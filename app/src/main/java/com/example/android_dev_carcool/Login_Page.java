package com.example.android_dev_carcool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Login_Page extends AppCompatActivity {
    Button login_button;
    ImageView goBack;
    EditText email;
    EditText password;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        login_button = findViewById(R.id.login_page_button);
        goBack = findViewById(R.id.goBackIconLoginPage);
        email = findViewById(R.id.email_login);
        password = findViewById(R.id.password_login);

        auth = FirebaseAuth.getInstance();

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MainActivity.class);
                startActivity(i);
            }
        }
        );

        login_button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          String txt_email = email.getText().toString();
                                          String txt_pswd = password.getText().toString();
                                          loginUser(txt_email,txt_pswd);
                                      }
                                  }
        );
    }

    private void loginUser(String email, String password) {
        auth.signInWithEmailAndPassword(email, password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                FirebaseDatabase.getInstance().getReference().child("android_dev_CarCool").child("Android Test").setValue("abcd");
                Toast.makeText(Login_Page.this, "Login Successful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login_Page.this, User_Profile.class));
            }
        });
    }
}
