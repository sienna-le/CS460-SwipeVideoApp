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
        video.videoTitle = "Orange cat loves snacks";
        video.videoDescription = "Cat eating a cheeto because he loves spicy chips";
        videoItemsList.add(video);

        VideoItem video2 = new VideoItem();
        video2.videoURL = "https://github.com/sienna-le/SwipeVideoDemo/raw/refs/heads/main/v24044gl0000db4hkbnog65sh1gmttvg.mp4";
        video2.videoTitle = "Small Dog";
        video2.videoDescription = "He's so cute and so excited to see you!";
        videoItemsList.add(video2);

        VideoItem video3 = new VideoItem();
        video3.videoURL = "https://github.com/sienna-le/SwipeVideoDemo/raw/refs/heads/main/v14044g50000d9u7rvvog65tfqlsiab0.mp4";
        video3.videoTitle = "Rabbit stands to eat";
        video3.videoDescription = "Watch the rabbit enjoy some yummy watermelon";
        videoItemsList.add(video3);

        VideoItem video4 = new VideoItem();
        video4.videoURL = "https://github.com/sienna-le/SwipeVideoDemo/raw/refs/heads/main/v12044gd0000cpfas07og65pvv3bf0jg.mp4";
        video4.videoTitle = "Swimming dog piggyback";
        video4.videoDescription = "Retriever kindly carries the smaller dog across the pool";
        videoItemsList.add(video4);

        VideoItem video5 = new VideoItem();
        video5.videoURL = "https://github.com/sienna-le/SwipeVideoDemo/raw/refs/heads/main/v12044gd0000davfnlnog65p78b5uld0.mp4";
        video5.videoTitle = "Cute kitten dance";
        video5.videoDescription = "He's got that feeling and he's dancing around";
        videoItemsList.add(video5);

        videoViewPager.setAdapter(new VideoAdapter(videoItemsList));



    }
}