package com.hyfun.animation.ui.tween;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class TweenAnimationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);
        setDisplayHomeAsUpEnabled();
    }

    public void alpha(View view) {
        startActivity(new Intent(this, AlphaAnimationActivity.class));
    }

    public void rotate(View view) {
        startActivity(new Intent(this, RotateAnimationActivity.class));
    }

    public void scale(View view) {
        startActivity(new Intent(this, ScaleAnimationActivity.class));
    }

    public void translate(View view) {
        startActivity(new Intent(this, TranslateAnimationActivity.class));
    }

    public void animationSet(View view) {
        startActivity(new Intent(this, AnimationSetActivity.class));
    }

    public void interpolator(View view) {
        startActivity(new Intent(this, InterpolatorActivity.class));
    }
}
