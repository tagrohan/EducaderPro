package com.luqidoproit.educaderpro;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter_sub  extends FragmentPagerAdapter {

    public PagerViewAdapter_sub(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=new fraginsyllabus();
                break;
            case 1:
                fragment=new fraginvideos();
                break;
            case 2:
                fragment=new fraginuq();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
