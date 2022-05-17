package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LandddigActivity extends AppCompatActivity {
    Button startbtn;
    private Spinner spinner,spinner1;
    private String Items1 ,Items2;
    int a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landddig);
        getSupportActionBar().hide();
        startbtn= findViewById(R.id.btn_start_home);
        spinner=findViewById(R.id.spinner_settime);
        spinner1=findViewById(R.id.spinner_capture);

        String[]Item1= new String[]{"SlectData","0 secs","10 secs","20 mins","60 mins","90 mins"};
        String[]Item2= new String[]{"only Snore","all sounds"};

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,Item1));
        spinner1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,Item2));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Items1=spinner.getSelectedItem().toString();
                if (i==0){
                    Toast.makeText(LandddigActivity.this, "Please select Time", Toast.LENGTH_SHORT).show();
                     }else{
                    if (i==1){
                        a=0;
                    }
                    else if (i==2){
                        a=10;
                    }
                    else if (i==3){
                        a=1200;
                    }
                    else if (i==4){
                        a=3600;
                    }
                    else if (i==5){
                        a=4500;
                    }
                    startbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent= new Intent(LandddigActivity.this,RecordingIntioActivity.class);
                            intent.putExtra("mytime",a);
                            startActivity(intent);
                        }
                    });


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Items1=spinner.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
    public void sleeptracks(View v){
        Intent intent= new Intent(LandddigActivity.this,SleepTracksActivity.class);
        startActivity(intent);
    }



}