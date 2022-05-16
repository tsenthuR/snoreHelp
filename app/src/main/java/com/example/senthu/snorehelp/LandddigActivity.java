package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LandddigActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landddig);
        getSupportActionBar().hide();
    }


    public void btnrecord(View v){
        Intent intent= new Intent(LandddigActivity.this,RecorddingActivity1.class);
        startActivity(intent);

    }
    public void btndianoise(View v){
        Intent intent= new Intent(LandddigActivity.this,DiagnosticTest1Activity.class);
        startActivity(intent);

    }
    public void btnhabits(View v){
        Intent intent= new Intent(LandddigActivity.this,HabitsActivity.class);
        startActivity(intent);

    }
    public void btnmedicaments(View v){
        Intent intent= new Intent(LandddigActivity.this,MedicamentsActivity.class);
        startActivity(intent);

    }
}