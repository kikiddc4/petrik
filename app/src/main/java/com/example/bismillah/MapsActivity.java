package com.example.bismillah;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Jakarta = new LatLng(-6.2008406,106.7987143);
        mMap.addMarker(new MarkerOptions().position(Jakarta).title("SPBU JAKARTA 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jakarta));

        LatLng Jakarta2 = new LatLng(-6.1917132,106.7927703);
        mMap.addMarker(new MarkerOptions().position(Jakarta2).title("SPBU JAKARTA 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jakarta2));

        LatLng Jakarta3 = new LatLng(-6.196441,106.7695605);
        mMap.addMarker(new MarkerOptions().position(Jakarta3).title("SPBU JAKARTA 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jakarta3));

    }
}
