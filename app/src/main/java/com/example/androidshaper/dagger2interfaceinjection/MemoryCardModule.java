package com.example.androidshaper.dagger2interfaceinjection;


import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {

    @Provides
    static
    MemoryCard providerMemoryCard()
    {
        return new MemoryCard();
    }

}
