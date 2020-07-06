package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_id);
        ImageButton imgbtn = findViewById(R.id.imgbtn_id);
        final CalendarView calendarView = findViewById(R.id.calendarView_id);
        final ImageView img = findViewById(R.id.img_id);
        final TextView tv = findViewById(R.id.tv_id);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("点击彩色砖头可以让普通砖头变成金色！");
                Log.i("MainActivity", "onClick: changetext");
            }
        });

        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageDrawable(getResources().getDrawable(R.drawable.gold));
                Log.i("MainActivity", "onClick: changeimage");
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Log.i("MainActivity", "onSelectedDayChange");
            }
        });

    }
}