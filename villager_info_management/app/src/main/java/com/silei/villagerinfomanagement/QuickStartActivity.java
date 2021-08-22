package com.silei.villagerinfomanagement;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ycl.tabview.library.TabView;
import com.ycl.tabview.library.TabViewChild;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lei.si
 * @date 2021/08/22
 * 添加底部导航栏
 * https://github.com/yaochangliang159/Android-TabView
 */
public class QuickStartActivity extends FragmentActivity {
    TabView tabView;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_start_activity);

        tabView= (TabView) findViewById(R.id.tabView);
        // start add data
        List<TabViewChild> tabViewChildList=new ArrayList<>();
        TabViewChild tabViewChild01=new TabViewChild(R.drawable.tab01_sel,R.drawable.tab01_unsel,"首页",  FragmentCommon.newInstance("首页"));
        // TabViewChild tabViewChild02=new TabViewChild(R.drawable.tab02_sel,R.drawable.tab02_unsel,"内存",  FragmentCommon.newInstance("内存"));
        // TabViewChild tabViewChild03=new TabViewChild(R.drawable.tab03_sel,R.drawable.tab03_unsel,"配置",  FragmentCommon.newInstance("配置"));
        // TabViewChild tabViewChild04=new TabViewChild(R.drawable.tab04_sel,R.drawable.tab04_unsel,"购物车",FragmentCommon.newInstance("购物车"));
        TabViewChild tabViewChild05=new TabViewChild(R.drawable.tab05_sel,R.drawable.tab05_unsel,"我的",  FragmentCommon.newInstance("我的"));
        tabViewChildList.add(tabViewChild01);
        // tabViewChildList.add(tabViewChild02);
        // tabViewChildList.add(tabViewChild03);
        // tabViewChildList.add(tabViewChild04);
        tabViewChildList.add(tabViewChild05);
        //end add data
        tabView.setTabViewDefaultPosition(2);
        tabView.setTabViewChild(tabViewChildList,getSupportFragmentManager());
        tabView.setOnTabChildClickListener(new TabView.OnTabChildClickListener() {
            @Override
            public void onTabChildClick(int  position, ImageView currentImageIcon, TextView currentTextView) {
                Toast.makeText(getApplicationContext(),"position:"+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}