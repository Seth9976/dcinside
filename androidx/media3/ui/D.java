package androidx.media3.ui;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final DefaultTimeBar a;

    public d(DefaultTimeBar defaultTimeBar0) {
        this.a = defaultTimeBar0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.m(valueAnimator0);
    }
}

