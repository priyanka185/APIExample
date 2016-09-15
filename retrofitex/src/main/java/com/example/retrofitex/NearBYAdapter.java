package com.example.retrofitex;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Priyanka on 14-09-2016.
 */
public class NearBYAdapter extends ArrayAdapter {
    Context context;
    double distance;
    Location current_location, places_locationA,places_locationB;
    String lat;
    String lng;
    List<NearBYPlaces.ResultsBean> list;
    public NearBYAdapter(Context context,List<NearBYPlaces.ResultsBean> list,String lat,
            String lng) {
        super(context, R.layout.near_by);
        this.context=context;
        this.list=list;
        this.lat=lat;
        this.lng=lng;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.near_by, parent, false);
        TextView name= (TextView) view.findViewById(R.id.nearby_name);
        ImageView image= (ImageView) view.findViewById(R.id.nearby_image);
        RatingBar ratingBar= (RatingBar) view.findViewById(R.id.ratingBar3);
        ratingBar.setRating((float) list.get(position).getRating());
        Log.d("dist",String.valueOf(distance)+" m");
        TextView distance1= (TextView) view.findViewById(R.id.distance);
        distance=getDistance(position);
        name.setText(list.get(position).getName());
        distance1.setText(String.format("%.2f",distance)+" km");

     /* if(list.get(position).getPhotos()!=null) {
    String url = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=600&photoreference=" +
            list.get(position).getPhotos().get(0).getPhotoReference() + "&key=" + MainActivity.API_KEY;
    Glide.with(parent.getContext()).load(url).placeholder(R.drawable.placeholder).into(image);
}*/
        return  view;
    }

    public double getDistance(int position) {
        current_location=new Location("locationA");
        current_location.setLatitude(Double.parseDouble(lat));
        current_location.setLongitude(Double.parseDouble(lng));
        places_locationA=new Location("Location B");
        places_locationA.setLatitude(list.get(position).getGeometry().getLocation().getLat());
        places_locationA.setLongitude(list.get(position).getGeometry().getLocation().getLng());
        distance=current_location.distanceTo(places_locationA);
        return  distance/1000;
    }
    public void sortByDistance(){
        Collections.sort(list, new Comparator<NearBYPlaces.ResultsBean>() {
            @Override
            public int compare(NearBYPlaces.ResultsBean lhs, NearBYPlaces.ResultsBean rhs) {
                current_location=new Location("locationA");
                current_location.setLatitude(Double.parseDouble(lat));
                current_location.setLongitude(Double.parseDouble(lng));
                places_locationA=new Location("Location B");
                places_locationA.setLatitude(lhs.getGeometry().getLocation().getLat());
                places_locationA.setLongitude(lhs.getGeometry().getLocation().getLng());
                double d1=current_location.distanceTo(places_locationA);
                places_locationB=new Location("Location B");
                places_locationB.setLatitude(rhs.getGeometry().getLocation().getLat());
                places_locationB.setLongitude(rhs.getGeometry().getLocation().getLng());
                double d2=current_location.distanceTo(places_locationB);
                return Double.valueOf(d1).compareTo(Double.valueOf(d2));
            }
        });
    }
    public void sortByRating(){
        Collections.sort(list, Collections.reverseOrder(new Comparator<NearBYPlaces.ResultsBean>() {
            @Override
            public int compare(NearBYPlaces.ResultsBean lhs, NearBYPlaces.ResultsBean rhs) {
                double rating1=lhs.getRating();
                double rating2=rhs.getRating();
                return Double.valueOf(rating1).compareTo(Double.valueOf(rating2));
            }
        }));

}
    @Override
    public int getCount() {
        return list.size();
    }
}
