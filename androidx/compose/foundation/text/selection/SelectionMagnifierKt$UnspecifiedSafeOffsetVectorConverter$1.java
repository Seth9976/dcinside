package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter.1 extends N implements Function1 {
    public static final SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter.1 e;

    static {
        SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter.1.e = new SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter.1();
    }

    SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter.1() {
        super(1);
    }

    // 去混淆评级： 低(20)
    @l
    public final AnimationVector2D a(long v) {
        return OffsetKt.d(v) ? new AnimationVector2D(Offset.p(v), Offset.r(v)) : SelectionMagnifierKt.a;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((Offset)object0).A());
    }
}

