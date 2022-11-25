package com.example.android_dev_carcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class PublishLeavingFromActivity extends AppCompatActivity {

    EditText place;
    ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish_leaving_from);

        place = (EditText) findViewById(R.id.place_publish);
        next = (ImageView) findViewById(R.id.next_leaving_from);

        next.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          String txt_place = place.getText().toString();
                                          if(txt_place.isEmpty()){
                                              Toast.makeText(PublishLeavingFromActivity.this, "Please enter the place", Toast.LENGTH_SHORT).show();
                                          }
                                          else{
                                              FirebaseDatabase.getInstance().getReference().child("RideDetails").push().child("Leaving From:").setValue(txt_place);
                                          }
                                          Intent i = new Intent(PublishLeavingFromActivity.this, Price_Publish_Ride.class);
                                          startActivity(i);
                                      }
                                  }
        );



    }
}