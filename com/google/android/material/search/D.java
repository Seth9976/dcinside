package com.google.android.material.search;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;

public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final View a;

    public d(View view0) {
        this.a = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        j.B(this.a, valueAnimator0);
    }
}

