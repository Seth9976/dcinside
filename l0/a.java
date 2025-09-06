package L0;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final Drawable a;

    public a(Drawable drawable0) {
        this.a = drawable0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        b.c(this.a, valueAnimator0);
    }
}

