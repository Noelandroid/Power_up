package com.example.powerup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {
    ImageView lock,instant;
    TextView got;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        lock=findViewById(R.id.lock);
        instant=findViewById(R.id.instant);
        got=findViewById(R.id.got);

        got.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HelpActivity.this,HomepageActivity.class);
                startActivity(intent);
                HelpActivity.this.finish();
            }
        });
    }
}
