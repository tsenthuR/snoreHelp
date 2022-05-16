
package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sigupDeducaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigup_deduca);
        getSupportActionBar().hide();
    }
    public void subedu(View v){
        Intent intent= new Intent(sigupDeducaActivity.this,SiginDproficActivity.class);
        startActivity(intent);
    }
}