package com.hyangmok.android.materialdesingn_propertyanimation_spreadcube;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSpread, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpread   = (Button) findViewById(R.id.btnSpread);
        btn1        = (Button) findViewById(R.id.btn1);
        btn2        = (Button) findViewById(R.id.btn2);
        btn3        = (Button) findViewById(R.id.btn3);
        btn4        = (Button) findViewById(R.id.btn4);
        btn5        = (Button) findViewById(R.id.btn5);
        btn6        = (Button) findViewById(R.id.btn6);
        btn7        = (Button) findViewById(R.id.btn7);
        btn8        = (Button) findViewById(R.id.btn8);
        btn9        = (Button) findViewById(R.id.btn9);

    }
    public void spread(View v){ // spread 버튼 눌렀을 때

        move(btn1,-200 , -200);
        move(btn2,-200 , 0);
        move(btn3,-200 , 200);
        move(btn4,0 , -200);
        move(btn5,0, 0);
        move(btn6,0, 200);
        move(btn7,200, -200);
        move(btn8,200, 0);
        move(btn9,200, 200);

    }
    public void combine(View v){ // respread 버튼 눌렀을 때

        rotater(btn1,0, 0, 0);
        rotater(btn2,0, 0 , 0);
        rotater(btn3,0, 0 , 0);
        rotater(btn4,0, 0 , 0);
        rotater(btn5,0, 0 , 0);
        rotater(btn6,0, 0, 0);
        rotater(btn7,0, 0, 0);
        rotater(btn8,0, 0, 0);
        rotater(btn9,0, 0, 0);

    }
    public void spin(View v){ // spread 버튼 눌렀을 때

        rotater(btn1,90, -200 , -200);
        rotater(btn2,90, -200 , 0);
        rotater(btn3,90, -200 , 200);
        rotater(btn4,90, 0 , -200);
        rotater(btn5,90, 0 , 0);
        rotater(btn6,90, 0, 200);
        rotater(btn7,90, 200, -200);
        rotater(btn8,90, 200, 0);
        rotater(btn9,90, 200, 200);

    }

    public void move(View player, int x, int y){
        ObjectAnimator ani1 = ObjectAnimator.ofFloat(player, "translationX", x);
        ObjectAnimator ani2 = ObjectAnimator.ofFloat(player, "translationY", y);

        AnimatorSet aniSet =new  AnimatorSet();
        aniSet.playTogether(ani1,ani2);
        aniSet.setDuration(3000);
        aniSet.start();

    }
    public void rotater(View player, int r, int x, int y){
        ObjectAnimator ani1 = ObjectAnimator.ofFloat(player, "rotation", r);
        ObjectAnimator ani2 = ObjectAnimator.ofFloat(player, "translationX", x);
        ObjectAnimator ani3 = ObjectAnimator.ofFloat(player, "translationY", y);
        AnimatorSet aniSet =new  AnimatorSet();
        aniSet.playTogether(ani1,ani2,ani3);
        aniSet.setDuration(3000);
        aniSet.start();

    }







}
