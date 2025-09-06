package androidx.compose.animation.core;

final class EasingFunctionsKt.EaseOutBounce.1 implements Easing {
    public static final EasingFunctionsKt.EaseOutBounce.1 a;

    static {
        EasingFunctionsKt.EaseOutBounce.1.a = new EasingFunctionsKt.EaseOutBounce.1();
    }

    @Override  // androidx.compose.animation.core.Easing
    public final float a(float f) {
        if(f < 0.363636f) {
            return 7.5625f * f * f;
        }
        if(f < 0.727273f) {
            return 7.5625f * (f - 0.545455f) * (f - 0.545455f) + 0.75f;
        }
        return f < 0.909091f ? 7.5625f * (f - 0.818182f) * (f - 0.818182f) + 0.9375f : 7.5625f * (f - 0.954545f) * (f - 0.954545f) + 0.984375f;
    }
}

