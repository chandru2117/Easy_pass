package com.example.easy_pass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button1;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button1= (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButton();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButton1();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButton2();
            }
        });
    }
    public void openButton(){

        Intent intent = new Intent(MainActivity.this,Personal_Form_Input.class);
        startActivity(intent);
    }
    public void openButton1(){

        Intent intent = new Intent(MainActivity.this,OnDuty_Form_Input.class);
        startActivity(intent);
    }

    public void openButton2(){

        Intent intent = new Intent(MainActivity.this,Emergency_Input_Form.class);
        startActivity(intent);
    }


}
