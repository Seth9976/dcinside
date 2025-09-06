package kotlin.collections;

import androidx.collection.b;
import kotlin.A0;
import kotlin.E0;
import kotlin.I0;
import kotlin.O0;
import kotlin.jvm.internal.L;
import kotlin.t;
import kotlin.y0;
import y4.l;

public final class s0 {
    @t
    private static final int a(long[] arr_v, int v, int v1) {
        long v2 = I0.l(arr_v, (v + v1) / 2);
        while(v <= v1) {
            while(b.a(I0.l(arr_v, v), v2) < 0) {
                ++v;
            }
            while(b.a(I0.l(arr_v, v1), v2) > 0) {
                --v1;
            }
            if(v <= v1) {
                long v3 = I0.l(arr_v, v);
                I0.u(arr_v, v, I0.l(arr_v, v1));
                I0.u(arr_v, v1, v3);
                ++v;
                --v1;
            }
        }
        return v;
    }

    @t
    private static final int b(byte[] arr_b, int v, int v1) {
        int v2 = A0.l(arr_b, (v + v1) / 2);
        while(v <= v1) {
            while(L.t(A0.l(arr_b, v) & 0xFF, v2 & 0xFF) < 0) {
                ++v;
            }
            while(L.t(A0.l(arr_b, v1) & 0xFF, v2 & 0xFF) > 0) {
                --v1;
            }
            if(v <= v1) {
                int v3 = A0.l(arr_b, v);
                A0.u(arr_b, v, A0.l(arr_b, v1));
                A0.u(arr_b, v1, ((byte)v3));
                ++v;
                --v1;
            }
        }
        return v;
    }

    @t
    private static final int c(short[] arr_v, int v, int v1) {
        int v2 = O0.l(arr_v, (v + v1) / 2);
        while(v <= v1) {
            while(L.t(O0.l(arr_v, v) & 0xFFFF, v2 & 0xFFFF) < 0) {
                ++v;
            }
            while(L.t(O0.l(arr_v, v1) & 0xFFFF, v2 & 0xFFFF) > 0) {
                --v1;
            }
            if(v <= v1) {
                int v3 = O0.l(arr_v, v);
                O0.u(arr_v, v, O0.l(arr_v, v1));
                O0.u(arr_v, v1, ((short)v3));
                ++v;
                --v1;
            }
        }
        return v;
    }

    @t
    private static final int d(int[] arr_v, int v, int v1) {
        int v2 = E0.l(arr_v, (v + v1) / 2);
        while(v <= v1) {
            while(y0.a(E0.l(arr_v, v), v2) < 0) {
                ++v;
            }
            while(y0.a(E0.l(arr_v, v1), v2) > 0) {
                --v1;
            }
            if(v <= v1) {
                int v3 = E0.l(arr_v, v);
                E0.u(arr_v, v, E0.l(arr_v, v1));
                E0.u(arr_v, v1, v3);
                ++v;
                --v1;
            }
        }
        return v;
    }

    @t
    private static final void e(long[] arr_v, int v, int v1) {
        int v2 = s0.a(arr_v, v, v1);
        if(v < v2 - 1) {
            s0.e(arr_v, v, v2 - 1);
        }
        if(v2 < v1) {
            s0.e(arr_v, v2, v1);
        }
    }

    @t
    private static final void f(byte[] arr_b, int v, int v1) {
        int v2 = s0.b(arr_b, v, v1);
        if(v < v2 - 1) {
            s0.f(arr_b, v, v2 - 1);
        }
        if(v2 < v1) {
            s0.f(arr_b, v2, v1);
        }
    }

    @t
    private static final void g(short[] arr_v, int v, int v1) {
        int v2 = s0.c(arr_v, v, v1);
        if(v < v2 - 1) {
            s0.g(arr_v, v, v2 - 1);
        }
        if(v2 < v1) {
            s0.g(arr_v, v2, v1);
        }
    }

    @t
    private static final void h(int[] arr_v, int v, int v1) {
        int v2 = s0.d(arr_v, v, v1);
        if(v < v2 - 1) {
            s0.h(arr_v, v, v2 - 1);
        }
        if(v2 < v1) {
            s0.h(arr_v, v2, v1);
        }
    }

    @t
    public static final void i(@l long[] arr_v, int v, int v1) {
        L.p(arr_v, "array");
        s0.e(arr_v, v, v1 - 1);
    }

    @t
    public static final void j(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "array");
        s0.f(arr_b, v, v1 - 1);
    }

    @t
    public static final void k(@l short[] arr_v, int v, int v1) {
        L.p(arr_v, "array");
        s0.g(arr_v, v, v1 - 1);
    }

    @t
    public static final void l(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "array");
        s0.h(arr_v, v, v1 - 1);
    }
}

