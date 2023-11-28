package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Button button;

    MyclickHandler myclickHandler;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserModel model=new UserModel("Maneesha","Maneesha@gmail.com");
        activityMainBinding.setUser(model);
        myclickHandler=new MyclickHandler(this);
        activityMainBinding.setOnclick(myclickHandler);
    }
}