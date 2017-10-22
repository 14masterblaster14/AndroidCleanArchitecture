package com.example.a3di;

import android.app.Application;

import com.example.a3di.Dagger.Component.DaggerStorageComponent;
import com.example.a3di.Dagger.Component.StorageComponent;
import com.example.a3di.Dagger.Module.StorageModule;

/**
 * Created by ADMIN on 10/21/2017.
 */

public class MyApplication extends Application {

    StorageComponent storageComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        storageComponent = DaggerStorageComponent.builder().storageModule(new StorageModule(this)).build();
    }

    public StorageComponent getStorageComponent() {
        return storageComponent;
    }
}
