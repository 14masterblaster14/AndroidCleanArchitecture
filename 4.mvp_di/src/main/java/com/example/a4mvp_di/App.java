package com.example.a4mvp_di;

import android.app.Application;

import com.example.a4mvp_di.di.component.DaggerNetComponent;
import com.example.a4mvp_di.di.component.NetComponent;
import com.example.a4mvp_di.di.module.AppModule;
import com.example.a4mvp_di.di.module.NetModule;

/**
 * Created by ADMIN on 10/22/2017.
 */

public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {

        return mNetComponent;
    }
}
