package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

public final class FloatDecayAnimationSpecKt {
    private static final float a = -4.2f;

    @l
    public static final Animation a(@l FloatDecayAnimationSpec floatDecayAnimationSpec0, float f, float f1) {
        L.p(floatDecayAnimationSpec0, "<this>");
        return AnimationKt.a(floatDecayAnimationSpec0, f, f1);
    }

    public static Animation b(FloatDecayAnimationSpec floatDecayAnimationSpec0, float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return FloatDecayAnimationSpecKt.a(floatDecayAnimationSpec0, f, f1);
    }
}

