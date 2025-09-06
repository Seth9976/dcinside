package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class EnterExitTransitionKt.TransformOriginVectorConverter.1 extends N implements Function1 {
    public static final EnterExitTransitionKt.TransformOriginVectorConverter.1 e;

    static {
        EnterExitTransitionKt.TransformOriginVectorConverter.1.e = new EnterExitTransitionKt.TransformOriginVectorConverter.1();
    }

    EnterExitTransitionKt.TransformOriginVectorConverter.1() {
        super(1);
    }

    @l
    public final AnimationVector2D a(long v) {
        return new AnimationVector2D(TransformOrigin.k(v), TransformOrigin.l(v));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((TransformOrigin)object0).o());
    }
}

