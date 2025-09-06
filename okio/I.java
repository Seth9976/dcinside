package okio;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import okio.internal.b;
import y4.l;
import z3.i;

@s0({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,187:1\n68#1:188\n74#1:189\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n106#1:188\n107#1:189\n*E\n"})
@i(name = "-SegmentedByteString")
public final class okio.i {
    @l
    private static final a a;
    private static final int b;

    static {
        okio.i.a = new a();
        okio.i.b = 0xB669FD2E;
    }

    public static final int a(byte b, int v) {
        return b & v;
    }

    public static final long b(byte b, long v) {
        return ((long)b) & v;
    }

    public static final long c(int v, long v1) {
        return ((long)v) & v1;
    }

    public static final boolean d(@l byte[] arr_b, int v, @l byte[] arr_b1, int v1, int v2) {
        L.p(arr_b, "a");
        L.p(arr_b1, "b");
        for(int v3 = 0; v3 < v2; ++v3) {
            if(arr_b[v3 + v] != arr_b1[v3 + v1]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long v, long v1, long v2) {
        if((v1 | v2) < 0L || v1 > v || v - v1 < v2) {
            throw new ArrayIndexOutOfBoundsException("size=" + v + " offset=" + v1 + " byteCount=" + v2);
        }
    }

    public static final int f() [...] // 潜在的解密器

    @l
    public static final a g() {
        return okio.i.a;
    }

    public static void h() {
    }

    public static final int i(int v, int v1) {
        return v >>> 0x20 - v1 | v << v1;
    }

    public static final long j(int v, long v1) {
        return Math.min(v, v1);
    }

    public static final long k(long v, int v1) {
        return Math.min(v, v1);
    }

    public static final int l(@l o o0, int v) {
        L.p(o0, "<this>");
        return v == okio.i.b ? o0.h0() : v;
    }

    public static final int m(@l byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        return v == okio.i.b ? arr_b.length : v;
    }

    @l
    public static final a n(@l a l$a0) {
        L.p(l$a0, "unsafeCursor");
        return l$a0 == okio.i.a ? new a() : l$a0;
    }

    public static final int o(int v) [...] // Inlined contents

    public static final long p(long v) {
        return (v & 0xFFL) << 56 | ((0xFF00000000000000L & v) >>> 56 | (0xFF000000000000L & v) >>> 40 | (0xFF0000000000L & v) >>> 24 | (0xFF00000000L & v) >>> 8 | (0xFF000000L & v) << 8 | (0xFF0000L & v) << 24 | (0xFF00L & v) << 40);
    }

    public static final short q(short v) [...] // Inlined contents

    public static final long r(long v, int v1) {
        return v << 0x40 - v1 | v >>> v1;
    }

    public static final int s(byte b, int v) {
        return b << v;
    }

    public static final int t(byte b, int v) {
        return b >> v;
    }

    @l
    public static final String u(byte b) {
        return v.x1(new char[]{b.J()[b >> 4 & 15], b.J()[b & 15]});
    }

    @l
    public static final String v(int v) {
        int v1 = 0;
        if(v == 0) {
            return "0";
        }
        char[] arr_c = {b.J()[v >> 28 & 15], b.J()[v >> 24 & 15], b.J()[v >> 20 & 15], b.J()[v >> 16 & 15], b.J()[v >> 12 & 15], b.J()[v >> 8 & 15], b.J()[v >> 4 & 15], b.J()[v & 15]};
        while(v1 < 8 && arr_c[v1] == 0x30) {
            ++v1;
        }
        return v.y1(arr_c, v1, 8);
    }

    @l
    public static final String w(long v) {
        if(v == 0L) {
            return "0";
        }
        char[] arr_c = {b.J()[((int)(v >> 60 & 15L))], b.J()[((int)(v >> 56 & 15L))], b.J()[((int)(v >> 52 & 15L))], b.J()[((int)(v >> 0x30 & 15L))], b.J()[((int)(v >> 44 & 15L))], b.J()[((int)(v >> 40 & 15L))], b.J()[((int)(v >> 36 & 15L))], b.J()[((int)(v >> 0x20 & 15L))], b.J()[((int)(v >> 28 & 15L))], b.J()[((int)(v >> 24 & 15L))], b.J()[((int)(v >> 20 & 15L))], b.J()[((int)(v >> 16 & 15L))], b.J()[((int)(v >> 12 & 15L))], b.J()[((int)(v >> 8 & 15L))], b.J()[((int)(v >> 4 & 15L))], b.J()[((int)(v & 15L))]};
        int v1;
        for(v1 = 0; v1 < 16 && arr_c[v1] == 0x30; ++v1) {
        }
        return v.y1(arr_c, v1, 16);
    }

    public static final byte x(byte b, byte b1) {
        return (byte)(b ^ b1);
    }
}

