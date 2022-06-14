package com.example.servizilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonst=findViewById(R.id.idBtnVerify);
        buttonst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,st_1_services.class);
                startActivity(intent);
            }
        });
    }
    public void openActivity(View v){
        Intent intent = new Intent(this,sp_1_signin.class);
        startActivity(intent);
    }


}