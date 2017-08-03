package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint;
    private int longRadius = 200;
    private int shortRadius = 150;
    private RectF mRectF;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRectF = new RectF();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        int cx = getWidth() / 2;
        int cy = getHeight() / 2;
        float left = cx - longRadius;
        float top = cy - shortRadius;
        float right = cx + longRadius;
        float bottom = cy + shortRadius;
        mRectF.set(left, top, right, bottom);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(mRectF, -180, 60, false, mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(mRectF, -110, 100, true, mPaint);

        canvas.drawArc(mRectF, 15, 150, false, mPaint);
    }
}
