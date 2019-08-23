package com.sematec.sematecandroidbasictir98;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class TestVideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        VideoView vv = findViewById(R.id.vv);
        vv.setVideoURI(Uri.parse("https://as8.cdn.asset.aparat.com/aparat-video/85f2492d7fbee868016b6134ac8aac4116415993-144p__29758.mp4"));


        vv.setMediaController(new MediaController(TestVideoViewActivity.this));
        vv.start();
    }
}
