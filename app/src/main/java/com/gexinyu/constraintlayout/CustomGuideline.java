package com.gexinyu.constraintlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cntv11 on 2017/12/4.
 */

public class CustomGuideline extends View {

    public CustomGuideline(Context context) {
        super(context);
        super.setVisibility(GONE);
    }

    public CustomGuideline(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(GONE);
    }

    public CustomGuideline(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(GONE);
    }

    public CustomGuideline(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(GONE);
    }

    public void setVisibility(int visibility) {
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.setMeasuredDimension(0, 0);
    }
}
