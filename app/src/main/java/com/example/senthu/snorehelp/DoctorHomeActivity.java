package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class DoctorHomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomedFragment homedFragment = new HomedFragment();
   PatientsdFragment patientsdFragment = new PatientsdFragment();
    AppponpontsDFragment appponpontsDFragment= new AppponpontsDFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home);
        getSupportActionBar().hide();
        bottomNavigationView=findViewById(R.id.dbottomnavigation);

        bottomNavigationView.setSelectedItemId(R.id.homed);
        getSupportFragmentManager().beginTransaction().replace(R.id.containerd,homedFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerd,homedFragment).commit();
                        return true;
                    case R.id.patients:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerd,patientsdFragment).commit();
                        return true;
                    case R.id.appointment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerd,appponpontsDFragment).commit();
                        return true;

                }

                return false;
            }
        });

    }



}