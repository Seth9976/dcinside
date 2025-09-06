package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.math.b;
import y4.l;

final class VectorConvertersKt.IntSizeToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.IntSizeToVector.2 e;

    static {
        VectorConvertersKt.IntSizeToVector.2.e = new VectorConvertersKt.IntSizeToVector.2();
    }

    VectorConvertersKt.IntSizeToVector.2() {
        super(1);
    }

    public final long a(@l AnimationVector2D animationVector2D0) {
        L.p(animationVector2D0, "it");
        return IntSizeKt.a(b.L0(animationVector2D0.f()), b.L0(animationVector2D0.g()));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return IntSize.b(this.a(((AnimationVector2D)object0)));
    }
}

