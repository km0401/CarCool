package com.example.android_dev_carcool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Signup_Page extends AppCompatActivity {

    ImageView goBack;
    Button proceed;
    EditText name;
    EditText mobile;
    EditText cnf_pswd;
    EditText email;
    EditText password;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FirebaseApp.initializeApp(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        goBack = findViewById(R.id.goBackIconSignUpPage);
        proceed = findViewById(R.id.proceed_button);
        email = findViewById(R.id.email_signup);
        name = findViewById(R.id.name_signup);
        mobile = findViewById(R.id.mob_signup);
        password = findViewById(R.id.pswd_signup);
        cnf_pswd = findViewById(R.id.cnfm_pswd_signup);

        auth = FirebaseAuth.getInstance();
        goBack.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                finish();
                                            }
                                        }
        );

        proceed.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           String txt_email = email.getText().toString();
                                           String txt_name = name.getText().toString();
                                           String txt_mob = mobile.getText().toString();
                                           String txt_cpwd = cnf_pswd.getText().toString();
                                           String txt_pswd = password.getText().toString();

                                           if (txt_email.isEmpty() || txt_pswd.isEmpty() || txt_name.isEmpty() || txt_mob.isEmpty() || txt_cpwd.isEmpty()) {
                                               Toast.makeText(Signup_Page.this, "Empty Credentials", Toast.LENGTH_SHORT).show();
                                           } else if (txt_pswd.length() < 6) {
                                               Toast.makeText(Signup_Page.this, "Password Too Short", Toast.LENGTH_SHORT).show();
                                           } else if (!txt_pswd.equals(txt_cpwd)) {
                                               Toast.makeText(Signup_Page.this, "Reconfirm Password", Toast.LENGTH_SHORT).show();
                                           } else {
                                               registerUser(txt_email, txt_pswd);
                                               FirebaseDatabase.getInstance().getReference().child("Users").child(txt_mob).child("Full Name").setValue(txt_name);
                                               FirebaseDatabase.getInstance().getReference().child("Users").child(txt_mob).child("Email").setValue(txt_email);
                                           }
                                       }
                                   }
        );
    }

    private void registerUser(String email, String password) {
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(Signup_Page.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Signup_Page.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    FirebaseUser user = auth.getCurrentUser();
                    String txt_name = name.getText().toString();
                    UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                            .setDisplayName(txt_name).build();
                    startActivity(new Intent(Signup_Page.this, Login_Page.class));
                    finish();
                }
                else{
                    Toast.makeText(Signup_Page.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

