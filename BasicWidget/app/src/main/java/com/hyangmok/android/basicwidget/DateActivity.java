package com.hyangmok.android.basicwidget;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class DateActivity extends AppCompatActivity {
    Button startBtn;
    Button stopBtn;
    Button pauseBtn;
    Chronometer timer;
    long timeWhenStopped = 0;
    long pauseTime=0;
    boolean pauseFlag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        timer     = (Chronometer) findViewById(R.id.chronometer);
        startBtn  = (Button) findViewById(R.id.startBtn);
        stopBtn   = (Button) findViewById(R.id.stopBtn);
        pauseBtn  = (Button) findViewById(R.id.pauseBtn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pauseFlag){
                    timer.setBase(SystemClock.elapsedRealtime());
                    timer.start();
                    pauseFlag=false;
                }


            }
        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.stop();
                pauseFlag=true;
            }
        });
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pauseFlag) {
                    //pause 버튼 눌렀을 때의 시간
                    pauseTime = SystemClock.elapsedRealtime();

                    timer.stop();
                    // pause 부터 현재까지 차이의 시간을 더해준다.
                    timeWhenStopped =  SystemClock.elapsedRealtime() - pauseTime;

                    timer.setBase( timer.getBase()+timeWhenStopped);//getBase : 시작시점

                    pauseFlag=false;
                    pauseBtn.setText("RESTART");
                }else{
                    pauseFlag=true;
                    pauseBtn.setText("PAUSE");
                    timer.start();

                }
            }
        });

    }
}
