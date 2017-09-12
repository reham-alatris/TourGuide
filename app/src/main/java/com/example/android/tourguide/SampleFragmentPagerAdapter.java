package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by reham moamed on 16/05/2017.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 5;
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Home();
            case 1:
                return new Sites();
            case 2:
                return new Restaurants();
            case 3:
                return new Museums();
            case 4:
                return new Hotels();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {

            case 0:
                return context.getString(R.string.tab1);
            case 1:
                return context.getString(R.string.tab2);
            case 2:
                return context.getString(R.string.tab3);
            case 3:
                return context.getString(R.string.tab4);
            case 4:
                return context.getString(R.string.tab5);
        }

        return null;
    }
}