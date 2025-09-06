package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class gK extends View {
    private float Au;
    private int DWo;
    private Paint JQp;
    private float PjT;
    private ValueAnimator ReZ;
    private Animator.AnimatorListener SM;
    private float XX;
    private float Zh;
    private ValueAnimator cr;
    private long cz;

    public gK(Context context0, int v) {
        super(context0);
        this.cz = 300L;
        this.XX = 0.0f;
        this.DWo = v;
        this.PjT();
    }

    public void PjT() {
        Paint paint0 = new Paint(1);
        this.JQp = paint0;
        paint0.setStyle(Paint.Style.FILL);
        this.JQp.setColor(this.DWo);
    }

    public void ReZ() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{this.Au, 0.0f});
        this.cr = valueAnimator0;
        valueAnimator0.setDuration(this.cz);
        this.cr.setInterpolator(new LinearInterpolator());
        this.cr.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final gK PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                gK.this.XX = f;
                gK.this.invalidate();
            }
        });
        Animator.AnimatorListener animator$AnimatorListener0 = this.SM;
        if(animator$AnimatorListener0 != null) {
            this.cr.addListener(animator$AnimatorListener0);
        }
        this.cr.start();
    }

    public void Zh() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, this.Au});
        this.ReZ = valueAnimator0;
        valueAnimator0.setDuration(this.cz);
        this.ReZ.setInterpolator(new LinearInterpolator());
        this.ReZ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final gK PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                gK.this.XX = f;
                gK.this.invalidate();
            }
        });
        this.ReZ.start();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        canvas0.drawCircle(this.PjT, this.Zh, this.XX, this.JQp);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.PjT = ((float)v) / 2.0f;
        this.Zh = ((float)v1) / 2.0f;
        this.Au = (float)(Math.hypot(v, v1) / 2.0);
    }

    public void setAnimationListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.SM = animator$AnimatorListener0;
    }
}

