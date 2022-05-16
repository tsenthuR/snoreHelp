package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DiagnosticTest3Activity extends AppCompatActivity {
    private RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,radioGroup7,radioGroup8;
    int x1,x2,x3,x4,x5,x6,x7,x8,x9;
    TextView change;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic_test3);
        getSupportActionBar().hide();
        radioGroup1=findViewById(R.id.oneg);
        radioGroup2=findViewById(R.id.twog);
        radioGroup3=findViewById(R.id.threeg);
        radioGroup4=findViewById(R.id.fourg);
        radioGroup5=findViewById(R.id.fiveg);
        radioGroup6=findViewById(R.id.sixg);
        radioGroup7=findViewById(R.id.seveng);
        radioGroup8=findViewById(R.id.eightg);

        button =findViewById(R.id.btn_nextive);


//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent hi= new Intent(DiagnosticTest3Activity.this,DiagnosticTest4Activity.class);
//                startActivity(hi);
//            }
//        });




        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.oone:
                        x1=0;
                        break;
                    case R.id.otwo:
                        x1= 1;
                        break;
                    case R.id.othree:
                        x1 = 2;
                        break;
                    case R.id.ofour:
                        x1=3;
                        break;

                }

            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.tone:
                        x2=0;
                        break;
                    case R.id.ttwo:
                        x2= 1;
                        break;
                    case R.id.tthree:
                        x2 = 2;
                        break;
                    case R.id.tfour:
                        x2=3;
                        break;

                }

            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.thone:
                        x3=0;
                        break;
                    case R.id.thtwo:
                        x3= 1;
                        break;
                    case R.id.ththree:
                        x3 = 2;
                        break;
                    case R.id.thfour:
                        x3=3;
                        break;

                }

            }
        });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.fone:
                        x4=0;
                        break;
                    case R.id.ftwo:
                        x4= 1;
                        break;
                    case R.id.fthree:
                        x4 = 2;
                        break;
                    case R.id.ffour:
                        x4=3;
                        break;

                }

            }
        });
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.fione:
                        x5=0;
                        break;
                    case R.id.fitwo:
                        x5= 1;
                        break;
                    case R.id.fithree:
                        x5 = 2;
                        break;
                    case R.id.fifour:
                        x5=3;
                        break;

                }

            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.sone:
                        x6=0;
                        break;
                    case R.id.stwo:
                        x6= 1;
                        break;
                    case R.id.sthree:
                        x6 = 2;
                        break;
                    case R.id.sfour:
                        x6=3;
                        break;

                }

            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.seone:
                        x7=0;
                        break;
                    case R.id.setwo:
                        x7= 1;
                        break;
                    case R.id.sethree:
                        x7 = 2;
                        break;
                    case R.id.sefour:
                        x7=3;
                        break;

                }

            }
        });
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.eone:
                        x8=0;
                        break;
                    case R.id.etwo:
                        x8= 1;
                        break;
                    case R.id.ethree:
                        x8 = 2;
                        break;
                    case R.id.efour:
                        x8=3;
                        break;

                }
                x9=x1+x2+x3+x4+x5+x6+x7+x8;




                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(DiagnosticTest3Activity.this,DiagnosticTest4Activity.class);
                        intent.putExtra("myInt",x9);
                        startActivity(intent);
                    }
                });


            }
        });




    }

}