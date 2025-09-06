package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.FloatToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.FloatToVector.2 e;

    static {
        VectorConvertersKt.FloatToVector.2.e = new VectorConvertersKt.FloatToVector.2();
    }

    VectorConvertersKt.FloatToVector.2() {
        super(1);
    }

    @l
    public final Float a(@l AnimationVector1D animationVector1D0) {
        L.p(animationVector1D0, "it");
        return animationVector1D0.f();
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((AnimationVector1D)object0));
    }
}

