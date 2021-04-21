package com.kmtstudio.cardviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView school,hospital,airport,restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        school = findViewById(R.id.schoolID);
        hospital = findViewById(R.id.hospitalID);
        airport = findViewById(R.id.airportID);
        restaurant = findViewById(R.id.restaurantID);



        school.setOnClickListener(this);
        hospital.setOnClickListener(this);
        airport.setOnClickListener(this);
        restaurant.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.schoolID) {

            Intent intent = new Intent(MainActivity.this,SchoolActivity.class);
            startActivity(intent);

        } else if (v.getId()==R.id.hospitalID) {

            Intent intent = new Intent(MainActivity.this,HospitalActivity.class);
            startActivity(intent);

        } else if (v.getId()==R.id.airportID) {

            Intent intent = new Intent(MainActivity.this,AirportActivity.class);
            startActivity(intent);

        } else if (v.getId()==R.id.restaurantID) {

            Intent intent = new Intent(MainActivity.this,RestaurantActivity.class);
            startActivity(intent);

        }

    }
}