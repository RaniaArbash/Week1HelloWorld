package com.example.week1helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText usernameEditText;
    EditText userIDEditText;

    ImageView welcomeImage;
    TextView dateText;
    int value = 0 ;

    Student s1 ;
    //R.java
    // life cycle functions/ events
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value = 90;
        usernameEditText = findViewById(R.id.usernametext);
        userIDEditText = findViewById(R.id.useridtext);

        welcomeImage =  findViewById(R.id.android_image);
        dateText = findViewById(R.id.dateText);
        welcomeImage.setImageResource(R.drawable.img2);
        dateText.setText((new Date().toString()));
        Log.d("week 1","on create " + value);
    }

    @Override
    protected void onStart() {
        super.onStart();
        value += 1;
        Log.d("week 1", "on start "+ value);
    }

    @Override
    protected void onResume() {
        super.onResume();
        value += 1;

        Log.d("week 1", "on resume " + value);

    }

    @Override
    protected void onPause() {
        super.onPause();
        value += 1;

        Log.d("week 1", "on pause " + value);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        value += 1;

        Log.d("week 1", "on destroy " + value);


    }

    public void logInClicked(View view) {
        Log.d("week 1", "Log in clicked  " );

        if (usernameEditText.getText().toString().isEmpty() || (userIDEditText.getText().toString().isEmpty())) {
            Toast.makeText(this,"ERROE !!!  Not Enough Information !!!",Toast.LENGTH_LONG).show();

        }
        if (userIDEditText.getText().toString().length() > 8){
            Toast.makeText(this,"ERROE !!!  Very long ID !!!",Toast.LENGTH_LONG).show();

        }
        else {

            String name = usernameEditText.getText().toString();
            int id = Integer.parseInt(userIDEditText.getText().toString());
            s1 = new Student(name, id);

            Toast.makeText(this,s1.CreateWelecomeMes(),Toast.LENGTH_LONG).show();
        }


    }
}