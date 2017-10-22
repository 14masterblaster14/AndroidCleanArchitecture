package com.example.a4mvp_di.mainscreen;

import com.example.a4mvp_di.data.Post;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ADMIN on 10/22/2017.
 */

public class MainScreenPresenterImpl implements MainScreenPresenter {

    public Retrofit retrofit;
    MainScreenView mainScreenView;

    @Inject
    public MainScreenPresenterImpl(MainScreenView mainScreenView, Retrofit retrofit) {
        this.mainScreenView = mainScreenView;
        this.retrofit = retrofit;
    }

    @Override
    public void loadPost() {

        retrofit.create(PostService.class).getPostList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Post>>() {
                    @Override
                    public void onCompleted() {
                        mainScreenView.showComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mainScreenView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Post> posts) {
                        mainScreenView.showPosts(posts);
                    }
                });

    }

    public interface PostService {
        @GET("/posts")
        Observable<List<Post>> getPostList();
    }
}
