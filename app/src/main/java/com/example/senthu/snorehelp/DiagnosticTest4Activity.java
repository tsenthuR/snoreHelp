package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DiagnosticTest4Activity extends AppCompatActivity {
    SwitchCompat switchCompat1,switchCompat2,switchCompat3,switchCompat4,switchCompat5,switchCompat6,switchCompat7,switchCompat8;
int x1,x2,x3,x4,x5,x6,x7,x8,x9;

Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic_test4);
        getSupportActionBar().hide();


        button=findViewById(R.id.btn_nextfive);
        switchCompat1=findViewById(R.id.switch1);
        switchCompat2=findViewById(R.id.switch2);
        switchCompat3=findViewById(R.id.switch3);
        switchCompat4=findViewById(R.id.switch4);
        switchCompat5=findViewById(R.id.switch5);
        switchCompat6=findViewById(R.id.switch6);
        switchCompat7=findViewById(R.id.switch7);
        switchCompat8=findViewById(R.id.switch8);


        switchCompat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat1.isChecked()) {
                    x1 = 1;

                } else {
                    x1 = 0;
                }
            }

        });


        switchCompat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat2.isChecked()) {
                    x2 = 1;

                } else {
                    x2 = 0;
                }
            }

        });


        switchCompat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat3.isChecked()) {
                    x3 = 1;

                } else {
                    x3 = 0;
                }
            }

        });


        switchCompat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat4.isChecked()) {
                    x4 = 1;

                } else {
                    x4 = 0;
                }
            }

        });


        switchCompat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat5.isChecked()) {
                    x5 = 1;

                } else {
                    x5 = 0;
                }
            }

        });


        switchCompat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat6.isChecked()) {
                    x6 = 1;

                } else {
                    x6 = 0;
                }
            }

        });


        switchCompat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat7.isChecked()) {
                    x7 = 1;

                } else {
                    x7 = 0;
                }
            }

        });
        switchCompat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat8.isChecked()) {
                    x8 = 1;

                } else {
                    x8 = 0;
                }
                x9=x1+x2+x3+x4+x5+x6+x7+x8;
                Intent ii= getIntent();
                int val= ii.getIntExtra("myInt",0);
                // textView.setText("hii"+val);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(DiagnosticTest4Activity.this,DiagnosticTest5Activity.class);
                        intent.putExtra("myInttt",val);
                        intent.putExtra("myseInt",x9);

                        startActivity(intent);
                    }
                });
            }

        });




        Intent ii= getIntent();
        int val= ii.getIntExtra("myInt",0);
       // textView.setText("hii"+val);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DiagnosticTest4Activity.this,DiagnosticTest5Activity.class);
                intent.putExtra("myInttt",val);
                startActivity(intent);
            }
        });


    }

}
