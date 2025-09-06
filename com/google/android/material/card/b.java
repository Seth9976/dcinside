package com.google.android.material.card;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final c a;

    public b(c c0) {
        this.a = c0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.I(valueAnimator0);
    }
}

