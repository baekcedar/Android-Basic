package com.hyangmok.android.broadcastsender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final String BROADCAST_GOTOMAIN = "com.hyangmok.android.GOTOMAIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }//onCreate
    public void sendBroadcastSend(View v){

        Intent intent = new Intent();
        intent.setAction(BROADCAST_GOTOMAIN);

        Log.i("test TAG","Send");
        intent.putExtra("number", 7);
        intent.putExtra("text", "hello");
        sendBroadcast(intent);


    }

} //class
