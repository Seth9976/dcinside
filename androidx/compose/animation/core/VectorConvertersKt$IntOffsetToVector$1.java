package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.IntOffsetToVector.1 extends N implements Function1 {
    public static final VectorConvertersKt.IntOffsetToVector.1 e;

    static {
        VectorConvertersKt.IntOffsetToVector.1.e = new VectorConvertersKt.IntOffsetToVector.1();
    }

    VectorConvertersKt.IntOffsetToVector.1() {
        super(1);
    }

    @l
    public final AnimationVector2D a(long v) {
        return new AnimationVector2D(((float)(((int)(v >> 0x20)))), ((float)(((int)(v & 0xFFFFFFFFL)))));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((IntOffset)object0).w());
    }
}

