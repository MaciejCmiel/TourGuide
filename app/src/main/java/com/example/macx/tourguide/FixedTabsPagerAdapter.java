package com.example.macx.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.macx.tourguide.fragments.DrinkFragment;
import com.example.macx.tourguide.fragments.FoodFragment;
import com.example.macx.tourguide.fragments.MuzeumFragment;
import com.example.macx.tourguide.fragments.TheatreFragment;

public class FixedTabsPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private int type;

    public FixedTabsPagerAdapter(Context context, FragmentManager fm, int type) {
        super(fm);
        this.context = context;
        this.type = type;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {

        if (type == 1){
            return position == 0 ? new MuzeumFragment() : new TheatreFragment();
        } else {
            return position == 0 ? new FoodFragment() : new DrinkFragment();

        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String s;
        if (type == 1) {
            if (position == 0) {
                s = "Museums";
            } else {
                s = "Theatres";
            }
        } else {
            if (position == 0) {
                s = "Food";
            } else {
                s = "Drinks";
            }
        }
        return s;
    }
}
