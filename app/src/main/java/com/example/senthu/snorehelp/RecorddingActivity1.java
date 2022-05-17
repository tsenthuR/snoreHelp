package com.example.senthu.snorehelp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;

import android.Manifest;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RecorddingActivity1 extends AppCompatActivity {
    private boolean isrecording = false;
    private String recordPremission = Manifest.permission.RECORD_AUDIO;
    private int PERMISSION_CODE = 21;
    MediaRecorder mediaRecorder;
    private String recordfile;
    private Chronometer timer;
    private TextView record_filename , textview1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordding1);
        getSupportActionBar().hide();
        timer = findViewById(R.id.record_timer);
        record_filename = findViewById(R.id.record_filename);
        textview1=findViewById(R.id.textView1);


    }
    public void recosstart(View v) {

            //start stament
            if (checkPremission()) {
                isrecording = true;
                starRecoring();
                //1800000
                new CountDownTimer(10000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        // Used for formatting digit to be in 2 digits only
                        NumberFormat f = new DecimalFormat("00");
                        long hour = (millisUntilFinished / 3600000) % 24;
                        long min = (millisUntilFinished / 60000) % 60;
                        long sec = (millisUntilFinished / 1000) % 60;
                        textview1.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));
                    }
                    // When the task is over it will print 00:00:00 there
                    public void onFinish() {
                        textview1.setText("00:00:00");
                        stopRecoring();
                        Toast.makeText(RecorddingActivity1.this, "stop Acity", Toast.LENGTH_SHORT).show();
                    }
                }.start();
                Toast.makeText(RecorddingActivity1.this, "Startv Acity", Toast.LENGTH_SHORT).show();
            }



    }


    private boolean checkPremission() {
        if (ActivityCompat.checkSelfPermission(this, recordPremission) == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            ActivityCompat.requestPermissions(this, new String[]{recordPremission}, PERMISSION_CODE);
            return false;
        }
    }

    private void starRecoring() {
        timer.setBase(SystemClock.elapsedRealtime());
        timer.start();
        String recrdPath = this.getExternalFilesDir("/").getAbsolutePath();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("hh_mm", Locale.CANADA);
        Date now = new Date();
        recordfile = "Recording_"+simpleDateFormat.format(now)+".3gp";
        record_filename.setText("Recorinf,filename:" + recrdPath);
        mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mediaRecorder.setOutputFile(recrdPath + "/" + recordfile);
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

        try {
            mediaRecorder.prepare();

        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaRecorder.start();


    }

    private void stopRecoring() {
        record_filename.setText("Recorinf,filename:" + recordfile + "saved");
        timer.stop();
        mediaRecorder.stop();
        mediaRecorder.release();
        mediaRecorder = null;

    }

    public void btnendsession(View v){
        Intent intent= new Intent(RecorddingActivity1.this,RecordResultActivity.class);
        startActivity(intent);

    }
}