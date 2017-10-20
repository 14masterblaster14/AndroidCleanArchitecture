package com.example.a2mvp_login.login;

/**
 * Created by ADMIN on 10/20/2017.
 */

public interface LoginInteractor {

    void login(String username, String password, OnLoginFinishedListener listener);

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }
}
