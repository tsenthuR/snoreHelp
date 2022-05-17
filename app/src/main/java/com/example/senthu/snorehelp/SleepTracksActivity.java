package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SleepTracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_tracks);
        getSupportActionBar().hide();
    }
}