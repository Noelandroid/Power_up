package com.example.powerup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OtpActivity extends AppCompatActivity {
    ImageView phoneimage;
    TextView didnt,resend;
    Button verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        phoneimage=findViewById(R.id.phoneimage);
        didnt=findViewById(R.id.tv_didnt);
        resend=findViewById(R.id.tv_resend);
        verify=findViewById(R.id.btn_verify);

        didnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OtpActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OtpActivity.this,HomepageActivity.class);
                startActivity(intent);
            }
        });
    }
}
