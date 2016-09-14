package com.example.retrofitex;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

/**
 * Created by Priyanka on 12-09-2016.
 */
public class Around_me extends Fragment implements GoogleApiClient.ConnectionCallbacks {
    GoogleApiClient client;
    Location location;
    GridView grid;
    String lat=null;
    String lng=null;
    String[] category_name={"ATM","Bar","School","Park","Hospital","Jewelry_store","Parking","Police"};
    int[] image_resource={R.drawable.atms,R.drawable.bars,R.drawable.edu,R.drawable.amusment,R.drawable.hospital,
            R.drawable.jewel,R.drawable.parking,R.drawable.police};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.around_me, container, false);
        grid = (GridView) v.findViewById(R.id.around);
        AroundMe_adapter aroundMeAdapter = new AroundMe_adapter(container.getContext(),category_name,image_resource);
        grid.setAdapter(aroundMeAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        client = new GoogleApiClient.Builder(getContext()).addConnectionCallbacks(this)
                .addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
                        AlertDialog.Builder dialog=new AlertDialog.Builder(getContext());
                        dialog.setMessage("No Connection!!");
                        dialog.show();
                    }
                })
                .addApi(LocationServices.API).build();

    }

    @Override
    public void onStart() {

        client.connect();
        super.onStart();
    }

    @Override
    public void onStop() {
        client.disconnect();
        super.onStop();
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        if (ActivityCompat.checkSelfPermission(getContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        location = LocationServices.FusedLocationApi.getLastLocation(client);
        if(location!=null){
            lat= String.valueOf(location.getLatitude());
            lng= String.valueOf(location.getLongitude());
            Log.d("LAT",lat+","+lng);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i=new Intent(parent.getContext(),AroundMePlaces.class);
                    i.putExtra("type",category_name[position].toLowerCase());
                    i.putExtra("title",category_name[position]);
                    i.putExtra("lat",lat);
                    i.putExtra("lng",lng);
                    startActivity(i);
                }
            });
        }
    }

    @Override
    public void onConnectionSuspended(int i) {

    }


}
