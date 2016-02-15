package com.example.testactivitylife.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testactivitylife.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printInfo("MainActivity.onCreate");
        setContentView(R.layout.activity_main);
        initView();
    }

    private Button btnNormalActivity;
    private Button btnDialogActivity;

    private void initView() {
        btnNormalActivity = (Button) findViewById(R.id.btn_normal_activity);
        btnDialogActivity = (Button) findViewById(R.id.btn_dialog_activity);

        btnNormalActivity.setOnClickListener(this);
        btnDialogActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_normal_activity:
                startNextActivity(NormalActivity.class);
                break;
            case R.id.btn_dialog_activity:
                startNextActivity(DialogActivity.class);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        printInfo("MainActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printInfo("MainActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printInfo("MainActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        printInfo("MainActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printInfo("MainActivity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        printInfo("MainActivity.onRestart");
    }
}
