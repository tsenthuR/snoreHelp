package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DoctorinfoPActivity extends AppCompatActivity {
    TextView name;
    TextView time;
    TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_doctorinfo_pactivity);
        name=findViewById(R.id.infoname);
        time=findViewById(R.id.infotime);
        age=findViewById(R.id.infoage);
        Intent info= getIntent();
        String nam=info.getStringExtra("myName");
        String tim=info.getStringExtra("myTime");
        String ag=info.getStringExtra("myAge");

        name.setText(nam);
        time.setText(tim);
        age.setText(ag);
    }
}