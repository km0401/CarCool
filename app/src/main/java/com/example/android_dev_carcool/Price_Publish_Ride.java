package com.example.android_dev_carcool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Price_Publish_Ride extends AppCompatActivity {
    ImageView increment, decrement;
    TextView priceTv;
    ImageView back, next;

    int count = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_publish_ride);

        increment = findViewById(R.id.increment_icon_price);
        decrement = findViewById(R.id.decrement_icon_price);
        priceTv = findViewById(R.id.price_value);
        back = findViewById(R.id.goBackIconPricePublishPage);
        next = findViewById(R.id.next_icon_price_publish);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Price_Publish_Ride.this, No_Of_Passenger_Publish_Ride.class));
            }
        });

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += 10;
                priceTv.setText(""+count);
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count<=30)
                    count = 30;
                else{
                    count -= 10;
                }
                priceTv.setText(""+count);
            }
        });
    }
}
