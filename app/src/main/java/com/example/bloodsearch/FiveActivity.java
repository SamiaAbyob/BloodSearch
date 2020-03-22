package com.example.bloodsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FiveActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView mapview1,mapview2,mapview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        Toast.makeText(FiveActivity.this,"Maps",Toast.LENGTH_SHORT).show();
        mapview1 = (ImageView) findViewById(R.id.map1);
        mapview2 = (ImageView) findViewById(R.id.map2);
        mapview3= (ImageView) findViewById(R.id.map3);
        mapview1.setOnClickListener(this);
        mapview2.setOnClickListener(this);
        mapview3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.map1)
        {
            mapview1.setVisibility(v.GONE);
            mapview2.setVisibility(v.VISIBLE);
            mapview3.setVisibility(v.GONE);
        }
        if(v.getId()==R.id.map2)
        {
            mapview1.setVisibility(v.GONE);
            mapview2.setVisibility(v.GONE);
            mapview3.setVisibility(v.VISIBLE);
        }

        if(v.getId()==R.id.map3)
        {
            mapview1.setVisibility(v.VISIBLE);
            mapview2.setVisibility(v.GONE);
            mapview3.setVisibility(v.GONE);
        }

    }
}
