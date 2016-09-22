package com.hyangmok.android.materialdesign_elevation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/*
    1. res/values/style.xml 의 Theme를 android:Theme.Material 로 변경
    2. Androidmanifest.xml 의 aplication 의 theme 속성을 변경된 Theme 로 변경
    3. Activity의 상속 클래스를 AppCompatActivity에서 Activity로 변경

    // Api level 21 미만에서 설정 안됨

 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
