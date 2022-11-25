package com.example.android_dev_carcool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Landing_Page extends AppCompatActivity {

    BottomNavigationView navigationView;


    EditText leavingFrom;
    EditText goingTo;
    EditText date;
    EditText noOfPassengers;
    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        navigationView= findViewById(R.id.bottom_nav_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.body_container,new SearchFragment()).commit();
        navigationView.setSelectedItemId(R.id.search_navbar);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch(item.getItemId()){

                    case R.id.search_navbar:
                        fragment=new SearchFragment();
                        break;

                    case R.id.rides_navbar:
                        fragment=new RidesFragment();
                        break;
                    case R.id.publish_navbar:
                        fragment=new PublishFragment();
                        break;
                    case R.id.profile_navbar:
                        fragment=new ProfileFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();

                return true;
            }
        });

        leavingFrom = findViewById(R.id.leaving_from_text);
        goingTo = findViewById(R.id.going_to_text);
        date = findViewById(R.id.date_input);
        noOfPassengers = findViewById(R.id.passenger_input);
        searchButton = findViewById(R.id.search_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}