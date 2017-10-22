package com.example.a4mvp_di.mainscreen;

import com.example.a4mvp_di.data.Post;

import java.util.List;

/**
 * Created by ADMIN on 10/22/2017.
 */

public interface MainScreenView {

    void showPosts(List<Post> posts);

    void showError(String message);

    void showComplete();
}
