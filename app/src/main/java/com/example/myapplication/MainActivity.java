package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button top = findViewById(R.id.top);
        Button center = findViewById(R.id.center);
        Button bottom = findViewById(R.id.bottom);
        TextView l1 = findViewById(R.id.l1);
        TextView l2 = findViewById(R.id.l2);
        TextView r1 = findViewById(R.id.r1);
        TextView r2 = findViewById(R.id.r2);

        top.setOnClickListener(v -> {
            l2.setVisibility(View.INVISIBLE);
            r2.setVisibility(View.INVISIBLE);
        });

        bottom.setOnClickListener(v -> {
            l1.setVisibility(View.INVISIBLE);
            r1.setVisibility(View.INVISIBLE);
        });

        center.setOnClickListener(v -> {
            l1.setVisibility(View.VISIBLE);
            r1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.VISIBLE);
            r2.setVisibility(View.VISIBLE);
        });


    }
}