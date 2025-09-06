package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public final class g {
    public static long a(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return ((long)(vectorizedDurationBasedAnimationSpec0.g() + vectorizedDurationBasedAnimationSpec0.c())) * 1000000L;
    }

    public static boolean d(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0) {
        return false;
    }
}

