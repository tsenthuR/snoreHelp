package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppoimentActivity extends AppCompatActivity {
    String name;
    String time;
    String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoiment);
        getSupportActionBar().hide();
    }
    public void clientinfo(View v){
        switch (v.getId()) {
            case (R.id.honinfo):
                name = "Hon Kesler";
                time = "Emergency : 10 AM - 11 AM";
                age = "54,men";
                Intent Hon = new Intent(AppoimentActivity.this, DoctorinfoPActivity.class);
                Hon.putExtra("myName", name);
                Hon.putExtra("myTime", time);
                Hon.putExtra("myAge", age);
                startActivity(Hon);
                break;

            case (R.id.joinfo):
                name = "Jo Yemen";
                time = "Consult : 12 AM - 1 PM";
                age = "96,women";
                Intent joi = new Intent(AppoimentActivity.this, DoctorinfoPActivity.class);
                joi.putExtra("myName", name);
                joi.putExtra("myTime", time);
                joi.putExtra("myAge", age);
                startActivity(joi);
                break;

            case (R.id.kiminfo):
                name = "Kim Jack";
                time = "Reports : 2 PM - 3 PM";
                age = "23,Girl";
                Intent kim = new Intent(AppoimentActivity.this, DoctorinfoPActivity.class);
                kim.putExtra("myName", name);
                kim.putExtra("myTime", time);
                kim.putExtra("myAge", age);
                startActivity(kim);
                break;

            case (R.id.meninfo):
                name = "Men Showr";
                time = "Consult : 5 PM - 6 PM";
                age = "30,boy";
                Intent men = new Intent(AppoimentActivity.this, DoctorinfoPActivity.class);
                men.putExtra("myName", name);
                men.putExtra("myTime", time);
                men.putExtra("myAge", age);
                startActivity(men);
                break;
        }
    }

    public void clientmsg(View v) {
        switch (v.getId()) {
            case (R.id.honmsg):
                name = "Hon Kesler";

                age = "54,men";
                Intent Hon = new Intent(AppoimentActivity.this, DoctorChatCActivity.class);
                Hon.putExtra("myName", name);
                startActivity(Hon);
                break;

            case (R.id.jomsg):
                name = "Jo Yemen";

                Intent jo = new Intent(AppoimentActivity.this, DoctorChatCActivity.class);
                jo.putExtra("myName", name);

                startActivity(jo);
                break;

            case (R.id.kimmsg):
                name = "Kim Jack";

                Intent kim = new Intent(AppoimentActivity.this, DoctorChatCActivity.class);
                kim.putExtra("myName", name);

                startActivity(kim);
                break;

            case (R.id.menmsg):
                name = "Men Showr";

                Intent men = new Intent(AppoimentActivity.this, DoctorChatCActivity.class);
                men.putExtra("myName", name);
                startActivity(men);
                break;
        }

    }




}