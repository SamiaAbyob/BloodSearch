package com.example.bloodsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mainActivityButton;
    Button loginActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityButton =(Button) findViewById(R.id.signupbuttonId);
        mainActivityButton.setOnClickListener(this);
        loginActivityButton=(Button) findViewById(R.id.loginbuttonId);
        loginActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case  R.id.signupbuttonId:
                Intent signupIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(signupIntent);
                break;
            case  R.id.loginbuttonId:
                Intent loginIntent = new Intent(MainActivity.this,FourActivity.class);
                startActivity(loginIntent);

        }




    }
}
