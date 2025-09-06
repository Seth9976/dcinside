package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nVectorConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,195:1\n175#2:196\n*S KotlinDebug\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n*L\n145#1:196\n*E\n"})
final class VectorConvertersKt.DpOffsetToVector.2 extends N implements Function1 {
    public static final VectorConvertersKt.DpOffsetToVector.2 e;

    static {
        VectorConvertersKt.DpOffsetToVector.2.e = new VectorConvertersKt.DpOffsetToVector.2();
    }

    VectorConvertersKt.DpOffsetToVector.2() {
        super(1);
    }

    public final long a(@l AnimationVector2D animationVector2D0) {
        L.p(animationVector2D0, "it");
        return DpKt.a(Dp.g(animationVector2D0.f()), Dp.g(animationVector2D0.g()));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return DpOffset.c(this.a(((AnimationVector2D)object0)));
    }
}

