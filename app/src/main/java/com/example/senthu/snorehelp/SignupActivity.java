package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    EditText username,dateob,gender,email,password,repassword;
    Button sigin;
    DbHelperP DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        username=findViewById(R.id.spname);
        dateob=findViewById(R.id.spdob);
        gender=findViewById(R.id.spgender);
        password=findViewById(R.id.sppass);
        email=findViewById(R.id.spemail);
        repassword=findViewById(R.id.sprepass);
        sigin=findViewById(R.id.spsigin);
        DB=new DbHelperP(this);

        sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=username.getText().toString();
                String dob=dateob.getText().toString();
                String gen=gender.getText().toString();
                String mail=email.getText().toString();
                String pass=password.getText().toString();
                String repass= repassword.getText().toString();

                if (TextUtils.isEmpty(name)||TextUtils.isEmpty(dob)||TextUtils.isEmpty(gen)||TextUtils.isEmpty(pass)||TextUtils.isEmpty(repass))
                {

                    Toast.makeText(SignupActivity.this, "Please fill in with all credentials", Toast.LENGTH_SHORT).show();
                }else{
                    if (pass.equals(repass)){
                            Boolean checkuser= DB.checkUsername(name);
                            if (checkuser==false){
                                boolean insert= DB.insertdata(name,dob,gen,mail,pass);
                                if (insert == true) {
                                    Toast.makeText(SignupActivity.this, "Successfully Account Created", Toast.LENGTH_SHORT).show();
                                    Intent intent= new Intent(SignupActivity.this,MainActivity2.class);
                                    startActivity(intent);

                                }else{
                                    Toast.makeText(SignupActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                                }
                            }else{
                                Toast.makeText(SignupActivity.this, "Username already exist", Toast.LENGTH_SHORT).show();
                            }
                    }
                    else {
                        Toast.makeText(SignupActivity.this, "Password Do Not Match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    public void btnLoginClicked(View v){
        Intent intent= new Intent(SignupActivity.this,Login_CActivity.class);
        startActivity(intent);

    }
}