package com.prjucu.preschoollearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class shape extends AppCompatActivity {
    ImageView arrows,cirlces,hearts,hexagons,ovals,pentagons,rectangles,squares,stars,triangles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);
        arrows = findViewById(R.id.arrows);
        cirlces = findViewById(R.id.circles);
        hearts = findViewById(R.id.hearts);
        hexagons = findViewById(R.id.hexagons);
        ovals = findViewById(R.id.ovals);
        pentagons = findViewById(R.id.pentagons);
        rectangles = findViewById(R.id.rectangles);
        squares = findViewById(R.id.squares);
        stars = findViewById(R.id.stars);
        triangles = findViewById(R.id.triangles);

        arrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,arrows.class);
                startActivity(intent);
            }
        });

        cirlces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,cirlces.class);
                startActivity(intent);
            }
        });

        hearts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,hearts.class);
                startActivity(intent);
            }
        });

        hexagons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,hexagons.class);
                startActivity(intent);
            }
        });

        ovals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,ovals.class);
                startActivity(intent);
            }
        });

        pentagons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,pentagons.class);
                startActivity(intent);
            }
        });

        rectangles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,rectangles.class);
                startActivity(intent);
            }
        });

        squares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,squares.class);
                startActivity(intent);
            }
        });

        stars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,stars.class);
                startActivity(intent);
            }
        });

        triangles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shape.this,triangles.class);
                startActivity(intent);
            }
        });



    }
}