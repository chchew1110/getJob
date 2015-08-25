package com.example.chrisc.bestlineaward;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FamilyLineDB extends SQLiteOpenHelper {

    public static final int VERSION = 1;
    public static String DATABASE_NAME = "family_line.db";

    public FamilyLineDB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
       super(context, DATABASE_NAME, factory, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

}
