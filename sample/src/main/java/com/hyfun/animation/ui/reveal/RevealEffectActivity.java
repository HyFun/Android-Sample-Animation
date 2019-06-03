package com.hyfun.animation.ui.reveal;

import android.animation.Animator;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class RevealEffectActivity extends BaseActivity {

    ImageView imageView;
    View viewAnimationView;

    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reveal_effect);

        setDisplayHomeAsUpEnabled();

        imageView = findViewById(R.id.reveal_image_top);
        viewAnimationView = findViewById(R.id.reveal_view_animation_view);

        findViewById(R.id.reveal_btn_switch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    return;
                }
                // 宽度为屏幕宽度
                int width = getScreenWidth(RevealEffectActivity.this);
                int height = imageView.getLayoutParams().height;
                //求出要揭露 View 的对角线，来作为扩散圆的最大半径
                int hypotenuse = (int) Math.hypot(width, height);
                if (flag) {
                    // 隐藏起来
                    Animator circularReveal = ViewAnimationUtils.createCircularReveal(viewAnimationView, width, height, hypotenuse, 0);
                    circularReveal.setDuration(1000);
                    circularReveal.addListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {
                        }

                        @Override
                        public void onAnimationEnd(Animator animation) {
                            viewAnimationView.setVisibility(View.GONE);
                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {
                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {
                        }
                    });
                    circularReveal.start();
                    flag = false;
                }else {
                    Animator circularReveal = ViewAnimationUtils.createCircularReveal(viewAnimationView, width, height, 0, hypotenuse);
                    circularReveal.setDuration(1000);
                    //注意：这里显示 mPuppet 调用并没有在监听方法里，并且是在动画开始前调用。
                    viewAnimationView.setVisibility(View.VISIBLE);
                    circularReveal.start();
                    flag = true;
                }
            }
        });
    }


    /**
     * 获取屏幕宽度
     *
     * @param activity
     * @return
     */
    public static final int getScreenWidth(Activity activity) {
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }
}
