package com.example.a4mvp_di.di.module;

import com.example.a4mvp_di.mainscreen.MainScreenPresenter;
import com.example.a4mvp_di.mainscreen.MainScreenPresenterImpl;
import com.example.a4mvp_di.mainscreen.MainScreenView;
import com.example.a4mvp_di.util.CustomScope;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by ADMIN on 10/22/2017.
 */
@Module
public class MainScreenModule {

    private MainScreenView mainScreenView;
    private MainScreenPresenter mainScreenPresenter;

    public MainScreenModule(MainScreenView mainScreenView) {
        this.mainScreenView = mainScreenView;
    }

    @Provides
    @CustomScope
    MainScreenView providesMainScreenView() {
        return mainScreenView;
    }

    @Provides
    @CustomScope
    MainScreenPresenter providesMainScreenPresenter(MainScreenView mainScreenView, Retrofit retrofit) {
        return new MainScreenPresenterImpl(mainScreenView, retrofit);
    }

}
