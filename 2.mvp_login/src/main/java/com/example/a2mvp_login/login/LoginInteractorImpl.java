package com.example.a2mvp_login.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by ADMIN on 10/20/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(String username, String password, OnLoginFinishedListener listener) {

        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                    return;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
