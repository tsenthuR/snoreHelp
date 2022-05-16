package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_CActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    DbHelperP DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_cactivity);
        getSupportActionBar().hide();
        username=findViewById(R.id.lcname);
        password=findViewById(R.id.lcpassword);
        login=findViewById(R.id.lclogin);
        DB= new DbHelperP(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= username.getText().toString();
                String pass= password.getText().toString();

                if (TextUtils.isEmpty(name)||TextUtils.isEmpty(pass)){
                    Toast.makeText(Login_CActivity.this, "Please fill all values", Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkuserPass= DB.checkusernamepassword(name,pass);
                    if (checkuserPass==true){
                        Toast.makeText(Login_CActivity.this, "Logging Sucees", Toast.LENGTH_SHORT).show();
                        Intent intent= new Intent(Login_CActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Login_CActivity.this, "Entered Valied Name", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void btnSignCClicked(View v){
        Intent intent= new Intent(Login_CActivity.this,SignupActivity.class);
        startActivity(intent);

    }


}
