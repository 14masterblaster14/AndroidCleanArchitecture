package com.example.a2mvp_login.main;

import java.util.List;

/**
 * Created by ADMIN on 10/21/2017.
 */

public interface FindItemsInteractor {

    void findItems(OnFinishedListener listener);

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }
}
