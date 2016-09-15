package com.example.retrofitex;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Phtotos extends AppCompatActivity {
    public static final String BASE_URL = "https://maps.googleapis.com";
    RecyclerView recyclerView1;
    Retrofit retrofit;
    String place_id = null;
    PhotoAdapter adapter3;
    private static final String API_KEY = "AIzaSyD6MsNjOg6B6AOslvBmVUIyGY9Mlx8yrGo";
    Photo_model photo_model;
    ImageView image;
    ListView list2;
    ProgressDialog progressDialog;
    RatingBar ratingBar;
    Thread thread;
    LinearLayout details_layout;
    TextView address1, phone1, website1, reviews1, mon, tue, wed, thurs, fri, sat, sun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phtotos);
        list2 = (ListView) findViewById(R.id.reviews_list);
        details_layout= (LinearLayout) findViewById(R.id.details_layout);
        recyclerView1 = (RecyclerView) findViewById(R.id.recycler_view1);
        address1 = (TextView) findViewById(R.id.address2);
        phone1 = (TextView) findViewById(R.id.phone2);
        website1 = (TextView) findViewById(R.id.website2);
        reviews1 = (TextView) findViewById(R.id.reviews);
        image = (ImageView) findViewById(R.id.image);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar2);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(manager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        Intent i = getIntent();
        place_id = i.getStringExtra("placeid");
        String url = i.getStringExtra("url");
        double rating=i.getDoubleExtra("rating",0.0);
        ratingBar.setRating((float)rating);
        if(url!=null){
        Glide.with(this).load(url).placeholder(R.drawable.placeholder).into(image);}
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        APIInterface apiInterface = retrofit.create(APIInterface.class);
        Call<Photo_model> call = apiInterface.getPhotos(place_id, API_KEY);
        Log.d("URL", retrofit + "");

        call.enqueue(new Callback<Photo_model>() {
            @Override
            public void onResponse(Call<Photo_model> call, Response<Photo_model> response) {

                if (response.isSuccessful()) {
                    photo_model = response.body();
                    progressDialog.dismiss();
                    details_layout.setVisibility(View.VISIBLE);
                    adapter3 = new PhotoAdapter(Phtotos.this, photo_model.getResult().getPhotos(), new PhotoAdapter.OnClickPhoto() {
                        @Override
                        public void sendUrl(final String url) {
                            Glide.with(Phtotos.this).load(url).placeholder(R.drawable.placeholder).into(image);
                        }
                    });
                    if (photo_model.getResult().getPhotos() != null) {
                        recyclerView1.setAdapter(adapter3);
                    }
                    else{
                        image.setVisibility(View.GONE);
                        recyclerView1.setVisibility(View.GONE);
                    }
                    if(photo_model.getResult().getReviews()!=null) {
                        Reviews adapter2 = new Reviews(Phtotos.this, photo_model.getResult().getReviews());
                        list2.setAdapter(adapter2);
                    }

                    String address = photo_model.getResult().getFormattedAddress();
                    String phone = photo_model.getResult().getFormattedPhoneNumber();
                    address1.setText(address);
                    phone1.setText(phone);
                    website1.setText(photo_model.getResult().getWebsite());
                    reviews1.setText("5 Reviews");
                    mon = (TextView) findViewById(R.id.monday);
                    tue = (TextView) findViewById(R.id.tue);
                    wed = (TextView) findViewById(R.id.wed);
                    thurs = (TextView) findViewById(R.id.thur);
                    fri = (TextView) findViewById(R.id.fri);
                    sat = (TextView) findViewById(R.id.sat);
                    sun = (TextView) findViewById(R.id.sun);
                    if(photo_model.getResult().getOpeningHours()!=null) {
                        mon.setText(photo_model.getResult().getOpeningHours().getWeekdayText().get(0));
                        tue.setText(photo_model.getResult().getOpeningHours().getWeekdayText().get(1));
                        wed.setText(photo_model.getResult().getOpeningHours().getWeekdayText().get(2));
                        thurs.setText(photo_model.getResult().getOpeningHours().getWeekdayText().get(3));
                        fri.setText(photo_model.getResult().getOpeningHours().getWeekdayText().get(4));
                        sat.setText(photo_model.getResult().getOpeningHours().getWeekdayText().get(5));
                        sun.setText(photo_model.getResult().getOpeningHours().getWeekdayText().get(6));
                    }else{
                        mon.setVisibility(View.GONE);
                        tue.setVisibility(View.GONE);
                        wed.setVisibility(View.GONE);
                        thurs.setVisibility(View.GONE);
                        fri.setVisibility(View.GONE);
                        sat.setVisibility(View.GONE);
                        sun.setVisibility(View.GONE);
                    }
                    //Log.d("weekday", photo_model.getResult().getOpeningHours().getWeekdayText().get(1) + "");
                }

            }

            @Override
            public void onFailure(Call<Photo_model> call, Throwable t) {
                Log.d("error", t.toString());
            }
        });

    }
}



