package com.google.android.material.textfield;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final p a;

    public i(p p0) {
        this.a = p0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.I(valueAnimator0);
    }
}

