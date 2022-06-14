package com.example.servizilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class st_1_services extends AppCompatActivity {
    Button buttonbasic;
    Button buttoncarp;
    Button buttoncater;
    Button buttoncreativ;
    Button buttonelec;
    Button buttonevent;
    Button buttonfabricate;
    Button buttongarden;
    Button buttonhealth;
    Button buttonhomedec;
    Button buttontutor;
    Button buttonhousemaid;
    Button buttonlaunderer;
    Button buttonmensonary;
    Button buttonpainter;
    Button buttonplumber;
    Button buttonsecurity;
    Button buttonvehserv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st1_services);
         buttonbasic = findViewById(R.id.button31);
         buttoncarp = findViewById(R.id.button2);
         buttoncater = findViewById(R.id.button3);
         buttoncreativ= findViewById(R.id.button13);
         buttonelec= findViewById(R.id.button4);
         buttonevent= findViewById(R.id.button33);
         buttonfabricate= findViewById(R.id.button8);
         buttongarden= findViewById(R.id.button5);
         buttonhealth= findViewById(R.id.button35);
         buttonhomedec= findViewById(R.id.button6);
         buttontutor= findViewById(R.id.button7);
         buttonhousemaid= findViewById(R.id.button30);
         buttonlaunderer= findViewById(R.id.button29);
         buttonmensonary= findViewById(R.id.button9);
         buttonpainter= findViewById(R.id.button10);
         buttonplumber= findViewById(R.id.button11);
         buttonsecurity= findViewById(R.id.button12);
         buttonvehserv= findViewById(R.id.button34);
         buttonbasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_basicservices.class);
                startActivity(intent);
            }
        });
        buttoncarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_carpentary.class);
                startActivity(intent);
            }
        });
        buttoncater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_catering.class);
                startActivity(intent);
            }
        });
        buttoncreativ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_creativityworker.class);
                startActivity(intent);
            }
        });
        buttonelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_electrician.class);
                startActivity(intent);
            }
        });
        buttonevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_events.class);
                startActivity(intent);
            }
        });
        buttonfabricate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_fabricationwork.class);
                startActivity(intent);
            }
        });
        buttongarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_gardening.class);
                startActivity(intent);
            }
        });
        buttonhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_healthcare.class);
                startActivity(intent);
            }
        });
        buttonhomedec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_homedecor.class);
                startActivity(intent);
            }
        });
        buttontutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_hometutor.class);
                startActivity(intent);
            }
        });
        buttonhousemaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_housemaid.class);
                startActivity(intent);
            }
        });
        buttonlaunderer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_launderer.class);
                startActivity(intent);
            }
        });
        buttonmensonary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_mensonary.class);
                startActivity(intent);
            }
        });
        buttonpainter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_painters.class);
                startActivity(intent);
            }
        });
        buttonplumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_plumber.class);
                startActivity(intent);
            }
        });
        buttonsecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_security.class);
                startActivity(intent);
            }
        });
        buttonvehserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(st_1_services.this,st_2_vehicleservices.class);
                startActivity(intent);
            }
        });







    }
}