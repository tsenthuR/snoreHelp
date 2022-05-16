package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DividerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divider);
        getSupportActionBar().hide();
    }
    public void docterpress(View v){
        Intent intent= new Intent(DividerActivity.this,Login_DActivity.class);
        startActivity(intent);
    }
    public void perpress(View v){
        Intent intent= new Intent(DividerActivity.this,Login_CActivity.class);
        startActivity(intent);
    }

}