package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LandddigActivity extends AppCompatActivity {
    Button startbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landddig);
        getSupportActionBar().hide();
        startbtn= findViewById(R.id.btn_start_home);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(LandddigActivity.this,RecorddingActivity1.class);
                startActivity(intent);
            }
        });
    }
    public void sleeptracks(View v){
        Intent intent= new Intent(LandddigActivity.this,SleepTracksActivity.class);
        startActivity(intent);
    }



}