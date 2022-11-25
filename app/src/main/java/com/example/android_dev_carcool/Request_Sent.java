package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Request_Sent extends AppCompatActivity {

//    Button signUp;
//    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button OK1 = (Button) findViewById(R.id.OK1);

        OK1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent i4 = new Intent(Request_Sent.this, Booked_Ride.class);
                                       startActivity(i4);
                                   }
                               }
        );
    }}
