package com.example.week1helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    EditText usernameEditText;
    EditText userIDEditText;

    ImageView welcomeImage;
    TextView dateText;
    int value = 0 ;
    Button signup_btn;
    Button help_btn;
    Button help2_btn;

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


        // second scnario
        signup_btn = findViewById(R.id.signup);
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("week 1", "set click listener for a button");
                // do whatever I want here.
                Toast.makeText(getApplicationContext(),"Sign Up Clicked !!! ",Toast.LENGTH_LONG).show();
            }
        });

        // third scenario
        help_btn = findViewById(R.id.help);
        help_btn.setOnClickListener(this);

        help2_btn = findViewById(R.id.help2);
        help2_btn.setOnClickListener(this);

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
        Log.d("week 1", "Add a public void function with View parameter and give its name to the layout");
        Toast.makeText(getApplicationContext()," Sign In Clicked !!! ",Toast.LENGTH_LONG).show();


        if (usernameEditText.getText().toString().isEmpty() || (userIDEditText.getText().toString().isEmpty())) {
            Toast.makeText(this,"ERROE !!!  Not Enough Information !!!",Toast.LENGTH_LONG).show();

        }
        else if (userIDEditText.getText().toString().length() > 8){
            Toast.makeText(this,"ERROE !!!  Very long ID !!!",Toast.LENGTH_LONG).show();

        }
        else {

            String name = usernameEditText.getText().toString();
            int id = Integer.parseInt(userIDEditText.getText().toString());
            s1 = new Student(name, id);

            Toast.makeText(this,s1.CreateWelecomeMes(),Toast.LENGTH_LONG).show();
        }


    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.help || id == R.id.help2){
            Log.d("week 1", "Implement OnClick Listener on the activity level");
            // do whatever I want here.
            Toast.makeText(getApplicationContext()," Help Clicked !!! ",Toast.LENGTH_LONG).show();
        }
    }
}