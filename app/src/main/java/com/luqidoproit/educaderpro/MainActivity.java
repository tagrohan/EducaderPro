package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        TextView e=findViewById(R.id.e);
        TextView d=findViewById(R.id.d);
        TextView u=findViewById(R.id.u);
        TextView c=findViewById(R.id.c);
        TextView a=findViewById(R.id.a);
        TextView dd=findViewById(R.id.dd);
        TextView ee=findViewById(R.id.ee);
        TextView r=findViewById(R.id.r);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
                 }
        },2000);

        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.image);
        e.setAnimation(animation);
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.d);
        d.setAnimation(animation1);
        Animation animation2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.u);
        u.setAnimation(animation2);
        Animation animation3= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.c);
        c.setAnimation(animation3);
        Animation animation4= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.dd);
        a.setAnimation(animation4);
        Animation animationn= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.a);
        dd.setAnimation(animationn);
        Animation animationo= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ee);
        ee.setAnimation(animationo);
        Animation animationor= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.r);
        r.setAnimation(animationor);
}}
