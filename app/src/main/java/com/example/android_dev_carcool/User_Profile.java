package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class User_Profile extends AppCompatActivity {

//    private User_Profile binding;
    TextView logout;
    TextView addBio;
    TextView miniBio;
    TextView add_preferences;
    TextView pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

//        binding = User_Profile.inflate(getLayoutInflater());

//        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_nav_menu);
//        bottomNavigationView.setSelectedItemId(R.id.search);


        addBio = findViewById(R.id.add_bio);
        miniBio = findViewById(R.id.mini_bio);
        add_preferences = findViewById(R.id.add_preferences);
        pref = findViewById(R.id.preferences);
        logout = findViewById(R.id.logout_btn);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(User_Profile.this, "Logged Out Successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(User_Profile.this, MainActivity.class));
            }
        });

        addBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomDialog();
            }
        });

        add_preferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomDialog2();
            }
        });

        FirebaseDatabase.getInstance().getReference().child("UserDetails").push().setValue("abcd");
    }

    void showCustomDialog() {
        final Dialog dialog = new Dialog(this);
        //We have added a title in the custom layout. So let's disable the default title.
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //The user will be able to cancel the dialog bu clicking anywhere outside the dialog.
        dialog.setCancelable(true);
        //Mention the name of the layout of your custom dialog.
        dialog.setContentView(R.layout.custom_dialog);

        //Initializing the views of the dialog.
        final EditText nameEt = dialog.findViewById(R.id.name_bio);
        Button submitButton = dialog.findViewById(R.id.submit_button);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEt.getText().toString();
                dialog.dismiss();
                miniBio.setText(name);
                addBio.setVisibility(View.GONE);
            }
        });
        dialog.show();
    }

    void showCustomDialog2() {
        final Dialog dialog2 = new Dialog(this);
        //We have added a title in the custom layout. So let's disable the default title.
        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //The user will be able to cancel the dialog bu clicking anywhere outside the dialog.
        dialog2.setCancelable(true);
        //Mention the name of the layout of your custom dialog.
        dialog2.setContentView(R.layout.custom_dialog2);
        //Initializing the views of the dialog.
        final EditText nameEt = dialog2.findViewById(R.id.name_pref);
        Button submitButton = dialog2.findViewById(R.id.submit_button2);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEt.getText().toString();
                dialog2.dismiss();
                pref.setText(name);
                add_preferences.setVisibility(View.GONE);
            }
        });
        dialog2.show();
    }


}