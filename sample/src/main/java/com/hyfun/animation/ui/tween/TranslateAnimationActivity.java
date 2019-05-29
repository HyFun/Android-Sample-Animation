package com.hyfun.animation.ui.tween;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

import com.hyfun.animation.R;
import com.hyfun.base.BaseActivity;

public class TranslateAnimationActivity extends BaseActivity {
    private View viewXml, viewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_animation);
        setDisplayHomeAsUpEnabled();

        viewXml = findViewById(R.id.tween_animation_view_xml);
        viewCode = findViewById(R.id.tween_animation_view_code);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_tween_translate);
        viewXml.startAnimation(animation);

        viewCode.startAnimation(createTranslateAnimation());
    }


    private Animation createTranslateAnimation() {
        TranslateAnimation animation = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 1, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0
        );
        animation.setDuration(1000);
        animation.setRepeatCount(AlphaAnimation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        return animation;

    }
}
