package com.example.retrofitex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Priyanka on 12-09-2016.
 */
public class AroundMe_adapter extends ArrayAdapter {
    Context context;
    String[] category_name;
    int[] image_resource;
    List<NearBYPlaces.ResultsBean> list;
    public AroundMe_adapter(Context context,String[] category_name,
            int[] image_resource) {
        super(context, R.layout.aroundme_grid);
        this.context=context;
        this.category_name=category_name;
        this.image_resource=image_resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.aroundme_grid, parent, false);
        ImageView image= (ImageView) itemView.findViewById(R.id.category_image);
        TextView name= (TextView) itemView.findViewById(R.id.category_name);
        name.setText(category_name[position]);
        image.setImageResource(image_resource[position]);
        return itemView;
    }

    @Override
    public int getCount() {
        return category_name.length;
    }
}
