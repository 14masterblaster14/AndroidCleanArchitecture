package com.example.a1mvp;

/**
 * Created by ADMIN on 10/20/2017.
 */

public interface GetQuoteInteractor {

    void getNextQuote(OnFinishedListener listener);

    interface OnFinishedListener {
        void onFinished(String string);
    }
}
