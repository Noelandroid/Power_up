package com.example.powerup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    ImageView firstimage;
   TextView newhere,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        firstimage=findViewById(R.id.firstimage);
        newhere=findViewById(R.id.newhereview);
        login=findViewById(R.id.loginview);



        newhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,HelpActivity.class);
                startActivity(intent);
                SecondActivity.this.finish();


            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,LoginActivity.class);
                startActivity(intent);
                SecondActivity.this.finish();
            }
        });


    }
}
