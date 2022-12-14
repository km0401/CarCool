package com.example.android_dev_carcool;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.TimePicker;

public class booking_time extends Activity {

    private TimePicker timePicker1;
//    private TextView time;
    private Calendar calendar;
    private String format = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_time);

        timePicker1 = (TimePicker) findViewById(R.id.timePicker1);
//        time = (TextView) findViewById(R.id.textView1);
        calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        showTime(hour, min);
    }
    public void setTime(View view) {
        int hour = timePicker1.getCurrentHour();
        int min = timePicker1.getCurrentMinute();
        showTime(hour, min);
        startActivity(new Intent(booking_time.this, Drop_Off_Publish_Ride.class));
    }

    public void showTime(int hour, int min) {
        if (hour == 0) {
            hour += 12;
            format = "AM";
        } else if (hour == 12) {
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }

//        time.setText(new StringBuilder().append(hour).append(" : ").append(min)
//                .append(" ").append(format));
    }


}
