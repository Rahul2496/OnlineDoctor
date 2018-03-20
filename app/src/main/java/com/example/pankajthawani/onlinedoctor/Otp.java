package com.example.pankajthawani.onlinedoctor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Otp extends AppCompatActivity {
    EditText otp;
    Button submit;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        submit=findViewById(R.id.submitbtn);
        otp=findViewById(R.id.editText3);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   if (Registration.number.toString().equals(otp.getText().toString()))
                   {
                        Intent intent=new Intent(Otp.this,HomePage.class);
                        startActivity(intent);
                   }
                   else {
                       Toast.makeText(Otp.this, "Enter vslid OTP", Toast.LENGTH_SHORT).show();
                   }
               }
                catch (Exception e)
                {
                    Toast.makeText(Otp.this, ""+e, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
