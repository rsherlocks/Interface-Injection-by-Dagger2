package com.example.androidshaper.dagger2interfaceinjection;

import javax.inject.Inject;

public class SimCard {

    public ServiceProvider serviceProvider;

    @Inject
    public SimCard(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
