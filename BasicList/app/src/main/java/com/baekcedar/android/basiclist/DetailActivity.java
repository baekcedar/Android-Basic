package com.baekcedar.android.basiclist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textViewTitle = (TextView) findViewById(R.id.textTitle);
        TextView textViewName = (TextView) findViewById(R.id.textName);
        ImageView img = (ImageView) findViewById(R.id.imageView);

        // 던진 곳에서 받기
        Intent intent = getIntent();
        int position = intent.getExtras().getInt("position");

        if( RecyclerAnimationActivity.datas !=null) {
            RecyclerData getData = RecyclerAnimationActivity.datas.get(position);
            textViewTitle.setText(getData.title); //받은 값 설정
            textViewName.setText(getData.name); //받은 값 설정
            img.setImageResource(getData.image);//받은 값 설정
        } //if
        if( RecyclerCardActivity.datas !=null) {
            RecyclerData getData = RecyclerCardActivity.datas.get(position);
            textViewTitle.setText(getData.title); //받은 값 설정
            textViewName.setText(getData.name); //받은 값 설정
            img.setImageResource(getData.image);//받은 값 설정
        } //if

    }//onCreate
} //class
