package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Drop_Off_Publish_Ride extends AppCompatActivity {
    ImageView next, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_off_publish_ride);

        next = findViewById(R.id.next_icon_drop_off_publish);
        back = findViewById(R.id.goBackIconDropOffPage);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Drop_Off_Publish_Ride.this, PublishReturnTripActivity.class));
            }
        });


    }
}