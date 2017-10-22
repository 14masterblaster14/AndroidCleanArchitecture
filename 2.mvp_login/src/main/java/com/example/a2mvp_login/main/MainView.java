package com.example.a2mvp_login.main;

import java.util.List;

/**
 * Created by ADMIN on 10/21/2017.
 */

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
