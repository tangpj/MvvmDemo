package com.example.mvvmdemo;

import android.databinding.ObservableField;

/**
 * @ClassName: UserBean
 * @author create by Tang
 * @date 2016/12/1 下午8:39
 * @Description: TODO
 */ 

public class UserBean {

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> sex = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>() ;

    public UserBean(){
        name.set("张三");
        sex.set("男");
        age.set(19);
    }

}
