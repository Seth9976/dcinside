package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.IntToVector.1 extends N implements Function1 {
    public static final VectorConvertersKt.IntToVector.1 e;

    static {
        VectorConvertersKt.IntToVector.1.e = new VectorConvertersKt.IntToVector.1();
    }

    VectorConvertersKt.IntToVector.1() {
        super(1);
    }

    @l
    public final AnimationVector1D a(int v) {
        return new AnimationVector1D(((float)v));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((Number)object0).intValue());
    }
}

