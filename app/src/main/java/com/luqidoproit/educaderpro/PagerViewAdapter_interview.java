package com.luqidoproit.educaderpro;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter_interview  extends FragmentPagerAdapter {
    public PagerViewAdapter_interview(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position) {
            case 0:
                fragment = new fragcontentinterview();
                break;
            case 1:
                fragment = new fragvideointerview();
                break;
        }
        return fragment;

    }

    @Override
    public int getCount() {
        return 2;
    }
}
