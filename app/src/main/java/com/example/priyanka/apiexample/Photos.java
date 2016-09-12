package com.example.priyanka.apiexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Photos extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageView image;
    String url=null;
    ArrayList<Photo_model> photoModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);
        image= (ImageView) findViewById(R.id.imageView5);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view1);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(manager);
        Intent i=getIntent();
        String place_id=i.getStringExtra("placeid");
        url="https://maps.googleapis.com/maps/api/place/details/json?placeid=" + place_id + "&key=AIzaSyD6MsNjOg6B6AOslvBmVUIyGY9Mlx8yrGo";
        new FetchData(this, url,2, new FetchData.onClickDataSend() {
            @Override
            public void sendData(ArrayList<DataModel> datalist) {}
            @Override
            public void sendPhoto(final ArrayList<Photo_model> photo_array) {
                Photos.this.photoModels=photo_array;
                Glide.with(Photos.this).load(photo_array.get(0).getUrl()).placeholder(R.drawable.placeholder).into(image);
                PhotoAdapter adapter=new PhotoAdapter(Photos.this, photo_array, new PhotoAdapter.OnClickPhoto() {
                    @Override
                    public void sendUrl(String url) {
                        Glide.with(Photos.this).load(url).placeholder(R.drawable.placeholder).into(image);
                    }
                });
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

                }
        }) .execute();

        }
}