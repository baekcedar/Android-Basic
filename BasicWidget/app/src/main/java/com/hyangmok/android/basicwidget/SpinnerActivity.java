package com.hyangmok.android.basicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {

    String dates[] = {"월","화","수","목","금","토","일"};

    Spinner     spinner;
    TextView    tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        spinner = (Spinner) findViewById(R.id.spinner);
        tv = (TextView) findViewById(R.id.spinnerText);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, dates
        );
        /*
            첫번째 인자 : 컨텍스트
            두번째 인자 : 줄당 레이아웃
            세번째 인자 : 데이터 배열
         */
        spinner.setAdapter(adapter);

        // 시프너에 리스너를 등록
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tv.setText(dates[position]+"요일");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
