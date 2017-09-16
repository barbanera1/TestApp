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

public class RightFragment extends BaseFragment {

    public static RightFragment create(){
        return new RightFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.right_slide, container, false);
        return rootView;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.right_slide;
    }

    @Override
    public void inOnCreateView(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    }
}
