package okio.internal;

import java.io.EOFException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.c0;
import okio.j0;
import okio.k0;
import okio.l0;
import okio.m0;
import okio.o0;
import okio.o;
import y4.l;
import z3.i;

@s0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
@i(name = "-Buffer")
public final class a {
    @l
    private static final byte[] a = null;
    public static final int b = 0x1000;
    public static final long c = -922337203685477580L;
    public static final long d = -7L;

    static {
        a.a = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    public static final void A(@l okio.l l0, @l byte[] arr_b) {
        L.p(l0, "<this>");
        L.p(arr_b, "sink");
        for(int v = 0; v < arr_b.length; v += v1) {
            int v1 = l0.read(arr_b, v, arr_b.length - v);
            if(v1 == -1) {
                throw new EOFException();
            }
        }
    }

    public static final long B(@l okio.l l0) {
        int v5;
        L.p(l0, "<this>");
        if(l0.size() == 0L) {
            throw new EOFException();
        }
        int v = 0;
        long v1 = 0L;
        boolean z = false;
        do {
            j0 j00 = l0.a;
            L.m(j00);
            byte[] arr_b = j00.a;
            int v2 = j00.b;
            int v3 = j00.c;
            while(v2 < v3) {
                int v4 = arr_b[v2];
                if(v4 >= 0x30 && v4 <= 57) {
                    v5 = v4 - 0x30;
                }
                else if(v4 >= 97 && v4 <= 102) {
                    v5 = v4 - 87;
                }
                else if(v4 < 65 || v4 > 70) {
                    goto label_26;
                }
                else {
                    v5 = v4 - 55;
                }
                if((0xF000000000000000L & v1) != 0L) {
                    throw new NumberFormatException("Number too large: ");
                }
                v1 = v1 << 4 | ((long)v5);
                ++v2;
                ++v;
                continue;
            label_26:
                if(v == 0) {
                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + okio.i.u(((byte)v4)));
                }
                z = true;
                break;
            }
            if(v2 == v3) {
                l0.a = j00.b();
                k0.d(j00);
            }
            else {
                j00.b = v2;
            }
        }
        while(!z && l0.a != null);
        l0.a1(l0.size() - ((long)v));
        return v1;
    }

    public static final int C(@l okio.l l0) {
        L.p(l0, "<this>");
        if(l0.size() < 4L) {
            throw new EOFException();
        }
        j0 j00 = l0.a;
        L.m(j00);
        int v = j00.b;
        int v1 = j00.c;
        if(((long)(v1 - v)) < 4L) {
            int v2 = l0.readByte();
            int v3 = l0.readByte();
            int v4 = l0.readByte();
            return l0.readByte() & 0xFF | ((v2 & 0xFF) << 24 | (v3 & 0xFF) << 16 | (v4 & 0xFF) << 8);
        }
        int v5 = j00.a[v + 3] & 0xFF | ((j00.a[v + 1] & 0xFF) << 16 | (j00.a[v] & 0xFF) << 24 | (j00.a[v + 2] & 0xFF) << 8);
        l0.a1(l0.size() - 4L);
        if(v + 4 == v1) {
            l0.a = j00.b();
            k0.d(j00);
            return v5;
        }
        j00.b = v + 4;
        return v5;
    }

    public static final long D(@l okio.l l0) {
        L.p(l0, "<this>");
        if(l0.size() < 8L) {
            throw new EOFException();
        }
        j0 j00 = l0.a;
        L.m(j00);
        int v = j00.b;
        int v1 = j00.c;
        if(((long)(v1 - v)) < 8L) {
            return (((long)l0.readInt()) & 0xFFFFFFFFL) << 0x20 | 0xFFFFFFFFL & ((long)l0.readInt());
        }
        long v2 = (((long)j00.a[v + 3]) & 0xFFL) << 0x20 | ((((long)j00.a[v]) & 0xFFL) << 56 | (((long)j00.a[v + 1]) & 0xFFL) << 0x30 | (((long)j00.a[v + 2]) & 0xFFL) << 40) | (((long)j00.a[v + 4]) & 0xFFL) << 24 | (((long)j00.a[v + 5]) & 0xFFL) << 16 | (((long)j00.a[v + 6]) & 0xFFL) << 8 | ((long)j00.a[v + 7]) & 0xFFL;
        l0.a1(l0.size() - 8L);
        if(v + 8 == v1) {
            l0.a = j00.b();
            k0.d(j00);
            return v2;
        }
        j00.b = v + 8;
        return v2;
    }

    public static final short E(@l okio.l l0) {
        L.p(l0, "<this>");
        if(l0.size() < 2L) {
            throw new EOFException();
        }
        j0 j00 = l0.a;
        L.m(j00);
        int v = j00.b;
        int v1 = j00.c;
        if(v1 - v < 2) {
            int v2 = l0.readByte();
            return (short)(l0.readByte() & 0xFF | (v2 & 0xFF) << 8);
        }
        int v3 = j00.a[v + 1] & 0xFF | (j00.a[v] & 0xFF) << 8;
        l0.a1(l0.size() - 2L);
        if(v + 2 == v1) {
            l0.a = j00.b();
            k0.d(j00);
            return (short)v3;
        }
        j00.b = v + 2;
        return (short)v3;
    }

    @l
    public static final okio.l.a F(@l okio.l l0, @l okio.l.a l$a0) {
        L.p(l0, "<this>");
        L.p(l$a0, "unsafeCursor");
        okio.l.a l$a1 = okio.i.n(l$a0);
        if(l$a1.a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        l$a1.a = l0;
        l$a1.b = false;
        return l$a1;
    }

    @l
    public static final String G(@l okio.l l0, long v) {
        L.p(l0, "<this>");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0 || v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException(("byteCount: " + v).toString());
        }
        if(l0.size() < v) {
            throw new EOFException();
        }
        if(v1 == 0) {
            return "";
        }
        j0 j00 = l0.a;
        L.m(j00);
        int v2 = j00.b;
        if(((long)v2) + v > ((long)j00.c)) {
            return m.c(l0.O2(v), 0, 0, 3, null);
        }
        String s = m.b(j00.a, v2, v2 + ((int)v));
        j00.b += (int)v;
        l0.a1(l0.size() - v);
        if(j00.b == j00.c) {
            l0.a = j00.b();
            k0.d(j00);
        }
        return s;
    }

