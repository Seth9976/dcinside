package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.DpToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.DpToVector.2 e;

    static {
        VectorConvertersKt.DpToVector.2.e = new VectorConvertersKt.DpToVector.2();
    }

    VectorConvertersKt.DpToVector.2() {
        super(1);
    }

    public final float a(@l AnimationVector1D animationVector1D0) {
        L.p(animationVector1D0, "it");
        return Dp.g(animationVector1D0.f());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return Dp.d(this.a(((AnimationVector1D)object0)));
    }
}

