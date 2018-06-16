package com.example.macx.tourguide.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.macx.tourguide.R;

public class MainActivity extends AppCompatActivity {

    private static final int MUZEUM = 1;
    private static final int FOOD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView muzeum = (TextView) findViewById(R.id.muzeum);
        TextView food = (TextView) findViewById(R.id.food);

        muzeum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AttractionsActivity.class);
                intent.putExtra("TYPE", MUZEUM);
                startActivity(intent);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AttractionsActivity.class);
                intent.putExtra("TYPE", FOOD);
                startActivity(intent);
            }
        });
    }
}
