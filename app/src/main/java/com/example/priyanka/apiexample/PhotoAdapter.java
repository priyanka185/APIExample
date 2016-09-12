package com.example.priyanka.apiexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Priyanka on 31-08-2016.
 */
public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.MyViewHolder>  {
    Context c;
    OnClickPhoto sendphoto;
    ArrayList<Photo_model> photolist;
    public PhotoAdapter(Context c,ArrayList<Photo_model> photolist,OnClickPhoto sendphoto){
        this.c=c;
        this.photolist=photolist;
        this.sendphoto=sendphoto;
    }
    @Override
    public PhotoAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.photos, parent, false);

        return new PhotoAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Glide.with(c).load(photolist.get(position).getUrl().toString()).placeholder(R.drawable.placeholder).into(holder.photos);
        holder.photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendphoto.sendUrl(photolist.get(position).getUrl().toString());
            }
        });

    }

    @Override
    public int getItemCount() {
        return photolist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView photos;

        public MyViewHolder(View itemView) {
            super(itemView);
            photos= (ImageView) itemView.findViewById(R.id.photo);

        }
    }
    public interface OnClickPhoto{
        void sendUrl(String url);
    }
}
