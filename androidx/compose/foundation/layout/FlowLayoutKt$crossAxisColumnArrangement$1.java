package androidx.compose.foundation.layout;

import A3.q;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class FlowLayoutKt.crossAxisColumnArrangement.1 extends N implements q {
    public static final FlowLayoutKt.crossAxisColumnArrangement.1 e;

    static {
        FlowLayoutKt.crossAxisColumnArrangement.1.e = new FlowLayoutKt.crossAxisColumnArrangement.1();
    }

    FlowLayoutKt.crossAxisColumnArrangement.1() {
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
        Arrangement.a.p().b(measureScope0, v, arr_v, measureScope0.getLayoutDirection(), arr_v1);
    }
}

