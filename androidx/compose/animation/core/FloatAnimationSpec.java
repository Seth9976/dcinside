package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public interface FloatAnimationSpec extends AnimationSpec {
    public static final class DefaultImpls {
        @Deprecated
        public static float a(@l FloatAnimationSpec floatAnimationSpec0, float f, float f1, float f2) {
            return c.a(floatAnimationSpec0, f, f1, f2);
        }

        @Deprecated
        @l
        public static VectorizedFloatAnimationSpec b(@l FloatAnimationSpec floatAnimationSpec0, @l TwoWayConverter twoWayConverter0) {
            L.p(twoWayConverter0, "converter");
            return c.c(floatAnimationSpec0, twoWayConverter0);
        }
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    VectorizedAnimationSpec a(TwoWayConverter arg1);

    @l
    VectorizedFloatAnimationSpec a(@l TwoWayConverter arg1);

    float b(long arg1, float arg2, float arg3, float arg4);

    long c(float arg1, float arg2, float arg3);

    float d(float arg1, float arg2, float arg3);

    float e(long arg1, float arg2, float arg3, float arg4);
}

