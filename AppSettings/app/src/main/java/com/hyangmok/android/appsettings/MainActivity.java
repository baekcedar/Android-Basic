package com.hyangmok.android.appsettings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_main);


//        //화면 요소 접근하기 (순서대로)
//        // 1. 요소 타입 선언 - 레이아웃.xml 파일을 text모드로 보면 해당 요소의 제일 첫 단어가 타입
//        // 2. findViewById(R.id.아이디) 로 해당 요소를 찾아서 할당
//        // 3. 찾은 요소를 타입에 맞게 캐스팅.
//
//        Button btn = (Button)findViewById(R.id.button);
//        // 4. 버튼의 경우 클릭 같은 이벤트를 감지하기 위해서 리스너를 달아야 한다.
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) { //클릭시 이 함수가 실행됨.
//                TextView tv = (TextView) findViewById(R.id.tv);

//                tv.setText("값변경");
//            }
//        });



    } //main

    // 뷰 요소에서 함수를 호출하기 위해서는
    // 1. 함수를 void 타입으로 작성하고
    // 2. 파라미터에 View 를 선언해준다.
    public void changeText(View v){
        TextView tv = (TextView) findViewById(R.id.tv);

        if(i == 0) {
            tv.setText(BuildConfig.MYURL);
            i = 1;
        }else{
            tv.setText(BuildConfig.MYURL2);
            i = 0;
        }

    }
} //class
