package androidx.compose.animation.core;

final class EasingFunctionsKt.EaseInOutElastic.1 implements Easing {
    public static final EasingFunctionsKt.EaseInOutElastic.1 a;

    static {
        EasingFunctionsKt.EaseInOutElastic.1.a = new EasingFunctionsKt.EaseInOutElastic.1();
    }

    @Override  // androidx.compose.animation.core.Easing
    public final float a(float f) {
        if(f != 0.0f) {
            if(f == 1.0f) {
                return 1.0f;
            }
            return 0.0f > f || f > 0.5f ? ((float)(((double)(((float)Math.pow(2.0, -20.0f * f + 10.0f)))) * Math.sin(((double)(f * 20.0f - 11.125f)) * 1.396263) / 2.0)) + 1.0f : ((float)(-(((double)(((float)Math.pow(2.0, f * 20.0f - 10.0f)))) * Math.sin(((double)(f * 20.0f - 11.125f)) * 1.396263)) / 2.0));
        }
        return 0.0f;
    }
}

