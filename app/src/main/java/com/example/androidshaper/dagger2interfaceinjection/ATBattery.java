package com.example.androidshaper.dagger2interfaceinjection;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ATBattery {

//    @Provides
//   static Battery getProvides(AnikBattery anikBattery){
//        anikBattery.showType();
//        return anikBattery;
//    }

    @Binds
    abstract Battery getProvides(AnikBattery anikBattery);
}
