package com.example.servizilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sp3_signup extends AppCompatActivity {
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp3_signup);
        textView3 = findViewById(R.id.textView3);
        Intent intent = getIntent();
        String name = intent.getStringExtra(sp2_signup.EXTRA_NAME);
        textView3.setText(name +", Write your experience");
    }

    public void openActivity(View v){
        Intent intent = new Intent(this,sp4_dash.class);
        startActivity(intent);
    }
}