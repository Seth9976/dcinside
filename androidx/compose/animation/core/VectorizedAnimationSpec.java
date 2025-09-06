package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public interface VectorizedAnimationSpec {
    public static final class DefaultImpls {
        @Deprecated
        @l
        public static AnimationVector a(@l VectorizedAnimationSpec vectorizedAnimationSpec0, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
            L.p(animationVector0, "initialValue");
            L.p(animationVector1, "targetValue");
            L.p(animationVector2, "initialVelocity");
            return f.a(vectorizedAnimationSpec0, animationVector0, animationVector1, animationVector2);
        }
    }

    boolean a();

    long b(@l AnimationVector arg1, @l AnimationVector arg2, @l AnimationVector arg3);

    @l
    AnimationVector d(@l AnimationVector arg1, @l AnimationVector arg2, @l AnimationVector arg3);

    @l
    AnimationVector e(long arg1, @l AnimationVector arg2, @l AnimationVector arg3, @l AnimationVector arg4);

    @l
    AnimationVector f(long arg1, @l AnimationVector arg2, @l AnimationVector arg3, @l AnimationVector arg4);
}

