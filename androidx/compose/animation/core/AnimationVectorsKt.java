package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public final class AnimationVectorsKt {
    @l
    public static final AnimationVector1D a(float f) {
        return new AnimationVector1D(f);
    }

    @l
    public static final AnimationVector2D b(float f, float f1) {
        return new AnimationVector2D(f, f1);
    }

    @l
    public static final AnimationVector3D c(float f, float f1, float f2) {
        return new AnimationVector3D(f, f1, f2);
    }

    @l
    public static final AnimationVector4D d(float f, float f1, float f2, float f3) {
        return new AnimationVector4D(f, f1, f2, f3);
    }

    @l
    public static final AnimationVector e(@l AnimationVector animationVector0) {
        L.p(animationVector0, "<this>");
        AnimationVector animationVector1 = AnimationVectorsKt.g(animationVector0);
        int v = animationVector1.b();
        for(int v1 = 0; v1 < v; ++v1) {
            animationVector1.e(v1, animationVector0.a(v1));
        }
        return animationVector1;
    }

    public static final void f(@l AnimationVector animationVector0, @l AnimationVector animationVector1) {
        L.p(animationVector0, "<this>");
        L.p(animationVector1, "source");
        int v = animationVector0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            animationVector0.e(v1, animationVector1.a(v1));
        }
    }

    @l
    public static final AnimationVector g(@l AnimationVector animationVector0) {
        L.p(animationVector0, "<this>");
        AnimationVector animationVector1 = animationVector0.c();
        L.n(animationVector1, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return animationVector1;
    }
}

