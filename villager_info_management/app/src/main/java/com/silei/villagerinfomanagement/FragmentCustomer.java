package com.silei.villagerinfomanagement;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentCustomer extends Fragment {
    private static final String TAG = FragmentCustomer.class.getSimpleName();

    StringBuilder printStr = new StringBuilder();

    public static FragmentCustomer newInstance() {
        FragmentCustomer fragmentCustomer = new FragmentCustomer();
        return fragmentCustomer;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_customer, container, false);
        // TextView textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }
}
