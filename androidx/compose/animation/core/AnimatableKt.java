package androidx.compose.animation.core;

import kotlin.jvm.internal.A;
import y4.l;

public final class AnimatableKt {
    @l
    public static final Animatable a(float f, float f1) {
        return new Animatable(f, VectorConvertersKt.i(A.a), f1, null, 8, null);
    }

    public static Animatable b(float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 0.01f;
        }
        return AnimatableKt.a(f, f1);
    }
}

