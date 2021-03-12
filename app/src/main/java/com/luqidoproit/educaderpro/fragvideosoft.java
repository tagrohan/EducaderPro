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

public class fragvideosoft extends Fragment {



Button team,presentation,speaking,entre,communication,leadership;


        @Nullable
       @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragvideosoft, null);

            team=view.findViewById(R.id.teamvideo);
            presentation=view.findViewById(R.id.presentationvideo);
            speaking=view.findViewById(R.id.publicvideo);
            entre=view.findViewById(R.id.entrepreneurvideo);
            communication=view.findViewById(R.id.englishpvideo);
            leadership=view.findViewById(R.id.leadershipvideo);
            team.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),teamvideo.class));
                }
            });
            presentation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),presentationvideo.class));
                }
            });
            speaking.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),publicspeakingvideo.class));
                }
            });
            entre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),entreprevideo.class));
                }
            });
            communication.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),englishcommvideo.class));
                }
            });
            leadership.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),leadershipvideo.class));
                }
            });













         return view;

        }}




