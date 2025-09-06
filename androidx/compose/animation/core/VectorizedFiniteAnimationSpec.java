package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public interface VectorizedFiniteAnimationSpec extends VectorizedAnimationSpec {
    public static final class DefaultImpls {
        @Deprecated
        @l
        public static AnimationVector a(@l VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec0, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
            L.p(animationVector0, "initialValue");
            L.p(animationVector1, "targetValue");
            L.p(animationVector2, "initialVelocity");
            return f.a(vectorizedFiniteAnimationSpec0, animationVector0, animationVector1, animationVector2);
        }

        @Deprecated
        public static boolean b(@l VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec0) {
            return h.c(vectorizedFiniteAnimationSpec0);
        }
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    boolean a();
}

