package com.hyangmok.android.basicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class SwitchActivity extends AppCompatActivity {
    TextView textView;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        textView = ( TextView) findViewById(R.id.textView);
        sw = (Switch)findViewById(R.id.switch1);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()){
                    textView.setText("ON");
                }else {
                    textView.setText("OFF");
                }
            }
        });
    }
}
