package com.hyfun.animation.ui.ripple;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class RippleEffectActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_effect);

        setDisplayHomeAsUpEnabled();

        // 代码设置view ripple效果
        {
            TextView textView = findViewById(R.id.ripple_effect_text_code);

            int[] attrs = new int[]{R.attr.selectableItemBackground};
            TypedArray typedArray = this.obtainStyledAttributes(attrs);
            int backgroundResource = typedArray.getResourceId(0, 0);
            textView.setBackgroundResource(backgroundResource);
        }


        // 代码创建Ripple
        {
            View view01 = findViewById(R.id.ripple_effect_create_ripple_code_01);
            View view02 = findViewById(R.id.ripple_effect_create_ripple_code_02);
            View view03 = findViewById(R.id.ripple_effect_create_ripple_code_03);
            View view04 = findViewById(R.id.ripple_effect_create_ripple_code_04);


        }
    }

    public void changeColor(View view) {
        startActivity(new Intent(this, RippleDefaultColorActivity.class));
    }
}
