package com.example.sharingparking.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.sharingparking.R;
import com.example.sharingparking.SysApplication;

/**
 * Created by Lizhiguo on 2017/11/30.
 */

public class BenefitActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benefit);

        //添加活动到ActivityList中(安全退出)
        SysApplication.getInstance().addActivity(this);
    }
}
