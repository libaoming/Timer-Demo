package com.lbm100.timerdemo;

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


        new CountDownTimer(10000,1000){

            public void onTick(long millisecondUtilDown){
               Log.i("Seconds left", String.valueOf(millisecondUtilDown /1000));
            }

            public  void onFinish(){
                Log.i("Done !", "CountDown Timer Finished");
            }
        }.start();



/*
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                Log.i("Runnable has run","1000 ms have passed....");
                handler.postDelayed(this,1000);
            }
        };

        handler.post(run);

*/


    }
}
