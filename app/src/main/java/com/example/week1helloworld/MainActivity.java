package com.example.week1helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

//R.java
    // life cycle functions/ events
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("week 1","on create " + R.string.welcome_msg);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("week 1", "on start");
    }
}