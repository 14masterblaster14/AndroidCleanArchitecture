package com.example.a1mvp;

import android.app.Application;
import android.content.Context;

/**
 * Created by ADMIN on 9/26/2017.
 */

public class DemoApplication extends Application {

    private static DemoApplication demoApplication;

    public static Context getDemoApplication() {

        return demoApplication.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        demoApplication = (DemoApplication) getApplicationContext();
    }
}
