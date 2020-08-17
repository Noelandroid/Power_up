package com.example.powerup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.hbb20.CountryCodePicker;

public class SignupActivity extends AppCompatActivity {
    CountryCodePicker registercountrycode;
    TextInputEditText registerphonenumber,registerpassword;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        registercountrycode=findViewById(R.id.countrycodepickersignup);
        registerphonenumber=findViewById(R.id.phonenumbersignup);
        registerpassword=findViewById(R.id.passwordsignup);
        signup=findViewById(R.id.signupButton);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignupActivity.this,OtpActivity.class);
                startActivity(intent);
            }
        });
    }
}
