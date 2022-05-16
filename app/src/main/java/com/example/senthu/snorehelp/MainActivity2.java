package com.example.senthu.snorehelp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    ConnectFragment connectFragment = new ConnectFragment();
    ProfileFragment profileFragment= new ProfileFragment();
    ReportsFragment reportsFragment = new ReportsFragment();
    ResultsFragment resultsFragment = new ResultsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        bottomNavigationView = findViewById(R.id.bottomnaigation);


        bottomNavigationView.setSelectedItemId(R.id.home);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.results:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,resultsFragment).commit();
                        return true;
                    case R.id.reports:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,reportsFragment).commit();
                        return true;
                    case R.id.connect:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,connectFragment).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }
}