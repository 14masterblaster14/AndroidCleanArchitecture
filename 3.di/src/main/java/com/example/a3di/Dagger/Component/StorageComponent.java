package com.example.a3di.Dagger.Component;

import com.example.a3di.AFragment;
import com.example.a3di.BFragment;
import com.example.a3di.Dagger.Module.StorageModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ADMIN on 10/21/2017.
 */

@Singleton
@Component(modules = StorageModule.class)
public interface StorageComponent {

    void inject(AFragment aFragment);

    void inject(BFragment bFragment);
}
