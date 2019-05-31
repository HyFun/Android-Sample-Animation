package com.hyfun.animation.ui.property;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

import com.hyfun.animation.R;
import com.hyfun.animation.base.BaseActivity;
import com.hyfun.animation.ui.property.w.ColorEvaluator;

public class ObjectAnimationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animaton);

        setDisplayHomeAsUpEnabled();

        // alpha
        {
            View propretyObjAnimotorAlphaXml = findViewById(R.id.property_object_animation_alpha_xml);
            View propretyObjAnimotorAlphaCode = findViewById(R.id.property_object_animation_alpha_code);

            // xml
            Animator animator = AnimatorInflater.loadAnimator(this, R.animator.property_object_animation_alpha);
            animator.setTarget(propretyObjAnimotorAlphaXml);
            animator.start();

            // code
            ObjectAnimator animatorCode = ObjectAnimator.ofFloat(propretyObjAnimotorAlphaCode, "alpha", 1.0f, 0f);
            animatorCode.setDuration(1000);
            animatorCode.setRepeatCount(ObjectAnimator.INFINITE);
            animatorCode.setRepeatMode(ObjectAnimator.REVERSE);
            animatorCode.start();
        }

        // rotation
        {
            View propertyObjAnimatorRotationXml = findViewById(R.id.property_object_animation_rotation_xml);
            View propertyObjAnimatorRotationCode = findViewById(R.id.property_object_animation_rotation_code);

            {
                Animator animatorXml = AnimatorInflater.loadAnimator(this, R.animator.property_object_animation_rotation);
                animatorXml.setTarget(propertyObjAnimatorRotationXml);
                animatorXml.start();

                ObjectAnimator animatorCode = ObjectAnimator.ofFloat(propertyObjAnimatorRotationCode, "rotation", 0.0f, 360f);
                animatorCode.setDuration(1000);
                animatorCode.setRepeatCount(ObjectAnimator.INFINITE);
                animatorCode.setRepeatMode(ObjectAnimator.REVERSE);
                animatorCode.start();
            }

        }

        // translation X
        {
            View propertyObjAnimatorTranslationXml = findViewById(R.id.property_object_animation_translation_xml);
            View peopertyObjAnimatorTranslationCode = findViewById(R.id.property_object_animation_translation_code);

            // xml
            Animator animatorXml = AnimatorInflater.loadAnimator(this, R.animator.property_object_animation_translation);
            animatorXml.setTarget(propertyObjAnimatorTranslationXml);
            animatorXml.start();

            // code
            float initX = peopertyObjAnimatorTranslationCode.getTranslationX();
            ObjectAnimator animatorCode = ObjectAnimator.ofFloat(peopertyObjAnimatorTranslationCode, "translationX", initX, 500);
            animatorCode.setDuration(1000);
            animatorCode.setRepeatCount(ObjectAnimator.INFINITE);
            animatorCode.setRepeatMode(ObjectAnimator.REVERSE);
            animatorCode.start();

        }

        // scale
        {
            View propertyObjAnimatorScaleXml = findViewById(R.id.property_object_animation_scale_xml);
            View propertyObjAnimatorScaleCode = findViewById(R.id.property_object_animation_scale_code);

            // xml
            Animator animatorXml = AnimatorInflater.loadAnimator(this, R.animator.property_object_animation_scale);
            animatorXml.setTarget(propertyObjAnimatorScaleXml);
            animatorXml.start();

            // code
            ObjectAnimator animatorCode = ObjectAnimator.ofFloat(propertyObjAnimatorScaleCode, "scaleX", 1, 0);
            animatorCode.setDuration(1000);
            animatorCode.setRepeatCount(ObjectAnimator.INFINITE);
            animatorCode.setRepeatMode(ObjectAnimator.REVERSE);
            animatorCode.start();
        }

        // custom
        {
            View view = findViewById(R.id.property_object_animation_custom);
            ObjectAnimator animatorCode = ObjectAnimator.ofObject(view, "color", new ColorEvaluator(), "#21D4B0", "#2172D4");
            animatorCode.setDuration(1000);
            animatorCode.setRepeatCount(ObjectAnimator.INFINITE);
            animatorCode.setRepeatMode(ObjectAnimator.REVERSE);
            animatorCode.start();
        }


        // 组合动画
        {
            View propertyObjAnimatorTogetherXml = findViewById(R.id.property_object_animation_together_xml);
            View propertyObjAnimatorTogetherCode = findViewById(R.id.property_object_animation_together_code);

            // xml
            AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.property_object_animator_togather);
            animatorSet.setTarget(propertyObjAnimatorTogetherXml);
            animatorSet.start();


            // cdoe
            // 平移动画
            ObjectAnimator translation = ObjectAnimator.ofFloat(propertyObjAnimatorTogetherCode, "translationX", 0, 300);
            // 旋转动画
            ObjectAnimator rotate = ObjectAnimator.ofFloat(propertyObjAnimatorTogetherCode, "rotation", 0f, 360f);
            // 透明度动画
            ObjectAnimator alpha = ObjectAnimator.ofFloat(propertyObjAnimatorTogetherCode, "alpha", 1f, 0.5f);
            // 步骤2：创建组合动画的对象
            AnimatorSet animSet = new AnimatorSet();
            // 步骤3：根据需求组合动画
            animSet.play(translation).with(rotate).before(alpha);
            animSet.setDuration(5000);
            // 步骤4：启动动画
            animSet.start();

        }

        // ViewPropertyAnimator用法
        {
            View propertyObjAnimatorViewPropertyCode = findViewById(R.id.property_object_animation_view_property_code);
            propertyObjAnimatorViewPropertyCode
                    .animate()
                    .setDuration(3000)
                    .rotation(360)
                    .translationX(500);
        }
    }
}
