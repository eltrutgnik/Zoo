package com.example.arturo.zoo.fragments;

import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by arturo on 7/19/15.
 */
public class ZooMapFragment extends SupportMapFragment {

    public static ZooMapFragment getInstance() {
        ZooMapFragment fragment = new ZooMapFragment();

        return fragment;
    }
}
