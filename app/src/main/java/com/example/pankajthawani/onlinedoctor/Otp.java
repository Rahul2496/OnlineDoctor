package com.example.pankajthawani.onlinedoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Otp extends AppCompatActivity {
    TextView otp,help;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        help=findViewById(R.id.helpon);
    }
    public void on_help(View view)
    {
        //Intent intent=new Intent(Otp.this,Help.class)
        //startActivity(intent);
    }
}
