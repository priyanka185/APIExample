package com.example.retrofitex;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Contacts;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Priyanka on 11-08-2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context c;
    List<DataModel.ResultsBean> datalist;

    public MyAdapter(Context c, List<DataModel.ResultsBean> results) {
        this.c=c;
        this.datalist=results;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.name_place.setText(datalist.get(position).getName().toString());
        holder.rating.setRating(Float.parseFloat(String.valueOf(datalist.get(position).getRating())));
       holder.address.setText(datalist.get(position).getFormattedAddress().toString());

        List<DataModel.ResultsBean.PhotosBean> data2=datalist.get(position).getPhotos();

        final String url1 = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=600&photoreference=" +
                data2.get(0).getPhotoReference().toString() + "&key="+MainActivity.API_KEY;
       Glide.with(c).load(url1).placeholder(R.drawable.placeholder).into(holder.icon);

        holder.address.setOnClickListener(new View.OnClickListener() {
           DataModel.ResultsBean.GeometryBean.LocationBean data1=  datalist.get(position).getGeometry().getLocation();
          String sourceLatitude= String.valueOf(data1.getLat());
           String sourceLongitude= String.valueOf(data1.getLng());
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("http://maps.google.com/maps?q=loc:" + sourceLatitude + "," + sourceLongitude);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
               mapIntent.setPackage("com.google.android.apps.maps");
                c.startActivity(mapIntent);
           }
        });

        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(c,Phtotos.class);
                i.putExtra("placeid", datalist.get(position).getPlaceId());
                i.putExtra("url",url1);
                i.putExtra("rating",datalist.get(position).getRating());
                c.startActivity(i);
            }
        });
            }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name_place,address,phone,website;
        ImageView icon;
        RatingBar rating;
        public MyViewHolder(View itemView) {
            super(itemView);
            name_place=(TextView)itemView.findViewById(R.id.textView);
            address= (TextView) itemView.findViewById(R.id.textView3);
            phone= (TextView) itemView.findViewById(R.id.textView4);
            website= (TextView) itemView.findViewById(R.id.textView5);
            icon= (ImageView) itemView.findViewById(R.id.imageView);
            rating=(RatingBar) itemView.findViewById(R.id.ratingBar);
        }
    }


}