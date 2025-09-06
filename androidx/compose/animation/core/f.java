package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public final class f {
    @l
    public static AnimationVector a(VectorizedAnimationSpec vectorizedAnimationSpec0, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return vectorizedAnimationSpec0.e(vectorizedAnimationSpec0.b(animationVector0, animationVector1, animationVector2), animationVector0, animationVector1, animationVector2);
    }
}

