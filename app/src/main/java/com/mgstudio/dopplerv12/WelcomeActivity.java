package com.mgstudio.dopplerv12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/* 欢迎页代码 */
public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent toloadin = new Intent(WelcomeActivity.this, LoadinActivity.class);
                startActivity(toloadin);
                WelcomeActivity.this.finish();
                finish();
            }
        }, 300);  // 延时跳转：0.3秒
    }
}
