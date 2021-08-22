package com.silei.villagerinfomanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;

/**
 * @author lei.si
 * @date 2021/08/22
 * 添加底部导航栏
 * https://github.com/yaochangliang159/Android-TabView
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this,QuickStartActivity.class));
    }

    public void quick_start(View view){
        startActivity(new Intent(this,QuickStartActivity.class));
    }
}