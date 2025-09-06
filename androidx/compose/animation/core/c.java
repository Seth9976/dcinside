package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public final class c {
    public static float a(FloatAnimationSpec floatAnimationSpec0, float f, float f1, float f2) {
        return floatAnimationSpec0.b(floatAnimationSpec0.c(f, f1, f2), f, f1, f2);
    }

    @l
    public static VectorizedFloatAnimationSpec c(FloatAnimationSpec floatAnimationSpec0, @l TwoWayConverter twoWayConverter0) {
        L.p(twoWayConverter0, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec0);
    }
}

