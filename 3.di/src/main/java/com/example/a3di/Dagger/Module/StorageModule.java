package com.example.a3di.Dagger.Module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.a3di.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ADMIN on 10/21/2017.
 */

@Module
public class StorageModule {

    private final MyApplication myApplication;

    public StorageModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(myApplication);
    }
}
