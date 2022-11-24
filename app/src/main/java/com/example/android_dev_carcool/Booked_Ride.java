package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Booked_Ride extends AppCompatActivity {

//    Button signUp;
//    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_ride);

        Button Book = (Button) findViewById(R.id.search);

        Book.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent i = new Intent(Booked_Ride.this, Request_Sent.class);
                                          startActivity(i);
                                      }
                                  }
        );


    }
}