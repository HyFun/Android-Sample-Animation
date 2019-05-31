package com.hyfun.animation.ui.ripple;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by HyFun on 2019/05/31.
 * Email: 775183940@qq.com
 * Description:
 */
public class SquareHeightTextView extends android.support.v7.widget.AppCompatTextView {
    public SquareHeightTextView(Context context) {
        super(context);
    }

    public SquareHeightTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareHeightTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(heightMeasureSpec, heightMeasureSpec);
    }
}
