package com.example.senthu.snorehelp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelperD extends SQLiteOpenHelper {
    public static final String DBNAME= "logindoctor.db";
    public DbHelperD(Context context) {
        super(context, "logindoctor.db", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table users(username TEXT primary key,fname TEXT,gender TEXT,dob TEXT,cnumber TEXT,Email TEXT,password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean insertdatadoctor(String username,String fname,String dob,String cnumber ,String gender,String email, String password){
        SQLiteDatabase db= this.getReadableDatabase();
        ContentValues values= new ContentValues();

        values.put("username",username);
        values.put("fname",fname);
        values.put("dob",dob);
        values.put("cnumber",cnumber);
        values.put("gender",gender);
        values.put("email",email);
        values.put("password",password);

        long result =db.insert("users",null,values);
        if (result==-1){
            return false;
        }else{
            return true;
        }
    }
    public boolean checkUsername(String username){
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where username=?",new String[]{username});
        if (cursor.getCount()>0){
            return true;

        }else {
            return false;
        }

    }
    public boolean checkusernamepassword(String username,String password){
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor cursor= db.rawQuery("select * from users where username=? and password=?",new String[]{username,password});
        if (cursor.getCount()>0){
            return true;
        }
        else{
            return false;

        }
    }

}
