package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class EnterExitTransitionKt.TransformOriginVectorConverter.2 extends N implements Function1 {
    public static final EnterExitTransitionKt.TransformOriginVectorConverter.2 e;

    static {
        EnterExitTransitionKt.TransformOriginVectorConverter.2.e = new EnterExitTransitionKt.TransformOriginVectorConverter.2();
    }

    EnterExitTransitionKt.TransformOriginVectorConverter.2() {
        super(1);
    }

    public final long a(@l AnimationVector2D animationVector2D0) {
        L.p(animationVector2D0, "it");
        return TransformOriginKt.a(animationVector2D0.f(), animationVector2D0.g());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return TransformOrigin.b(this.a(((AnimationVector2D)object0)));
    }
}

