package com.hyfun.animation.ui.tween;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class ScaleAnimationActivity extends BaseActivity {

    private View viewXml, viewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_animation);
        setDisplayHomeAsUpEnabled();

        viewXml = findViewById(R.id.tween_animation_view_xml);
        viewCode = findViewById(R.id.tween_animation_view_code);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_tween_scale);
        viewXml.startAnimation(animation);

        viewCode.startAnimation(createScaleAnimation());

    }

    private Animation createScaleAnimation() {
        ScaleAnimation animation = new ScaleAnimation(1, 0, 1, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setRepeatCount(AlphaAnimation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);

        return animation;
    }
}
