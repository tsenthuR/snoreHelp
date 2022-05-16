package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiagnosticTest2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic_test2);
        getSupportActionBar().hide();
    }
    public void btnD2Next(View v){
        Intent intent= new Intent(DiagnosticTest2Activity.this,DiagnosticTest3Activity.class);
        startActivity(intent);
    }
}