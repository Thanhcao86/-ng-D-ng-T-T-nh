package com.example.thanhcao.apphenho.view;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ThanhCao on 5/28/2017.
 */

public class sqliteDatabase extends SQLiteOpenHelper{
    public sqliteDatabase(Context context) {
        super(context, "ThanhCao.sqlite", null, 1);
    }

    //tuy vấn tả kết quả. CÂU SELECT
    public Cursor ThanhCao_GetData(String sql){
        SQLiteDatabase db = getWritableDatabase();
        return  db.rawQuery(sql,null);
    }
    //truy vẫn không trả kết quả, DELETE, INSERT, EDIT...
    public void ThanhCao_QueryData(String sql){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
