package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    Button signUp;
//    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUp = (Button) findViewById(R.id.signup_button);
        Button login = (Button) findViewById(R.id.login_button);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Signup_Page.class);
                startActivity(i);
            }
        }
        );

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this, Login_Page.class);
                startActivity(i2);
            }
        }
        );

    }
}