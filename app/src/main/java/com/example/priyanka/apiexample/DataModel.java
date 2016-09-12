package com.example.priyanka.apiexample;

/**
 * Created by Priyanka on 12-08-2016.
 */
public class DataModel {
    String name;
    String rating;
    String address;
    String lng,lat;
    String place_id;

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getUrl() {
        return url;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRating() {

        return rating;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {

        return name;
    }
}
