package com.example.janit.capstoneproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

//Icons Made by monkik
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView creditCardPane = (CardView) findViewById(R.id.credit_card);
        CardView scholarshipPane = (CardView) findViewById(R.id.scholarship);
        CardView carPane = (CardView) findViewById(R.id.car);
        CardView housePane = (CardView) findViewById(R.id.housing);
        creditCardPane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creditCard(v);
            }
        });
        scholarshipPane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scholarship(v);
            }
        });
        carPane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car(v);
            }
        });
        housePane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                house(v);
            }
        });

    }


    public void creditCard(View view){
        startActivity(new Intent(MainActivity.this,creditCard.class));
    }
    public void scholarship(View view){
        startActivity(new Intent(MainActivity.this,studentloan.class));
    }
    public void car(View view){
        startActivity(new Intent(MainActivity.this,car.class));
    }
    public void house(View view){
        startActivity(new Intent(MainActivity.this,house.class));
    }


}


