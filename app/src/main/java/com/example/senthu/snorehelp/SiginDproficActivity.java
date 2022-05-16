package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SiginDproficActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_dprofic);
        getSupportActionBar().hide();
    }
    public void doctorfinalsigin(View v){
        Intent intent= new Intent(SiginDproficActivity.this,DoctorHomeActivity.class);
        startActivity(intent);
    }
}