package com.example.applicationtourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // DatabaseHelper myDb;
    DataAccessLayer dal;
    Button hotels,clinics,institution,restaurant,shopping,spa,taxi,gallery,travel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dal=new DataAccessLayer(this);
        dal.loadData();


        hotels=(Button)findViewById(R.id.hotel);
        clinics=(Button)findViewById(R.id.clinics);
        restaurant=(Button)findViewById(R.id.restaurant);
        taxi=(Button)findViewById(R.id.taxi);
        institution=(Button)findViewById(R.id.institution);
        spa=(Button)findViewById(R.id.spa);
        shopping=(Button)findViewById(R.id.shopping);
        travel=(Button)findViewById(R.id.travel);
        gallery=(Button)findViewById(R.id.things);



        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),HotelActivity.class);
                startActivity(intent);

            }
        });
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),RestaurantActivity.class);
                startActivity(intent);

            }
        });
        clinics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),ClinicsActivity.class);
                startActivity(intent);

            }
        });
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),ShoppingActivity.class);
                startActivity(intent);

            }
        });
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), TaxiActivity.class);
                startActivity(intent);

            }
        });
        institution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),InstitutionsActivity.class);
                startActivity(intent);

            }
        });   spa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),SpaActivity.class);
                startActivity(intent);

            }
        });   gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),GalleryActivity.class);
                startActivity(intent);

            }
        });   travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),TravelAgentsActivity.class);
                startActivity(intent);

            }
        });




    }
}
