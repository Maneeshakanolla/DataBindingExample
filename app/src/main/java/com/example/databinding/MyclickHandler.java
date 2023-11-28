package com.example.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyclickHandler {
    Context context;

    public MyclickHandler(Context context) {
        this.context = context;
    }
    public void onButtonClicked(View view){
        Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show();
    }

}
