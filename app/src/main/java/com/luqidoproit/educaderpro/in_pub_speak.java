package com.luqidoproit.educaderpro;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import static com.luqidoproit.educaderpro.R.*;

public class in_pub_speak extends AppCompatActivity {
    TextView content,videosoft;
     ViewPager viewPagersoft;
     PagerViewAdapter_soft pagerViewAdaptersoft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_in_pub_speak);

        content=findViewById(id.content);
        videosoft=findViewById(id.VIDEOSSOFT);
        viewPagersoft=findViewById(id.viewpager_SOFT);
        pagerViewAdaptersoft=new PagerViewAdapter_soft(getSupportFragmentManager());
        viewPagersoft.setAdapter(pagerViewAdaptersoft);
        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPagersoft.setCurrentItem(0);
            }
        });
        videosoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPagersoft.setCurrentItem(1);
            }
        });

       viewPagersoft.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

           }

           @RequiresApi(api = Build.VERSION_CODES.M)
           @Override
           public void onPageSelected(int position) {
               onChange(position);

           }

           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChange(int position) {
        if(position==0)
        {
            content.setTextSize(25);
          content.setTextColor(getColor(color.colorored));

            videosoft.setTextSize(20);
            videosoft.setTextColor(getColor(color.colorAccent));
        }
        if(position==1)
        {
            content.setTextSize(20);
            content.setTextColor(getColor(color.colorAccent));

            videosoft.setTextSize(25);
            videosoft.setTextColor(getColor(color.colorored));
        }
    }
}
