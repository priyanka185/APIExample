package com.example.priyanka.apiexample;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Priyanka on 11-08-2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context c;
    ArrayList<DataModel> datalist;
    public MyAdapter(Context c,ArrayList<DataModel> datalist){
        this.c=c;
        this.datalist=datalist;
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
        holder.rating.setRating(Float.parseFloat(datalist.get(position).getRating().toString()));
        holder.address.setText(datalist.get(position).getAddress().toString());
        Glide.with(c).load(datalist.get(position).getUrl().toString()).placeholder(R.drawable.placeholder).into(holder.icon);

        holder.address.setOnClickListener(new View.OnClickListener() {
           String sourceLatitude=datalist.get(position).getLat().toString();
            String sourceLongitude=datalist.get(position).getLng().toString();
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
                Intent i=new Intent(c,Photos.class);
                i.putExtra("placeid", datalist.get(position).getPlace_id());
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