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

public class first_cse extends AppCompatActivity {
    TextView subject,project;
    ViewPager viewPager;
    PagerViewAdapter_csfirst pagerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_cse);
        Intent i=getIntent();
        String key=i.getStringExtra("key");
        String branch=i.getStringExtra("key1");


        subject=findViewById(R.id.subjectcs);
        project=findViewById(R.id.projectcs);
        SharedPreferences preferences=getSharedPreferences("mypref", Context.MODE_PRIVATE);

       SharedPreferences.Editor editor=preferences.edit();
       editor.putString("name",key);
        editor.putString("branch",branch);
       editor.commit();



        viewPager=findViewById(R.id.viewpager_csfirst);
        pagerViewAdapter=new PagerViewAdapter_csfirst(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);
        subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
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
            subject.setTextSize(25);
            subject.setTextColor(getColor(R.color.colorored));

            project.setTextSize(20);
            project.setTextColor(getColor(R.color.colorAccent));
        }
        if(position==1)
        {
            subject.setTextSize(20);
            subject.setTextColor(getColor(R.color.colorAccent));

            project.setTextSize(25);
            project.setTextColor(getColor(R.color.colorored));
        }



    }

}
