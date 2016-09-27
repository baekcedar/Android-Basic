package com.hyangmok.android.basicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Switch;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressBar proBar;
    Switch proSwitch;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);


        proBar      = (ProgressBar) findViewById(R.id.progressBar);
        proSwitch   = (Switch) findViewById(R.id.proSwitch);
        proSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()){
                    proBar.setVisibility(ProgressBar.VISIBLE);
                }else {
                    proBar.setVisibility(proBar.GONE);
                }
            }
        });
    }
}
