package com.luqidoproit.educaderpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragvideointerview extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragvideointerview,null);
        Button aptitude=view.findViewById(R.id.aptitudevideo);
        Button  gd=view.findViewById(R.id.gdvideo);
        Button  resume=view.findViewById(R.id.resumevideo);
        Button  interview=view.findViewById(R.id.interviewvideo);


        aptitude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),aptitudevideo.class));
            }
        });
        gd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),gdvideo.class));
            }
        });
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),resumevideo.class));
            }
        });
        interview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),intervideo.class));
            }
        });




        return view;

    }
}
