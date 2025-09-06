package com.google.android.material.internal;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Rect;

public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final g a;
    public final Rect b;

    public f(g g0, Rect rect0) {
        this.a = g0;
        this.b = rect0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.m(this.b, valueAnimator0);
    }
}

