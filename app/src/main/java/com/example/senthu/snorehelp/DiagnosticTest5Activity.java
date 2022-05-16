package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DiagnosticTest5Activity extends AppCompatActivity {
    TextView sle,osa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic_test5);
        getSupportActionBar().hide();
        sle=findViewById(R.id.tvfivefirst);
        osa=findViewById(R.id.tvfiveseco);
        Intent ili= getIntent();
        int x9=ili.getIntExtra("myInttt",0);
        int x10=ili.getIntExtra("myseInt",0);
        osa.setText("hh"+x10);
        if (x9<10){
            sle.setText("Normal");

        }
        else if (x9<14){
            sle.setText("Mild");

        }
        else if (x9<17){
            sle.setText("Moderate");

        }
        else {
            sle.setText("Severe");
            sle.setTextColor(Color.RED);

        }
        if (x10<2){
            osa.setText("LOW RISK");

        }
        else if (x10<4){
            osa.setText("INTERMEDIATE RISK");

        }
//        else if (x10<17){
//            osa.setText("Moderate");
//
//        }
        else {
            osa.setText("HIGH RISK ");
            osa.setTextColor(Color.RED);

        }
    }
}