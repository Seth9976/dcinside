package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class VectorConvertersKt.SizeToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.SizeToVector.2 e;

    static {
        VectorConvertersKt.SizeToVector.2.e = new VectorConvertersKt.SizeToVector.2();
    }

    VectorConvertersKt.SizeToVector.2() {
        super(1);
    }

    public final long a(@l AnimationVector2D animationVector2D0) {
        L.p(animationVector2D0, "it");
        return SizeKt.a(animationVector2D0.f(), animationVector2D0.g());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return Size.c(this.a(((AnimationVector2D)object0)));
    }
}

