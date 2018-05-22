package com.example.upshottechonologies.loginapp;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.men_xml, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(HomeActivity.this, "Selected Item1", Toast.LENGTH_LONG).show();
                break;
            case R.id.settings:
                startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                Toast.makeText(HomeActivity.this, "Selected Settings", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
