package com.example.favoritelist;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Priyanka on 08-09-2016.
 */
public class Favorites extends android.support.v4.app.Fragment {
    GridView gridView;
    public Favorites(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.favorites,container,false);
        gridView= (GridView) v.findViewById(R.id.gridView);
        GridAdapter adapter=new GridAdapter(container.getContext());
        gridView.setAdapter(adapter);
        return  v;
    }
}
