package com.dcinside.app.view.recent;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final RecentMenuView a;

    public g(RecentMenuView recentMenuView0) {
        this.a = recentMenuView0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.t(valueAnimator0);
    }
}

