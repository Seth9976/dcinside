package androidx.media3.ui;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final PlayerControlViewLayoutManager a;

    public v(PlayerControlViewLayoutManager playerControlViewLayoutManager0) {
        this.a = playerControlViewLayoutManager0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.N(valueAnimator0);
    }
}

