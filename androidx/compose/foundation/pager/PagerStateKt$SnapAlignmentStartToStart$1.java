package androidx.compose.foundation.pager;

import A3.p;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class PagerStateKt.SnapAlignmentStartToStart.1 extends N implements p {
    public static final PagerStateKt.SnapAlignmentStartToStart.1 e;

    static {
        PagerStateKt.SnapAlignmentStartToStart.1.e = new PagerStateKt.SnapAlignmentStartToStart.1();
    }

    PagerStateKt.SnapAlignmentStartToStart.1() {
        super(3);
    }

    @l
    public final Float a(@l Density density0, float f, float f1) {
        L.p(density0, "$this$null");
        return 0.0f;
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.a(((Density)object0), ((Number)object1).floatValue(), ((Number)object2).floatValue());
    }
}

