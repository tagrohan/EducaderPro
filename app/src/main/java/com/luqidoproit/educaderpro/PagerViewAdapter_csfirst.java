package com.luqidoproit.educaderpro;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerViewAdapter_csfirst extends FragmentPagerAdapter {
    public PagerViewAdapter_csfirst(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=new fragsub_csfirst();
                break;
            case 1:
                fragment=new fragproject_csfirst();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
