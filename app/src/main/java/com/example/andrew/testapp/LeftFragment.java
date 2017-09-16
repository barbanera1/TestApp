package com.example.andrew.testapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Andrew-PC on 9/15/2017.
 */

public class LeftFragment extends BaseFragment {

    public static LeftFragment create(){
        return new LeftFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.left_slide, container, false);
        return rootView;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.left_slide;
    }

    @Override
    public void inOnCreateView(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    }
}
