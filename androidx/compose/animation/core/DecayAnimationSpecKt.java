package androidx.compose.animation.core;

import kotlin.jvm.internal.A;
import kotlin.jvm.internal.L;
import y4.l;

public final class DecayAnimationSpecKt {
    public static final float a(@l DecayAnimationSpec decayAnimationSpec0, float f, float f1) {
        L.p(decayAnimationSpec0, "<this>");
        return ((AnimationVector1D)decayAnimationSpec0.a(VectorConvertersKt.i(A.a)).d(AnimationVectorsKt.a(f), AnimationVectorsKt.a(f1))).f();
    }

    public static final Object b(@l DecayAnimationSpec decayAnimationSpec0, @l TwoWayConverter twoWayConverter0, Object object0, Object object1) {
        L.p(decayAnimationSpec0, "<this>");
        L.p(twoWayConverter0, "typeConverter");
        AnimationVector animationVector0 = decayAnimationSpec0.a(twoWayConverter0).d(((AnimationVector)twoWayConverter0.a().invoke(object0)), ((AnimationVector)twoWayConverter0.a().invoke(object1)));
        return twoWayConverter0.b().invoke(animationVector0);
    }

    @l
    public static final DecayAnimationSpec c(float f, float f1) {
        return DecayAnimationSpecKt.e(new FloatExponentialDecaySpec(f, f1));
    }

    public static DecayAnimationSpec d(float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.1f;
        }
        return DecayAnimationSpecKt.c(f, f1);
    }

    @l
    public static final DecayAnimationSpec e(@l FloatDecayAnimationSpec floatDecayAnimationSpec0) {
        L.p(floatDecayAnimationSpec0, "<this>");
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec0);
    }
}

