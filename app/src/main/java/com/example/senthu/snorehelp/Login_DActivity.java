package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login_DActivity extends AppCompatActivity {
    TextView username,password;
    Button login;
    DbHelperD db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_dactivity);
        getSupportActionBar().hide();
        username=findViewById(R.id.ldname);
        password=findViewById(R.id.ldpass);
        login=findViewById(R.id.ldlogin);
        db=new DbHelperD(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= username.getText().toString();
                String pass= password.getText().toString();
                if (TextUtils.isEmpty(name)||TextUtils.isEmpty(pass)){
                    Toast.makeText(Login_DActivity.this, "Please ente all field values", Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkuserpass=db.checkusernamepassword(name,pass);
                    if (checkuserpass==true){
                        Toast.makeText(Login_DActivity.this, "Login suess", Toast.LENGTH_SHORT).show();
                        Intent intent= new Intent(Login_DActivity.this,DoctorHomeActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Login_DActivity.this, "enter vailed username", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    public void btnSignDClicked(View v){
        Intent intent= new Intent(Login_DActivity.this,SignupDActivity.class);
        startActivity(intent);

    }
}