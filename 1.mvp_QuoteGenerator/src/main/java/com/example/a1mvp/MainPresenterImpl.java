package com.example.a1mvp;

/**
 * Created by ADMIN on 10/20/2017.
 */

public class MainPresenterImpl implements MainPresenter, GetQuoteInteractor.OnFinishedListener {

    private MainView mainView;
    private GetQuoteInteractor getQuoteInteractor;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        getQuoteInteractor = new GetQuoteInteractorImpl();
    }

    @Override
    public void onButtonClick() {

        if (mainView != null) {
            mainView.showProgress();
        }
        getQuoteInteractor.getNextQuote(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished(String string) {
        if (mainView != null) {
            mainView.setQuote(string);
            mainView.hideProgress();
        }
    }
}
