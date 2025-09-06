package androidx.compose.foundation.layout;

import A3.r;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt$DefaultRowMeasurePolicy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
final class RowKt.DefaultRowMeasurePolicy.1 extends N implements r {
    public static final RowKt.DefaultRowMeasurePolicy.1 e;

    static {
        RowKt.DefaultRowMeasurePolicy.1.e = new RowKt.DefaultRowMeasurePolicy.1();
    }

    RowKt.DefaultRowMeasurePolicy.1() {
        super(5);
    }

    @Override  // A3.r
    public Object K0(Object object0, Object object1, Object object2, Object object3, Object object4) {
        this.a(((Number)object0).intValue(), ((int[])object1), ((LayoutDirection)object2), ((Density)object3), ((int[])object4));
        return S0.a;
    }

    public final void a(int v, @l int[] arr_v, @l LayoutDirection layoutDirection0, @l Density density0, @l int[] arr_v1) {
        L.p(arr_v, "size");
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        L.p(arr_v1, "outPosition");
        Arrangement.a.p().b(density0, v, arr_v, layoutDirection0, arr_v1);
    }
}

