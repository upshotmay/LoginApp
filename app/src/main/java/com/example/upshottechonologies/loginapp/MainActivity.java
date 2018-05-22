package com.example.upshottechonologies.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etPwd, etUname;
    Button insert;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new DBHelper(this);
        etPwd = findViewById(R.id.etPwd);
        etUname = findViewById(R.id.etUname);
        insert = findViewById(R.id.insertButton);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insert(etUname.getText().toString(), etPwd.getText().toString());
            }
        });
    }
}
