package com.hyfun.animation.ui.property;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class PropertyAnimationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animation);

        setDisplayHomeAsUpEnabled();
    }

    public void valueAnimation(View view) {
        startActivity(new Intent(this, ValueAnimationActivity.class));
    }
}
