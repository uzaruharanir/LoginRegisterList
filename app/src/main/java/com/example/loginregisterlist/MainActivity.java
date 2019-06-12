package com.example.loginregisterlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etemail,etpassword;
    Button btnlogin,btnregister;
    String email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etemail=(EditText)findViewById(R.id.etemail);
        etpassword=(EditText)findViewById(R.id.etpassword);
        btnlogin=(Button)findViewById(R.id.btnlogin);
        btnregister=(Button)findViewById(R.id.btnregister);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calllist=new Intent(MainActivity.this,List.class);
                startActivity(calllist);
            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Intent calllist=new Intent(MainActivity.this,List.class);
                //startActivity(calllist);
                email=etemail.getText().toString().trim();
                password=etpassword.getText().toString().trim();
                if(email.isEmpty())
                {
//Display Message
                    Toast.makeText(getApplicationContext(),"Please enter your Email", Toast.LENGTH_SHORT).show();
                }
                if(password.isEmpty())
                {
//Display Message
                    Toast.makeText(getApplicationContext(),"Please enter your Password", Toast.LENGTH_SHORT).show();
                }
                if(email.equals("uzarwanda@gmail.com") && password.equals("123"))
                {
//Display Message
                    Toast.makeText(getApplicationContext(),"Login Success", Toast.LENGTH_SHORT).show();
                    Intent calllist=new Intent(MainActivity.this,List.class);
                    startActivity(calllist);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
