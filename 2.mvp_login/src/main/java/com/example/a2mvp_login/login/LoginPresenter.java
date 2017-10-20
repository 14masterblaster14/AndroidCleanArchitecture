package com.example.a2mvp_login.login;

/**
 * Created by ADMIN on 10/20/2017.
 */

public interface LoginPresenter {

    void validateCredentials(String username, String password);

    void onDestroy();
}
