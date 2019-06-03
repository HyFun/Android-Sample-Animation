package com.hyfun.animation.ui.transition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class TransitionAnimationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_animation);

        setDisplayHomeAsUpEnabled();
    }

    public void openNetEaseScan(View view) {
        startActivity(new Intent(this, NetEaseScaleActivity.class));
    }

    public void openNetEaseSlide(View view) {
        startActivity(new Intent(this, NetEaseSlideActivity.class));
    }
}
