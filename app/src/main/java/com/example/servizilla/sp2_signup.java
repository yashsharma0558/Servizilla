package com.example.servizilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class sp2_signup extends AppCompatActivity {
    EditText name;
    public static final String EXTRA_NAME = "com.example.protosss.extra.NAME";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp2_signup);
    }

    public void openActivity(View v) {
        Intent intent = new Intent(this, sp3_signup.class);
        name = findViewById(R.id.name);
        String nameText = name.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText);
        startActivity(intent);

    }
}