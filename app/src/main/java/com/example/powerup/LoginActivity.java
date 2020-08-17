package com.example.powerup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.hbb20.CountryCodePicker;

public class LoginActivity extends AppCompatActivity {

    CountryCodePicker countrycodepicker;
    TextInputEditText phonenumber;
    Button Login,password;
    TextView signup,forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logins);

        countrycodepicker = (CountryCodePicker) findViewById(R.id.countrycodepicker);
        signup=findViewById(R.id.signup);
        phonenumber=findViewById(R.id.phonenumber);
        forgotpassword=findViewById(R.id.forgot_password);
        password=findViewById(R.id.password);
        Login=findViewById(R.id.loginButton);
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,Forgotpassword.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

    }
}
