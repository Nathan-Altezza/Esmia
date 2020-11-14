package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.MainActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.c1);
        Button b2 = findViewById(R.id.c2);
        Button b4 = findViewById(R.id.c4);
        Button b3 = findViewById(R.id.c3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent (getApplicationContext(), MainActivity2.class);
                startActivity(i);

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent (getApplicationContext(), MainActivity3.class);
                startActivity(i);

            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent (getApplicationContext(), MainActivity4.class);
                startActivity(i);

            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent (getApplicationContext(), MainActivity5.class);
                startActivity(i);

            }

        });
    }


}