package com.example.priyanka.apiexample;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recView;
    RelativeLayout layout;
    String url="https://maps.googleapis.com/maps/api/place/textsearch/json?query=tourist%20spot" +
            "s%20in%20Bengaluru&location=12.9592,77.6974&radius=5000&key=AIzaSyD6MsNjOg6B6AOslvBmVUIyGY9Mlx8yrGo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout= (RelativeLayout) findViewById(R.id.relativeLayout);

        recView= (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext());
        recView.setLayoutManager(manager);

        if(isNetworkAvailable(this)){
        new FetchData(this, url,1, new FetchData.onClickDataSend() {
            @Override
            public void sendData(final ArrayList<DataModel> datalist) {
                MyAdapter adapter=new MyAdapter(MainActivity.this,datalist);
                recView.setAdapter(adapter);
            }

            @Override
            public void sendPhoto(ArrayList<Photo_model> photo_array) {

            }
        }).execute();

            }
        else{
            Snackbar.make(layout,"No Internet Connection",Snackbar.LENGTH_LONG).setAction("retry", new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            }).show();
        }
    }
    public boolean isNetworkAvailable(final Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }


}

