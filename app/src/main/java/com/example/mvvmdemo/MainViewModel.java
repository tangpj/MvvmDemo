package com.example.mvvmdemo;


import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.mvvmdemo.databinding.ActivityMainBinding;
import com.example.mvvmdemo.databinding.ContentMainBinding;

/**
 * @ClassName: MainViewModel
 * @author create by Tang
 * @date 2016/12/1 下午8:48
 * @Description: TODO
 */ 

public class MainViewModel {

    private ActivityMainBinding activityMainBinding;
    private ContentMainBinding contentMainBinding;
    private AppCompatActivity activity;

    public UserBean user;

    public MainViewModel(AppCompatActivity activity, ActivityMainBinding activityMainBinding){
        this.activity = activity;
        this.activityMainBinding = activityMainBinding;
        this.contentMainBinding = activityMainBinding.contentMain;
        init();
    }

    public void init(){
        activity.setSupportActionBar(activityMainBinding.toolbar);
        activityMainBinding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        user = new UserBean();
        contentMainBinding.setViewModel(this);

    }

    public void applyUser(View v){
        Snackbar.make(v,"提交成功",Snackbar.LENGTH_SHORT).setAction("Action",null).show();
        user.name.set(contentMainBinding.name.getText().toString());
        user.sex.set(contentMainBinding.sex.getText().toString());
        user.age.set(Integer.valueOf(contentMainBinding.age.getText().toString()));
    }

}
