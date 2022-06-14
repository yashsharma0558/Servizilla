package com.example.servizilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class st_2_creativityworker extends AppCompatActivity {
    Button buttonartwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st2_creativityworker);
        buttonartwork=findViewById(R.id.button16);
        buttonartwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_2_creativityworker.this,st_3_area.class);
                startActivity(intent);            }
        });
    }
}