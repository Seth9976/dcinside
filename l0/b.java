package L0;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class b {
    @l
    public static final b a;

    static {
        b.a = new b();
    }

    @l
    @n
    public static final ValueAnimator.AnimatorUpdateListener b(@l Drawable drawable0) {
        L.p(drawable0, "drawable");
        return (ValueAnimator valueAnimator0) -> {
            L.p(drawable0, "$drawable");
            L.p(valueAnimator0, "animation");
            Object object0 = valueAnimator0.getAnimatedValue();
            L.n(object0, "null cannot be cast to non-null type kotlin.Int");
            drawable0.setLevel(((int)(((Integer)object0))));
        };
    }

    // 检测为 Lambda 实现
    private static final void c(Drawable drawable0, ValueAnimator valueAnimator0) [...]

    @l
    @n
    public static final ValueAnimator d(@l Drawable drawable0, int v, long v1) {
        L.p(drawable0, "animatedDrawable");
        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setIntValues(new int[]{0, ((int)v1)});
        valueAnimator0.setDuration(v1);
        if(v == 0) {
            v = -1;
        }
        valueAnimator0.setRepeatCount(v);
        valueAnimator0.setRepeatMode(1);
        valueAnimator0.setInterpolator(null);
        valueAnimator0.addUpdateListener(b.b(drawable0));
        return valueAnimator0;
    }

    @m
    @n
    public static final ValueAnimator e(@l com.facebook.fresco.animation.drawable.b b0, int v) {
        L.p(b0, "animatedDrawable");
        ValueAnimator valueAnimator0 = b.d(b0, b0.k(), b0.l());
        if(valueAnimator0 == null) {
            return null;
        }
        valueAnimator0.setRepeatCount(((int)Math.max(((long)v) / b0.l(), 1L)));
        return valueAnimator0;
    }
}

