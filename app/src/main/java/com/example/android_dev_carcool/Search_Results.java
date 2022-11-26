package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Search_Results extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        back = findViewById(R.id.goBackSearchResults);
        CardView search1 = (CardView) findViewById(R.id.cardId1);
        CardView search2 = (CardView) findViewById(R.id.cardId2);
        CardView search3 = (CardView) findViewById(R.id.cardId3);
        CardView search4 = (CardView) findViewById(R.id.cardId4);


        search1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent i = new Intent(Search_Results.this, Confirm_Ride.class);
                                          startActivity(i);
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