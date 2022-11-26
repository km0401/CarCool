package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Confirm_Ride extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_ride);

        Button Book = (Button) findViewById(R.id.search);
        back = findViewById(R.id.goBackIconConfirmRidePage);

        Book.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent i3 = new Intent(Confirm_Ride.this, Request_Sent.class);
                                        startActivity(i3);
                                    }
                                }
        );

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}

