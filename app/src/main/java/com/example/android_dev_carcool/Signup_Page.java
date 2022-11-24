package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Signup_Page extends AppCompatActivity {

    ImageView goBack;
    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        goBack = findViewById(R.id.goBackIconSignUpPage);
        proceed = findViewById(R.id.proceed_button);

        goBack.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent i = new Intent(v.getContext(), MainActivity.class);
                                                startActivity(i);
                                            }
                                        }
        );

        proceed.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent i = new Intent(v.getContext(), User_Profile.class);
                                                startActivity(i);
                                            }
                                        }
        );
    }
}
