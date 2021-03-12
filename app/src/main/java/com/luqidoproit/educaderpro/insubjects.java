package com.luqidoproit.educaderpro;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class insubjects extends AppCompatActivity {
    TextView syllabus,videos,uq;
    ViewPager viewPager;
    PagerViewAdapter_sub pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insubjects);

        Intent i=getIntent();
        String subjectCode=i.getStringExtra("subjectCode");
        SharedPreferences preferences=getSharedPreferences("mypref", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("subjectCode",subjectCode);

        editor.commit();


        syllabus=findViewById(R.id.syllabus);
        videos=findViewById(R.id.videos);
        uq=findViewById(R.id.uq);
        viewPager=findViewById(R.id.viewpager_sub);
        pagerViewAdapter=new PagerViewAdapter_sub(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

uq.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        viewPager.setCurrentItem(2);
    }
});
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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
            syllabus.setTextSize(20);
            syllabus.setTextColor(getColor(R.color.colorored));

            videos.setTextSize(17);
            videos.setTextColor(getColor(R.color.colorAccent));

            uq.setTextSize(17);
            uq.setTextColor(getColor(R.color.colorAccent));
        }
        if(position==1)
        {
            syllabus.setTextSize(17);
            syllabus.setTextColor(getColor(R.color.colorAccent));

            videos.setTextSize(20);
            videos.setTextColor(getColor(R.color.colorored));

            uq.setTextSize(17);
            uq.setTextColor(getColor(R.color.colorAccent));
        }
        if(position==2)
        {
            syllabus.setTextSize(17);
            syllabus.setTextColor(getColor(R.color.colorAccent));

            videos.setTextSize(17);
            videos.setTextColor(getColor(R.color.colorAccent));

            uq.setTextSize(20);
            uq.setTextColor(getColor(R.color.colorored));
        }

    }
}
