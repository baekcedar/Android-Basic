package com.hyangmok.android.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    static final String BROADCAST_GOTOMAIN = "com.hyangmok.android.GOTOMAIN";
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("onReceive","onReceive");
        String name = intent.getAction();
        if ( name.equals(BROADCAST_GOTOMAIN)){
            Log.e("=== dsfalkjfklasj ===","---- in");
            //context 내부에 정보를 담고있는 꾸러미
            Intent itt1 = new Intent(context, Main2Activity.class);
            // 플래그를 두개로 보내기( 인자값 제한으로 OR 연산을 통해 결과값을 전달)
            itt1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            context.startActivity(itt1);

        }
    }


}
