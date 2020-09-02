package com.example.androidshaper.dagger2interfaceinjection;

import dagger.Component;

@Component(modules = {MemoryCardModule.class,ATBattery.class})
public interface SmartPhoneComponent {
    SmartPhone getComponent();
}
