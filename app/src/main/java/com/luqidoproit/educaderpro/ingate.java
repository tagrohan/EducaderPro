package com.luqidoproit.educaderpro;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class ingate extends AppCompatActivity {
    TextView contentcomp,videocomp;
    ViewPager viewPagercomp;
    PagerViewAdapter_comp pagerViewAdaptercomp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingate);
        contentcomp=findViewById(R.id.contentcompt);
        videocomp=findViewById(R.id.VIDEOScomp);
        viewPagercomp=findViewById(R.id.viewpager_compt);
        pagerViewAdaptercomp=new PagerViewAdapter_comp(getSupportFragmentManager());
        viewPagercomp.setAdapter(pagerViewAdaptercomp);
        contentcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPagercomp.setCurrentItem(0);
            }
        });
        viewPagercomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPagercomp.setCurrentItem(1);
            }
        });
        viewPagercomp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {
                onchangerohan(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onchangerohan(int position) {
        if(position==0)
        {
            contentcomp.setTextSize(25);
            contentcomp.setTextColor(getColor(R.color.colorored));

            videocomp.setTextSize(20);
            videocomp.setTextColor(getColor(R.color.colorAccent));
        }
        if(position==1)
        {
            contentcomp.setTextSize(20);
            contentcomp.setTextColor(getColor(R.color.colorAccent));

            videocomp.setTextSize(25);
            videocomp.setTextColor(getColor(R.color.colorored));
        }

    }
}
