package com.example.andrew.testapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by Andrew-PC on 9/15/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return LeftFragment.create();
            case 1:
                return EmptyFragment.create();
            case 2:
                return RightFragment.create();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
