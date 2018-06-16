package com.example.macx.tourguide.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.macx.tourguide.FixedTabsPagerAdapter;
import com.example.macx.tourguide.R;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout);

        int type = getIntent().getIntExtra("TYPE", 0);

        Log.i(AttractionsActivity.class.getName(), "TEST: Attractions Activity");

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        FixedTabsPagerAdapter adapter = new FixedTabsPagerAdapter(this, getSupportFragmentManager(), type);

        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
