package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

public class tT extends View {
    private Paint PjT;
    private static int ReZ = 50;
    private int Zh;
    private ObjectAnimator cr;

    static {
    }

    public tT(Context context0) {
        this(context0, null);
    }

    public tT(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, -1);
    }

    public tT(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.Zh = 10;
        this.ReZ();
    }

    public void PjT() {
        int v = ((int)Math.min(((float)this.getMeasuredWidth()) / 2.0f, ((float)this.getMeasuredHeight()) / 2.0f)) - 18;
        tT.ReZ = v;
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{10, v});
        valueAnimator0.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimator0.setDuration(800L);
        valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final tT PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                tT.this.Zh = v;
                tT.this.invalidate();
            }
        });
        valueAnimator0.addListener(new Animator.AnimatorListener() {
            final tT PjT;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                tT.this.cr.start();
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                tT.this.setVisibility(0);
                tT.this.setAlpha(1.0f);
            }
        });
        valueAnimator0.start();
    }

    private void ReZ() {
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setAntiAlias(true);
        this.PjT.setColor(Color.parseColor("#FFFFFFFF"));
        this.PjT.setStyle(Paint.Style.STROKE);
        this.PjT.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        this.cr = objectAnimator0;
        objectAnimator0.setDuration(200L);
    }

    public void Zh() {
        this.clearAnimation();
    }

    @Override  // android.view.View
    public void invalidate() {
        if(this.hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        this.PjT.setShader(new LinearGradient(((float)(this.getMeasuredWidth() / 2)), 0.0f, ((float)(this.getMeasuredWidth() / 2)), ((float)this.getMeasuredHeight()), -1, 0xFFFFFF, Shader.TileMode.CLAMP));
        canvas0.drawCircle(((float)this.getMeasuredWidth()) / 2.0f, ((float)this.getMeasuredHeight()) / 2.0f, ((float)this.Zh), this.PjT);
    }
}

