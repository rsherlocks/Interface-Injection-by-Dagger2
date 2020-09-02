package com.example.androidshaper.dagger2interfaceinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmartPhoneComponent smartPhoneComponent=DaggerSmartPhoneComponent.create();
        smartPhone=smartPhoneComponent.getComponent();
        smartPhone.makeCall();
    }
}