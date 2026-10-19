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

/**
 * Swipe App demonstrates android application with swiping feature to view videos with unique titles and description
 *
 * @author sienna
 */
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

        //set up videos linking to url, title and description to play on app
        final ViewPager2 videoViewPager = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItemsList = new ArrayList<>();

        VideoItem video = new VideoItem();
        video.videoURL = "https://github.com/sienna-le/SwipeVideoDemo/raw/refs/heads/main/v12044gd0000da91av7og65nk5v38ehg.mp4";
        video.videoTitle = "Orange cat :)";
        video.videoDescription = "Cat eating a cheeto";
        videoItemsList.add(video);

        VideoItem video2 = new VideoItem();
        video2.videoURL = "https://github.com/sienna-le/SwipeVideoDemo/raw/refs/heads/main/v24044gl0000db4hkbnog65sh1gmttvg.mp4";
        video2.videoTitle = "Small Dog";
        video2.videoDescription = "He's so cute!";
        videoItemsList.add(video2);

        VideoItem video3 = new VideoItem();
        video3.videoURL = "https://github.com/sienna-le/SwipeVideoDemo/raw/refs/heads/main/v14044g50000d9u7rvvog65tfqlsiab0.mp4";
        video3.videoTitle = "Rabbit";
        video3.videoDescription = "Yummy watermelon he loves fruit";
        videoItemsList.add(video3);

        videoViewPager.setAdapter(new VideoAdapter(videoItemsList));



    }
}