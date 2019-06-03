package com.hyfun.animation.ui.transition;

import android.os.Bundle;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class NetEaseSlideActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_ease_slide);

        setDisplayHomeAsUpEnabled();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.anim_slide_close_exit);
    }
}
