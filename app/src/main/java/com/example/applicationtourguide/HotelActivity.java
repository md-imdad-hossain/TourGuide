package com.example.applicationtourguide;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class HotelActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private DatabaseHelper myDb;
    private MyAdapter adapter;
    private String filter = "";
    private String table_name = "tbHotel";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        //initialize the variables
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        populateRecyclerView(filter,table_name);


    }

    private void populateRecyclerView(String filter,String table_name){
        myDb = new DatabaseHelper(this);
        adapter = new MyAdapter(myDb.ItemList(filter,table_name), this, mRecyclerView);
        mRecyclerView.setAdapter(adapter);

    }
}
