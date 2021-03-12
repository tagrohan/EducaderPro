package com.luqidoproit.educaderpro;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter_comp extends FragmentPagerAdapter {
    public PagerViewAdapter_comp(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position) {
            case 0:
                fragment = new fragcontentcomp();
                break;
            case 1:
                fragment = new fragvideocomp();
                break;
        }
        return fragment;


    }

    @Override
    public int getCount() {
        return 2;
    }
}
