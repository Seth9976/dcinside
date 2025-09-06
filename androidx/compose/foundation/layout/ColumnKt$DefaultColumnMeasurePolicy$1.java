package androidx.compose.foundation.layout;

import A3.r;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt$DefaultColumnMeasurePolicy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
final class ColumnKt.DefaultColumnMeasurePolicy.1 extends N implements r {
    public static final ColumnKt.DefaultColumnMeasurePolicy.1 e;

    static {
        ColumnKt.DefaultColumnMeasurePolicy.1.e = new ColumnKt.DefaultColumnMeasurePolicy.1();
    }

    ColumnKt.DefaultColumnMeasurePolicy.1() {
        super(5);
    }

    @Override  // A3.r
    public Object K0(Object object0, Object object1, Object object2, Object object3, Object object4) {
        this.a(((Number)object0).intValue(), ((int[])object1), ((LayoutDirection)object2), ((Density)object3), ((int[])object4));
        return S0.a;
    }

    public final void a(int v, @l int[] arr_v, @l LayoutDirection layoutDirection0, @l Density density0, @l int[] arr_v1) {
        L.p(arr_v, "size");
        L.p(layoutDirection0, "<anonymous parameter 2>");
        L.p(density0, "density");
        L.p(arr_v1, "outPosition");
        Arrangement.a.r().c(density0, v, arr_v, arr_v1);
    }
}

