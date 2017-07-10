package com.raksa.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*
        //using Handle and Runnable as Timer
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //let the message to run every second

                Log.i("Message","1 second was passed !");
                handler.postDelayed(this,1000);
            }
        };

        // let the thread run again
        handler.post(runnable);
*/




        //using CountDownTimer
        new CountDownTimer(1,1) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

            }
        };

    }
}
