package com.luqidoproit.educaderpro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class catvideo extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catvideo);
        Button button=findViewById(R.id.catplay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(youtubeplay.getAPI_key(),onInitializedListener);
            }
        });

        youTubePlayerView = findViewById(R.id.youtubeplaycat);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                List<String> videolist = new ArrayList<>();
                videolist.add("k5PwQ1n2x4U&list=PLtMMdSqG5Rhz4Zj1_IdMWjDsgB6KQvCMq");
                videolist.add("PLtMMdSqG5Rhz4Zj1_IdMWjDsgB6KQvCMq&index=2");

                youTubePlayer.loadVideos(videolist);
            }



            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
    }
}