    public static final int H(@l okio.l l0) {
        int v4;
        int v3;
        int v2;
        L.p(l0, "<this>");
        if(l0.size() == 0L) {
            throw new EOFException();
        }
        int v = l0.Q(0L);
        int v1 = 1;
        if((v & 0x80) == 0) {
            v2 = v & 0x7F;
            v3 = 1;
            v4 = 0;
            goto label_23;
        }
        if((v & 0xE0) == 0xC0) {
            v2 = v & 0x1F;
            v3 = 2;
            v4 = 0x80;
            goto label_23;
        }
        boolean z = false;
        if((v & 0xF0) == 0xE0) {
            z = true;
            v2 = v & 15;
            v3 = 3;
            v4 = 0x800;
        }
        else if((v & 0xF8) == 0xF0) {
            z = true;
            v2 = v & 7;
            v3 = 4;
            v4 = 0x10000;
        }
        if(z) {
        label_23:
            if(l0.size() < ((long)v3)) {
                throw new EOFException("size < " + v3 + ": " + l0.size() + " (to read code point prefixed 0x" + okio.i.u(((byte)v)) + ')');
            }
            while(v1 < v3) {
                int v5 = l0.Q(((long)v1));
                if((v5 & 0xC0) == 0x80) {
                    v2 = v2 << 6 | v5 & 0x3F;
                    ++v1;
                    continue;
                }
                l0.skip(((long)v1));
                return 0xFFFD;
            }
            l0.skip(((long)v3));
            return v2 > 0x10FFFF || 0xD800 <= v2 && v2 < 0xE000 || v2 < v4 ? 0xFFFD : v2;
        }
        l0.skip(1L);
        return 0xFFFD;
    }

    @y4.m
    public static final String I(@l okio.l l0) {
        L.p(l0, "<this>");
        long v = l0.w0(10);
        if(v != -1L) {
            return a.j0(l0, v);
        }
        return l0.size() == 0L ? null : l0.C0(l0.size());
    }

    @l
    public static final String J(@l okio.l l0, long v) {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        L.p(l0, "<this>");
        if(v < 0L) {
            throw new IllegalArgumentException(("limit < 0: " + v).toString());
        }
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            v1 = v + 1L;
        }
        long v2 = l0.m2(10, 0L, v1);
        if(v2 != -1L) {
            return a.j0(l0, v2);
        }
        if(v1 < l0.size() && l0.Q(v1 - 1L) == 13 && l0.Q(v1) == 10) {
            return a.j0(l0, v1);
        }
        okio.l l1 = new okio.l();
        l0.q(l1, 0L, Math.min(0x20L, l0.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(l0.size(), v) + " content=" + l1.B1().z() + '…');
    }

