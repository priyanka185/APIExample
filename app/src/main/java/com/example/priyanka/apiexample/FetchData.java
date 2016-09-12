package com.example.priyanka.apiexample;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Priyanka on 31-08-2016.
 */
public class FetchData extends AsyncTask<String,String,JSONObject> {
    Context c;
    String url;
    int num;
    onClickDataSend sendData=null;
    ArrayList<Photo_model> photos_array=new ArrayList<>();
    ArrayList<DataModel> dataList=new ArrayList<>();
    public FetchData(Context c,String url,int num, onClickDataSend sendData){
        this.c=c;
        this.url=url;
        this.sendData=sendData;
        this.num=num;
    }
    protected void onPreExecute() {
        Log.d("task","running");
    }
    @Override
    protected JSONObject doInBackground(String... strings) {

        JSONParser jParser = new JSONParser();
        JSONObject jobj = jParser.getJSONfromUrl(url);
        return jobj;
    }
    @Override
    protected void onPostExecute(JSONObject jsonObject) {
        if(num==1){
        try {
            String rating1 = "0";
            String url1;
            JSONArray jsonAry = jsonObject.getJSONArray("results");
            for (int i = 0; i < jsonAry.length(); i++) {
                JSONObject jsonObject1 = jsonAry.getJSONObject(i);
                String name1 = jsonObject1.getString("name");
                if (jsonObject1.has("rating")) {
                    rating1 = jsonObject1.getString("rating");
                }
                String address1 = jsonObject1.getString("formatted_address");
                JSONObject geometry = jsonObject1.getJSONObject("geometry");
                JSONObject location = geometry.getJSONObject("location");
                String lat = location.getString("lat");
                String lng = location.getString("lng");
                String place_id = jsonObject1.getString("place_id");
                DataModel data = new DataModel();
                data.setName(name1);
                data.setRating(rating1);
                data.setAddress(address1);
                data.setLat(lat);
                data.setLng(lng);
                data.setPlace_id(place_id);

                if (jsonObject1.has("photos")) {
                    JSONArray ary = jsonObject1.getJSONArray("photos");
                    JSONObject obj = ary.getJSONObject(0);
                    url1 = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=600&photoreference=" +
                            obj.getString("photo_reference") + "&key=AIzaSyD6MsNjOg6B6AOslvBmVUIyGY9Mlx8yrGo";
                    data.setUrl(url1);
                    dataList.add(data);
                }
            }
            sendData.sendData(dataList);
        }catch (JSONException e) {
            e.printStackTrace();
        }
        }else{
    String url2;
            JSONObject jsonObject2;
            try {
                jsonObject2 = jsonObject.getJSONObject("result");
                JSONArray jsonary = jsonObject2.getJSONArray("photos");
                for (int j = 0; j < jsonary.length(); j++) {
                    Photo_model photo = new Photo_model();
                    JSONObject jsonobj = jsonary.getJSONObject(j);
                    url2 = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=600&photoreference=" +
                            jsonobj.getString("photo_reference") + "&key=AIzaSyD6MsNjOg6B6AOslvBmVUIyGY9Mlx8yrGo";
                    photo.setUrl(url2);
                    photos_array.add(photo);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            sendData.sendPhoto(photos_array);

        }

    }

public interface onClickDataSend{
    void sendData(ArrayList<DataModel> datalist);
    void sendPhoto(ArrayList<Photo_model> photo_array);
    }
}
