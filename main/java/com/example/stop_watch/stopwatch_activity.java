package com.example.stop_watch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

public class stopwatch_activity extends AppCompatActivity {
    Button start,stop,reset;
    Chronometer timerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        //set the user interface layout
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        reset=findViewById(R.id.reset);
        timerHere=findViewById(R.id.timerHere);

        //set start button
        start.setOnClickListener(v-> {
            timerHere.setBase(SystemClock.elapsedRealtime());
            timerHere.start();
        });

        //set the stop button
        stop.setOnClickListener(v-> timerHere.stop());

        //set the reset button
        reset.setOnClickListener(view -> timerHere.setBase(SystemClock.elapsedRealtime()));


    }

}