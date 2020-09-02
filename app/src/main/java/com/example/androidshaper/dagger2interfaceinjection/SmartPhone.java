package com.example.androidshaper.dagger2interfaceinjection;

import android.util.Log;

import javax.inject.Inject;


public class SmartPhone {

    public Battery battery;
    public  SimCard simCard;
    public MemoryCard memoryCard;
    private static final String TAG="SmartPhone";

    @Inject
    public SmartPhone(Battery battery, SimCard simCard, MemoryCard memoryCard) {
        this.battery = battery;
        this.simCard = simCard;
        this.memoryCard = memoryCard;
        battery.showType();
    }

    public void makeCall()
    {
        Log.d(TAG, "making a Call......... ");
    }
}
