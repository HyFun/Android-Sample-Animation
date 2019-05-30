package com.hyfun.animation.ui.tween;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class RotateAnimationActivity extends BaseActivity {

    private View viewXml, viewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_animation);
        setDisplayHomeAsUpEnabled();

        viewXml = findViewById(R.id.tween_animation_view_xml);
        viewCode = findViewById(R.id.tween_animation_view_code);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_tween_rotate);
        viewXml.startAnimation(animation);

        viewCode.startAnimation(createRotateAnimation());
    }

    private Animation createRotateAnimation() {
        RotateAnimation animation = new RotateAnimation(0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setRepeatCount(AlphaAnimation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        return animation;
    }
}
