package com.hyangmok.android.layoutbasic01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class ActivityLayoutCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_activity_layout_code);

        RelativeLayout layout = new RelativeLayout(this);
        setContentView(layout);


    }



}
