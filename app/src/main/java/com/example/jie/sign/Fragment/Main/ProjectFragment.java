package com.example.jie.sign.Fragment.Main;

import android.content.Intent;
import android.view.View;

import com.example.jie.sign.BaseTemplate.BaseLazyFragment;
import com.example.jie.sign.CustomView.FastMenuBar;

import com.example.jie.sign.R;


/**
 * Created by Diko(kedongyu) on 2016/4/7.
 * 本界面对应主界面-项目
 */
public class ProjectFragment extends BaseLazyFragment implements FastMenuBar.onMenuBarClickListener {


    @Override
    public int getLayoutId() {
        return R.layout.fragment_project;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("项目");
    }

    @Override
    public void processClick(View v) {

    }

    @Override
    public void onMenuBarClick(FastMenuBar v) {

    }
}