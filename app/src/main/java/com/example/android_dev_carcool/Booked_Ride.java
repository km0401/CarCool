package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Booked_Ride extends AppCompatActivity {

    ImageView goBack1;
    ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booked_ride);


        goBack1 = findViewById(R.id.goBackBookedRidePage);
        next = findViewById(R.id.next_icon_booked_ride);

        goBack1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          finish();
                                      }
                                  }
        );
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), PastRides.class));
            }
        });
    }
}
