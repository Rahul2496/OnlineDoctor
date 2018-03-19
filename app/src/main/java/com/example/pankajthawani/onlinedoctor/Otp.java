package com.example.pankajthawani.onlinedoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Otp extends AppCompatActivity {
    TextView help;
    EditText otp;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        help=findViewById(R.id.helpon);
    }
    public void on_help(View view)
    {

        try {
            //Code to check weather the entered OTP is correct or not..
            if (Registration.number.toString().equals(otp.getText().toString()))
            {
                Intent intent=new Intent(Otp.this,Dashboard.class);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(Otp.this, "Please enter valid OTP", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){e.getMessage();}

    }
}
