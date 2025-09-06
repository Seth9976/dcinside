package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public interface VectorizedDurationBasedAnimationSpec extends VectorizedFiniteAnimationSpec {
    public static final class DefaultImpls {
        @Deprecated
        public static long a(@l VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
            L.p(animationVector0, "initialValue");
            L.p(animationVector1, "targetValue");
            L.p(animationVector2, "initialVelocity");
            return g.a(vectorizedDurationBasedAnimationSpec0, animationVector0, animationVector1, animationVector2);
        }

        @Deprecated
        @l
        public static AnimationVector b(@l VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
            L.p(animationVector0, "initialValue");
            L.p(animationVector1, "targetValue");
            L.p(animationVector2, "initialVelocity");
            return f.a(vectorizedDurationBasedAnimationSpec0, animationVector0, animationVector1, animationVector2);
        }

        @Deprecated
        public static boolean c(@l VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0) {
            return g.d(vectorizedDurationBasedAnimationSpec0);
        }
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    long b(@l AnimationVector arg1, @l AnimationVector arg2, @l AnimationVector arg3);

    int c();

    int g();
}

