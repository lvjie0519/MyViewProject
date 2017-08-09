package com.example.myviewproject.project01;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/8/9 0009.
 */

public class SelfDefineView01 extends View {

    public SelfDefineView01(Context context) {
        this(context, null);
    }

    public SelfDefineView01(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SelfDefineView01(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }




}
