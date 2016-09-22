package com.hyangmok.android.activitybasic01;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by HM on 2016-09-20.
 * 수동으로 Activity 만들기
 * 1. activity 클래스 상속
 * 2. onCreate 메서드를 오버라이드
 * 3. onCreate 메서드 안에서 레이아웃.xml을 Set
 */


public class Activity3 extends AppCompatActivity {
    private static final String TAG = "Activity3";
    @Override   // 1. 액티비티 생성 시에 호출되는 함수
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "called onCreate");
        setContentView(R.layout.activity_3);



    }








    @Override   // 2. 화면에 나타나기 바로 전에 호출 되는 함수
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "called onStart");
    }

    @Override   // 3. 이때 사용자가 화면에 입력 할 수 있게 된다
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "called onResume");
    }

    // Activity 가 동작하고 있는 중

    @Override   // 4. 화면에서 사라졌을 떄 < 액티비티가 나를 일부만 가리고 있을 때
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "called onPause");
    }

    @Override   // 5. 화면에서 사라졌을 때
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "called onStop");
    }

    @Override   // 5.1 Stop 되었던 Activity가 다시 호출 될 때
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "called onRestart");
    }

    @Override   // 6. 앱이 종료되면 (메모리에서 해제되면)
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "called onDestroy");
    }





    public void openActivity4(View v){

        Intent intent = new Intent(this, Activity4.class);

        startActivity(intent);
    }
    public void openActivity5(View v){

        Intent intent = new Intent(this, Activity5.class);

        startActivity(intent);
    }

    public void openActivity(View v){

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

}//class
