package androidx.collection;

import kotlin.V;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n1661#1:1851\n1661#1:1852\n1661#1:1853\n1715#1:1854\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1680#1:1851\n1682#1:1852\n1685#1:1853\n1721#1:1854\n*E\n"})
public final class ScatterMapKt {
    public static final long a = 0x8080808080808080L;
    public static final long b = 0x80L;
    public static final long c = 0xFEL;
    public static final long d = 0xFFL;
    @l
    @f
    public static final long[] e = null;
    public static final int f = 8;
    public static final int g = 7;
    public static final int h = 6;
    @l
    private static final MutableScatterMap i = null;
    public static final int j = 0xCC9E2D51;
    public static final long k = 0x101010101010101L;
    public static final long l = 0x8080808080808080L;

    static {
        ScatterMapKt.e = new long[]{0x80808080808080FFL, -1L};
        ScatterMapKt.i = new MutableScatterMap(0);
    }

    public static final void A(@l long[] arr_v, int v, long v1) {
        L.p(arr_v, "data");
        int v2 = (v & 7) << 3;
        arr_v[v >> 3] = v1 << v2 | arr_v[v >> 3] & ~(0xFFL << v2);
    }

    @l
    public static final ScatterMap a() {
        L.n(ScatterMapKt.i, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return ScatterMapKt.i;
    }

    public static final int b(long v) {
        return Long.numberOfTrailingZeros(v) >> 3;
    }

    @b0
    public static void c() {
    }

    @b0
    public static void d() {
    }

    @b0
    public static void e() {
    }

    public static final long f(@l long[] arr_v, int v) {
        L.p(arr_v, "metadata");
        int v1 = (v & 7) << 3;
        return -((long)v1) >> 0x3F & arr_v[(v >> 3) + 1] << 0x40 - v1 | arr_v[v >> 3] >>> v1;
    }

    public static final int g(int v) {
        return v >>> 7;
    }

    public static final int h(int v) {
        return v & 0x7F;
    }

    public static final boolean i(long v) {
        return v != 0L;
    }

    public static final int j(@m Object object0) {
        if(object0 != null) {
            int v = object0.hashCode();
            return v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        }
        return 0;
    }

    public static final boolean k(@l long[] arr_v, int v) {
        L.p(arr_v, "metadata");
        return (arr_v[v >> 3] >> ((v & 7) << 3) & 0xFFL) == 0xFEL;
    }

    public static final boolean l(@l long[] arr_v, int v) {
        L.p(arr_v, "metadata");
        return (arr_v[v >> 3] >> ((v & 7) << 3) & 0xFFL) == 0x80L;
    }

    @b0
    public static final boolean m(long v) {
        return v < 0x80L;
    }

    public static final boolean n(@l long[] arr_v, int v) {
        L.p(arr_v, "metadata");
        return (arr_v[v >> 3] >> ((v & 7) << 3) & 0xFFL) < 0x80L;
    }

    public static final int o(int v) {
        return v == 7 ? 6 : v - v / 8;
    }

    @b0
    public static final int p(long v) {
        return Long.numberOfTrailingZeros(v) >> 3;
    }

    public static final long q(long v) {
        return v & ~v << 6 & 0x8080808080808080L;
    }

    @b0
    public static final long r(long v) {
        return v & ~v << 7 & 0x8080808080808080L;
    }

    @b0
    public static final long s(long v, int v1) {
        long v2 = v ^ ((long)v1) * 0x101010101010101L;
        return ~v2 & v2 - 0x101010101010101L & 0x8080808080808080L;
    }

    @l
    public static final MutableScatterMap t() {
        return new MutableScatterMap(0, 1, null);
    }

    @l
    public static final MutableScatterMap u(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        MutableScatterMap mutableScatterMap0 = new MutableScatterMap(arr_v.length);
        mutableScatterMap0.j0(arr_v);
        return mutableScatterMap0;
    }

    public static final long v(long v) {
        return v & v - 1L;
    }

    public static final int w(int v) {
        return v == 0 ? 6 : v * 2 + 1;
    }

    public static final int x(int v) {
        return v <= 0 ? 0 : -1 >>> Integer.numberOfLeadingZeros(v);
    }

    @b0
    public static final long y(@l long[] arr_v, int v) {
        L.p(arr_v, "data");
        return arr_v[v >> 3] >> ((v & 7) << 3) & 0xFFL;
    }

    public static final int z(int v) {
        return v == 7 ? 8 : v + (v - 1) / 7;
    }
}

