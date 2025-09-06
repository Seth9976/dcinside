package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.DpToVector.1 extends N implements Function1 {
    public static final VectorConvertersKt.DpToVector.1 e;

    static {
        VectorConvertersKt.DpToVector.1.e = new VectorConvertersKt.DpToVector.1();
    }

    VectorConvertersKt.DpToVector.1() {
        super(1);
    }

    @l
    public final AnimationVector1D b(float f) {
        return new AnimationVector1D(f);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.b(((Dp)object0).w());
    }
}

