package com.example.android_dev_carcool;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PastRides extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_rides);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)  findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.rides_navbar);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.search_navbar:
                        startActivity(new Intent(PastRides.this, Landing_Page.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.publish_navbar:
                        startActivity(new Intent(PastRides.this,PublishLeavingFromActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.rides_navbar:
                        return true;
                    case R.id.profile_navbar:
                        startActivity(new Intent(PastRides.this, User_Profile.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
