package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private Button button;
    private EditText text1, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.button);
        text1 = (EditText) findViewById(R.id.editTextTextPassword);
        text1.setHint("Enter Password");
        text2 = (EditText) findViewById(R.id.editTextTextPersonName);
        text2.setHint("Enter Username");


        button.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String usr = new String (String.valueOf(text2.getText()));
                String pwd = new String (String.valueOf(text1.getText()));
                if(usr.equals("admin")&&pwd.equals("admin123")){
                    openActivity2();
                }
            }
        });
    }


    public void openActivity2(){
        Intent intent =  new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}