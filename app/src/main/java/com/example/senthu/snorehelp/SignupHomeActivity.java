package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignupHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_home);
        getSupportActionBar().hide();
    }
}