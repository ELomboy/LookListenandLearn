package com.prjucu.preschoollearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class color extends AppCompatActivity {
    ImageView black,pink,blue,purple,brown,red,green,white,orange,yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        black = findViewById(R.id.black);
        pink = findViewById(R.id.pink);
        blue = findViewById(R.id.blue);
        purple = findViewById(R.id.purple);
        brown = findViewById(R.id.brown);
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        white = findViewById(R.id.white);
        orange = findViewById(R.id.orange);
        yellow = findViewById(R.id.yellow);

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,black.class);
                startActivity(intent);
            }
        });

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,pink.class);
                startActivity(intent);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,blue.class);
                startActivity(intent);
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,purple.class);
                startActivity(intent);
            }
        });

        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,brown.class);
                startActivity(intent);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,red.class);
                startActivity(intent);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,green.class);
                startActivity(intent);
            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,white.class);
                startActivity(intent);
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,orange.class);
                startActivity(intent);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(color.this,yellow.class);
                startActivity(intent);
            }
        });


    }
}