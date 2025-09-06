package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.RectToVector.1 extends N implements Function1 {
    public static final VectorConvertersKt.RectToVector.1 e;

    static {
        VectorConvertersKt.RectToVector.1.e = new VectorConvertersKt.RectToVector.1();
    }

    VectorConvertersKt.RectToVector.1() {
        super(1);
    }

    @l
    public final AnimationVector4D a(@l Rect rect0) {
        L.p(rect0, "it");
        return new AnimationVector4D(rect0.t(), rect0.B(), rect0.x(), rect0.j());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((Rect)object0));
    }
}

