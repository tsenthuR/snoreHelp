package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class RecordResultActivity extends AppCompatActivity implements AudioListAdapter.onItemListClick {
    private RecyclerView Listview;
    private File[] allfiles;
    private AudioListAdapter audioListAdapter;
    private MediaPlayer mediaPlayer=null;
    private boolean isplaying=false;
    private File filetoplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_record_result);
        Listview= findViewById(R.id.audio_lit_viewer);
        String path=this.getExternalFilesDir("/").getAbsolutePath();
        File directory= new File(path);
        allfiles=directory.listFiles();
        audioListAdapter=new AudioListAdapter(allfiles,this);
        Listview.setHasFixedSize(true);
        Listview.setLayoutManager(new LinearLayoutManager(this));
        Listview.setAdapter(audioListAdapter);

    }

    @Override
    public void onClickListener(File file, int position) {
        if (isplaying){
            stopAudio();

        }else {
            filetoplay=file;
            playAudio(filetoplay);

        }

    }

    private void playAudio(File filetoplay) {
        mediaPlayer= new MediaPlayer();
        try {
            mediaPlayer.setDataSource(filetoplay.getAbsolutePath());
            mediaPlayer.prepare();
            mediaPlayer.start();
            String c= filetoplay.getName();
            Toast.makeText(RecordResultActivity.this, "Now Playing "+c, Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        isplaying=true;
    }

    private void stopAudio() {
        isplaying=false;
        mediaPlayer.stop();
        String c= filetoplay.getName();
        Toast.makeText(RecordResultActivity.this, "Stop Playing "+c, Toast.LENGTH_SHORT).show();

    }
}