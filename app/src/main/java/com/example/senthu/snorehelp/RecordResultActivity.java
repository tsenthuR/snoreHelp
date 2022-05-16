package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.File;

public class RecordResultActivity extends AppCompatActivity {
    private RecyclerView Listview;
    private File[] allfiles;
    private AudioListAdapter audioListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_record_result);
        Listview= findViewById(R.id.audio_lit_viewer);
        String path=this.getExternalFilesDir("/").getAbsolutePath();
        File directory= new File(path);
        allfiles=directory.listFiles();
        audioListAdapter=new AudioListAdapter(allfiles);
        Listview.setHasFixedSize(true);
        Listview.setLayoutManager(new LinearLayoutManager(this));
        Listview.setAdapter(audioListAdapter);

    }
}