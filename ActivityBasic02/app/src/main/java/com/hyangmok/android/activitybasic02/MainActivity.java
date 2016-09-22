package com.hyangmok.android.activitybasic02;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText3);
    }//onCreate


    public void openSubActivity(View v){
        Intent intent = new Intent(MainActivity.this, SubActivity.class); // 두번째 인자 SubActivity에 연결

         String str = editText.getText().toString();
        intent.putExtra("key1",str); // SubActivity에 보내기
       // startActivity(intent);
        startActivityForResult(intent,0); // 전송한 Activity
    }//openSubActivity


    // 전달받은 Activity가 꺼지면 아래 함수가 실행됨
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("TAG:onActivityResult", "OK");
        // send 버튼이 호출
        if(requestCode==0){ //해당 코드가 0 이라면
            if(resultCode==1){ //정상적으로 넘겨줬다면
                Bundle bundle = data.getExtras();
                String result = bundle.getString("return1");
                editText2.setText(result);
            }
        }


    }
}//class