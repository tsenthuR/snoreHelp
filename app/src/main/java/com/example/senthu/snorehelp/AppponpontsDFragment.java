package com.example.senthu.snorehelp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AppponpontsDFragment extends Fragment {
    Button btn_click;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_appponponts_d, container, false);

          btn_click=v.findViewById(R.id.clickme);
          btn_click.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent= new Intent(getActivity(),AppoimentActivity.class);
                  startActivity(intent);
              }
          });
        return v;

    }

}