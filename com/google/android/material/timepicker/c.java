package com.google.android.material.timepicker;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final ClockHandView a;

    public c(ClockHandView clockHandView0) {
        this.a = clockHandView0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.m(valueAnimator0);
    }
}

