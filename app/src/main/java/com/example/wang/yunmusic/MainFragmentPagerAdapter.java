package com.example.wang.yunmusic;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by wang on 16/9/22.
 */

public class MainFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<String> mTitles;
    private Context mContext;
    private List<Fragment> mFragments;

    public MainFragmentPagerAdapter(FragmentManager fm, List<String> titles, Context context, List<Fragment> fragments) {
        super(fm);
        mTitles = titles;
        mContext = context;
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
