package com.example.servizilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sp4_dash extends AppCompatActivity {
    Button buttoncontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp4_dash);
        buttoncontact=findViewById(R.id.button21);
        buttoncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sp4_dash.this,sp_6_contact.class);
                startActivity(intent);
            }
        });
    }

}