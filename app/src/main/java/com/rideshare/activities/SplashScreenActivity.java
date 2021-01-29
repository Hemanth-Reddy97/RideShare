package com.rideshare.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.rideshare.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final int ScreenDisplay = 1500;
        Thread t1=new Thread(){
            int wait1=0;
            public void run(){
                try{
                    while(wait1<=ScreenDisplay )
                    {
                        sleep(100);
                        wait1+=100;
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intentg= new Intent(SplashScreenActivity.this, LoginActivity.class);
                    startActivity(intentg);
                    finish();

                }
            }
        };
        t1.start();
    }
}