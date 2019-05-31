package com.hyfun.animation.ui.property;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;

public class ValueAnimationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animation);

        setDisplayHomeAsUpEnabled();

        //         <!--ValueAnimator.ofInt(int values)-->
        {
            View propertyValueAnimationOfIntXml = findViewById(R.id.property_value_animation_ofint_xml);
            final View propertyValueAnimationOfIntCode = findViewById(R.id.property_value_animation_ofint_code);
            // xml
            // 载入XML动画
            Animator animator = AnimatorInflater.loadAnimator(this, R.animator.property_value_animation_ofint);
            // 设置动画对象
            animator.setTarget(propertyValueAnimationOfIntXml);
            // 启动动画
            animator.start();
            // code
            ValueAnimator valueAnimator = ValueAnimator.ofInt(propertyValueAnimationOfIntCode.getLayoutParams().width, 1000);
            valueAnimator.setDuration(1000);
            valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
            valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    int currentValue = (Integer) animation.getAnimatedValue();
                    // 获得每次变化后的属性值
                    //System.out.println(currentValue);
                    // 输出每次变化后的属性值进行查看
                    propertyValueAnimationOfIntCode.getLayoutParams().width = currentValue;
                    // 每次值变化时，将值手动赋值给对象的属性
                    // 即将每次变化后的值 赋 给按钮的宽度，这样就实现了按钮宽度属性的动态变化
                    // 步骤4：刷新视图，即重新绘制，从而实现动画效果
                    propertyValueAnimationOfIntCode.requestLayout();
                }
            });
            valueAnimator.start();
        }

        //         <!--ValueAnimator.oFloat（float values）-->
        {
            View propertyValueAnimationOfFloatXml = findViewById(R.id.property_value_animation_offloat_xml);
            final View propertyValueAnimationOfFloatCode = findViewById(R.id.property_value_animation_offloat_code);
            // xml
            // 载入XML动画
            Animator animator = AnimatorInflater.loadAnimator(this, R.animator.property_value_animation_offloat);
            // 设置动画对象
            animator.setTarget(propertyValueAnimationOfFloatXml);
            // 启动动画
            animator.start();
            // code
            ValueAnimator valueAnimator = ValueAnimator.ofFloat(propertyValueAnimationOfFloatCode.getLayoutParams().width, 1000);
            valueAnimator.setDuration(1000);
            valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
            valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    float currentValue = (Float) animation.getAnimatedValue();
                    // 获得每次变化后的属性值
                    //System.out.println(currentValue);
                    // 输出每次变化后的属性值进行查看
                    propertyValueAnimationOfFloatCode.getLayoutParams().width = (int) currentValue;
                    // 每次值变化时，将值手动赋值给对象的属性
                    // 即将每次变化后的值 赋 给按钮的宽度，这样就实现了按钮宽度属性的动态变化
                    // 步骤4：刷新视图，即重新绘制，从而实现动画效果
                    propertyValueAnimationOfFloatCode.requestLayout();
                }
            });
            valueAnimator.start();
        }


        //         <!--ValueAnimator.ofObject()-->
        {
        }

    }

}
