package com.holtnet.arlingtontourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.holtnet.arlingtontourguide.R;

public class MenuFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public MenuFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new FoodFragment();

        } else if (position == 1){
            return new FunFragment();

        } else if (position == 2){
            return new CultureFragment();
        }
        else {
            return new HistoryFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_food);
        } else if (position == 1) {
            return context.getString(R.string.category_fun);
        } else if (position == 2) {
            return context.getString(R.string.category_culture);
        } else {
            return context.getString(R.string.category_history);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
