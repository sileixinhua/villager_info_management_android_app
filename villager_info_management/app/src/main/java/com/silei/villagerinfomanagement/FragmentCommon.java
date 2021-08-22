package com.silei.villagerinfomanagement;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author lei.si
 * @date 2021/08/22
 * 添加底部导航栏
 * https://github.com/yaochangliang159/Android-TabView
 */
public class FragmentCommon extends Fragment {

    private static final String TAG = FragmentCommon.class.getSimpleName();

    TextView textView;

    public static FragmentCommon newInstance(String text){
        FragmentCommon fragmentCommon=new FragmentCommon();
        Bundle bundle=new Bundle();
        bundle.putString("text",text);
        fragmentCommon.setArguments(bundle);
        return fragmentCommon;
    }

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_common,container,false);
        textView= (TextView) view.findViewById(R.id.textView);
        textView.setText(getArguments().getString("text"));
        return view;
    }
}