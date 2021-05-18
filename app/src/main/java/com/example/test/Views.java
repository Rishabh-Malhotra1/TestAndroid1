package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Views extends AppCompatActivity {
    private ImageView imageView;
    private  EditText text1,text2;
    private TextView textView;
    int press = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views);
        imageView = findViewById(R.id.imageView);
        imageView.setBackgroundColor(Color.rgb(128, 128, 128));
        text1 = (EditText) findViewById(R.id.editTextTextPersonName3);
        text1.setHint("Enter Alphanumeric");
        text2 = (EditText) findViewById(R.id.editTextNumber);
        text2.setHint("Enter Number");
        textView = (TextView) findViewById(R.id.editTextTextPersonName2);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                press++;
                if(press%3==1){
                    textView.setTextColor(Color.RED);
                    textView.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                    }
                if(press%3==2){
                    textView.setTextColor(Color.GREEN);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if(press%3==0){
                    textView.setTextColor(Color.BLUE);
                    textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
                }
            }
        });
    }

}