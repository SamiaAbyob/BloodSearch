package com.example.bloodsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourActivity extends AppCompatActivity implements View.OnClickListener {
    Button location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        location = (Button)findViewById(R.id.locatiobButton);
        location.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent locationIntent = new Intent(FourActivity.this,FiveActivity.class);
        startActivity(locationIntent);

    }
}
