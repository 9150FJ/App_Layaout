package com.cifpceuta.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class FrameLayout extends AppCompatActivity {
    ImageButton pausa,reanudar,retroceder;
    VideoView vw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        pausa=(ImageButton) findViewById(R.id.imagePausa);
        reanudar=(ImageButton) findViewById(R.id.imageReanudar);
        retroceder=(ImageButton) findViewById(R.id.imageRetroceder);
        vw=(VideoView) findViewById(R.id.videoView);

        vw.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.loro));

        reanudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vw.start();
                reanudar.setVisibility(View.INVISIBLE);
                pausa.setVisibility(View.VISIBLE);
            }
        });
        pausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vw.pause();
                pausa.setVisibility(View.INVISIBLE);
                reanudar.setVisibility(View.VISIBLE);
            }
        });
        retroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                metodoAtras();
            }
        });
    }


    public void metodoAtras(){
        startActivity(new Intent(this, MainActivity.class));
    }
}
