package com.example.a4mvp_di.di.component;

import com.example.a4mvp_di.di.module.MainScreenModule;
import com.example.a4mvp_di.mainscreen.MainActivity;
import com.example.a4mvp_di.util.CustomScope;

import dagger.Component;

/**
 * Created by ADMIN on 10/22/2017.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity mainActivity);
}
