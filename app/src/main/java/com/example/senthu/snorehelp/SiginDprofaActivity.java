package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class SiginDprofaActivity extends AppCompatActivity {
    private Spinner spinner,spinner1,spinner2;
    private String Items1 ,Items2,Items3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_dprofa);
        getSupportActionBar().hide();
        spinner=findViewById(R.id.spinner_education);
        spinner1=findViewById(R.id.spinner_language);
        spinner2=findViewById(R.id.spinner_special);
        String[]Item1= new String[]{"computer","Laptop","apple"};
        String[]Item2= new String[]{"computer","Laptop","apple"};
        String[]Item3= new String[]{"computer","Laptop","apple"};

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,Item1));
        spinner1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,Item2));
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,Item3));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Items1=spinner.getSelectedItem().toString();
                Toast.makeText(SiginDprofaActivity.this, "jj"+i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Items2=spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Items3=spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
    public void sumitpro(View v){
        Intent intent= new Intent(SiginDprofaActivity.this,sigupDeducaActivity.class);
        startActivity(intent);
    }
}