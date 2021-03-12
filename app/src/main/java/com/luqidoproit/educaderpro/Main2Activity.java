package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class Main2Activity extends AppCompatActivity {
    Button cse, me, ee, civil, ai, ece, ss, engcom, presentation, publicspeaking, leadership, teamwork, aptitude, gd, resume, interview;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
                break;
            case R.id.about:
                startActivity(new Intent(getApplicationContext(), aboutactivity.class));
                break;
            case R.id.feedback:
                startActivity(new Intent(getApplicationContext(), feedback.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            Fragment home = new home_fragment();
            FragmentTransaction fb = getSupportFragmentManager().beginTransaction();
            fb.replace(R.id.frag, home).commit();
            return;
        }
        Fragment home = new home_fragment();
        FragmentTransaction fb = getSupportFragmentManager().beginTransaction();
        fb.replace(R.id.frag, home).commit();
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LinearLayout cse = findViewById(R.id.cse);
        LinearLayout melay = findViewById(R.id.melayout);
        LinearLayout civillay = findViewById(R.id.civillayout);
        LinearLayout eelay = findViewById(R.id.eelayout);
        LinearLayout ecelay = findViewById(R.id.ecelayout);
        LinearLayout ailay = findViewById(R.id.ailayout);
        TextView aitext = findViewById(R.id.aitext);
        TextView metext = findViewById(R.id.metext);
        TextView civiltext = findViewById(R.id.civiltext);
        TextView eetext = findViewById(R.id.eetext);
        TextView ecetext = findViewById(R.id.ecetext);
        TextView cstext = findViewById(R.id.cstext);





        LinearLayout entrelay = findViewById(R.id.studyskilllayout);
        LinearLayout commlay = findViewById(R.id.commlayout);
        LinearLayout presentationlay = findViewById(R.id.presentationlayout);
        LinearLayout publicspeakinglay = findViewById(R.id.publicspeakinglayout);
        LinearLayout leaderlay = findViewById(R.id.leaderlayout);
        LinearLayout teamlay = findViewById(R.id.teamlayout);
        TextView entretext = findViewById(R.id.studytext);
        TextView commtext = findViewById(R.id.commtext);
        TextView presentationtext = findViewById(R.id.presentationtext);
        TextView publictext = findViewById(R.id.publictext);
        TextView leadertext = findViewById(R.id.leadertext);
        TextView teamtext = findViewById(R.id.teamtext);





    LinearLayout    aptitudelay = findViewById(R.id.aptitudelayout);
    LinearLayout    gdlay = findViewById(R.id.gdlayout);
    LinearLayout    resumelay = findViewById(R.id.resumelayout);
     LinearLayout   interviewlay = findViewById(R.id.interviewlayout);
        TextView aptitudetext = findViewById(R.id.aptitudetext);
        TextView gdtext = findViewById(R.id.gdtext);
        TextView resunetext = findViewById(R.id.resumetext);
        TextView interviewtext = findViewById(R.id.interviewtext);





        LinearLayout    gatelay = findViewById(R.id.gatelayout);
        LinearLayout    catlay = findViewById(R.id.catlayout);
        LinearLayout    upsclay = findViewById(R.id.upsclayout);
        LinearLayout   satlay = findViewById(R.id.satlayout);
        TextView gatetext = findViewById(R.id.gatetext);
        TextView cattext = findViewById(R.id.cattext);
        TextView upsctext = findViewById(R.id.upsctext);
        TextView sattext = findViewById(R.id.sattext);




        Button csbutton = findViewById(R.id.csbutton);
        me = findViewById(R.id.me);
        ee = findViewById(R.id.ee);
        civil = findViewById(R.id.civil);
        ai = findViewById(R.id.ai);
        ece = findViewById(R.id.ece);


        Button gate = findViewById(R.id.gate);
        Button cat = findViewById(R.id.cat);
        Button upsc = findViewById(R.id.upsc);
        Button sat = findViewById(R.id.sat);

        final DrawerLayout drawerLayout = findViewById(R.id.deawerlayout);
        NavigationView navigationView = findViewById(R.id.nevmenu);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        Fragment home = new home_fragment();
                        FragmentTransaction fb = getSupportFragmentManager().beginTransaction();
                        fb.replace(R.id.frag, home).commit();
                        break;
                    case R.id.nav_gallery:
                        Fragment gellery = new rate_us_fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag, gellery).commit();
                        break;
                    case R.id.nav_tools:
                        Fragment tools = new premium_fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag, tools).commit();
                        break;
                    case R.id.nav_send:
                        Fragment send = new send_fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag, send).commit();
                        break;

                    case R.id.nav_share:
                        Fragment share = new share_fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag, share).commit();
                        break;

                    case R.id.nav_slideshow:
                        Fragment slideshow = new visit_web_fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag, slideshow).commit();
                        break;

                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;


            }
        });
        ss = findViewById(R.id.studyskill);
        engcom = findViewById(R.id.englishcommunication);
        presentation = findViewById(R.id.presentationskill);
        publicspeaking = findViewById(R.id.publicspeaking);
        leadership = findViewById(R.id.leadershipskill);
        teamwork = findViewById(R.id.teamworkskill);
        aptitude = findViewById(R.id.aptitude);
        gd = findViewById(R.id.gd);
        resume = findViewById(R.id.Resume);
        interview = findViewById(R.id.interviewquestion);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }


    public void onbuttonclick(View view) {
        switch (view.getId()) {
            case R.id.melayout:
                startActivity(new Intent(getApplicationContext(), inME.class));
                break;
            case R.id.civillayout:
                startActivity(new Intent(getApplicationContext(), incivil.class));
                break;
            case R.id.ailayout:
                startActivity(new Intent(getApplicationContext(), inAI.class));
                break;
            case R.id.eelayout:
                startActivity(new Intent(getApplicationContext(), inEE.class));
                break;
            case R.id.ecelayout:
                startActivity(new Intent(getApplicationContext(), inECE.class));
                break;
            case R.id.aitext:
                startActivity(new Intent(getApplicationContext(), inAI.class));
                break;
            case R.id.studyskilllayout:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.commlayout:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.presentationlayout:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.publicspeakinglayout:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.leaderlayout:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.teamlayout:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.aptitudelayout:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.gdlayout:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.resumelayout:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.interviewlayout:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.gatelayout:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.catlayout:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.upsclayout:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.satlayout:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;

            case R.id.studytext:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.commtext:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.presentationtext:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.publictext:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.leadertext:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.teamtext:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.aptitudetext:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.gdtext:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.resumetext:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.interviewtext:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.gatetext:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.cattext:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.upsctext:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.sattext:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.metext:
                startActivity(new Intent(getApplicationContext(), inME.class));
                break;
            case R.id.civiltext:
                startActivity(new Intent(getApplicationContext(), incivil.class));
                break;
            case R.id.eetext:
                startActivity(new Intent(getApplicationContext(), inEE.class));
                break;
            case R.id.ecetext:
                startActivity(new Intent(getApplicationContext(), inECE.class));
                break;
            case R.id.cse:
                startActivity(new Intent(getApplicationContext(), incse.class));
                break;
            case R.id.cstext:
                startActivity(new Intent(getApplicationContext(), incse.class));
                break;

            case R.id.csbutton:
                startActivity(new Intent(getApplicationContext(), incse.class));
                break;
            case R.id.me:
                startActivity(new Intent(getApplicationContext(), inME.class));
                break;
            case R.id.civil:
                startActivity(new Intent(getApplicationContext(), incivil.class));
                break;
            case R.id.ai:
                startActivity(new Intent(getApplicationContext(), inAI.class));
                break;
            case R.id.ece:
                startActivity(new Intent(getApplicationContext(), inECE.class));
                break;
            case R.id.ee:
                startActivity(new Intent(getApplicationContext(), inEE.class));
                break;
            case R.id.gate:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.upsc:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.sat:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.cat:
                startActivity(new Intent(getApplicationContext(), ingate.class));
                break;
            case R.id.studyskill:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.englishcommunication:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.presentationskill:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.publicspeaking:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.leadershipskill:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.teamworkskill:
                startActivity(new Intent(getApplicationContext(), in_pub_speak.class));
                break;
            case R.id.aptitude:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.gd:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
            case R.id.Resume:
                startActivity(new Intent(getApplicationContext(), in_interview
                        .class));
                break;
            case R.id.interviewquestion:
                startActivity(new Intent(getApplicationContext(), in_interview.class));
                break;
        }

    }


}
