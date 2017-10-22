package com.example.a2mvp_login.main;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ADMIN on 10/21/2017.
 */

public class FindItemsInteractorImpl implements FindItemsInteractor {
    @Override
    public void findItems(OnFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);

    }

    private List<String> createArrayList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10"
        );
    }
}
