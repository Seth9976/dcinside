package com.google.android.material.search;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.shape.k;

public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final k a;
    public final View b;

    public h(k k0, View view0) {
        this.a = k0;
        this.b = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        j.A(this.a, this.b, valueAnimator0);
    }
}

