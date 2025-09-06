package com.bytedance.sdk.openadsdk.core.JQp;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class cz extends FrameLayout {
    private boolean Au;
    private Drawable JQp;
    private int PjT;
    private Drawable ReZ;
    private ValueAnimator XX;
    private int Zh;
    private Drawable cr;
    private boolean cz;

    public cz(Context context0) {
        super(context0);
        this.PjT = 100;
    }

    public cz(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.PjT = 100;
    }

    private void PjT() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{0, 10000});
        this.XX = valueAnimator0;
        valueAnimator0.setDuration(2000L);
        this.XX.setRepeatCount(-1);
        this.XX.setInterpolator(new LinearInterpolator());
        this.XX.setRepeatMode(1);
        this.XX.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final cz PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                cz.this.setProgress(v);
            }
        });
        this.XX.start();
        this.setMax(10000);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cz = true;
        if(this.JQp != null) {
            this.PjT();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cz = false;
        ValueAnimator valueAnimator0 = this.XX;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
            this.XX.removeAllUpdateListeners();
            this.XX = null;
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(@NonNull View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(v != 0) {
            ValueAnimator valueAnimator1 = this.XX;
            if(valueAnimator1 != null && !this.Au) {
                this.Au = true;
                valueAnimator1.pause();
            }
        }
        else if(this.Au) {
            this.Au = false;
            ValueAnimator valueAnimator0 = this.XX;
            if(valueAnimator0 != null) {
                valueAnimator0.resume();
                return;
            }
            this.PjT();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable0) {
        this.JQp = drawable0;
        this.setProgressDrawable(drawable0);
        if(this.cz && this.XX == null) {
            this.PjT();
        }
    }

    @Override  // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setLayoutParams(SM.PjT(this, viewGroup$LayoutParams0));
    }

    public void setMax(int v) {
        this.PjT = v;
    }

    @Override  // android.view.View
    public void setPadding(int v, int v1, int v2, int v3) {
        super.setPaddingRelative(v, v1, v2, v3);
    }

    public void setProgress(int v) {
        this.Zh = v;
        Drawable drawable0 = this.ReZ;
        if(drawable0 != null) {
            drawable0.setLevel(((int)(((float)v) * 10000.0f / ((float)this.PjT))));
        }
    }

    public void setProgressDrawable(Drawable drawable0) {
        this.cr = drawable0;
        this.setBackground(drawable0);
        Drawable drawable1 = this.cr;
        if(drawable1 instanceof LayerDrawable) {
            int v = ((LayerDrawable)drawable1).getNumberOfLayers();
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable2 = ((LayerDrawable)this.cr).getDrawable(v1);
                if(drawable2 instanceof ScaleDrawable || drawable2 instanceof ClipDrawable) {
                    this.ReZ = drawable2;
                }
            }
        }
        Drawable drawable3 = this.cr;
        if(drawable3 instanceof RotateDrawable) {
            this.ReZ = drawable3;
        }
    }
}

