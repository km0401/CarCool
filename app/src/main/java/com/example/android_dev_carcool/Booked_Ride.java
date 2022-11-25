package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Booked_Ride extends AppCompatActivity {

    ImageView goBack1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comfort);


        goBack1 = findViewById(R.id.goBackBookedRidePage);

        goBack1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent i1 = new Intent(v.getContext(),Landing_Page.class);
                                          startActivity(i1);
                                      }
                                  }
        );
    }
}
