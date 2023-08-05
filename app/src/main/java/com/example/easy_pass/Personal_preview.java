package com.example.easy_pass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personal_preview extends AppCompatActivity {
    Button personal_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_preview);
        personal_share = (Button)findViewById(R.id.personal_share);
        personal_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text1/plain");
                String shareBody = "Share Using";
                String shareSub = "Your subject here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivities(new Intent[]{Intent.createChooser(myIntent, "Share Using")});

            }
        });
    }
}