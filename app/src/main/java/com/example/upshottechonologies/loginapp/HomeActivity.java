package com.example.upshottechonologies.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String str = getIntent().getStringExtra("Name");
        tv= findViewById(R.id.tv);
        tv.setText("Hi Welcome "+str);

    }
}
