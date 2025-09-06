package androidx.compose.animation.core;

import kotlin.jvm.internal.A;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AnimationStateKt {
    @l
    public static final AnimationState a(float f, float f1, long v, long v1, boolean z) {
        return new AnimationState(VectorConvertersKt.i(A.a), f, AnimationVectorsKt.a(f1), v, v1, z);
    }

    @l
    public static final AnimationState b(@l TwoWayConverter twoWayConverter0, Object object0, Object object1, long v, long v1, boolean z) {
        L.p(twoWayConverter0, "typeConverter");
        return new AnimationState(twoWayConverter0, object0, ((AnimationVector)twoWayConverter0.a().invoke(object1)), v, v1, z);
    }

    public static AnimationState c(float f, float f1, long v, long v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            f1 = 0.0f;
        }
        long v3 = 0x8000000000000000L;
        long v4 = (v2 & 4) == 0 ? v : 0x8000000000000000L;
        if((v2 & 8) == 0) {
            v3 = v1;
        }
        return (v2 & 16) == 0 ? AnimationStateKt.a(f, f1, v4, v3, z) : AnimationStateKt.a(f, f1, v4, v3, false);
    }

    public static AnimationState d(TwoWayConverter twoWayConverter0, Object object0, Object object1, long v, long v1, boolean z, int v2, Object object2) {
        long v3 = (v2 & 8) == 0 ? v : 0x8000000000000000L;
        long v4 = (v2 & 16) == 0 ? v1 : 0x8000000000000000L;
        return (v2 & 0x20) == 0 ? AnimationStateKt.b(twoWayConverter0, object0, object1, v3, v4, z) : AnimationStateKt.b(twoWayConverter0, object0, object1, v3, v4, false);
    }

    @l
    public static final AnimationState e(@l AnimationState animationState0, float f, float f1, long v, long v1, boolean z) {
        L.p(animationState0, "<this>");
        return new AnimationState(animationState0.g(), f, AnimationVectorsKt.a(f1), v, v1, z);
    }

    @l
    public static final AnimationState f(@l AnimationState animationState0, Object object0, @m AnimationVector animationVector0, long v, long v1, boolean z) {
        L.p(animationState0, "<this>");
        return new AnimationState(animationState0.g(), object0, animationVector0, v, v1, z);
    }

    public static AnimationState g(AnimationState animationState0, float f, float f1, long v, long v1, boolean z, int v2, Object object0) {
        if((v2 & 1) != 0) {
            f = ((Number)animationState0.getValue()).floatValue();
        }
        if((v2 & 2) != 0) {
            f1 = ((AnimationVector1D)animationState0.j()).f();
        }
        if((v2 & 4) != 0) {
            v = animationState0.d();
        }
        if((v2 & 8) != 0) {
            v1 = animationState0.b();
        }
        if((v2 & 16) != 0) {
            z = animationState0.k();
        }
        return AnimationStateKt.e(animationState0, f, f1, v, v1, z);
    }

    public static AnimationState h(AnimationState animationState0, Object object0, AnimationVector animationVector0, long v, long v1, boolean z, int v2, Object object1) {
        if((v2 & 1) != 0) {
            object0 = animationState0.getValue();
        }
        if((v2 & 2) != 0) {
            animationVector0 = AnimationVectorsKt.e(animationState0.j());
        }
        if((v2 & 4) != 0) {
            v = animationState0.d();
        }
        if((v2 & 8) != 0) {
            v1 = animationState0.b();
        }
        if((v2 & 16) != 0) {
            z = animationState0.k();
        }
        return AnimationStateKt.f(animationState0, object0, animationVector0, v, v1, z);
    }

    @l
    public static final AnimationVector i(@l TwoWayConverter twoWayConverter0, Object object0) {
        L.p(twoWayConverter0, "<this>");
        return AnimationVectorsKt.g(((AnimationVector)twoWayConverter0.a().invoke(object0)));
    }

    public static final boolean j(@l AnimationState animationState0) {
        L.p(animationState0, "<this>");
        return animationState0.b() != 0x8000000000000000L;
    }
}

