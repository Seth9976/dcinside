package androidx.compose.animation.core;

import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.DpOffsetToVector.1 extends N implements Function1 {
    public static final VectorConvertersKt.DpOffsetToVector.1 e;

    static {
        VectorConvertersKt.DpOffsetToVector.1.e = new VectorConvertersKt.DpOffsetToVector.1();
    }

    VectorConvertersKt.DpOffsetToVector.1() {
        super(1);
    }

    @l
    public final AnimationVector2D a(long v) {
        return new AnimationVector2D(DpOffset.j(v), DpOffset.l(v));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((DpOffset)object0).r());
    }
}

