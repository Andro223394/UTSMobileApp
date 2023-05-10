package com.example.catsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // local variable
        ImageButton iBtn1 = findViewById(R.id.imageButton1);

        // button 1
        iBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.catsound1);
                mp.start();
            }
        });
        ImageButton iBtn2 = findViewById(R.id.imageButton2);

        iBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.catsound2);
                mp.start();
            }
        });
        ImageButton iBtn3 = findViewById(R.id.imageButton3);

        iBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.catsound3);
                mp.start();
            }
        });
        ImageButton iBtn4 = findViewById(R.id.imageButton4);

        iBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cat4);
                mp.start();
            }
        });
        ImageButton iBtn5 = findViewById(R.id.imageButton5);

        iBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cat5);
                mp.start();
            }
        });
        ImageButton iBtn6 = findViewById(R.id.imageButton6);

        iBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cat6);
                mp.start();
            }
        });
        ImageButton iBtn7 = findViewById(R.id.imageButton7);

        iBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cat7);
                mp.start();
            }
        });
        ImageButton iBtn8 = findViewById(R.id.imageButton8);

        iBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cat8);
                mp.start();
            }
        });
        ImageButton iBtn9 = findViewById(R.id.imageButton9);

        iBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cat9);
                mp.start();
            }
        });

    }
}








