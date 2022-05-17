package com.example.senthu.snorehelp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HabitsActivity extends AppCompatActivity {
    String Slectoption= "normal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habits);
        getSupportActionBar().hide();

    }
    public void btnBathoption(View v){
        showOptionDialoh();

    }
    public void btnAlcoholoption(View v){
        showOptionDialoh();

    }
    public void btnSmokingoption(View v){
        showOptionDialoh();

    }
    public void btnWeightoption(View v){
        showOptionDialoh();

    }

    public void btnExerciseoption(View v){
        showOptionDialoh();

    }


    private void showOptionDialoh() {
        final String [] option= {"Select","Delete"};
        AlertDialog.Builder builder= new AlertDialog.Builder(HabitsActivity.this);
        builder.setSingleChoiceItems(option, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               Slectoption= option[i];

            }
        });
        builder.setPositiveButton("proceed", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(HabitsActivity.this, " You Selected  "+Slectoption, Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();

            }
        });
        builder.setNegativeButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(HabitsActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();

            }
        });
        builder.show();
    }
    public void btnconf(View view){
        Intent intent= new Intent(HabitsActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}