package androidx.core.view.insets;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final Protection a;

    public a(Protection protection0) {
        this.a = protection0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.p(valueAnimator0);
    }
}

