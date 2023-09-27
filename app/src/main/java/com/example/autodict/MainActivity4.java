package com.example.autodict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {
    ImageButton T1,T,T2,T3,T4,T5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        T = findViewById(R.id.imageButton2);
        T1=findViewById(R.id.imageButton5);
        T2=findViewById(R.id.imageButton6);
        T3 = findViewById(R.id.imageButton8);
        T4=findViewById(R.id.imageButton9);

        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(i);
            }
        });
        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(i);

            }
        });
        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(i);
            }
        });
        T3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity4.this, MainActivity9.class);
                startActivity(i);
            }
        });
        T4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity4.this, MainActivity8.class);
                startActivity(i);
            }
        });
    }
}