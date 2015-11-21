package com.example.ultimatefitnessapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sergio gil on 11/20/15.
 */
public class MyDBHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "userData.db";
    private static final String TABLE_BMR = "bmr";
    private static final String COLUMN_ID = "";
    private static final String COLUMN_HEIGHT = "";
    private static final String COLUMN_WEIGHT = "";
    private static final String COLUMN_GENDER = "";
    private static final String COLUMN_BMR = "";

    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE" + TABLE_BMR + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT " +
                COLUMN_HEIGHT + " TEXT " +
                COLUMN_WEIGHT + " TEXT " +
                COLUMN_GENDER + " TEXT " +
                COLUMN_BMR + " TEXT " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP_TABLE IF EXISTS " + TABLE_BMR);
        onCreate(db);
    }

    // Adding BMR value to the database
    public void addBMR(UserData user)
    {
        ContentValues values = new ContentValues();
        values.put(COLUMN_BMR, "100");
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_BMR, null, values);
        db.close();
    }
}
