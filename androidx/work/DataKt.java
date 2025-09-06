package androidx.work;

import kotlin.V;
import kotlin.jvm.internal.L;
import y4.l;

public final class DataKt {
    public static final boolean a(Data data0, String s) {
        L.p(data0, "<this>");
        L.p(s, "key");
        L.y(4, "T");
        return data0.u(s, Object.class);
    }

    @l
    public static final Data b(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        Builder data$Builder0 = new Builder();
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            data$Builder0.b(((String)v1.e()), v1.f());
        }
        return data$Builder0.a();
    }
}

