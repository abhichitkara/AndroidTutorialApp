package com.example.abhi.tutorialfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        LayoutInflater l =getLayoutInflater();
        View v = l.inflate(R.layout.activity_splash,null);
        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView.setGifImageResource(R.drawable.boot);
        new Thread(){

            public void run(){
                try{
                    Thread.sleep(4000);
                    startActivity(new Intent(splash.this,MainActivity.class));
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        }.start();


    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}

