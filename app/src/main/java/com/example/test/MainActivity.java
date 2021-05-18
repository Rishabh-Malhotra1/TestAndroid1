package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });
         button2 = (Button)  findViewById(R.id.button3);
         button2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity4();
                }
            });
    }
    public void openActivity2(){
        Intent intent =  new Intent(this,Views.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent1 =  new Intent(this,ViewGroup.class);
        startActivity(intent1);
    }
}