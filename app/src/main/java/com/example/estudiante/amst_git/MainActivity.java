package com.example.estudiante.amst_git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewMap(View v){
        Intent mapa = new Intent(getBaseContext(), MapsActivity.class);
        startActivity(mapa);
    }

    public void viewCalendar (View v){
        Intent calendario = new Intent (this, Calendar.class);
        startActivity(calendario);
    }

    public void Videoview (View v){
        Intent videoView = new Intent (this, VideoView.class);
        startActivity(videoView);
    }

    public void viewChart(View view){
        Intent barIntent = new Intent (this, LinearChartActivity.class);
        startActivity(barIntent);
    }
}
