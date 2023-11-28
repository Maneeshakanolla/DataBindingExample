package com.example.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class UserModel extends BaseObservable {
    String userName, userEmail;

    public UserModel(String userName, String userEmail) {
        this.userName = userName;
        this.userEmail = userEmail;
    }
@Bindable
    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }
@Bindable
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        notifyPropertyChanged(BR.userEmail);
    }
}
