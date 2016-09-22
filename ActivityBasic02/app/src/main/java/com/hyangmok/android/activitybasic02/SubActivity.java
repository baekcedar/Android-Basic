package com.hyangmok.android.activitybasic02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class SubActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn = (Button)findViewById(R.id.btn); // eixt 버튼
        editText = (EditText) findViewById(R.id.editText2);
        Intent intent = getIntent(); // 던진 곳에서 받기
        // 미리 정의 된 Bundle
        Bundle bundle = intent.getExtras(); // 보냈던 putExtra를 bundle 타입으로 받기
        editText.setText(bundle.getString("key1")); //받은 값 설정


    } //onCreate
    public void btnexit(View v){ // exit 버튼 클릭시
        String result = editText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("return1", result); // 아까 전달받은 String 을 result에 넣어 전송
        setResult(1,intent); //1 은 코드값(잘 보내졌다는 약속) , intent 보내기
        finish(); //액티비티 종료

    }

    //계산기에 필요한 함수
    public String eval(String str){ // String 으로 받은 결과를 JavaScript언어 eval을 통해 계산을 한다음 String으로 넘겨줌
        String result="";
        Log.i("test str:",str);

        try{
            ScriptEngineManager mgr = new ScriptEngineManager();
            Log.i("test 2:","mgr");
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            Log.i("test 3:","engine");
            result = engine.eval(str).toString();
            Log.i("test result:",result);
        }catch(ScriptException e){
            Log.i("test result catch:",result);
            e.printStackTrace();
        }
        return result;
    } //eval

    public void openMainActivity(View v){
        Intent intent = new Intent(SubActivity.this, MainActivity.class);
         startActivity(intent);
    }//openSubActivity
} //class
