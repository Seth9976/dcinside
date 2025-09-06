package com.google.android.material.appbar;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.material.shape.k;

public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final AppBarLayout a;
    public final k b;

    public c(AppBarLayout appBarLayout0, k k0) {
        this.a = appBarLayout0;
        this.b = k0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.w(this.b, valueAnimator0);
    }
}

