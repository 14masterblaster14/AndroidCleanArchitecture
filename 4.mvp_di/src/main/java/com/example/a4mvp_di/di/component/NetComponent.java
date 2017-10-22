package com.example.a4mvp_di.di.component;

import com.example.a4mvp_di.di.module.AppModule;
import com.example.a4mvp_di.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by ADMIN on 10/22/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();
}
