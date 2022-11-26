package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PublishReturnTripActivity extends AppCompatActivity {
    ImageView back;
    TextView yes, no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish_return_trip);

        back = findViewById(R.id.goBackPublishReturnTrip);
        yes = findViewById(R.id.yes_publish_return_trip);
        no = findViewById(R.id.no_publish_return_trip);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), PublishLeavingFromActivity.class));
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), PastRides.class));
            }
        });
    }
}