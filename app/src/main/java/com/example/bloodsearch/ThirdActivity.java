package com.example.bloodsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    Button findBloodButton;
    TextView userNameshow,bloodGroupshow,addRessShow,phoneNumberShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toast.makeText(ThirdActivity.this,"Signup successfully",Toast.LENGTH_SHORT).show();
        findBloodButton = (Button)findViewById(R.id.findbutton);
        findBloodButton.setOnClickListener(this);
        userNameshow = (TextView)findViewById(R.id.usernameShow);
        bloodGroupshow = (TextView)findViewById(R.id.bloodgroupShow);
        addRessShow = (TextView)findViewById(R.id.addressShow);
        phoneNumberShow = (TextView)findViewById(R.id.phonenumberShow);
        Bundle  bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String username = bundle.getString("User Name");
            String bloodgroup = bundle.getString("Blood Group");
            String address = bundle.getString("Address");
            String phonenumber = bundle.getString("Phone number");

            userNameshow.setText(username);
            bloodGroupshow.setText(bloodgroup);
            addRessShow.setText(address);
            phoneNumberShow.setText(phonenumber);

        }

    }

    @Override
    public void onClick(View v) {
       Intent findbuttonIntent = new Intent(ThirdActivity.this,FourActivity.class);
       startActivity(findbuttonIntent);

    }
}
