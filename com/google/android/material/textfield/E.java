package com.google.android.material.textfield;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final f a;

    public e(f f0) {
        this.a = f0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.F(valueAnimator0);
    }
}

