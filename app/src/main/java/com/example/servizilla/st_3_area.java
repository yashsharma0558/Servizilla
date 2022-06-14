package com.example.servizilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class st_3_area extends AppCompatActivity {
    Button buttonexp;
    Button buttonrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st3_area);
        buttonexp=findViewById(R.id.button36);
        buttonrate=findViewById(R.id.button39);
        buttonrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_3_area.this,st_3_rating.class);
                startActivity(intent);
            }
        });
        buttonexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(st_3_area.this,st_3_experience.class);
                startActivity(intent);
            }
        });
    }
}