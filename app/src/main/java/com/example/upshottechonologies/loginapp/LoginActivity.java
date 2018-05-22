package com.example.upshottechonologies.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etuname, etpwd;
    Button btn, register;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dbHelper = new DBHelper(this);
        etuname = findViewById(R.id.etusname);
        etpwd = findViewById(R.id.etpwd);
        btn = findViewById(R.id.loginbutton);
        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = etuname.getText().toString();
                String pwd= etpwd.getText().toString();
                String res = dbHelper.validate(uname, pwd);
                if(res!=null)
                {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class );
                    intent.putExtra("Name", res);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Entered Invalid username or  password", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
