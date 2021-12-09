package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
AppCompatButton b1,b2;
String getName,getAddress,getPhoneNo,getEmailId,getUsername,getPassword,getConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.address);
        ed3=(EditText)findViewById(R.id.phoneno);
        ed4=(EditText)findViewById(R.id.emailid);
        ed5=(EditText)findViewById(R.id.username);
        ed6=(EditText)findViewById(R.id.password);
        ed7=(EditText)findViewById(R.id.confirmpassword);
        b1=(AppCompatButton)findViewById(R.id.register);
        b2=(AppCompatButton)findViewById(R.id.backtologin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getAddress,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPhoneNo,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getEmailId,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getUsername,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getConfirmPassword,Toast.LENGTH_LONG).show();

            }
        });b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });



    }
}