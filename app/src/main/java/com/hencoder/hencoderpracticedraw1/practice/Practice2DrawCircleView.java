package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice2DrawCircleView extends View {

    private int radius = 160;
    private int margin = 30;
    private int marginTop = 10;
    private int marginTop1 = 10;

    private Paint mPaint;

    public Practice2DrawCircleView(Context context) {
        this(context, null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        //实心圆
        int width = getWidth();
        int marginLeft = (width - radius * 4 - margin) / 2;
        int cx1 = marginLeft + radius;
        int cy1 = radius + marginTop;
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(cx1, cy1, radius, mPaint);

        //空心圆
        int cx2 = width - marginLeft - radius;
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        canvas.drawCircle(cx2, cy1, radius, mPaint);

        //蓝色实心圆
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        int cy2 = cx1 + radius + marginTop1;
        canvas.drawCircle(cx1, cy2, radius, mPaint);

        //线宽为 20 的空心圆
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(getResources().getDimension(R.dimen.circle_width));
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(cx2, cy2, radius, mPaint);
    }
}
