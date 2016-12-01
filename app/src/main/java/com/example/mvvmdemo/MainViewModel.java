package com.example.mvvmdemo;


import android.support.design.widget.Snackbar;
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

    private UserBean user;

    public MainViewModel(ActivityMainBinding activityMainBinding){
        this.activityMainBinding = activityMainBinding;
        this.contentMainBinding = activityMainBinding.contentMain;
        init();
    }

    public void init(){
        user = new UserBean();
        contentMainBinding.setUser(user);
        contentMainBinding.setViewModel(this);

    }

    public void applyUser(View v){
        Snackbar.make(v,"提交成功",Snackbar.LENGTH_SHORT).setAction("Action",null).show();
        user.name.set(contentMainBinding.name.getText().toString());
        user.sex.set(contentMainBinding.sex.getText().toString());
        user.age.set(Integer.valueOf(contentMainBinding.age.getText().toString()));
    }

}
