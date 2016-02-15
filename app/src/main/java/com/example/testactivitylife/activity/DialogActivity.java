package com.example.testactivitylife.activity;

import android.os.Bundle;

import com.example.testactivitylife.R;

public class DialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printInfo("DialogActivity.onCreate");
        setContentView(R.layout.activity_dialog);
    }

    @Override
    protected void onStart() {
        super.onStart();
        printInfo("DialogActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printInfo("DialogActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printInfo("DialogActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        printInfo("DialogActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printInfo("DialogActivity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        printInfo("DialogActivity.onRestart");
    }
}
