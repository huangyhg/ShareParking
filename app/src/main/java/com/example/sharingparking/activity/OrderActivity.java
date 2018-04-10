package com.example.sharingparking.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.sharingparking.R;
import com.example.sharingparking.SysApplication;

/**
 * 活动：显示附近已发布的车位，预订车位
 * Created by Lizhiguo on 2017/11/29.
 */

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderhistory);

        //添加活动到ActivityList中(安全退出)
        SysApplication.getInstance().addActivity(this);
    }
}
