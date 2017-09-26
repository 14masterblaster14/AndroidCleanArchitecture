package com.example.a1mvp.dao;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.a1mvp.DemoApplication;
import com.example.a1mvp.R;
import com.example.a1mvp.dto.UserDTO;

/**
 * Created by ADMIN on 9/26/2017.
 */

public class UserDAOImplmentation implements UserDAO {
    @Override
    public boolean saveUserDetails(UserDTO userDTO) {

        SharedPreferences.Editor editor = DemoApplication.getDemoApplication()
                .getSharedPreferences(DemoApplication.getDemoApplication().getString(R.string.app_name), Context.MODE_PRIVATE)
                .edit();
        editor.putString("userDTO", userDTO.toString());
        editor.commit();
        return false;
    }
}