    public static final long K(@l okio.l.a l$a0, long v) {
        L.p(l$a0, "<this>");
        okio.l l0 = l$a0.a;
        if(l0 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if(!l$a0.b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long v1 = l0.size();
        if(Long.compare(v, v1) <= 0) {
            if(v < 0L) {
                throw new IllegalArgumentException(("newSize < 0: " + v).toString());
            }
            long v2 = v1 - v;
            while(v2 > 0L) {
                j0 j00 = l0.a;
                L.m(j00);
                j0 j01 = j00.g;
                L.m(j01);
                int v3 = j01.c;
                long v4 = (long)(v3 - j01.b);
                if(v4 <= v2) {
                    l0.a = j01.b();
                    k0.d(j01);
                    v2 -= v4;
                }
                else {
                    j01.c = v3 - ((int)v2);
                    if(true) {
                        break;
                    }
                }
            }
            l$a0.i(null);
            l$a0.d = v;
            l$a0.e = null;
            l$a0.f = -1;
            l$a0.g = -1;
        }
        else {
            long v5 = v - v1;
            boolean z = true;
            while(v5 > 0L) {
                j0 j02 = l0.j1(1);
                int v6 = (int)Math.min(v5, 0x2000 - j02.c);
                j02.c += v6;
                v5 -= (long)v6;
                if(z) {
                    l$a0.i(j02);
                    l$a0.d = v1;
                    l$a0.e = j02.a;
                    l$a0.f = j02.c - v6;
                    l$a0.g = j02.c;
                    z = false;
                }
            }
        }
        l0.a1(v);
        return v1;
    }

    public static final int L(@l okio.l.a l$a0, long v) {
        j0 j02;
        L.p(l$a0, "<this>");
        okio.l l0 = l$a0.a;
        if(l0 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        int v1 = Long.compare(v, -1L);
        if(v1 < 0 || v > l0.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + v + " > size=" + l0.size());
        }
        if(v1 != 0 && v != l0.size()) {
            long v2 = l0.size();
            j0 j00 = l0.a;
            long v3 = 0L;
            if(l$a0.b() == null) {
                j02 = j00;
            }
            else {
                long v4 = l$a0.d;
                int v5 = l$a0.f;
                j0 j01 = l$a0.b();
                L.m(j01);
                long v6 = v4 - ((long)(v5 - j01.b));
                if(v6 > v) {
                    j02 = j00;
                    j00 = l$a0.b();
                    v2 = v6;
                }
                else {
                    j02 = l$a0.b();
                    v3 = v6;
                }
            }
            if(v2 - v > v - v3) {
                while(true) {
                    L.m(j02);
                    int v7 = j02.c;
                    int v8 = j02.b;
                    if(v < ((long)(v7 - v8)) + v3) {
                        break;
                    }
                    v3 += (long)(v7 - v8);
                    j02 = j02.f;
                }
            }
            else {
                while(v2 > v) {
                    L.m(j00);
                    j00 = j00.g;
                    L.m(j00);
                    v2 -= (long)(j00.c - j00.b);
                }
                v3 = v2;
                j02 = j00;
            }
            if(l$a0.b) {
                L.m(j02);
                if(j02.d) {
                    j0 j03 = j02.f();
                    if(l0.a == j02) {
                        l0.a = j03;
                    }
                    j02 = j02.c(j03);
                    j0 j04 = j02.g;
                    L.m(j04);
                    j04.b();
                }
            }
            l$a0.i(j02);
            l$a0.d = v;
            L.m(j02);
            l$a0.e = j02.a;
            int v9 = j02.b + ((int)(v - v3));
            l$a0.f = v9;
            l$a0.g = j02.c;
            return j02.c - v9;
        }
        l$a0.i(null);
        l$a0.d = v;
        l$a0.e = null;
        l$a0.f = -1;
        l$a0.g = -1;
        return -1;
    }

    public static final int M(@l okio.l l0, @l c0 c00) {
        L.p(l0, "<this>");
        L.p(c00, "options");
        int v = a.m0(l0, c00, false, 2, null);
        if(v == -1) {
            return -1;
        }
        l0.skip(((long)c00.d()[v].h0()));
        return v;
    }

    public static final void N(@l okio.l l0, long v) {
        L.p(l0, "<this>");
        while(v > 0L) {
            j0 j00 = l0.a;
            if(j00 == null) {
                throw new EOFException();
            }
            int v1 = (int)Math.min(v, j00.c - j00.b);
            l0.a1(l0.size() - ((long)v1));
            v -= (long)v1;
            int v2 = j00.b + v1;
            j00.b = v2;
            if(v2 == j00.c) {
                l0.a = j00.b();
                k0.d(j00);
            }
        }
    }

    @l
    public static final o O(@l okio.l l0) {
        L.p(l0, "<this>");
        if(l0.size() > 0x7FFFFFFFL) {
            throw new IllegalStateException(("size > Int.MAX_VALUE: " + l0.size()).toString());
        }
        return l0.i1(((int)l0.size()));
    }

    @l
    public static final o P(@l okio.l l0, int v) {
        L.p(l0, "<this>");
        if(v == 0) {
            return o.f;
        }
        okio.i.e(l0.size(), 0L, v);
        j0 j00 = l0.a;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v2 < v) {
            L.m(j00);
            int v4 = j00.c;
            int v5 = j00.b;
            if(v4 == v5) {
                throw new AssertionError("s.limit == s.pos");
            }
            v2 += v4 - v5;
            ++v3;
            j00 = j00.f;
        }
        byte[][] arr2_b = new byte[v3][];
        int[] arr_v = new int[v3 * 2];
        j0 j01 = l0.a;
        int v6 = 0;
        while(v1 < v) {
            L.m(j01);
            arr2_b[v6] = j01.a;
            v1 += j01.c - j01.b;
            arr_v[v6] = Math.min(v1, v);
            arr_v[v6 + v3] = j01.b;
            j01.d = true;
            ++v6;
            j01 = j01.f;
        }
        return new l0(arr2_b, arr_v);
    }

    @l
    public static final j0 Q(@l okio.l l0, int v) {
        L.p(l0, "<this>");
        if(v < 1 || v > 0x2000) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        j0 j00 = l0.a;
        if(j00 == null) {
            j0 j01 = k0.e();
            l0.a = j01;
            j01.g = j01;
            j01.f = j01;
            return j01;
        }
        L.m(j00);
        j0 j02 = j00.g;
        L.m(j02);
        return j02.c + v <= 0x2000 && j02.e ? j02 : j02.c(k0.e());
    }

    @l
    public static final okio.l R(@l okio.l l0, @l o o0, int v, int v1) {
        L.p(l0, "<this>");
        L.p(o0, "byteString");
        o0.w0(l0, v, v1);
        return l0;
    }

    @l
    public static final okio.l S(@l okio.l l0, @l o0 o00, long v) {
        L.p(l0, "<this>");
        L.p(o00, "source");
        while(v > 0L) {
            long v1 = o00.read(l0, v);
            if(v1 == -1L) {
                throw new EOFException();
            }
            v -= v1;
        }
        return l0;
    }

    @l
    public static final okio.l T(@l okio.l l0, @l byte[] arr_b) {
        L.p(l0, "<this>");
        L.p(arr_b, "source");
        return l0.d2(arr_b, 0, arr_b.length);
    }

    @l
    public static final okio.l U(@l okio.l l0, @l byte[] arr_b, int v, int v1) {
        L.p(l0, "<this>");
        L.p(arr_b, "source");
        okio.i.e(arr_b.length, v, v1);
        int v2 = v1 + v;
        while(v < v2) {
            j0 j00 = l0.j1(1);
            int v3 = Math.min(v2 - v, 0x2000 - j00.c);
            int v4 = v + v3;
            kotlin.collections.l.v0(arr_b, j00.a, j00.c, v, v4);
            j00.c += v3;
            v = v4;
        }
        l0.a1(l0.size() + ((long)v1));
        return l0;
    }

    public static final void V(@l okio.l l0, @l okio.l l1, long v) {
        j0 j03;
        L.p(l0, "<this>");
        L.p(l1, "source");
        if(l1 == l0) {
            throw new IllegalArgumentException("source == this");
        }
        okio.i.e(l1.size(), 0L, v);
        while(v > 0L) {
            j0 j00 = l1.a;
            L.m(j00);
            int v1 = j00.c;
            j0 j01 = l1.a;
            L.m(j01);
            if(v < ((long)(v1 - j01.b))) {
                j0 j02 = l0.a;
                if(j02 == null) {
                    j03 = null;
                }
                else {
                    L.m(j02);
                    j03 = j02.g;
                }
                if(j03 != null && j03.e && ((long)j03.c) + v - ((long)(j03.d ? 0 : j03.b)) <= 0x2000L) {
                    j0 j04 = l1.a;
                    L.m(j04);
                    j04.g(j03, ((int)v));
                    l1.a1(l1.size() - v);
                    l0.a1(l0.size() + v);
                    return;
                }
                j0 j05 = l1.a;
                L.m(j05);
                l1.a = j05.e(((int)v));
            }
            j0 j06 = l1.a;
            L.m(j06);
            long v2 = (long)(j06.c - j06.b);
            l1.a = j06.b();
            j0 j07 = l0.a;
            if(j07 == null) {
                l0.a = j06;
                j06.g = j06;
                j06.f = j06;
            }
            else {
                L.m(j07);
                j0 j08 = j07.g;
                L.m(j08);
                j08.c(j06).a();
            }
            l1.a1(l1.size() - v2);
            l0.a1(l0.size() + v2);
            v -= v2;
        }
    }

    public static okio.l W(okio.l l0, o o0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = o0.h0();
        }
        L.p(l0, "<this>");
        L.p(o0, "byteString");
        o0.w0(l0, v, v1);
        return l0;
    }

    public static final long X(@l okio.l l0, @l o0 o00) {
        L.p(l0, "<this>");
        L.p(o00, "source");
        long v = 0L;
        long v1;
        while((v1 = o00.read(l0, 0x2000L)) != -1L) {
            v += v1;
        }
        return v;
    }

    @l
    public static final okio.l Y(@l okio.l l0, int v) {
        L.p(l0, "<this>");
        j0 j00 = l0.j1(1);
        int v1 = j00.c;
        j00.c = v1 + 1;
        j00.a[v1] = (byte)v;
        l0.a1(l0.size() + 1L);
        return l0;
    }

