package com.google.android.material.motion;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final ClippableRoundedCornerLayout a;

    public g(ClippableRoundedCornerLayout clippableRoundedCornerLayout0) {
        this.a = clippableRoundedCornerLayout0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        h.q(this.a, valueAnimator0);
    }
}

