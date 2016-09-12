package com.example.priyanka.apiexample;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Priyanka on 11-08-2016.
 */
public class JSONParser {


    String json=null;
    JSONObject jsonObj;

    public JSONParser() {

    }
    public JSONObject getJSONfromUrl(String url1){

        URL url= null;
        try {
            url = new URL(url1);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection urlConnection = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader= new BufferedReader(new InputStreamReader(in));
            StringBuilder sb=new StringBuilder();
            String line = null;
            while((line=reader.readLine())!=null){
                sb.append(line);
            }
            in.close();
             json=sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }urlConnection.disconnect();
        try {
            jsonObj=new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return  jsonObj;
    }
}