    @l
    public static final okio.l Z(@l okio.l l0, long v) {
        boolean z;
        int v1 = 1;
        L.p(l0, "<this>");
        int v2 = Long.compare(v, 0L);
        if(v2 == 0) {
            return l0.e2(0x30);
        }
        if(v2 < 0) {
            v = -v;
            if(v < 0L) {
                return l0.b3("-9223372036854775808");
            }
            z = true;
        }
        else {
            z = false;
        }
        if(v >= 100000000L) {
            if(v >= 1000000000000L) {
                if(v >= 1000000000000000L) {
                    if(v >= 100000000000000000L) {
                        v1 = v >= 1000000000000000000L ? 19 : 18;
                    }
                    else if(v < 10000000000000000L) {
                        v1 = 16;
                    }
                    else {
                        v1 = 17;
                    }
                }
                else if(v < 10000000000000L) {
                    v1 = 13;
                }
                else if(v < 100000000000000L) {
                    v1 = 14;
                }
                else {
                    v1 = 15;
                }
            }
            else if(v >= 10000000000L) {
                v1 = v < 100000000000L ? 11 : 12;
            }
            else if(v < 1000000000L) {
                v1 = 9;
            }
            else {
                v1 = 10;
            }
        }
        else if(v >= 10000L) {
            if(v >= 1000000L) {
                v1 = v < 10000000L ? 7 : 8;
            }
            else if(v < 100000L) {
                v1 = 5;
            }
            else {
                v1 = 6;
            }
        }
        else if(v >= 100L) {
            v1 = v < 1000L ? 3 : 4;
        }
        else if(v >= 10L) {
            v1 = 2;
        }
        if(z) {
            ++v1;
        }
        j0 j00 = l0.j1(v1);
        byte[] arr_b = j00.a;
        int v3 = j00.c + v1;
        while(v != 0L) {
            --v3;
            arr_b[v3] = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102}[((int)(v % 10L))];
            v /= 10L;
        }
        if(z) {
            arr_b[v3 - 1] = 45;
        }
        j00.c += v1;
        l0.a1(l0.size() + ((long)v1));
        return l0;
    }

    public static final void a(@l okio.l l0) {
        L.p(l0, "<this>");
        l0.skip(l0.size());
    }

    @l
    public static final okio.l a0(@l okio.l l0, long v) {
        L.p(l0, "<this>");
        if(v == 0L) {
            return l0.e2(0x30);
        }
        long v1 = v >>> 1 | v;
        long v2 = v1 | v1 >>> 2;
        long v3 = v2 | v2 >>> 4;
        long v4 = v3 | v3 >>> 8;
        long v5 = v4 | v4 >>> 16;
        long v6 = v5 | v5 >>> 0x20;
        long v7 = v6 - (v6 >>> 1 & 0x5555555555555555L);
        long v8 = (v7 >>> 2 & 0x3333333333333333L) + (v7 & 0x3333333333333333L);
        long v9 = (v8 >>> 4) + v8 & 0xF0F0F0F0F0F0F0FL;
        long v10 = v9 + (v9 >>> 8);
        long v11 = v10 + (v10 >>> 16);
        int v12 = (int)(((v11 & 0x3FL) + (v11 >>> 0x20 & 0x3FL) + 3L) / 4L);
        j0 j00 = l0.j1(v12);
        byte[] arr_b = j00.a;
        int v13 = j00.c;
        for(int v14 = v13 + v12 - 1; v14 >= v13; --v14) {
            arr_b[v14] = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102}[((int)(15L & v))];
            v >>>= 4;
        }
        j00.c += v12;
        l0.a1(l0.size() + ((long)v12));
        return l0;
    }

    public static final void b(@l okio.l.a l$a0) {
        L.p(l$a0, "<this>");
        if(l$a0.a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        l$a0.a = null;
        l$a0.i(null);
        l$a0.d = -1L;
        l$a0.e = null;
        l$a0.f = -1;
        l$a0.g = -1;
    }

    @l
    public static final okio.l b0(@l okio.l l0, int v) {
        L.p(l0, "<this>");
        j0 j00 = l0.j1(4);
        int v1 = j00.c;
        j00.a[v1] = (byte)(v >>> 24 & 0xFF);
        j00.a[v1 + 1] = (byte)(v >>> 16 & 0xFF);
        j00.a[v1 + 2] = (byte)(v >>> 8 & 0xFF);
        j00.a[v1 + 3] = (byte)(v & 0xFF);
        j00.c = v1 + 4;
        l0.a1(l0.size() + 4L);
        return l0;
    }

    public static final long c(@l okio.l l0) {
        L.p(l0, "<this>");
        long v = l0.size();
        if(v == 0L) {
            return 0L;
        }
        j0 j00 = l0.a;
        L.m(j00);
        j0 j01 = j00.g;
        L.m(j01);
        return j01.c >= 0x2000 || !j01.e ? v : v - ((long)(j01.c - j01.b));
    }

    @l
    public static final okio.l c0(@l okio.l l0, long v) {
        L.p(l0, "<this>");
        j0 j00 = l0.j1(8);
        int v1 = j00.c;
        j00.a[v1] = (byte)(((int)(v >>> 56 & 0xFFL)));
        j00.a[v1 + 1] = (byte)(((int)(v >>> 0x30 & 0xFFL)));
        j00.a[v1 + 2] = (byte)(((int)(v >>> 40 & 0xFFL)));
        j00.a[v1 + 3] = (byte)(((int)(v >>> 0x20 & 0xFFL)));
        j00.a[v1 + 4] = (byte)(((int)(v >>> 24 & 0xFFL)));
        j00.a[v1 + 5] = (byte)(((int)(v >>> 16 & 0xFFL)));
        j00.a[v1 + 6] = (byte)(((int)(v >>> 8 & 0xFFL)));
        j00.a[v1 + 7] = (byte)(((int)(v & 0xFFL)));
        j00.c = v1 + 8;
        l0.a1(l0.size() + 8L);
        return l0;
    }

    @l
    public static final okio.l d(@l okio.l l0) {
        L.p(l0, "<this>");
        okio.l l1 = new okio.l();
        if(l0.size() == 0L) {
            return l1;
        }
        j0 j00 = l0.a;
        L.m(j00);
        j0 j01 = j00.d();
        l1.a = j01;
        j01.g = j01;
        j01.f = j01;
        for(j0 j02 = j00.f; j02 != j00; j02 = j02.f) {
            j0 j03 = j01.g;
            L.m(j03);
            L.m(j02);
            j03.c(j02.d());
        }
        l1.a1(l0.size());
        return l1;
    }

    @l
    public static final okio.l d0(@l okio.l l0, int v) {
        L.p(l0, "<this>");
        j0 j00 = l0.j1(2);
        int v1 = j00.c;
        j00.a[v1] = (byte)(v >>> 8 & 0xFF);
        j00.a[v1 + 1] = (byte)(v & 0xFF);
        j00.c = v1 + 2;
        l0.a1(l0.size() + 2L);
        return l0;
    }

    @l
    public static final okio.l e(@l okio.l l0, @l okio.l l1, long v, long v1) {
        L.p(l0, "<this>");
        L.p(l1, "out");
        okio.i.e(l0.size(), v, v1);
        if(v1 == 0L) {
            return l0;
        }
        l1.a1(l1.size() + v1);
        j0 j00;
        for(j00 = l0.a; true; j00 = j00.f) {
            L.m(j00);
            int v2 = j00.c;
            int v3 = j00.b;
            if(v < ((long)(v2 - v3))) {
                break;
            }
            v -= (long)(v2 - v3);
        }
        while(v1 > 0L) {
            L.m(j00);
            j0 j01 = j00.d();
            int v4 = j01.b + ((int)v);
            j01.b = v4;
            j01.c = Math.min(v4 + ((int)v1), j01.c);
            j0 j02 = l1.a;
            if(j02 == null) {
                j01.g = j01;
                j01.f = j01;
                l1.a = j01;
            }
            else {
                L.m(j02);
                j0 j03 = j02.g;
                L.m(j03);
                j03.c(j01);
            }
            v1 -= (long)(j01.c - j01.b);
            j00 = j00.f;
            v = 0L;
        }
        return l0;
    }

    @l
    public static final okio.l e0(@l okio.l l0, @l String s, int v, int v1) {
        L.p(l0, "<this>");
        L.p(s, "string");
        if(v < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + v).toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + v1 + " < " + v).toString());
        }
        if(v1 > s.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + v1 + " > " + s.length()).toString());
        }
        while(v < v1) {
            int v2 = s.charAt(v);
            if(v2 < 0x80) {
                j0 j00 = l0.j1(1);
                byte[] arr_b = j00.a;
                int v3 = j00.c - v;
                int v4 = Math.min(v1, 0x2000 - v3);
                int v5 = v + 1;
                arr_b[v + v3] = (byte)v2;
                while(true) {
                    v = v5;
                    if(v >= v4) {
                        break;
                    }
                    int v6 = s.charAt(v);
                    if(v6 >= 0x80) {
                        break;
                    }
                    v5 = v + 1;
                    arr_b[v + v3] = (byte)v6;
                }
                int v7 = v3 + v - j00.c;
                j00.c += v7;
                l0.a1(l0.size() + ((long)v7));
            }
            else {
                if(v2 < 0x800) {
                    j0 j01 = l0.j1(2);
                    int v8 = j01.c;
                    j01.a[v8] = (byte)(v2 >> 6 | 0xC0);
                    j01.a[v8 + 1] = (byte)(v2 & 0x3F | 0x80);
                    j01.c = v8 + 2;
                    l0.a1(l0.size() + 2L);
                }
                else if(v2 < 0xD800 || v2 > 0xDFFF) {
                    j0 j03 = l0.j1(3);
                    int v12 = j03.c;
                    j03.a[v12] = (byte)(v2 >> 12 | 0xE0);
                    j03.a[v12 + 1] = (byte)(0x3F & v2 >> 6 | 0x80);
                    j03.a[v12 + 2] = (byte)(v2 & 0x3F | 0x80);
                    j03.c = v12 + 3;
                    l0.a1(l0.size() + 3L);
                }
                else {
                    int v9 = v + 1 >= v1 ? 0 : s.charAt(v + 1);
                    if(v2 > 0xDBFF || 0xDC00 > v9 || v9 >= 0xE000) {
                        l0.e2(0x3F);
                        ++v;
                    }
                    else {
                        int v10 = ((v2 & 0x3FF) << 10 | v9 & 0x3FF) + 0x10000;
                        j0 j02 = l0.j1(4);
                        int v11 = j02.c;
                        j02.a[v11] = (byte)(v10 >> 18 | 0xF0);
                        j02.a[v11 + 1] = (byte)(v10 >> 12 & 0x3F | 0x80);
                        j02.a[v11 + 2] = (byte)(v10 >> 6 & 0x3F | 0x80);
                        j02.a[v11 + 3] = (byte)(v10 & 0x3F | 0x80);
                        j02.c = v11 + 4;
                        l0.a1(l0.size() + 4L);
                        v += 2;
                    }
                    continue;
                }
                ++v;
            }
        }
        return l0;
    }

    public static final boolean f(@l okio.l l0, @y4.m Object object0) {
        L.p(l0, "<this>");
        if(l0 == object0) {
            return true;
        }
        if(!(object0 instanceof okio.l)) {
            return false;
        }
        if(l0.size() != ((okio.l)object0).size()) {
            return false;
        }
        if(l0.size() == 0L) {
            return true;
        }
        j0 j00 = l0.a;
        L.m(j00);
        j0 j01 = ((okio.l)object0).a;
        L.m(j01);
        int v = j00.b;
        int v1 = j01.b;
        for(long v2 = 0L; v2 < l0.size(); v2 += v3) {
            long v3 = (long)Math.min(j00.c - v, j01.c - v1);
            long v4 = 0L;
            while(v4 < v3) {
                if(j00.a[v] != j01.a[v1]) {
                    return false;
                }
                ++v4;
                ++v;
                ++v1;
            }
            if(v == j00.c) {
                j00 = j00.f;
                L.m(j00);
                v = j00.b;
            }
            if(v1 == j01.c) {
                j01 = j01.f;
                L.m(j01);
                v1 = j01.b;
            }
        }
        return true;
    }

    @l
    public static final okio.l f0(@l okio.l l0, int v) {
        L.p(l0, "<this>");
        if(v < 0x80) {
            l0.e2(v);
            return l0;
        }
        if(v < 0x800) {
            j0 j00 = l0.j1(2);
            int v1 = j00.c;
            j00.a[v1] = (byte)(v >> 6 | 0xC0);
            j00.a[v1 + 1] = (byte)(v & 0x3F | 0x80);
            j00.c = v1 + 2;
            l0.a1(l0.size() + 2L);
            return l0;
        }
        if(0xD800 <= v && v < 0xE000) {
            l0.e2(0x3F);
            return l0;
        }
        if(v < 0x10000) {
            j0 j01 = l0.j1(3);
            int v2 = j01.c;
            j01.a[v2] = (byte)(v >> 12 | 0xE0);
            j01.a[v2 + 1] = (byte)(v >> 6 & 0x3F | 0x80);
            j01.a[v2 + 2] = (byte)(v & 0x3F | 0x80);
            j01.c = v2 + 3;
            l0.a1(l0.size() + 3L);
            return l0;
        }
        if(v > 0x10FFFF) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + okio.i.v(v));
        }
        j0 j02 = l0.j1(4);
        int v3 = j02.c;
        j02.a[v3] = (byte)(v >> 18 | 0xF0);
        j02.a[v3 + 1] = (byte)(v >> 12 & 0x3F | 0x80);
        j02.a[v3 + 2] = (byte)(v >> 6 & 0x3F | 0x80);
        j02.a[v3 + 3] = (byte)(v & 0x3F | 0x80);
        j02.c = v3 + 4;
        l0.a1(l0.size() + 4L);
        return l0;
    }

    public static final long g(@l okio.l.a l$a0, int v) {
        L.p(l$a0, "<this>");
        if(v <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + v).toString());
        }
        if(v > 0x2000) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + v).toString());
        }
        okio.l l0 = l$a0.a;
        if(l0 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if(!l$a0.b) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long v1 = l0.size();
        j0 j00 = l0.j1(v);
        int v2 = 0x2000 - j00.c;
        j00.c = 0x2000;
        l0.a1(v1 + ((long)v2));
        l$a0.i(j00);
        l$a0.d = v1;
        l$a0.e = j00.a;
        l$a0.f = 0x2000 - v2;
        l$a0.g = 0x2000;
        return (long)v2;
    }

    @l
    public static final byte[] g0() [...] // 潜在的解密器

    public static final byte h(@l okio.l l0, long v) {
        L.p(l0, "<this>");
        okio.i.e(l0.size(), v, 1L);
        j0 j00 = l0.a;
        if(j00 != null) {
            if(l0.size() - v < v) {
                long v1;
                for(v1 = l0.size(); v1 > v; v1 -= (long)(j00.c - j00.b)) {
                    j00 = j00.g;
                    L.m(j00);
                }
                L.m(j00);
                return j00.a[((int)(((long)j00.b) + v - v1))];
            }
            long v2 = 0L;
            long v3;
            while((v3 = ((long)(j00.c - j00.b)) + v2) <= v) {
                j00 = j00.f;
                L.m(j00);
                v2 = v3;
            }
            L.m(j00);
            return j00.a[((int)(((long)j00.b) + v - v2))];
        }
        L.m(null);
        throw null;
    }

    public static void h0() {
    }

    public static final int i(@l okio.l l0) {
        L.p(l0, "<this>");
        j0 j00 = l0.a;
        if(j00 == null) {
            return 0;
        }
        int v = 1;
        do {
            int v1 = j00.b;
            int v2 = j00.c;
            while(v1 < v2) {
                v = v * 0x1F + j00.a[v1];
                ++v1;
            }
            j00 = j00.f;
            L.m(j00);
        }
        while(j00 != l0.a);
        return v;
    }

    public static final boolean i0(@l j0 j00, int v, @l byte[] arr_b, int v1, int v2) {
        L.p(j00, "segment");
        L.p(arr_b, "bytes");
        int v3 = j00.c;
        byte[] arr_b1 = j00.a;
        while(v1 < v2) {
            if(v == v3) {
                j00 = j00.f;
                L.m(j00);
                arr_b1 = j00.a;
                v = j00.b;
                v3 = j00.c;
            }
            if(arr_b1[v] != arr_b[v1]) {
                return false;
            }
            ++v;
            ++v1;
        }
        return true;
    }

    public static final long j(@l okio.l l0, byte b, long v, long v1) {
        int v4;
        L.p(l0, "<this>");
        long v2 = 0L;
        if(0L > v || v > v1) {
            throw new IllegalArgumentException(("size=" + l0.size() + " fromIndex=" + v + " toIndex=" + v1).toString());
        }
        if(v1 > l0.size()) {
            v1 = l0.size();
        }
        if(v == v1) {
            return -1L;
        }
        j0 j00 = l0.a;
        if(j00 == null) {
            return -1L;
        }
        if(l0.size() - v < v) {
            for(v2 = l0.size(); v2 > v; v2 -= (long)(j00.c - j00.b)) {
                j00 = j00.g;
                L.m(j00);
            }
            while(v2 < v1) {
                byte[] arr_b = j00.a;
                int v3 = (int)Math.min(j00.c, ((long)j00.b) + v1 - v2);
                for(v4 = (int)(((long)j00.b) + v - v2); v4 < v3; ++v4) {
                    if(arr_b[v4] == b) {
                        return ((long)(v4 - j00.b)) + v2;
                    }
                }
                v2 += (long)(j00.c - j00.b);
                j00 = j00.f;
                L.m(j00);
                v = v2;
            }
            return -1L;
        }
        long v5;
        while((v5 = ((long)(j00.c - j00.b)) + v2) <= v) {
            j00 = j00.f;
            L.m(j00);
            v2 = v5;
        }
        while(v2 < v1) {
            byte[] arr_b1 = j00.a;
            int v6 = (int)Math.min(j00.c, ((long)j00.b) + v1 - v2);
            v4 = (int)(((long)j00.b) + v - v2);
            while(v4 < v6) {
                if(arr_b1[v4] != b) {
                    ++v4;
                    continue;
                }
                return ((long)(v4 - j00.b)) + v2;
            }
            v2 += (long)(j00.c - j00.b);
            j00 = j00.f;
            L.m(j00);
            v = v2;
        }
        return -1L;
    }

    @l
    public static final String j0(@l okio.l l0, long v) {
        String s;
        L.p(l0, "<this>");
        if(v > 0L && l0.Q(v - 1L) == 13) {
            s = l0.C0(v - 1L);
            l0.skip(2L);
            return s;
        }
        s = l0.C0(v);
        l0.skip(1L);
        return s;
    }

    public static final long k(@l okio.l l0, @l o o0, long v) {
        long v1 = 0L;
        L.p(l0, "<this>");
        L.p(o0, "bytes");
        if(o0.h0() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        if(v < 0L) {
            throw new IllegalArgumentException(("fromIndex < 0: " + v).toString());
        }
        j0 j00 = l0.a;
        if(j00 == null) {
            return -1L;
        }
        if(l0.size() - v < v) {
            for(v1 = l0.size(); v1 > v; v1 -= (long)(j00.c - j00.b)) {
                j00 = j00.g;
                L.m(j00);
            }
            byte[] arr_b = o0.K();
            int v2 = arr_b[0];
            int v3 = o0.h0();
            long v4 = l0.size() - ((long)v3) + 1L;
            while(v1 < v4) {
                byte[] arr_b1 = j00.a;
                int v5 = (int)Math.min(j00.c, ((long)j00.b) + v4 - v1);
                for(int v6 = (int)(((long)j00.b) + v - v1); v6 < v5; ++v6) {
                    if(arr_b1[v6] == v2 && a.i0(j00, v6 + 1, arr_b, 1, v3)) {
                        return ((long)(v6 - j00.b)) + v1;
                    }
                }
                v1 += (long)(j00.c - j00.b);
                j00 = j00.f;
                L.m(j00);
                v = v1;
            }
            return -1L;
        }
        long v7;
        while((v7 = ((long)(j00.c - j00.b)) + v1) <= v) {
            j00 = j00.f;
            L.m(j00);
            v1 = v7;
        }
        byte[] arr_b2 = o0.K();
        int v8 = arr_b2[0];
        int v9 = o0.h0();
        long v10 = l0.size() - ((long)v9) + 1L;
        while(v1 < v10) {
            byte[] arr_b3 = j00.a;
            int v11 = (int)Math.min(j00.c, ((long)j00.b) + v10 - v1);
            for(int v12 = (int)(((long)j00.b) + v - v1); v12 < v11; ++v12) {
                if(arr_b3[v12] == v8 && a.i0(j00, v12 + 1, arr_b2, 1, v9)) {
                    return ((long)(v12 - j00.b)) + v1;
                }
            }
            v1 += (long)(j00.c - j00.b);
            j00 = j00.f;
            L.m(j00);
            v = v1;
        }
        return -1L;
    }

    public static final Object k0(@l okio.l l0, long v, @l A3.o o0) {
        L.p(l0, "<this>");
        L.p(o0, "lambda");
        j0 j00 = l0.a;
        if(j00 == null) {
            return o0.invoke(null, -1L);
        }
        if(l0.size() - v < v) {
            long v1;
            for(v1 = l0.size(); v1 > v; v1 -= (long)(j00.c - j00.b)) {
                j00 = j00.g;
                L.m(j00);
            }
            return o0.invoke(j00, v1);
        }
        long v2 = 0L;
        long v3;
        while((v3 = ((long)(j00.c - j00.b)) + v2) <= v) {
            j00 = j00.f;
            L.m(j00);
            v2 = v3;
        }
        return o0.invoke(j00, v2);
    }

    public static final long l(@l okio.l l0, @l o o0, long v) {
        int v4;
        L.p(l0, "<this>");
        L.p(o0, "targetBytes");
        long v1 = 0L;
        if(v < 0L) {
            throw new IllegalArgumentException(("fromIndex < 0: " + v).toString());
        }
        j0 j00 = l0.a;
        if(j00 == null) {
            return -1L;
        }
        if(l0.size() - v < v) {
            for(v1 = l0.size(); v1 > v; v1 -= (long)(j00.c - j00.b)) {
                j00 = j00.g;
                L.m(j00);
            }
            if(o0.h0() == 2) {
                int v2 = o0.r(0);
                int v3 = o0.r(1);
                while(v1 < l0.size()) {
                    byte[] arr_b = j00.a;
                    v4 = (int)(((long)j00.b) + v - v1);
                    int v5 = j00.c;
                    while(v4 < v5) {
                        int v6 = arr_b[v4];
                        if(v6 == v2 || v6 == v3) {
                            return ((long)(v4 - j00.b)) + v1;
                        }
                        ++v4;
                    }
                    v1 += (long)(j00.c - j00.b);
                    j00 = j00.f;
                    L.m(j00);
                    v = v1;
                }
                return -1L;
            }
            byte[] arr_b1 = o0.K();
            while(v1 < l0.size()) {
                byte[] arr_b2 = j00.a;
                v4 = (int)(((long)j00.b) + v - v1);
                int v7 = j00.c;
                while(v4 < v7) {
                    int v8 = arr_b2[v4];
                    for(int v9 = 0; v9 < arr_b1.length; ++v9) {
                        if(v8 == arr_b1[v9]) {
                            return ((long)(v4 - j00.b)) + v1;
                        }
                    }
                    ++v4;
                }
                v1 += (long)(j00.c - j00.b);
                j00 = j00.f;
                L.m(j00);
                v = v1;
            }
            return -1L;
        }
        long v10;
        while((v10 = ((long)(j00.c - j00.b)) + v1) <= v) {
            j00 = j00.f;
            L.m(j00);
            v1 = v10;
        }
        if(o0.h0() == 2) {
            int v11 = o0.r(0);
            int v12 = o0.r(1);
            while(v1 < l0.size()) {
                byte[] arr_b3 = j00.a;
                v4 = (int)(((long)j00.b) + v - v1);
                int v13 = j00.c;
                while(v4 < v13) {
                    int v14 = arr_b3[v4];
                    if(v14 != v11 && v14 != v12) {
                        ++v4;
                        continue;
                    }
                    return ((long)(v4 - j00.b)) + v1;
                }
                v1 += (long)(j00.c - j00.b);
                j00 = j00.f;
                L.m(j00);
                v = v1;
            }
            return -1L;
        }
        byte[] arr_b4 = o0.K();
        while(v1 < l0.size()) {
            byte[] arr_b5 = j00.a;
            v4 = (int)(((long)j00.b) + v - v1);
            int v15 = j00.c;
            while(v4 < v15) {
                int v16 = arr_b5[v4];
                int v17 = 0;
                while(v17 < arr_b4.length) {
                    if(v16 != arr_b4[v17]) {
                        ++v17;
                        continue;
                    }
                    return ((long)(v4 - j00.b)) + v1;
                }
                ++v4;
            }
            v1 += (long)(j00.c - j00.b);
            j00 = j00.f;
            L.m(j00);
            v = v1;
        }
        return -1L;
    }

    public static final int l0(@l okio.l l0, @l c0 c00, boolean z) {
        int v11;
        int v10;
        j0 j03;
        int v9;
        int v8;
        L.p(l0, "<this>");
        L.p(c00, "options");
        j0 j00 = l0.a;
        if(j00 == null) {
            return z ? -2 : -1;
        }
        byte[] arr_b = j00.a;
        int v = j00.b;
        int v1 = j00.c;
        int[] arr_v = c00.g();
        j0 j01 = j00;
        int v2 = 0;
        int v3 = -1;
    alab1:
        while(true) {
            int v4 = arr_v[v2];
            int v5 = v2 + 2;
            int v6 = arr_v[v2 + 1];
            if(v6 != -1) {
                v3 = v6;
            }
            if(j01 == null) {
                break;
            }
            if(v4 < 0) {
                int v7 = v5 - v4;
                while(true) {
                    if((arr_b[v] & 0xFF) != arr_v[v5]) {
                        return v3;
                    }
                    boolean z1 = v5 + 1 == v7;
                    if(v + 1 == v1) {
                        L.m(j01);
                        j0 j02 = j01.f;
                        L.m(j02);
                        v8 = j02.b;
                        byte[] arr_b1 = j02.a;
                        v9 = j02.c;
                        if(j02 == j00) {
                            if(!z1) {
                                break alab1;
                            }
                            arr_b = arr_b1;
                            j03 = null;
                        }
                        else {
                            j03 = j02;
                            arr_b = arr_b1;
                        }
                    }
                    else {
                        j03 = j01;
                        v9 = v1;
                        v8 = v + 1;
                    }
                    if(z1) {
                        v10 = arr_v[v5 + 1];
                        v11 = v8;
                        v1 = v9;
                        j01 = j03;
                        break;
                    }
                    v = v8;
                    v1 = v9;
                    j01 = j03;
                    ++v5;
                }
            }
            else {
                v11 = v + 1;
                int v12 = arr_b[v] & 0xFF;
                int v13 = v5 + v4;
                while(true) {
                    if(v5 == v13) {
                        return v3;
                    }
                    if(v12 == arr_v[v5]) {
                        break;
                    }
                    ++v5;
                }
                v10 = arr_v[v5 + v4];
                if(v11 == v1) {
                    j01 = j01.f;
                    L.m(j01);
                    v11 = j01.b;
                    arr_b = j01.a;
                    v1 = j01.c;
                    if(j01 == j00) {
                        j01 = null;
                    }
                }
            }
            if(v10 >= 0) {
                return v10;
            }
            v2 = -v10;
            v = v11;
        }
        return z ? -2 : v3;
    }

    public static final int m(@l okio.l.a l$a0) {
        L.p(l$a0, "<this>");
        long v = l$a0.d;
        okio.l l0 = l$a0.a;
        L.m(l0);
        if(v == l0.size()) {
            throw new IllegalStateException("no more bytes");
        }
        return l$a0.d == -1L ? l$a0.f(0L) : l$a0.f(l$a0.d + ((long)(l$a0.g - l$a0.f)));
    }

    public static int m0(okio.l l0, c0 c00, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return a.l0(l0, c00, z);
    }

    public static final boolean n(@l okio.l l0, long v, @l o o0, int v1, int v2) {
        L.p(l0, "<this>");
        L.p(o0, "bytes");
        if(v >= 0L && v1 >= 0 && v2 >= 0 && l0.size() - v >= ((long)v2) && o0.h0() - v1 >= v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                if(l0.Q(((long)v3) + v) != o0.r(v1 + v3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final int o(@l okio.l l0, @l byte[] arr_b) {
        L.p(l0, "<this>");
        L.p(arr_b, "sink");
        return l0.read(arr_b, 0, arr_b.length);
    }

    public static final int p(@l okio.l l0, @l byte[] arr_b, int v, int v1) {
        L.p(l0, "<this>");
        L.p(arr_b, "sink");
        okio.i.e(arr_b.length, v, v1);
        j0 j00 = l0.a;
        if(j00 == null) {
            return -1;
        }
        int v2 = Math.min(v1, j00.c - j00.b);
        kotlin.collections.l.v0(j00.a, arr_b, v, j00.b, j00.b + v2);
        j00.b += v2;
        l0.a1(l0.size() - ((long)v2));
        if(j00.b == j00.c) {
            l0.a = j00.b();
            k0.d(j00);
        }
        return v2;
    }

    public static final long q(@l okio.l l0, @l okio.l l1, long v) {
        L.p(l0, "<this>");
        L.p(l1, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        if(l0.size() == 0L) {
            return -1L;
        }
        if(v > l0.size()) {
            v = l0.size();
        }
        l1.write(l0, v);
        return v;
    }

    public static final long r(@l okio.l l0, @l m0 m00) {
        L.p(l0, "<this>");
        L.p(m00, "sink");
        long v = l0.size();
        if(v > 0L) {
            m00.write(l0, v);
        }
        return v;
    }

    @l
    public static final okio.l.a s(@l okio.l l0, @l okio.l.a l$a0) {
        L.p(l0, "<this>");
        L.p(l$a0, "unsafeCursor");
        okio.l.a l$a1 = okio.i.n(l$a0);
        if(l$a1.a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        l$a1.a = l0;
        l$a1.b = true;
        return l$a1;
    }

    public static final byte t(@l okio.l l0) {
        L.p(l0, "<this>");
        if(l0.size() == 0L) {
            throw new EOFException();
        }
        j0 j00 = l0.a;
        L.m(j00);
        int v = j00.c;
        int v1 = j00.b + 1;
        byte b = j00.a[j00.b];
        l0.a1(l0.size() - 1L);
        if(v1 == v) {
            l0.a = j00.b();
            k0.d(j00);
            return b;
        }
        j00.b = v1;
        return b;
    }

    @l
    public static final byte[] u(@l okio.l l0) {
        L.p(l0, "<this>");
        return l0.O2(l0.size());
    }

    @l
    public static final byte[] v(@l okio.l l0, long v) {
        L.p(l0, "<this>");
        if(v < 0L || v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException(("byteCount: " + v).toString());
        }
        if(l0.size() < v) {
            throw new EOFException();
        }
        byte[] arr_b = new byte[((int)v)];
        l0.readFully(arr_b);
        return arr_b;
    }

    @l
    public static final o w(@l okio.l l0) {
        L.p(l0, "<this>");
        return l0.F0(l0.size());
    }

    @l
    public static final o x(@l okio.l l0, long v) {
        L.p(l0, "<this>");
        if(v < 0L || v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException(("byteCount: " + v).toString());
        }
        if(l0.size() < v) {
            throw new EOFException();
        }
        if(v >= 0x1000L) {
            o o0 = l0.i1(((int)v));
            l0.skip(v);
            return o0;
        }
        return new o(l0.O2(v));
    }

    public static final long y(@l okio.l l0) {
        L.p(l0, "<this>");
        if(l0.size() == 0L) {
            throw new EOFException();
        }
        int v = 0;
        long v1 = 0L;
        long v2 = -7L;
        boolean z = false;
        boolean z1 = false;
        do {
            j0 j00 = l0.a;
            L.m(j00);
            byte[] arr_b = j00.a;
            int v3 = j00.b;
            int v4 = j00.c;
            while(v3 < v4) {
                int v5 = arr_b[v3];
                if(v5 >= 0x30 && v5 <= 57) {
                    int v6 = Long.compare(v1, -922337203685477580L);
                    if(v6 >= 0 && (v6 != 0 || ((long)(0x30 - v5)) >= v2)) {
                        v1 = v1 * 10L + ((long)(0x30 - v5));
                        goto label_26;
                    }
                    okio.l l1 = new okio.l().g2(v1).e2(v5);
                    if(!z) {
                        l1.readByte();
                    }
                    throw new NumberFormatException("Number too large: ");
                }
                else if(v5 == 45 && v == 0) {
                    --v2;
                    z = true;
                }
                else {
                    goto label_29;
                }
            label_26:
                ++v3;
                ++v;
                continue;
            label_29:
                z1 = true;
                if(true) {
                    break;
                }
            }
            if(v3 == v4) {
                l0.a = j00.b();
                k0.d(j00);
            }
            else {
                j00.b = v3;
            }
        }
        while(!z1 && l0.a != null);
        l0.a1(l0.size() - ((long)v));
        if(v < (z ? 2 : 1)) {
            if(l0.size() == 0L) {
                throw new EOFException();
            }
            throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or \'-\'") + " but was 0x" + okio.i.u(l0.Q(0L)));
        }
        return z ? v1 : -v1;
    }

    public static final void z(@l okio.l l0, @l okio.l l1, long v) {
        L.p(l0, "<this>");
        L.p(l1, "sink");
        if(l0.size() >= v) {
            l1.write(l0, v);
            return;
        }
        l1.write(l0, l0.size());
        throw new EOFException();
    }
}

