package com.example.stop_watch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    Button btnget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// set the user interface layout for this activity
        btnget=findViewById(R.id.btnget);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
    }
//connect two activity
    public void get(View view) {
        Intent intent=new Intent(this,stopwatch_activity.class);
        startActivity(intent);
    }
}