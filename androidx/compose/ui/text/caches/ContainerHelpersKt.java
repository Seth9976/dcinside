package androidx.compose.ui.text.caches;

import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public final class ContainerHelpersKt {
    @l
    @f
    public static final int[] a;
    @l
    @f
    public static final Object[] b;

    static {
        ContainerHelpersKt.a = new int[0];
        ContainerHelpersKt.b = new Object[0];
    }

    public static final int a(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        int v2 = v - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = arr_v[v4];
            if(v5 < v1) {
                v3 = v4 + 1;
                continue;
            }
            if(v5 > v1) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v3;
    }
}

