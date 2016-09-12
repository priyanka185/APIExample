package com.example.retrofitex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Priyanka on 31-08-2016.
 */
public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.MyViewHolder>  {
    Context c;
    OnClickPhoto sendPhoto;
    List<Photo_model.ResultBean.PhotosBean> photo_list;
    public PhotoAdapter(Phtotos c, List<Photo_model.ResultBean.PhotosBean> photo_list,OnClickPhoto sendPhoto){
        this.c=c;
        this.photo_list=photo_list;
        this.sendPhoto=sendPhoto;
    }
    @Override
    public PhotoAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.photos, parent, false);

        return new PhotoAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        final String url = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=600&photoreference=" +
                photo_list.get(position).getPhotoReference().toString()+ "&key=AIzaSyAw8zXyNKNGwlA2RFZT5TgfjysL_I9oi0g";
        Glide.with(c).load(url).placeholder(R.drawable.placeholder).into(holder.photos);

        holder.photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendPhoto.sendUrl(url);
            }
        });
    }

    @Override
    public int getItemCount() {
        return photo_list.size();
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
