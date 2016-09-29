package com.baekcedar.android.basiclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAnimationActivity extends AppCompatActivity {

    public static ArrayList<RecyclerData> datas = null;

    // 1. 리사이클러 뷰를 메인 레이아웃에 만든다.
    // 2. 리사이클러 뷰에 들어갈 아이템 레이아웃을 만든다.
    // -- 들어갈 데이터는 정의되어 있고
    // 3. 아답터를 만든다.
    // 4. 리사이클러뷰에 아답터는 세팅한다.
    // 5. 리사이클러뷰에 레이아웃 매니저를 지정한다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_animation);

        datas = new ArrayList<>();

        RecyclerData  data;
        RecyclerView recyclerView;

        for( int i = 1 ; i <= 100 ; i ++ ) {
            data = new RecyclerData();

            data.title = i+" "+"기억상실";
            data.name = "거미";
            data.image = R.mipmap.gummi;

            datas.add(data);
        }
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewAnimation);
        RecyclerAnimationAdapter adapter = new RecyclerAnimationAdapter(datas,R.layout.recycler_item,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
