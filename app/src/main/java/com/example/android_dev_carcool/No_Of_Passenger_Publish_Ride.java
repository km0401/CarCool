package com.example.android_dev_carcool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class No_Of_Passenger_Publish_Ride extends AppCompatActivity {
    ImageView goBack;
    ImageView next;
    ImageView increment, decrement;
    TextView passengerTv;
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_of_passenger_publish_ride);

        next = findViewById(R.id.next_icon_no_of_passenger_publish);
        increment = findViewById(R.id.increment_icon_passenger);
        decrement = findViewById(R.id.decrement_icon_passenger);
        goBack = findViewById(R.id.goBackIconNoOfPassengerPage);
        passengerTv = findViewById(R.id.no_of_passenger_value);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), Pick_Date_Publish.class));
            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          finish();
                                      }
                                  }
        );

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                passengerTv.setText(""+count);
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count<=1)
                    count = 1;
                else{
                    count --;
                }
                passengerTv.setText(""+count);
            }
        });
    }
}
