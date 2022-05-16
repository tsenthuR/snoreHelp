package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupDActivity extends AppCompatActivity {
    EditText username,fulname,dateob,contactnumber,gender,email,password,repassword;

    DbHelperD db;
    Button sumit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_dactivity);
        getSupportActionBar().hide();
        username=findViewById(R.id.sdname);
        fulname=findViewById(R.id.sdfulname);
        dateob=findViewById(R.id.sddob);
        contactnumber=findViewById(R.id.sdphone);
        gender=findViewById(R.id.sdgender);
        email=findViewById(R.id.sdemail);
        password=findViewById(R.id.sdpass);
        repassword=findViewById(R.id.sdrepass);
        db=new DbHelperD(this);
        sumit=findViewById(R.id.sdsumit);

        sumit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= username.getText().toString();
                String fname= fulname.getText().toString();
                String dob=dateob.getText().toString();
                String number=contactnumber.getText().toString();
                String gen=gender.getText().toString();
                String mail=email.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();
                if (TextUtils.isEmpty(name)||TextUtils.isEmpty(fname)||TextUtils.isEmpty(dob)||TextUtils.isEmpty(number)||TextUtils.isEmpty(gen)||TextUtils.isEmpty(mail)
                ||TextUtils.isEmpty(pass)||TextUtils.isEmpty(repass)){
                    Toast.makeText(SignupDActivity.this, "Please all fieds", Toast.LENGTH_SHORT).show();
                }else{
                    if(pass.equals(repass)) {
                        Boolean checkuser = db.checkUsername(name);
                        if (checkuser == false) {
                            Boolean insert = db.insertdatadoctor(name, fname, dob, number, gen, mail, pass);
                            if (insert == true) {
                                Toast.makeText(SignupDActivity.this, "Registerd Suecess", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(SignupDActivity.this, SiginDprofaActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(SignupDActivity.this, "Registed Failed", Toast.LENGTH_SHORT).show();
                            }

                        } else {
                            Toast.makeText(SignupDActivity.this, "Alredy user entereb", Toast.LENGTH_SHORT).show();

                        }
                    }else{
                        Toast.makeText(SignupDActivity.this, "Password not match", Toast.LENGTH_SHORT).show();
                    }
                    }

            }
        });
    }


}
