package androidx.compose.foundation.layout;

import A3.q;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$crossAxisRowArrangement$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,724:1\n1#2:725\n*E\n"})
final class FlowLayoutKt.crossAxisRowArrangement.1 extends N implements q {
    public static final FlowLayoutKt.crossAxisRowArrangement.1 e;

    static {
        FlowLayoutKt.crossAxisRowArrangement.1.e = new FlowLayoutKt.crossAxisRowArrangement.1();
    }

    FlowLayoutKt.crossAxisRowArrangement.1() {
        super(4);
    }

    @Override  // A3.q
    public Object T0(Object object0, Object object1, Object object2, Object object3) {
        this.a(((Number)object0).intValue(), ((int[])object1), ((MeasureScope)object2), ((int[])object3));
        return S0.a;
    }

    public final void a(int v, @l int[] arr_v, @l MeasureScope measureScope0, @l int[] arr_v1) {
        L.p(arr_v, "size");
        L.p(measureScope0, "measureScope");
        L.p(arr_v1, "outPosition");
        Arrangement.a.r().c(measureScope0, v, arr_v, arr_v1);
    }
}

