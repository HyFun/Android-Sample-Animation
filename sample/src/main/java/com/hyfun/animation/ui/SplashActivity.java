package com.hyfun.animation.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.hyfun.animation.MainActivity;
import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                overridePendingTransition(R.anim.screen_zoom_in, R.anim.screen_zoom_out);
                finish();
            }
        }, 1000);
    }
}
