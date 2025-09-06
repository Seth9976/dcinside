package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.IntToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.IntToVector.2 e;

    static {
        VectorConvertersKt.IntToVector.2.e = new VectorConvertersKt.IntToVector.2();
    }

    VectorConvertersKt.IntToVector.2() {
        super(1);
    }

    @l
    public final Integer a(@l AnimationVector1D animationVector1D0) {
        L.p(animationVector1D0, "it");
        return (int)animationVector1D0.f();
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((AnimationVector1D)object0));
    }
}

