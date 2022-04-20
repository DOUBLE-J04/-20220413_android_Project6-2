package com.example.android_project6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1, button2;
        final ViewFlipper vf;
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        vf = (ViewFlipper)findViewById(R.id.viewFill);
        ImageView pic1 = (ImageView)findViewById(R.id.pic1);
        ImageView pic2 = (ImageView)findViewById(R.id.pic2);
        ImageView pic3 = (ImageView)findViewById(R.id.pic3);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                vf.setFlipInterval(1000);
                vf.startFlipping();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                vf.stopFlipping();
            }
        });
    }
}