package L0;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.drawable.b;
import y4.l;
import y4.m;
import z3.n;

public final class c {
    @l
    public static final c a;

    static {
        c.a = new c();
    }

    // 去混淆评级： 低(20)
    @m
    @n
    public static final ValueAnimator.AnimatorUpdateListener a(@m Drawable drawable0) {
        return drawable0 instanceof b ? L0.b.b(((b)drawable0)) : null;
    }

    // 去混淆评级： 低(20)
    @m
    @n
    public static final ValueAnimator b(@m Drawable drawable0) {
        return drawable0 instanceof b ? L0.b.d(drawable0, ((b)drawable0).k(), ((b)drawable0).l()) : null;
    }

    // 去混淆评级： 低(20)
    @m
    @n
    public static final ValueAnimator c(@m Drawable drawable0, int v) {
        return drawable0 instanceof b ? L0.b.e(((b)drawable0), v) : null;
    }
}

