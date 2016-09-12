package com.example.retrofitex;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Retrofit retrofit;
    MyAdapter adapter;
    DataModel dataModels;
    ProgressDialog progressDialog;
    public static final String API_KEY="AIzaSyAw8zXyNKNGwlA2RFZT5TgfjysL_I9oi0g";
    public static final String BASE_URL = "https://maps.googleapis.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        APIInterface apiInterface=retrofit.create(APIInterface.class);

        Call<DataModel> call=apiInterface.getJson(API_KEY);
        Log.d("URL",retrofit+"");
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                Log.d("response",response+"");
                if(response.isSuccessful()) {
                  dataModels=response.body();
                    progressDialog.dismiss();
                    adapter=new MyAdapter(MainActivity.this,dataModels.getResults());
                    recyclerView.setAdapter(adapter);
                }

            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {
                Log.d("error",t.toString());
            }
        });
    }
}
