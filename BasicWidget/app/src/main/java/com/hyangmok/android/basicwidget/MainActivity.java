package com.hyangmok.android.basicwidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }//onCreate

    public void textFieldActivity(View v){
        Intent intent = new Intent(this, TextActivity.class);
        startActivity(intent);
    }
    public void dateActivity(View v){
        Intent intent = new Intent(this, DateActivity.class);
        startActivity(intent);
    }

    public void tabActivity(View v){
        Intent intent = new Intent(this, TabActivity.class);
        startActivity(intent);
    }
    public void spinnerActivity(View v){
        Intent intent = new Intent(this, SpinnerActivity.class);
        startActivity(intent);
    }
    public void radioGroupActivity(View v){
        Intent intent = new Intent(this, RadioGroupActivity.class);
        startActivity(intent);
    }
    public void ratingBarActivity(View v){
        Intent intent = new Intent(this, RatingBarActivity.class);
        startActivity(intent);
    }
    public void checkBoxActivity(View v){
        Intent intent = new Intent(this, CheckBoxActivity.class);
        startActivity(intent);
    }
    public void seekBarActivity(View v){
        Intent intent = new Intent(this, SeekBarActivity.class);
        startActivity(intent);
    }
    public void switchActivity(View v){
        Intent intent = new Intent(this, SwitchActivity.class);
        startActivity(intent);
    }
}//class











