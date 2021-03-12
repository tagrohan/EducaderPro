package com.luqidoproit.educaderpro;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class in_interview extends AppCompatActivity {
    TextView contentinterview,videointerview;
    ViewPager viewPagerinterview;
    PagerViewAdapter_interview pagerViewAdapterinterview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_interview);
        contentinterview=findViewById(R.id.contentinterview);
        videointerview=findViewById(R.id.VIDEOSinterview);
        viewPagerinterview=findViewById(R.id.viewpager_interview);
        pagerViewAdapterinterview=new PagerViewAdapter_interview(getSupportFragmentManager());
        viewPagerinterview.setAdapter(pagerViewAdapterinterview);
        contentinterview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPagerinterview.setCurrentItem(0);
            }
        });
        videointerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPagerinterview.setCurrentItem(1);
            }
        });
        viewPagerinterview.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {
                onChangetab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangetab(int position) {
        if(position==0)
        {
            contentinterview.setTextSize(25);
            contentinterview.setTextColor(getColor(R.color.colorored));

            videointerview.setTextSize(20);
            videointerview.setTextColor(getColor(R.color.colorAccent));
        }
        if(position==1)
        {
            contentinterview.setTextSize(20);
            contentinterview.setTextColor(getColor(R.color.colorAccent));

            videointerview.setTextSize(25);
            videointerview.setTextColor(getColor(R.color.colorored));
        }

    }
}
