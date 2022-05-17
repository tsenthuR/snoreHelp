package com.example.senthu.snorehelp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MedicamentsActivity extends AppCompatActivity {
    String Slectoption= "normal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicaments);
        getSupportActionBar().hide();

    }
    public void btncpapoption(View v){
        showOptionDialoh();

        }
    public void btnSugaryoption(View v){
        showOptionDialoh();

    }
    public void btnMouthpicesoption(View v){
        showOptionDialoh();

    }
    public void btnSleeepoption(View v){
        showOptionDialoh();

    }
    public void btnPillowoption(View v){
        showOptionDialoh();

    }
    private void showOptionDialoh() {
        final String [] option= {"Select","Delete"};
        AlertDialog.Builder builder= new AlertDialog.Builder(MedicamentsActivity.this);
        builder.setTitle("Please Select Honstly Answer");
        builder.setSingleChoiceItems(option, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Slectoption= option[i];

            }
        });
        builder.setPositiveButton("proceed", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MedicamentsActivity.this, "  You Selected   "+Slectoption, Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();

            }
        });
        builder.setNegativeButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MedicamentsActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();

            }
        });
        builder.show();
    }

    public void medicabtn(View v){
        Intent intent= new Intent(MedicamentsActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}