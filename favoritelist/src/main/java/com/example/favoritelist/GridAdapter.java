package com.example.favoritelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Priyanka on 08-09-2016.
 */
public class GridAdapter extends ArrayAdapter {
    Context context;
    public GridAdapter(Context context) {
        super(context, R.layout.item_list);
        this.context=context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return view;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
