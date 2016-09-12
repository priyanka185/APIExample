package com.example.favoritelist;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Priyanka on 08-09-2016.
 */
public class Coupons extends android.support.v4.app.Fragment {
    public Coupons(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.coupons,container,false);
        return  v;
    }
}
