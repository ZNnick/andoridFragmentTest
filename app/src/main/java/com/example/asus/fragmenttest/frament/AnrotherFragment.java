package com.example.asus.fragmenttest.frament;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.fragmenttest.MainActivity;
import com.example.asus.fragmenttest.R;

/**
 * Created by ZN_nick on 2018/3/23.
 */

public class AnrotherFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.anrother_right_fragment,container,false);
        MainActivity mainActivity=(MainActivity) getActivity();
        return view;

    }
    //获取碎片的实例（仅用于实验）

}
