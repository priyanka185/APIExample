package com.example.retrofitex;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

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
    String radius="500";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.around_me_places);
        list= (ListView) findViewById(R.id.nearBy);
        Intent i=getIntent();
        String title=i.getStringExtra("title");
        setTitle(title);
        String type=i.getStringExtra("type");
        String lat=i.getStringExtra("lat");
        String lng=i.getStringExtra("lng");
        Log.d("LAT",lat+","+lng);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        retrofit = new Retrofit.Builder().baseUrl(MainActivity.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        APIInterface apiInterface=retrofit.create(APIInterface.class);

        Call<NearBYPlaces> call=apiInterface.getNearByPlaces(lat+","+lng,radius,type,MainActivity.API_KEY);
        call.enqueue(new Callback<NearBYPlaces>() {
            @Override
            public void onResponse(Call<NearBYPlaces> call, Response<NearBYPlaces> response) {
                if(response.isSuccessful()) {
                    Log.d("successfull","successful");
                    places = response.body();
                    progressDialog.dismiss();
                    NearBYAdapter adapter = new NearBYAdapter(AroundMePlaces.this, places.getResults());
                    list.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<NearBYPlaces> call, Throwable t) {

            }
        });

    }
}
