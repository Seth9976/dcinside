package com.google.android.material.search;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Rect;

public final class z implements ValueAnimator.AnimatorUpdateListener {
    public final F a;
    public final float b;
    public final float c;
    public final Rect d;

    public z(F f0, float f1, float f2, Rect rect0) {
        this.a = f0;
        this.b = f1;
        this.c = f2;
        this.d = rect0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.P(this.b, this.c, this.d, valueAnimator0);
    }
}

