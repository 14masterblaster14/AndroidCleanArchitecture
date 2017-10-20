package com.example.a2mvp_login.login;

/**
 * Created by ADMIN on 10/20/2017.
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
