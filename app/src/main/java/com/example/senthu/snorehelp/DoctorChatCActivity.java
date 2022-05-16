package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DoctorChatCActivity extends AppCompatActivity {
    TextView namec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_chat_cactivity);
        getSupportActionBar().hide();
        namec=findViewById(R.id.infonamec);
        Intent name=getIntent();
        String nam=name.getStringExtra("myName");
        namec.setText(nam);
    }
}