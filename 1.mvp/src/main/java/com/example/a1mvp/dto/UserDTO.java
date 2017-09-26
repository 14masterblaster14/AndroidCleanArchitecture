package com.example.a1mvp.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ADMIN on 9/26/2017.
 */

public class UserDTO implements Parcelable {

    public static final Creator<UserDTO> CREATOR = new Creator<UserDTO>() {
        @Override
        public UserDTO createFromParcel(Parcel in) {
            return new UserDTO(in);
        }

        @Override
        public UserDTO[] newArray(int size) {
            return new UserDTO[size];
        }
    };
    private int userID;
    private String email;
    private String authToken;
    private String mobileNumber;

    protected UserDTO(Parcel in) {
        userID = in.readInt();
        email = in.readString();
        authToken = in.readString();
        mobileNumber = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(userID);
        dest.writeString(email);
        dest.writeString(authToken);
        dest.writeString(mobileNumber);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "userID=" + userID +
                ", email='" + email + '\'' +
                ", authToken='" + authToken + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
