package com.dcinside.app.read;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;

public final class l implements ValueAnimator.AnimatorUpdateListener {
    public final View a;
    public final ValueAnimator b;

    public l(View view0, ValueAnimator valueAnimator0) {
        this.a = view0;
        this.b = valueAnimator0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        x.W(this.a, this.b, valueAnimator0);
    }
}

