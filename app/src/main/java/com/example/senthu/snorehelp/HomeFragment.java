package com.example.senthu.snorehelp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class HomeFragment extends Fragment {
    ImageButton btnrecord ,btndianoise,btnhabits , btnmedicaments;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_home, container, false);
        btnrecord=view.findViewById(R.id.ib_record);
        btndianoise=view.findViewById(R.id.ib_diagnosis);
        btnhabits=view.findViewById(R.id.ib_habits);
        btnmedicaments=view.findViewById(R.id.ib_medicaments);

        btnrecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),LandddigActivity.class);
                startActivity(intent);

            }
        });
        btndianoise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),DiagnosticTest1Activity.class);
                startActivity(intent);

            }
        });
        btnhabits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),HabitsActivity.class);
                startActivity(intent);

            }
        });
        btnmedicaments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),MedicamentsActivity.class);
                startActivity(intent);

            }
        });



 return  view;
    }
    public void btnrecord(View v){


    }
    public void btndianoise(View v){
        Intent intent= new Intent(getActivity(),DiagnosticTest1Activity.class);
        startActivity(intent);

    }
    public void btnhabits(View v){
        Intent intent= new Intent(getActivity(),HabitsActivity.class);
        startActivity(intent);

    }
    public void btnmedicaments(View v){


    }

}