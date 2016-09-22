package com.hyangmok.android.activitybasic01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }//onCreate

    public void openMe(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // Activity를 호출하는 함수
    public void openActivity(View v){
        // ACtivity 호출 로직
        // 1. Intent 생성 (인자 : 컨텍스트 activity 일 경우 자기 자신 넘기기 (this) )
        //
                                   // ↓ 컨텍스트
        Intent intent = new Intent(this, Activity2.class);
                                         //  ↑호출한 activity 클래스명
        // 2. 생성된 인텐트를 시스템에 넘겨서 실행
        startActivity(intent);
    }
    public void openCall(View v) { // 전화걸기
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01035779199"));
        startActivity(intent);
    }

    public void openSMS(View v) { // 문자보내기
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:01035779199"));
        startActivity(intent);
    }
    public void openNaver(View v) { //네이버 접속
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"));
        startActivity(intent);
    }

} //class
