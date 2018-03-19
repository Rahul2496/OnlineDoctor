package com.example.pankajthawani.onlinedoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
    TextView reg;
    EditText name,mob;
    Button register;
    static  String nameuser,mobuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        reg =(TextView)findViewById(R.id.textView);
        name =(EditText)findViewById(R.id.editText);
        mob =(EditText)findViewById(R.id.editText2);
        register =(Button)findViewById(R.id.submitbtn);
        nameuser=name.getText().toString();
        mobuser=mob.getText().toString();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Code to intent...
            }
        });

    }
}
