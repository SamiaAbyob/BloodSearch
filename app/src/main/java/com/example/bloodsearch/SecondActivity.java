package com.example.bloodsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button thirdActivityButton;
    EditText senduserName,sendbloodGroup,sendphoneNumber,sendAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        thirdActivityButton = (Button) findViewById(R.id.signupbuttonId1);
        senduserName =(EditText)findViewById(R.id.editId3);
        sendbloodGroup= (EditText)findViewById(R.id.editId5);
        sendphoneNumber = (EditText)findViewById(R.id.editId6);
        sendAddress = (EditText)findViewById(R.id.editId7);
        thirdActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String userName = senduserName.getText().toString();
        String bloodGroup = sendbloodGroup.getText().toString();
        String phoneNumber = sendphoneNumber.getText().toString();
        String address = sendAddress.getText().toString();
        Intent  signup1Intent = new Intent(SecondActivity.this,ThirdActivity.class);
        signup1Intent.putExtra("User Name",userName);
        signup1Intent.putExtra("Blood Group",bloodGroup);
        signup1Intent.putExtra("Address",address);
        signup1Intent.putExtra("Phone number",phoneNumber);

        startActivity(signup1Intent);

    }
}
