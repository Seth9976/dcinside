package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.FloatToVector.1 extends N implements Function1 {
    public static final VectorConvertersKt.FloatToVector.1 e;

    static {
        VectorConvertersKt.FloatToVector.1.e = new VectorConvertersKt.FloatToVector.1();
    }

    VectorConvertersKt.FloatToVector.1() {
        super(1);
    }

    @l
    public final AnimationVector1D b(float f) {
        return new AnimationVector1D(f);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.b(((Number)object0).floatValue());
    }
}

