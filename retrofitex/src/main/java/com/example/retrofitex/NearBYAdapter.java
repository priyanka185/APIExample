package com.example.retrofitex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Priyanka on 14-09-2016.
 */
public class NearBYAdapter extends ArrayAdapter {
    Context context;
    List<NearBYPlaces.ResultsBean> list;
    String url=null;
    public NearBYAdapter(Context context,List<NearBYPlaces.ResultsBean> list) {
        super(context, R.layout.near_by);
        this.context=context;
        this.list=list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.near_by, parent, false);
        TextView name= (TextView) view.findViewById(R.id.nearby_name);
        TextView address= (TextView) view.findViewById(R.id.nearby_address);
        ImageView image= (ImageView) view.findViewById(R.id.nearby_image);
        name.setText(list.get(position).getName());
        address.setText(list.get(position).getVicinity());

       //url= "https://maps.googleapis.com/maps/api/place/photo?maxwidth=600&photoreference=" +
         //       list.get(position).getPhotos().get(0).getPhotoReference() + "&key="+MainActivity.API_KEY;
       // Glide.with(parent.getContext()).load(url).placeholder(R.drawable.placeholder).into(image);
        return  view;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
