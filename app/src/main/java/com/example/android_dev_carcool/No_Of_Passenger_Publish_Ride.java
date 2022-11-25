package com.example.android_dev_carcool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class No_Of_Passenger_Publish_Ride extends AppCompatActivity {
    ImageView goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_of_passenger_publish_ride);


        goBack = findViewById(R.id.goBackIconPricePublishPage);

        goBack.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent i = new Intent(v.getContext(), comfort.class);
                                          startActivity(i);
                                      }
                                  }
        );
    }
}
