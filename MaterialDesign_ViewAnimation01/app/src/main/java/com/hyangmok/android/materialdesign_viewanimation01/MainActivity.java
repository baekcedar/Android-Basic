package com.hyangmok.android.materialdesign_viewanimation01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAlpha;
    Button btnRotate;
    Button btnScale;
    Button btnTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlpha      = (Button)findViewById(R.id.btnAlpha);
        btnRotate     = (Button)findViewById(R.id.btnRotate);
        btnScale      = (Button)findViewById(R.id.btnScale);
        btnTranslate  = (Button)findViewById(R.id.btnTranslate);

    }//onCreate


    public void onClickAlpha(View v){
        Animation animaion = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
        btnAlpha.startAnimation(animaion);
    }

    public void onClickRotate(View v){
        Animation animaion = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
        btnRotate.startAnimation(animaion);
    }
    public void onClickScale(View v){
        Animation animaion = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
        btnScale.startAnimation(animaion);
    }
    public void onClickTranslate(View v){
        Animation animaion = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
        btnTranslate.startAnimation(animaion);
    }

} //class
