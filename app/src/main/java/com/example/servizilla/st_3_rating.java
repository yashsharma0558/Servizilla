package com.example.servizilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class st_3_rating extends AppCompatActivity {
    Button buttonarea;
    Button buttonexp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st3_rating);
        buttonarea = findViewById(R.id.button37);
        buttonexp = findViewById(R.id.button36);
        buttonarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_3_rating.this,st_3_area.class);
                startActivity(intent);
            }
        });
        buttonexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(st_3_rating.this,st_3_experience.class);
                startActivity(intent);
            }
        });
    }
}