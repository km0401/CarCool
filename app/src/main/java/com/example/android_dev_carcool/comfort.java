package com.example.android_dev_carcool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class comfort extends AppCompatActivity {
    ImageView goBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comfort);


        goBack2 = findViewById(R.id.goBackIconcomfortPage);

        goBack2.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent i2 = new Intent(v.getContext(), No_Of_Passenger_Publish_Ride.class);
                                          startActivity(i2);
                                      }
                                  }
        );
    }
}
