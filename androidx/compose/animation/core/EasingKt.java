package androidx.compose.animation.core;

import y4.l;

public final class EasingKt {
    @l
    private static final Easing a = null;
    @l
    private static final Easing b = null;
    @l
    private static final Easing c = null;
    @l
    private static final Easing d = null;
    private static final float e = 0.001f;

    static {
        EasingKt.a = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
        EasingKt.b = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
        EasingKt.c = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        EasingKt.d = (float f) -> f;
    }

    @l
    public static final Easing a() {
        return EasingKt.c;
    }

    @l
    public static final Easing b() {
        return EasingKt.a;
    }

    @l
    public static final Easing c() {
        return EasingKt.d;
    }

    @l
    public static final Easing d() {
        return EasingKt.b;
    }
}

