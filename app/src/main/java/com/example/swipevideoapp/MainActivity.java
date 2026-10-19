package com.example.swipevideoapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final ViewPager2 videoViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItemsList = new ArrayList<>();

        VideoItem videoCelebration = new VideoItem();
        videoCelebration.videoURL = "https://github.com/sienna-le/SwipeVideoDemo/raw/refs/heads/main/CatVideo1.mp4";
        videoCelebration.videoTitle = "yay";
        videoCelebration.videoDescription = "yayay";
        videoItemsList.add(videoCelebration);

        /*
        VideoItem videoCelebration1 = new VideoItem();
        videoCelebration1.videoURL = "x";
        videoCelebration1.videoTitle = "ya2y";
        videoCelebration1.videoDescription = "yay2ay";
        videoItemsList.add(videoCelebration1);
        */

        videoViewPager.setAdapter(new VideoAdapter(videoItemsList));



    }
}