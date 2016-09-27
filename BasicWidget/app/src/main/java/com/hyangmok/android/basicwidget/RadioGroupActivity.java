package com.hyangmok.android.basicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioGroupActivity extends AppCompatActivity {
    Button      appleBtn;
    Button      orangeBtn;
    Button      bananaBtn;
    RadioGroup  radioGroup;
    TextView    textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        appleBtn    = (Button) findViewById(R.id.appleBtn);
        orangeBtn   = (Button) findViewById(R.id.orangeBtn);
        bananaBtn   = (Button) findViewById(R.id.bananaBtn);
        radioGroup  = (RadioGroup) findViewById(R.id.radioGroup);
        textView    = (TextView) findViewById(R.id.textView);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.appleBtn :
                        textView.setText(" APPLE "); break;
                    case R.id.orangeBtn :
                        textView.setText(" ORANGE "); break;
                    case R.id.bananaBtn :
                        textView.setText(" BANANA "); break;

                }
            }
        });


    }
}
