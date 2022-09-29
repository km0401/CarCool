package com.example.android_dev_carcool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Page extends AppCompatActivity {
    Button login_button;
    ImageView goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        login_button = findViewById(R.id.login_page_button);
        goBack = findViewById(R.id.goBackIconLoginPage);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), User_Profile.class);
                startActivity(i);
            }
        }
        );

        goBack.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent i = new Intent(v.getContext(), MainActivity.class);
                                          startActivity(i);
                                      }
                                  }
        );
    }
}
