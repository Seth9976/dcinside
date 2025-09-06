package okio.internal;

import A3.p;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.j0;
import okio.l0;
import okio.o;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
@i(name = "-SegmentedByteString")
public final class g {
    public static final int a(@l int[] arr_v, int v, int v1, int v2) {
        L.p(arr_v, "<this>");
        int v3 = v2 - 1;
        while(v1 <= v3) {
            int v4 = v1 + v3 >>> 1;
            int v5 = arr_v[v4];
            if(v5 < v) {
                v1 = v4 + 1;
                continue;
            }
            if(v5 > v) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -v1 - 1;
    }

    public static final void b(@l l0 l00, int v, @l byte[] arr_b, int v1, int v2) {
        L.p(l00, "<this>");
        L.p(arr_b, "target");
        okio.i.e(l00.h0(), v, v2);
        okio.i.e(arr_b.length, v1, v2);
        int v3 = v2 + v;
        for(int v4 = g.n(l00, v); v < v3; ++v4) {
            int v5 = v4 == 0 ? 0 : l00.y0()[v4 - 1];
            int v6 = Math.min(v3, l00.y0()[v4]) - v;
            int v7 = l00.y0()[l00.z0().length + v4] + (v - v5);
            kotlin.collections.l.v0(l00.z0()[v4], arr_b, v1, v7, v7 + v6);
            v1 += v6;
            v += v6;
        }
    }

    public static final boolean c(@l l0 l00, @m Object object0) {
        L.p(l00, "<this>");
        return object0 == l00 || object0 instanceof o && ((o)object0).h0() == l00.h0() && l00.W(0, ((o)object0), 0, l00.h0());
    }

    public static final int d(@l l0 l00) {
        L.p(l00, "<this>");
        return l00.y0()[l00.z0().length - 1];
    }

    public static final int e(@l l0 l00) {
        L.p(l00, "<this>");
        int v = l00.u();
        if(v != 0) {
            return v;
        }
        byte[][] arr2_b = l00.z0();
        int v1 = 0;
        int v3 = 1;
        for(int v2 = 0; v1 < arr2_b.length; v2 = v5) {
            int v4 = l00.y0()[arr2_b.length + v1];
            int v5 = l00.y0()[v1];
            byte[] arr_b = l00.z0()[v1];
            int v6 = v5 - v2 + v4;
            while(v4 < v6) {
                v3 = v3 * 0x1F + arr_b[v4];
                ++v4;
            }
            ++v1;
        }
        l00.b0(v3);
        return v3;
    }

    public static final byte f(@l l0 l00, int v) {
        L.p(l00, "<this>");
        okio.i.e(l00.y0()[l00.z0().length - 1], v, 1L);
        int v1 = g.n(l00, v);
        return v1 == 0 ? l00.z0()[0][v + l00.y0()[l00.z0().length]] : l00.z0()[v1][v - l00.y0()[v1 - 1] + l00.y0()[l00.z0().length + v1]];
    }

    public static final boolean g(@l l0 l00, int v, @l o o0, int v1, int v2) {
        L.p(l00, "<this>");
        L.p(o0, "other");
        if(v >= 0 && v <= l00.h0() - v2) {
            int v3 = v2 + v;
            for(int v4 = g.n(l00, v); v < v3; ++v4) {
                int v5 = v4 == 0 ? 0 : l00.y0()[v4 - 1];
                int v6 = Math.min(v3, l00.y0()[v4]) - v;
                if(!o0.X(v1, l00.z0()[v4], l00.y0()[l00.z0().length + v4] + (v - v5), v6)) {
                    return false;
                }
                v1 += v6;
                v += v6;
            }
            return true;
        }
        return false;
    }

    public static final boolean h(@l l0 l00, int v, @l byte[] arr_b, int v1, int v2) {
        L.p(l00, "<this>");
        L.p(arr_b, "other");
        if(v >= 0 && v <= l00.h0() - v2 && v1 >= 0 && v1 <= arr_b.length - v2) {
            int v3 = v2 + v;
            for(int v4 = g.n(l00, v); v < v3; ++v4) {
                int v5 = v4 == 0 ? 0 : l00.y0()[v4 - 1];
                int v6 = Math.min(v3, l00.y0()[v4]) - v;
                if(!okio.i.d(l00.z0()[v4], l00.y0()[l00.z0().length + v4] + (v - v5), arr_b, v1, v6)) {
                    return false;
                }
                v1 += v6;
                v += v6;
            }
            return true;
        }
        return false;
    }

    @l
    public static final o i(@l l0 l00, int v, int v1) {
        L.p(l00, "<this>");
        int v2 = okio.i.l(l00, v1);
        if(v < 0) {
            throw new IllegalArgumentException(("beginIndex=" + v + " < 0").toString());
        }
        if(v2 > l00.h0()) {
            throw new IllegalArgumentException(("endIndex=" + v2 + " > length(" + l00.h0() + ')').toString());
        }
        int v3 = v2 - v;
        if(v3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + v2 + " < beginIndex=" + v).toString());
        }
        if(v == 0 && v2 == l00.h0()) {
            return l00;
        }
        if(v == v2) {
            return o.f;
        }
        int v4 = g.n(l00, v);
        int v5 = g.n(l00, v2 - 1);
        byte[][] arr2_b = (byte[][])kotlin.collections.l.l1(l00.z0(), v4, v5 + 1);
        int[] arr_v = new int[arr2_b.length * 2];
        int v6 = 0;
        if(v4 <= v5) {
            int v7 = v4;
            for(int v8 = 0; true; ++v8) {
                arr_v[v8] = Math.min(l00.y0()[v7] - v, v3);
                arr_v[v8 + arr2_b.length] = l00.y0()[l00.z0().length + v7];
                if(v7 == v5) {
                    break;
                }
                ++v7;
            }
        }
        if(v4 != 0) {
            v6 = l00.y0()[v4 - 1];
        }
        arr_v[arr2_b.length] += v - v6;
        return new l0(arr2_b, arr_v);
    }

    @l
    public static final byte[] j(@l l0 l00) {
        L.p(l00, "<this>");
        byte[] arr_b = new byte[l00.h0()];
        byte[][] arr2_b = l00.z0();
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v < arr2_b.length; v1 = v4) {
            int v3 = l00.y0()[arr2_b.length + v];
            int v4 = l00.y0()[v];
            int v5 = v4 - v1;
            kotlin.collections.l.v0(l00.z0()[v], arr_b, v2, v3, v3 + v5);
            v2 += v5;
            ++v;
        }
        return arr_b;
    }

    public static final void k(@l l0 l00, @l okio.l l0, int v, int v1) {
        L.p(l00, "<this>");
        L.p(l0, "buffer");
        int v2 = v + v1;
        for(int v3 = g.n(l00, v); v < v2; ++v3) {
            int v4 = v3 == 0 ? 0 : l00.y0()[v3 - 1];
            int v5 = Math.min(v2, l00.y0()[v3]) - v;
            int v6 = l00.y0()[l00.z0().length + v3] + (v - v4);
            j0 j00 = new j0(l00.z0()[v3], v6, v6 + v5, true, false);
            j0 j01 = l0.a;
            if(j01 == null) {
                j00.g = j00;
                j00.f = j00;
                l0.a = j00;
            }
            else {
                L.m(j01);
                j0 j02 = j01.g;
                L.m(j02);
                j02.c(j00);
            }
            v += v5;
        }
        l0.a1(l0.size() + ((long)v1));
    }

    private static final void l(l0 l00, int v, int v1, p p0) {
        for(int v2 = g.n(l00, v); v < v1; ++v2) {
            int v3 = v2 == 0 ? 0 : l00.y0()[v2 - 1];
            int v4 = Math.min(v1, l00.y0()[v2]) - v;
            p0.invoke(l00.z0()[v2], ((int)(l00.y0()[l00.z0().length + v2] + (v - v3))), v4);
            v += v4;
        }
    }

    public static final void m(@l l0 l00, @l p p0) {
        L.p(l00, "<this>");
        L.p(p0, "action");
        byte[][] arr2_b = l00.z0();
        int v = 0;
        for(int v1 = 0; v < arr2_b.length; v1 = v3) {
            int v2 = l00.y0()[arr2_b.length + v];
            int v3 = l00.y0()[v];
            p0.invoke(l00.z0()[v], v2, ((int)(v3 - v1)));
            ++v;
        }
    }

    public static final int n(@l l0 l00, int v) {
        L.p(l00, "<this>");
        int v1 = g.a(l00.y0(), v + 1, 0, l00.z0().length);
        return v1 >= 0 ? v1 : ~v1;
    }
}

