package com.info303.appepsilon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void next() {

        Button suivantBtn = (Button) findViewById(R.id.suivantBtn);
        suivantBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent progresser = new Intent(MainActivity.this, ImageActivity.class);

                startActivity(progresser);
            }
        });


    }
    public void forgot() {

        Button forgotBtn = (Button) findViewById(R.id.forgotBtn);
        forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent progresserF = new Intent(MainActivity.this, ForgotActivity.class);

                startActivity(progresserF);
            }
        });


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next();
        forgot();

    }
}
