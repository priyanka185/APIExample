package com.example.retrofitex;

import android.Manifest;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Priyanka on 12-09-2016.
 */
public class Places extends Fragment {
    RecyclerView recyclerView;
    Retrofit retrofit;
    MyAdapter adapter;
    DataModel dataModels;
    ProgressDialog progressDialog;
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.places, container, false);
        progressDialog=new ProgressDialog(container.getContext());
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        recyclerView= (RecyclerView) v.findViewById(R.id.recycler_view);
        LinearLayoutManager manager=new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        retrofit = new Retrofit.Builder().baseUrl(MainActivity.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        APIInterface apiInterface=retrofit.create(APIInterface.class);

        Call<DataModel> call=apiInterface.getJson(MainActivity.API_KEY);
        Log.d("URL",retrofit+"");
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                Log.d("response",response+"");
                if(response.isSuccessful()) {
                    dataModels=response.body();
                    progressDialog.dismiss();
                    adapter=new MyAdapter(container.getContext(),dataModels.getResults());
                    recyclerView.setAdapter(adapter);
                }

            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {
                Log.d("error",t.toString());
            }
        });
        return v;
    }
}
