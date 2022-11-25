package com.example.android_dev_carcool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class comfort extends AppCompatActivity {
    ImageView goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comfort);


        goBack = findViewById(R.id.goBackIconcomfortPage);

        goBack.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent i = new Intent(v.getContext(), No_Of_Passenger_Publish_Ride.class);
                                          startActivity(i);
                                      }
                                  }
        );
    }
}
