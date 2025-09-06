package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.OffsetToVector.1 extends N implements Function1 {
    public static final VectorConvertersKt.OffsetToVector.1 e;

    static {
        VectorConvertersKt.OffsetToVector.1.e = new VectorConvertersKt.OffsetToVector.1();
    }

    VectorConvertersKt.OffsetToVector.1() {
        super(1);
    }

    @l
    public final AnimationVector2D a(long v) {
        return new AnimationVector2D(Offset.p(v), Offset.r(v));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((Offset)object0).A());
    }
}

