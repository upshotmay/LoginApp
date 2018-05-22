package com.example.upshottechonologies.loginapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.upshottechonologies.loginapp.modelClass.*;
import android.database.Cursor;

public class DBHelper extends SQLiteOpenHelper {
    DBHelper(Context context)
    {
        super(context, modelClass.DB_NAME, null, modelClass.VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(modelClass.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long insert(String uname, String pwd)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(modelClass.U_NAME, uname);
        contentValues.put(modelClass.PWD, pwd);
        SQLiteDatabase db = this.getWritableDatabase();
        return db.insert(modelClass.TB_NAME, null, contentValues);
    }

    public String validate(String uname, String pwd)
    {
        String sql = "SELECT * FROM "+ modelClass.TB_NAME +" WHERE ("
                +modelClass.U_NAME +"="+"'"+uname+"'" +" AND "+modelClass.PWD+"="+"'"+pwd+"'"+")";
        System.out.println("SQL:"+sql);
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        System.out.println("Cursor Count:"+cursor.getCount());

        if(cursor.getCount()>0) {
            cursor.moveToNext();
            return cursor.getString(cursor.getColumnIndex(modelClass.U_NAME));
        }
        else
            return null;
    }


}
