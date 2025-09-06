package com.dcinside.app.voice;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.mackhartley.roundedprogressbar.RoundedProgressBar;

public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final RoundedProgressBar a;

    public g(RoundedProgressBar roundedProgressBar0) {
        this.a = roundedProgressBar0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        m.P(this.a, valueAnimator0);
    }
}

