package com.hyfun.animation.ui.tween;

import android.os.Bundle;
import android.support.graphics.drawable.PathInterpolatorCompat;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class InterpolatorActivity extends BaseActivity {

    private View interpolator_AccelerateDecelerateInterpolator;
    private View interpolator_AccelerateInterpolator;
    private View interpolator_AnticipateInterpolator;
    private View interpolator_AnticipateOvershootInterpolator;
    private View interpolator_BounceInterpolator;
    private View interpolator_CycleInterpolator;
    private View interpolator_DecelerateInterpolator;
    private View interpolator_LinearInterpolator;
    private View interpolator_OvershootInterpolator;
    private View interpolator_PathInterpolator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator);
        setDisplayHomeAsUpEnabled();
        interpolator_AccelerateDecelerateInterpolator = findViewById(R.id.interpolator_AccelerateDecelerateInterpolator);
        interpolator_AccelerateInterpolator = findViewById(R.id.interpolator_AccelerateInterpolator);
        interpolator_AnticipateInterpolator = findViewById(R.id.interpolator_AnticipateInterpolator);
        interpolator_AnticipateOvershootInterpolator = findViewById(R.id.interpolator_AnticipateOvershootInterpolator);
        interpolator_BounceInterpolator = findViewById(R.id.interpolator_BounceInterpolator);
        interpolator_CycleInterpolator = findViewById(R.id.interpolator_CycleInterpolator);
        interpolator_DecelerateInterpolator = findViewById(R.id.interpolator_DecelerateInterpolator);
        interpolator_LinearInterpolator = findViewById(R.id.interpolator_LinearInterpolator);
        interpolator_OvershootInterpolator = findViewById(R.id.interpolator_OvershootInterpolator);
        interpolator_PathInterpolator = findViewById(R.id.interpolator_PathInterpolator);

        interpolator_AccelerateDecelerateInterpolator.startAnimation(createAnimation(new AccelerateDecelerateInterpolator()));
        interpolator_AccelerateInterpolator.startAnimation(createAnimation(new AccelerateInterpolator()));
        interpolator_AnticipateInterpolator.startAnimation(createAnimation(new AnticipateInterpolator()));
        interpolator_AnticipateOvershootInterpolator.startAnimation(createAnimation(new AnticipateOvershootInterpolator()));
        interpolator_BounceInterpolator.startAnimation(createAnimation(new BounceInterpolator()));
        interpolator_CycleInterpolator.startAnimation(createAnimation(new CycleInterpolator(1)));
        interpolator_DecelerateInterpolator.startAnimation(createAnimation(new DecelerateInterpolator()));
        interpolator_LinearInterpolator.startAnimation(createAnimation(new LinearInterpolator()));
        interpolator_OvershootInterpolator.startAnimation(createAnimation(new OvershootInterpolator()));
        //interpolator_PathInterpolator.startAnimation(createAnimation(new PathInterpolatorCompat()));
    }


    private Animation createAnimation(Interpolator interpolator) {
        TranslateAnimation animation = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 1, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0
        );
        animation.setInterpolator(interpolator);
        animation.setDuration(1000);
        animation.setRepeatCount(AlphaAnimation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        return animation;
    }
}
