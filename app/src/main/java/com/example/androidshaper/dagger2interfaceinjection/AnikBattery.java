package com.example.androidshaper.dagger2interfaceinjection;

import android.util.Log;

import javax.inject.Inject;

public class AnikBattery implements Battery {

    private static final String TAG="SmartPhone";

    @Inject
    public AnikBattery() {
    }

    @Override
    public void showType() {

        Log.d(TAG, "showType: Anik Telecoms Battery....");
        
        
        
    }
}
