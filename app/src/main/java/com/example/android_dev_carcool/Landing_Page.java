package com.example.android_dev_carcool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Landing_Page extends AppCompatActivity {

    EditText leavingFrom;
    EditText goingTo;
    EditText date;
    EditText noOfPassengers;
    Button searchButton;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        leavingFrom = findViewById(R.id.leaving_from_text);
        goingTo = findViewById(R.id.going_to_text);
        date = findViewById(R.id.date_input);
        noOfPassengers = findViewById(R.id.passenger_input);
        searchButton = findViewById(R.id.search_button);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.search_navbar);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.search_navbar:
                        return true;
                    case R.id.publish_navbar:
                        startActivity(new Intent(Landing_Page.this,PublishLeavingFromActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.rides_navbar:
                        startActivity(new Intent(Landing_Page.this, PastRides.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile_navbar:
                        startActivity(new Intent(Landing_Page.this, User_Profile.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Landing_Page.this, Search_Results.class));
            }
        });

    }
}