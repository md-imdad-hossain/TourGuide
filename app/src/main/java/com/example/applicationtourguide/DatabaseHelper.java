package com.example.applicationtourguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.LinkedList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="tourGuide.db";
    private static final int DATABASE_VERSION = 3 ;
    public static final String TABLE_NAME_HOTEL="tbHotel";
    public static final String TABLE_NAME_RESTAURANT="tbRestaurant";
    public static final String TABLE_NAME_CLINIC="tbClinic";
    public static final String TABLE_NAME_INSTITUTION="tbInstitution";
    public static final String TABLE_NAME_SHOPPING="tbShopping";
    public static final String TABLE_NAME_TRAVELAGENT="tbTravelagent";
    public static final String TABLE_NAME_SPA="tbSpa";
    public static final String TABLE_NAME_TAXI="tbTaxi";
    public static final String COLUMN_ID="id";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_ADDRESS="address";
    public static final String COLUMN_IMAGE="imagename";
    public static final String COLUMN_DETAILS="details";
    public static final String COLUMN_PHONE="phonenum";
    public static final String COLUMN_WEB="website";

    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME , null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TABLE_NAME_HOTEL + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_ADDRESS + " NUMBER NOT NULL, " +
                COLUMN_DETAILS + " TEXT NOT NULL, " +
                COLUMN_PHONE + " TEXT NOT NULL, " +
                COLUMN_WEB + " TEXT NOT NULL, " +
                COLUMN_IMAGE + " TEXT NOT NULL);"
        );
        db.execSQL(" CREATE TABLE " + TABLE_NAME_RESTAURANT + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_ADDRESS + " NUMBER NOT NULL, " +
                COLUMN_DETAILS + " TEXT NOT NULL, " +
                COLUMN_PHONE + " TEXT NOT NULL, " +
                COLUMN_WEB + " TEXT NOT NULL, " +
                COLUMN_IMAGE + " TEXT NOT NULL);"
        );
        db.execSQL(" CREATE TABLE " + TABLE_NAME_CLINIC + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_ADDRESS + " NUMBER NOT NULL, " +
                COLUMN_DETAILS + " TEXT NOT NULL, " +
                COLUMN_PHONE + " TEXT NOT NULL, " +
                COLUMN_WEB + " TEXT NOT NULL, " +
                COLUMN_IMAGE + " TEXT NOT NULL);"
        );
        db.execSQL(" CREATE TABLE " + TABLE_NAME_SHOPPING + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_ADDRESS + " NUMBER NOT NULL, " +
                COLUMN_DETAILS + " TEXT NOT NULL, " +
                COLUMN_PHONE + " TEXT NOT NULL, " +
                COLUMN_WEB + " TEXT NOT NULL, " +
                COLUMN_IMAGE + " TEXT NOT NULL);"
        );
        db.execSQL(" CREATE TABLE " + TABLE_NAME_INSTITUTION + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_ADDRESS + " NUMBER NOT NULL, " +
                COLUMN_DETAILS + " TEXT NOT NULL, " +
                COLUMN_PHONE + " TEXT NOT NULL, " +
                COLUMN_WEB + " TEXT NOT NULL, " +
                COLUMN_IMAGE + " TEXT NOT NULL);"
        );
        db.execSQL(" CREATE TABLE " + TABLE_NAME_SPA + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_ADDRESS + " NUMBER NOT NULL, " +
                COLUMN_DETAILS + " TEXT NOT NULL, " +
                COLUMN_PHONE + " TEXT NOT NULL, " +
                COLUMN_WEB + " TEXT NOT NULL, " +
                COLUMN_IMAGE + " TEXT NOT NULL);"
        );
        db.execSQL(" CREATE TABLE " + TABLE_NAME_TAXI + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_ADDRESS + " NUMBER NOT NULL, " +
                COLUMN_DETAILS + " TEXT NOT NULL, " +
                COLUMN_PHONE + " TEXT NOT NULL, " +
                COLUMN_WEB + " TEXT NOT NULL, " +
                COLUMN_IMAGE + " TEXT NOT NULL);"
        );
        db.execSQL(" CREATE TABLE " + TABLE_NAME_TRAVELAGENT + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_ADDRESS + " NUMBER NOT NULL, " +
                COLUMN_DETAILS + " TEXT NOT NULL, " +
                COLUMN_PHONE + " TEXT NOT NULL, " +
                COLUMN_WEB + " TEXT NOT NULL, " +
                COLUMN_IMAGE + " TEXT NOT NULL);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_HOTEL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_RESTAURANT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_SHOPPING);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_CLINIC);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_SPA);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_INSTITUTION);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_TRAVELAGENT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_TAXI);
        this.onCreate(db);
    }

    public void insertData(ModelClass modelClass, String table_Name){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COLUMN_NAME,modelClass.getItemName());
        contentValues.put(COLUMN_ADDRESS,modelClass.getItemAddress());
        contentValues.put(COLUMN_IMAGE,modelClass.getItemImage());
        contentValues.put(COLUMN_DETAILS,modelClass.getItemDetails());
        contentValues.put(COLUMN_PHONE,modelClass.getItemPhone());
        contentValues.put(COLUMN_WEB,modelClass.getItemWebsite());

        long result =db.insert(table_Name,null,contentValues);

        if(result== -1){
            Log.d("dbstatus","not inserted");
        }
        else {
            Log.d("dbstatus"," inserted");
        }

        db.close();
    }


    /**Query records, give options to filter results**/
    public List<ModelClass> ItemList(String filter,String table_name) {
        String query;
        if(filter.equals("")){
            //regular query
            query = "SELECT  * FROM " + table_name;
        }else{
            //filter results by filter option provided
            query = "SELECT  * FROM " + table_name + " ORDER BY "+ filter;
        }

        List<ModelClass> modelLinkedList = new LinkedList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        ModelClass modelClass;

        if (cursor.moveToFirst()) {
            do {
                modelClass = new ModelClass();

                modelClass.setItemId(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)));
                modelClass.setItemName(cursor.getString(cursor.getColumnIndex(COLUMN_NAME)));
                modelClass.setItemAddress(cursor.getString(cursor.getColumnIndex(COLUMN_ADDRESS)));
                modelClass.setItemDetails(cursor.getString(cursor.getColumnIndex(COLUMN_DETAILS)));
                modelClass.setItemImage(cursor.getString(cursor.getColumnIndex(COLUMN_IMAGE)));
                modelClass.setItemPhone(cursor.getString(cursor.getColumnIndex(COLUMN_PHONE)));
                modelClass.setItemWebsite(cursor.getString(cursor.getColumnIndex(COLUMN_WEB)));
                modelLinkedList.add(modelClass);
            } while (cursor.moveToNext());
        }

        db.close();
        cursor.close();
        return modelLinkedList;
    }

}
