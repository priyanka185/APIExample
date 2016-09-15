package com.example.retrofitex;

import android.app.ProgressDialog;
import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.retrofitex.NearBYAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AroundMePlaces extends AppCompatActivity {
ListView list;
    Retrofit retrofit;
    ProgressDialog progressDialog;
    NearBYPlaces places;
    String radius="5000";
    double distance;
    Location current_location, places_location;
    String lat,lng;
    NearBYAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.around_me_places);
        list= (ListView) findViewById(R.id.nearBy);
        Intent i=getIntent();
        String title=i.getStringExtra("title");
        setTitle(title);
        String type=i.getStringExtra("type");
         lat=i.getStringExtra("lat");
         lng=i.getStringExtra("lng");
        Log.d("LAT",lat+","+lng);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        retrofit = new Retrofit.Builder().baseUrl(MainActivity.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        APIInterface apiInterface=retrofit.create(APIInterface.class);

        Call<NearBYPlaces> call=apiInterface.getNearByPlaces(lat+","+lng,"distance",type,MainActivity.API_KEY);
        call.enqueue(new Callback<NearBYPlaces>() {
            @Override
            public void onResponse(Call<NearBYPlaces> call, Response<NearBYPlaces> response) {
                if(response.isSuccessful()) {
                    Log.d("successfull","successful");
                    places = response.body();
                    progressDialog.dismiss();
                    adapter = new NearBYAdapter(AroundMePlaces.this, places.getResults(),lat,lng);
                    list.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<NearBYPlaces> call, Throwable t) {

            }
        });
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(AroundMePlaces.this,Phtotos.class);
                i.putExtra("placeid", places.getResults().get(position).getPlaceId());
                i.putExtra("rating",places.getResults().get(position).getRating());
                if(places.getResults().get(position).getPhotos()!=null) {
                    String url = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=600&photoreference=" +
                      places.getResults().get(position).getPhotos().get(0).getPhotoReference() + "&key=" + MainActivity.API_KEY;
                     i.putExtra("url",url);
                }
                startActivity(i);

            }
        });}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id== R.id.sortByDist){
            adapter.sortByDistance();
            adapter.notifyDataSetChanged();
        }else {
            adapter.sortByRating();
            adapter.notifyDataSetChanged();
        }
        return super.onOptionsItemSelected(item);
    }
}
