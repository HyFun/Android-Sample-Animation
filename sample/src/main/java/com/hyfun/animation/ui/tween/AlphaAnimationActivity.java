package com.hyfun.animation.ui.tween;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.hyfun.animation.R;
import com.hyfun.base.BaseActivity;

public class AlphaAnimationActivity extends BaseActivity {

    private View viewXml, viewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_animation);
        setDisplayHomeAsUpEnabled();

        viewXml = findViewById(R.id.tween_animation_view_xml);
        viewCode = findViewById(R.id.tween_animation_view_code);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_tween_alpha);
        viewXml.startAnimation(animation);

        viewCode.startAnimation(createAlphaAnimation());

    }


    private Animation createAlphaAnimation() {
        AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setRepeatCount(AlphaAnimation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        return animation;
    }
}
