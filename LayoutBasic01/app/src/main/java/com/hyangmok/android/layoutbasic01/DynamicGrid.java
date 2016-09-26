package com.hyangmok.android.layoutbasic01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class DynamicGrid extends AppCompatActivity {
    Button btn;
    GridLayout grid;

    int idx=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_grid);

        btn = (Button)findViewById(R.id.button);

        grid = (GridLayout) findViewById(R.id.gridView);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               Button newBtn = new Button(DynamicGrid.this);
                newBtn.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        grid.removeView(v);
                    }
                });
                idx++;
                newBtn.setText(""+idx);

                grid.addView(newBtn);
            }
        });


    }
}
