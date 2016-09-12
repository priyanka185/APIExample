package com.example.cameraapi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Priyanka on 01-09-2016.
 */
public class GridViewAdapter extends ArrayAdapter {
    Context context;
    ImageView imageView;
    ArrayList<ImageItem> imageItem;
    public GridViewAdapter(Context context, ArrayList<ImageItem> imageItem) {
        super(context, R.layout.grid_item, imageItem);
        this.context=context;
        this.imageItem=imageItem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_item, parent, false);
        imageView= (ImageView) itemView.findViewById(R.id.imageView);
        imageView.setImageBitmap(imageItem.get(position).getImage_uri());
        return  itemView;
    }

    @Override
    public int getCount() {
        return imageItem.size();
    }
}
