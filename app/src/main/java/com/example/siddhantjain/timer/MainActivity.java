package com.example.siddhantjain.timer;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000 , 1000){

            public void onTick(long done){
                Log.i("Seconds left " , String.valueOf(done/1000));
            }
            public void onFinish(){
                Log.i("LOG DONE" , "FINISHED");
            }
        }.start();
    }

    
        //ANOTHER METHOD
        /*final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                Log.i("RUNNABLE HAS RUN" , "and has stopped now ");
                handler.postDelayed(this , 1000);
            }
        };
        handler.post(run);
    }
*/
    }