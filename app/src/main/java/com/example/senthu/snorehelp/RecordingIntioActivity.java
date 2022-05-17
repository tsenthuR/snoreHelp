package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RecordingIntioActivity extends AppCompatActivity {
    TextView textView1;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording_intio);
        getSupportActionBar().hide();
        textView1=findViewById(R.id.textView1);
        Intent liea=getIntent();
        a=liea.getIntExtra("mytime",0);
        b=a*1000;
        new CountDownTimer(b, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("00");
                long hour = (millisUntilFinished / 3600000) % 24;
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                textView1.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                Intent intent= new Intent(RecordingIntioActivity.this,RecorddingActivity1.class);
                startActivity(intent);
                textView1.setText("00:00:00");

                Toast.makeText(RecordingIntioActivity.this, "Recording Started", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}