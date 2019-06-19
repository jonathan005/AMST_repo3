package com.example.estudiante.amst_git;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;

public class VideoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        android.widget.VideoView video = findViewById(R.id.videoView2);
        String path_v = "android.resource://" +  getPackageName()+"/"+R.raw.video_taller;
        Uri uri = Uri.parse(path_v);
        video.setVideoURI(uri);

        MediaController md = new MediaController(this);
        video.setMediaController(md);
        md.setAnchorView(video);
    }
}
