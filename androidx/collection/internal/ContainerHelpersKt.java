package androidx.collection.internal;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.f;

public final class ContainerHelpersKt {
    @l
    @f
    public static final int[] a;
    @l
    @f
    public static final long[] b;
    @l
    @f
    public static final Object[] c;

    static {
        ContainerHelpersKt.a = new int[0];
        ContainerHelpersKt.b = new long[0];
        ContainerHelpersKt.c = new Object[0];
    }

    public static final int a(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "array");
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

    public static final int b(@l long[] arr_v, int v, long v1) {
        L.p(arr_v, "array");
        int v2 = v - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = Long.compare(arr_v[v4], v1);
            if(v5 < 0) {
                v3 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v3;
    }

    public static final boolean c(@m Object object0, @m Object object1) {
        return L.g(object0, object1);
    }

    public static final int d(int v) {
        for(int v1 = 4; v1 < 0x20; ++v1) {
            int v2 = (1 << v1) - 12;
            if(v <= v2) {
                return v2;
            }
        }
        return v;
    }

    public static final int e(int v) {
        return ContainerHelpersKt.d(v * 4) / 4;
    }

    public static final int f(int v) {
        return ContainerHelpersKt.d(v * 8) / 8;
    }
}

