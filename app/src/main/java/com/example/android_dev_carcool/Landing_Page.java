package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Landing_Page extends AppCompatActivity {

    EditText leavingFrom;
    EditText goingTo;
    EditText date;
    EditText noOfPassengers;
    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
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