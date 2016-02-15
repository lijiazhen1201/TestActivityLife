package com.example.testactivitylife.activity;

import android.os.Bundle;

import com.example.testactivitylife.R;

public class NormalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printInfo("NormalActivity.onCreate");
        setContentView(R.layout.activity_normal);
    }

    @Override
    protected void onStart() {
        super.onStart();
        printInfo("NormalActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printInfo("NormalActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printInfo("NormalActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        printInfo("NormalActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printInfo("NormalActivity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        printInfo("NormalActivity.onRestart");
    }
}
