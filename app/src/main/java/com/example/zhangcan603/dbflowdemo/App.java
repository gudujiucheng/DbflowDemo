package com.example.zhangcan603.dbflowdemo;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}

