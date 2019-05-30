package com.hyfun.animation.ui.tween;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class AnimationSetActivity extends BaseActivity {
    private View viewXml, viewCode, viewXml2, viewCode2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_set);
        setDisplayHomeAsUpEnabled();

        viewXml = findViewById(R.id.tween_animation_view_xml);
        viewCode = findViewById(R.id.tween_animation_view_code);

        viewXml2 = findViewById(R.id.tween_animation_view_xml_2);
        viewCode2 = findViewById(R.id.tween_animation_view_code_2);


        // 同时执行动画
        {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_tween_animation_set);
            viewXml.startAnimation(animation);

            viewCode.startAnimation(createAnimationSet());
        }
        // 按照顺序执行动画
        {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_tween_animation_set_order);
            viewXml2.startAnimation(animation);

            viewCode2.startAnimation(createAnimationSet2());
        }

    }

    /**
     * 同时执行动画
     *
     * @return
     */
    private AnimationSet createAnimationSet() {
        long duration = 1000;


        AnimationSet set = new AnimationSet(true);
        // alpha
        AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);
        alpha.setRepeatCount(AlphaAnimation.INFINITE);
        alpha.setRepeatMode(Animation.REVERSE);
        alpha.setDuration(duration);
        set.addAnimation(alpha);
        // rotate
        RotateAnimation rotate = new RotateAnimation(0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setRepeatCount(AlphaAnimation.INFINITE);
        rotate.setRepeatMode(Animation.REVERSE);
        rotate.setDuration(duration);
        set.addAnimation(rotate);
        // scale
        ScaleAnimation scale = new ScaleAnimation(1, 0, 1, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setRepeatCount(AlphaAnimation.INFINITE);
        scale.setRepeatMode(Animation.REVERSE);
        scale.setDuration(duration);
        set.addAnimation(scale);
        // translate
        TranslateAnimation translate = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 1, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0
        );
        translate.setRepeatCount(AlphaAnimation.INFINITE);
        translate.setRepeatMode(Animation.REVERSE);
        translate.setDuration(duration);
        set.addAnimation(translate);

        // 需要给单个animation设置循环模式和类型，如果给set设置，则没有效果


        return set;
    }


    /**
     * 按照顺序执行的animation
     *
     * @return
     */
    private AnimationSet createAnimationSet2() {
        long duration = 1000;


        AnimationSet set = new AnimationSet(true);
        // alpha
        AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);
        alpha.setDuration(duration);
        set.addAnimation(alpha);
        // rotate
        RotateAnimation rotate = new RotateAnimation(0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(duration);
        rotate.setStartOffset(1000);
        set.addAnimation(rotate);
        // scale
        ScaleAnimation scale = new ScaleAnimation(1, 0, 1, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(duration);
        scale.setStartOffset(2000);
        set.addAnimation(scale);
        // translate
        TranslateAnimation translate = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 1, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0
        );
        translate.setDuration(duration);
        translate.setStartOffset(3000);
        set.addAnimation(translate);

        // 需要给单个animation设置循环模式和类型，如果给set设置，则没有效果
        set.setDuration(4000);

        return set;
    }
}
