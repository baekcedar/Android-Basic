package com.hyangmok.android.basicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity {
    CheckBox checkBox1,checkBox2,checkBox3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        textView = (TextView) findViewById(R.id.textView);
        checkBox1.setOnCheckedChangeListener(checkedChangeListener);
        checkBox2.setOnCheckedChangeListener(checkedChangeListener);
        checkBox3.setOnCheckedChangeListener(checkedChangeListener);
    }

    CompoundButton.OnCheckedChangeListener checkedChangeListener
            = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            StringBuilder sb = new StringBuilder(); //String 합치기

            if(checkBox1.isChecked()){
                sb.append("짜장 ");
            }
            if(checkBox2.isChecked()){
                sb.append("짬뽕 ");
            }
            if(checkBox3.isChecked()){
                sb.append("냉면 ");
            }
            textView.setText(sb.toString());
        }
    };
}
