package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.OffsetToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.OffsetToVector.2 e;

    static {
        VectorConvertersKt.OffsetToVector.2.e = new VectorConvertersKt.OffsetToVector.2();
    }

    VectorConvertersKt.OffsetToVector.2() {
        super(1);
    }

    public final long a(@l AnimationVector2D animationVector2D0) {
        L.p(animationVector2D0, "it");
        return OffsetKt.a(animationVector2D0.f(), animationVector2D0.g());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return Offset.d(this.a(((AnimationVector2D)object0)));
    }
}

