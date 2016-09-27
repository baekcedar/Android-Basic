package com.hyangmok.android.basicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class TabActivity extends AppCompatActivity {
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tabHost = (TabHost) findViewById(R.id.tabHost);
        assert tabHost != null;
        tabHost.setup();

        //tab 1
        TabHost.TabSpec spec1 = tabHost.newTabSpec("Tab One");
        TabHost.TabSpec spec2 = tabHost.newTabSpec("Tab Two");
        TabHost.TabSpec spec3 = tabHost.newTabSpec("Tab Three");
        //탭을 눌렀을 때 호출되는 view
        spec1.setContent(R.id.tab1);
        spec2.setContent(R.id.tab2);
        spec3.setContent(R.id.tab3);
        // 탭의 이름
        spec1.setIndicator("Tab 001");
        spec2.setIndicator("Tab 002");
        spec3.setIndicator("Tab 003");
        // 탭 호스트에 탭을 담아준다.
        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);





    }
}
