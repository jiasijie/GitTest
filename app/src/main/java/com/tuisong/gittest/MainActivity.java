package com.tuisong.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //我在这里要开发个导航栏的功能
        setContentView(R.layout.activity_main);
        //我是搜索啊 你见怪不怪啊
    }
}
