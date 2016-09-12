package com.example.retrofitex;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Priyanka on 07-09-2016.
 */
public interface APIInterface {
   String place_id=null;
    @GET("maps/api/place/textsearch/json?query=tourist%20spots%20in%20Bengaluru&location=12.9592,77.6974&radius=5000&key=AIzaSyAw8zXyNKNGwlA2RFZT5TgfjysL_I9oi0g")
    Call<DataModel> getJson();

    @GET("maps/api/place/details/json")
    Call<Photo_model> getPhotos(@Query("placeid") String place_id, @Query("key") String api_key);
}
