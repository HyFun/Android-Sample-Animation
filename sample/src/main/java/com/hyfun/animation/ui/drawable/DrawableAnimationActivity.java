package com.hyfun.animation.ui.drawable;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class DrawableAnimationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);
        setDisplayHomeAsUpEnabled();
        ImageView imageView = findViewById(R.id.drawable_animation_image);

        AnimationDrawable drawable = (AnimationDrawable) imageView.getDrawable();
        drawable.start();
    }
}
