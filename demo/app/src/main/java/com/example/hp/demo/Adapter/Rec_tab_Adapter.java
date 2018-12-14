package com.example.hp.demo.Adapter;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hp.demo.fragment.Rec_fragment;

import java.util.List;

public class Rec_tab_Adapter extends FragmentPagerAdapter {

    private List<Rec_fragment> rec_fragmentList;
    private List<String> titleList;

    public Rec_tab_Adapter(FragmentManager fm, List<Rec_fragment> rec_fragmentList, List<String> titleList) {
        super(fm);
        this.rec_fragmentList = rec_fragmentList;
        this.titleList = titleList;
    }

    @Override
    public Fragment getItem(int i) {
        return rec_fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return rec_fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
