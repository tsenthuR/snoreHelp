package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiagnosticTest1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic_test1);
        getSupportActionBar().hide();
    }
    public void btnd1Next(View v){
        Intent intent= new Intent(DiagnosticTest1Activity.this,DiagnosticTest2Activity.class);
        startActivity(intent);

    }
}