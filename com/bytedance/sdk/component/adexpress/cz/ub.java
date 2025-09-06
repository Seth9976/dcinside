package com.bytedance.sdk.component.adexpress.cz;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View.MeasureSpec;
import android.view.View;

public class ub extends View {
    private ValueAnimator JQp;
    private Context PjT;
    private RectF ReZ;
    private boolean XX;
    private Paint Zh;
    private float cr;
    private int cz;

    public ub(Context context0) {
        super(context0);
        this.cz = 1500;
        this.PjT = context0;
        Paint paint0 = new Paint();
        this.Zh = paint0;
        paint0.setAntiAlias(true);
        this.Zh.setStyle(Paint.Style.STROKE);
        this.Zh.setStrokeWidth(10.0f);
        this.Zh.setColor(Color.parseColor("#80FFFFFF"));
        this.ReZ = new RectF();
    }

    public void PjT() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
        this.JQp = valueAnimator0;
        valueAnimator0.setDuration(((long)this.cz));
        this.JQp.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final ub PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                ub.this.cr = f;
                ub.this.requestLayout();
            }
        });
        this.JQp.start();
    }

    public void ReZ() {
        this.XX = true;
        this.invalidate();
    }

    public void Zh() {
        ValueAnimator valueAnimator0 = this.JQp;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.XX) {
            return;
        }
        canvas0.drawArc(this.ReZ, 270.0f, this.cr, false, this.Zh);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getSize(v1);
        this.setMeasuredDimension(Math.min(v2, v3), Math.min(v2, v3));
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.ReZ.set(5.0f, 5.0f, ((float)(v - 5)), ((float)(v1 - 5)));
    }

    public void setDuration(int v) {
        this.cz = v;
    }
}

