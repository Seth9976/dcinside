package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.SizeToVector.1 extends N implements Function1 {
    public static final VectorConvertersKt.SizeToVector.1 e;

    static {
        VectorConvertersKt.SizeToVector.1.e = new VectorConvertersKt.SizeToVector.1();
    }

    VectorConvertersKt.SizeToVector.1() {
        super(1);
    }

    @l
    public final AnimationVector2D a(long v) {
        return new AnimationVector2D(Size.t(v), Size.m(v));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((Size)object0).y());
    }
}

