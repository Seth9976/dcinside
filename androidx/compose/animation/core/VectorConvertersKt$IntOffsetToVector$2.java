package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.math.b;
import y4.l;

final class VectorConvertersKt.IntOffsetToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.IntOffsetToVector.2 e;

    static {
        VectorConvertersKt.IntOffsetToVector.2.e = new VectorConvertersKt.IntOffsetToVector.2();
    }

    VectorConvertersKt.IntOffsetToVector.2() {
        super(1);
    }

    public final long a(@l AnimationVector2D animationVector2D0) {
        L.p(animationVector2D0, "it");
        return IntOffsetKt.a(b.L0(animationVector2D0.f()), b.L0(animationVector2D0.g()));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return IntOffset.b(this.a(((AnimationVector2D)object0)));
    }
}

