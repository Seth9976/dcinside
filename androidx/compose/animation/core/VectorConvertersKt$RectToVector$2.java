package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.RectToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.RectToVector.2 e;

    static {
        VectorConvertersKt.RectToVector.2.e = new VectorConvertersKt.RectToVector.2();
    }

    VectorConvertersKt.RectToVector.2() {
        super(1);
    }

    @l
    public final Rect a(@l AnimationVector4D animationVector4D0) {
        L.p(animationVector4D0, "it");
        return new Rect(animationVector4D0.f(), animationVector4D0.g(), animationVector4D0.h(), animationVector4D0.i());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((AnimationVector4D)object0));
    }
}

