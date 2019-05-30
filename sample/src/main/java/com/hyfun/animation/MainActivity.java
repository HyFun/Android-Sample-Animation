package com.hyfun.animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.hyfun.animation.base.BaseActivity;
import com.hyfun.animation.ui.drawable.DrawableAnimationActivity;
import com.hyfun.animation.ui.tween.TweenAnimationActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Glide.with(this).asGif().load(R.mipmap.material).into((ImageView) findViewById(R.id.main_image));


    }

    /**
     * 视图动画
     *
     * @param view
     */
    public void viewAnimation(View view) {
        startActivity(new Intent(this, TweenAnimationActivity.class));
    }

    /**
     * 帧动画
     *
     * @param view
     */
    public void viewDrawable(View view) {
        startActivity(new Intent(this, DrawableAnimationActivity.class));
    }
}
