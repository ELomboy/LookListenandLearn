package com.prjucu.preschoollearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class alphabet extends AppCompatActivity {
    ImageView abcd,efgh,ijkl,mnop,qrst,uvyx,yz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        abcd = findViewById(R.id.abcd);
        efgh = findViewById(R.id.efgh);
        ijkl = findViewById(R.id.ijkl);
        mnop = findViewById(R.id.mnop);
        qrst = findViewById(R.id.qrst);
        uvyx = findViewById(R.id.uvyx);
        yz = findViewById(R.id.yz);

        abcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alphabet.this,abcd.class);
                startActivity(intent);
            }
        });

        efgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alphabet.this,efgh.class);
                startActivity(intent);
            }
        });

        ijkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alphabet.this,ijkl.class);
                startActivity(intent);
            }
        });

        mnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alphabet.this,mnop.class);
                startActivity(intent);
            }
        });

        qrst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alphabet.this,qrst.class);
                startActivity(intent);
            }
        });

        uvyx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alphabet.this,uvyx.class);
                startActivity(intent);
            }
        });

        yz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alphabet.this,yz.class);
                startActivity(intent);
            }
        });
    }
}