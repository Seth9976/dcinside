package kotlin.text;

import java.util.Arrays;
import kotlin.H0;
import kotlin.collections.c;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r;
import kotlin.ranges.s;
import kotlin.y;
import y4.l;

@s0({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1050:1\n998#1,7:1052\n998#1,7:1059\n998#1,7:1066\n998#1,7:1073\n998#1,7:1080\n998#1,7:1087\n998#1,7:1094\n998#1,7:1101\n1009#1,5:1108\n1009#1,5:1113\n998#1,7:1118\n998#1,7:1125\n1009#1,5:1132\n1018#1,5:1137\n1#2:1051\n1188#3,3:1142\n1188#3,3:1145\n1188#3,3:1148\n1188#3,3:1151\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n418#1:1052,7\n451#1:1059,7\n455#1:1066,7\n458#1:1073,7\n499#1:1080,7\n502#1:1087,7\n507#1:1094,7\n512#1:1101,7\n519#1:1108,5\n520#1:1113,5\n967#1:1118,7\n969#1:1125,7\n983#1:1132,5\n991#1:1137,5\n42#1:1142,3\n43#1:1145,3\n54#1:1148,3\n55#1:1151,3\n*E\n"})
public final class j {
    @l
    private static final String a = "0123456789abcdef";
    @l
    private static final String b = "0123456789ABCDEF";
    @l
    private static final int[] c;
    @l
    private static final int[] d;
    @l
    private static final int[] e;
    @l
    private static final long[] f;

    static {
        int[] arr_v = new int[0x100];
        int v = 0;
        for(int v1 = 0; v1 < 0x100; ++v1) {
            arr_v[v1] = "0123456789abcdef".charAt(v1 & 15) | "0123456789abcdef".charAt(v1 >> 4) << 8;
        }
        j.c = arr_v;
        int[] arr_v1 = new int[0x100];
        for(int v2 = 0; v2 < 0x100; ++v2) {
            arr_v1[v2] = "0123456789ABCDEF".charAt(v2 & 15) | "0123456789ABCDEF".charAt(v2 >> 4) << 8;
        }
        j.d = arr_v1;
        int[] arr_v2 = new int[0x100];
        for(int v3 = 0; v3 < 0x100; ++v3) {
            arr_v2[v3] = -1;
        }
        int v5 = 0;
        for(int v4 = 0; v5 < 16; ++v4) {
            arr_v2["0123456789abcdef".charAt(v5)] = v4;
            ++v5;
        }
        int v7 = 0;
        for(int v6 = 0; v7 < 16; ++v6) {
            arr_v2["0123456789ABCDEF".charAt(v7)] = v6;
            ++v7;
        }
        j.e = arr_v2;
        long[] arr_v3 = new long[0x100];
        for(int v8 = 0; v8 < 0x100; ++v8) {
            arr_v3[v8] = -1L;
        }
        int v10 = 0;
        for(int v9 = 0; v10 < 16; ++v9) {
            arr_v3["0123456789abcdef".charAt(v10)] = (long)v9;
            ++v10;
        }
        for(int v11 = 0; v < 16; ++v11) {
            arr_v3["0123456789ABCDEF".charAt(v)] = (long)v11;
            ++v;
        }
        j.f = arr_v3;
    }

    public static int A(String s, k k0, int v, Object object0) {
        if((v & 1) != 0) {
            k0 = k.d.a();
        }
        return j.y(s, k0);
    }

    @r
    private static final int B(String s, int v, int v1, k k0, int v2) {
        c.a.a(v, v1, s.length());
        d k$d0 = k0.d();
        if(k$d0.g()) {
            j.d(s, v, v1, v2);
            return j.N(s, v, v1);
        }
        String s1 = k$d0.d();
        String s2 = k$d0.f();
        j.f(s, v, v1, s1, s2, k$d0.c(), v2);
        return j.N(s, v + s1.length(), v1 - s2.length());
    }

    @r
    private static final long C(String s, int v, int v1, k k0) {
        return j.G(s, v, v1, k0, 16);
    }

    @h0(version = "1.9")
    @r
    public static final long D(@l String s, @l k k0) {
        L.p(s, "<this>");
        L.p(k0, "format");
        return j.C(s, 0, s.length(), k0);
    }

    static long E(String s, int v, int v1, k k0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        if((v2 & 4) != 0) {
            k0 = k.d.a();
        }
        return j.C(s, v, v1, k0);
    }

    public static long F(String s, k k0, int v, Object object0) {
        if((v & 1) != 0) {
            k0 = k.d.a();
        }
        return j.D(s, k0);
    }

    @r
    private static final long G(String s, int v, int v1, k k0, int v2) {
        c.a.a(v, v1, s.length());
        d k$d0 = k0.d();
        if(k$d0.g()) {
            j.d(s, v, v1, v2);
            return j.O(s, v, v1);
        }
        String s1 = k$d0.d();
        String s2 = k$d0.f();
        j.f(s, v, v1, s1, s2, k$d0.c(), v2);
        return j.O(s, v + s1.length(), v1 - s2.length());
    }

    @r
    private static final short H(String s, int v, int v1, k k0) {
        return (short)j.B(s, v, v1, k0, 4);
    }

    @h0(version = "1.9")
    @r
    public static final short I(@l String s, @l k k0) {
        L.p(s, "<this>");
        L.p(k0, "format");
        return j.H(s, 0, s.length(), k0);
    }

    static short J(String s, int v, int v1, k k0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        if((v2 & 4) != 0) {
            k0 = k.d.a();
        }
        return j.H(s, v, v1, k0);
    }

    public static short K(String s, k k0, int v, Object object0) {
        if((v & 1) != 0) {
            k0 = k.d.a();
        }
        return j.I(s, k0);
    }

    private static final long L(String s, int v) {
        int v1 = s.charAt(v);
        if(v1 >>> 8 == 0) {
            long v2 = j.f[v1];
            if(v2 >= 0L) {
                return v2;
            }
        }
        j.Q(s, v);
        throw new y();
    }

    private static final byte M(String s, int v) {
        int v1 = s.charAt(v);
        if(v1 >>> 8 == 0) {
            int[] arr_v = j.e;
            int v2 = arr_v[v1];
            if(v2 >= 0) {
                int v3 = s.charAt(v + 1);
                if(v3 >>> 8 == 0) {
                    int v4 = arr_v[v3];
                    if(v4 >= 0) {
                        return (byte)(v2 << 4 | v4);
                    }
                }
                j.Q(s, v + 1);
                throw new y();
            }
        }
        j.Q(s, v);
        throw new y();
    }

    private static final int N(String s, int v, int v1) {
        int v2 = 0;
        while(v < v1) {
            int v3 = s.charAt(v);
            if(v3 >>> 8 == 0) {
                int v4 = j.e[v3];
                if(v4 < 0) {
                    j.Q(s, v);
                    throw new y();
                }
                v2 = v2 << 4 | v4;
                ++v;
                continue;
            }
            j.Q(s, v);
            throw new y();
        }
        return v2;
    }

    private static final long O(String s, int v, int v1) {
        long v2 = 0L;
        while(v < v1) {
            int v3 = s.charAt(v);
            if(v3 >>> 8 == 0) {
                long v4 = j.f[v3];
                if(v4 < 0L) {
                    j.Q(s, v);
                    throw new y();
                }
                v2 = v2 << 4 | v4;
                ++v;
                continue;
            }
            j.Q(s, v);
            throw new y();
        }
        return v2;
    }

    public static final int P(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        long v9;
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long v7 = ((long)v5) + 2L + ((long)v6);
        long v8 = j.a(v7, v2, v4);
        if(v1 <= v2) {
            v9 = j.a(v7, v1, v4);
        }
        else {
            v9 = j.a(v8, v1 / v2, v3);
            int v10 = v1 % v2;
            if(v10 != 0) {
                v9 = v9 + ((long)v3) + j.a(v7, v10, v4);
            }
        }
        long v11 = j.m0(v, v9, 1);
        long v12 = ((long)v) - (v9 + 1L) * v11;
        long v13 = j.m0(v12, v8, v3);
        long v14 = v12 - (v8 + ((long)v3)) * v13;
        long v15 = j.m0(v14, v7, v4);
        return v14 - (v7 + ((long)v4)) * v15 <= 0L ? ((int)(v11 * ((long)v1) + v13 * ((long)v2) + v15)) : ((int)(v11 * ((long)v1) + v13 * ((long)v2) + v15 + 1L));
    }

    private static final Void Q(String s, int v) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + v + ", but was " + s.charAt(v));
    }

    private static final void R(String s, int v, int v1, int v2, boolean z) {
        L.n(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.substring(v, v1);
        L.o(s1, "substring(...)");
        throw new NumberFormatException("Expected " + (z ? "exactly" : "at most") + ' ' + v2 + " hexadecimal digits at index " + v + ", but was " + s1 + " of length " + (v1 - v));
    }

    private static final void S(String s, int v, int v1, String s1, String s2) {
        L.n(s, "null cannot be cast to non-null type java.lang.String");
        String s3 = s.substring(v, v1);
        L.o(s3, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + s1 + "\" and suffix \"" + s2 + "\", but was " + s3);
    }

    private static final void T(String s, int v, int v1, String s1, String s2) {
        int v2 = s.B(s1.length() + v, v1);
        L.n(s, "null cannot be cast to non-null type java.lang.String");
        String s3 = s.substring(v, v2);
        L.o(s3, "substring(...)");
        throw new NumberFormatException("Expected " + s2 + " \"" + s1 + "\" at index " + v + ", but was " + s3);
    }

    private static final int U(String s, char[] arr_c, int v) {
        int v1 = s.length();
        if(v1 != 0) {
            if(v1 != 1) {
                L.n(s, "null cannot be cast to non-null type java.lang.String");
                return v + s.length();
            }
            arr_c[v] = s.charAt(0);
        }
        return v + s.length();
    }

    @h0(version = "1.9")
    @r
    @l
    public static final String V(byte b, @l k k0) {
        L.p(k0, "format");
        String s = k0.e() ? "0123456789ABCDEF" : "0123456789abcdef";
        d k$d0 = k0.d();
        if(k$d0.g()) {
            char[] arr_c = {s.charAt(b >> 4 & 15), s.charAt(b & 15)};
            return k$d0.e() ? E.z1(arr_c, s.B(Integer.numberOfLeadingZeros(b & 0xFF) - 24 >> 2, 1), 0, 2, null) : v.x1(arr_c);
        }
        return j.h0(b, k$d0, s, 8);
    }

    @h0(version = "1.9")
    @r
    @l
    public static final String W(int v, @l k k0) {
        L.p(k0, "format");
        String s = k0.e() ? "0123456789ABCDEF" : "0123456789abcdef";
        d k$d0 = k0.d();
        if(k$d0.g()) {
            char[] arr_c = {s.charAt(v >> 28 & 15), s.charAt(v >> 24 & 15), s.charAt(v >> 20 & 15), s.charAt(v >> 16 & 15), s.charAt(v >> 12 & 15), s.charAt(v >> 8 & 15), s.charAt(v >> 4 & 15), s.charAt(v & 15)};
            return k$d0.e() ? E.z1(arr_c, s.B(Integer.numberOfLeadingZeros(v) >> 2, 7), 0, 2, null) : v.x1(arr_c);
        }
        return j.h0(v, k$d0, s, 0x20);
    }

    @h0(version = "1.9")
    @r
    @l
    public static final String X(long v, @l k k0) {
        L.p(k0, "format");
        String s = k0.e() ? "0123456789ABCDEF" : "0123456789abcdef";
        d k$d0 = k0.d();
        if(k$d0.g()) {
            char[] arr_c = {s.charAt(((int)(v >> 60 & 15L))), s.charAt(((int)(v >> 56 & 15L))), s.charAt(((int)(v >> 52 & 15L))), s.charAt(((int)(v >> 0x30 & 15L))), s.charAt(((int)(v >> 44 & 15L))), s.charAt(((int)(v >> 40 & 15L))), s.charAt(((int)(v >> 36 & 15L))), s.charAt(((int)(v >> 0x20 & 15L))), s.charAt(((int)(v >> 28 & 15L))), s.charAt(((int)(v >> 24 & 15L))), s.charAt(((int)(v >> 20 & 15L))), s.charAt(((int)(v >> 16 & 15L))), s.charAt(((int)(v >> 12 & 15L))), s.charAt(((int)(v >> 8 & 15L))), s.charAt(((int)(v >> 4 & 15L))), s.charAt(((int)(15L & v)))};
            return k$d0.e() ? E.z1(arr_c, s.B(Long.numberOfLeadingZeros(v) >> 2, 15), 0, 2, null) : v.x1(arr_c);
        }
        return j.h0(v, k$d0, s, 0x40);
    }

    @h0(version = "1.9")
    @r
    @l
    public static final String Y(short v, @l k k0) {
        L.p(k0, "format");
        String s = k0.e() ? "0123456789ABCDEF" : "0123456789abcdef";
        d k$d0 = k0.d();
        if(k$d0.g()) {
            char[] arr_c = {s.charAt(v >> 12 & 15), s.charAt(v >> 8 & 15), s.charAt(v >> 4 & 15), s.charAt(v & 15)};
            return k$d0.e() ? E.z1(arr_c, s.B(Integer.numberOfLeadingZeros(v & 0xFFFF) - 16 >> 2, 3), 0, 2, null) : v.x1(arr_c);
        }
        return j.h0(v, k$d0, s, 16);
    }

    @h0(version = "1.9")
    @r
    @l
    public static final String Z(@l byte[] arr_b, int v, int v1, @l k k0) {
        L.p(arr_b, "<this>");
        L.p(k0, "format");
        c.a.a(v, v1, arr_b.length);
        if(v == v1) {
            return "";
        }
        int[] arr_v = k0.e() ? j.d : j.c;
        b k$b0 = k0.c();
        return k$b0.j() ? j.i0(arr_b, v, v1, k$b0, arr_v) : j.l0(arr_b, v, v1, k$b0, arr_v);
    }

    private static final long a(long v, int v1, int v2) {
        if(v1 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return v * ((long)v1) + ((long)v2) * (((long)v1) - 1L);
    }

    @h0(version = "1.9")
    @r
    @l
    public static final String a0(@l byte[] arr_b, @l k k0) {
        L.p(arr_b, "<this>");
        L.p(k0, "format");
        return j.Z(arr_b, 0, arr_b.length, k0);
    }

    private static final int b(String s, int v, int v1, String s1, boolean z, String s2) {
        if(s1.length() == 0) {
            return v;
        }
        int v2 = s1.length();
        for(int v3 = 0; v3 < v2; ++v3) {
            if(!e.J(s1.charAt(v3), s.charAt(v + v3), z)) {
                j.T(s, v, v1, s1, s2);
            }
        }
        return v + s1.length();
    }

    public static String b0(byte b, k k0, int v, Object object0) {
        if((v & 1) != 0) {
            k0 = k.d.a();
        }
        return j.V(b, k0);
    }

    private static final int c(long v) {
        if(0L > v || v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException("The resulting string length is too big: " + H0.g0(v));
        }
        return (int)v;
    }

    public static String c0(int v, k k0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            k0 = k.d.a();
        }
        return j.W(v, k0);
    }

    private static final void d(String s, int v, int v1, int v2) {
        if(v >= v1 || v1 - v > v2) {
            j.R(s, v, v1, v2, false);
        }
    }

    public static String d0(long v, k k0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            k0 = k.d.a();
        }
        return j.X(v, k0);
    }

    private static final int e(String s, int v, int v1) {
        switch(s.charAt(v)) {
            case 10: {
                return v + 1;
            }
            case 13: {
                return v + 1 >= v1 || s.charAt(v + 1) != 10 ? v + 1 : v + 2;
            }
            default: {
                throw new NumberFormatException("Expected a new line at index " + v + ", but was " + s.charAt(v));
            }
        }
    }

    public static String e0(short v, k k0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            k0 = k.d.a();
        }
        return j.Y(v, k0);
    }

    private static final void f(String s, int v, int v1, String s1, String s2, boolean z, int v2) {
        if(v1 - v - s1.length() <= s2.length()) {
            j.S(s, v, v1, s1, s2);
        }
        if(s1.length() != 0) {
            int v4 = s1.length();
            for(int v5 = 0; v5 < v4; ++v5) {
                if(!e.J(s1.charAt(v5), s.charAt(v + v5), z)) {
                    j.T(s, v, v1, s1, "prefix");
                }
            }
            v += s1.length();
        }
        int v6 = v1 - s2.length();
        if(s2.length() != 0) {
            int v7 = s2.length();
            for(int v3 = 0; v3 < v7; ++v3) {
                if(!e.J(s2.charAt(v3), s.charAt(v6 + v3), z)) {
                    j.T(s, v6, v1, s2, "suffix");
                }
            }
        }
        j.d(s, v, v6, v2);
    }

    public static String f0(byte[] arr_b, int v, int v1, k k0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_b.length;
        }
        if((v2 & 4) != 0) {
            k0 = k.d.a();
        }
        return j.Z(arr_b, v, v1, k0);
    }

    private static final int g(String s, int v) {
        int v1 = s.charAt(v);
        if(v1 >>> 8 == 0) {
            int v2 = j.e[v1];
            if(v2 >= 0) {
                return v2;
            }
        }
        j.Q(s, v);
        throw new y();
    }

    public static String g0(byte[] arr_b, k k0, int v, Object object0) {
        if((v & 1) != 0) {
            k0 = k.d.a();
        }
        return j.a0(arr_b, k0);
    }

    private static final int h(byte[] arr_b, int v, String s, String s1, int[] arr_v, char[] arr_c, int v1) {
        return j.U(s1, arr_c, j.i(arr_b, v, arr_v, arr_c, j.U(s, arr_c, v1)));
    }

    @r
    private static final String h0(long v, d k$d0, String s, int v1) {
        if((v1 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String s1 = k$d0.d();
        String s2 = k$d0.f();
        int v2 = j.c(((long)s1.length()) + ((long)(v1 >> 2)) + ((long)s2.length()));
        char[] arr_c = new char[v2];
        boolean z = k$d0.e();
        int v4 = j.U(s1, arr_c, 0);
        int v5 = v1;
        for(int v3 = 0; v3 < v1 >> 2; ++v3) {
            v5 -= 4;
            int v6 = (int)(v >> v5 & 15L);
            z = z && v6 == 0 && v5 > 0;
            if(!z) {
                arr_c[v4] = s.charAt(v6);
                ++v4;
            }
        }
        int v7 = j.U(s2, arr_c, v4);
        return v7 == v2 ? v.x1(arr_c) : E.z1(arr_c, 0, v7, 1, null);
    }

    private static final int i(byte[] arr_b, int v, int[] arr_v, char[] arr_c, int v1) {
        int v2 = arr_v[arr_b[v] & 0xFF];
        arr_c[v1] = (char)(v2 >> 8);
        arr_c[v1 + 1] = (char)(v2 & 0xFF);
        return v1 + 2;
    }

    // 去混淆评级： 低(20)
    @r
    private static final String i0(byte[] arr_b, int v, int v1, b k$b0, int[] arr_v) {
        return k$b0.k() ? j.k0(arr_b, v, v1, k$b0, arr_v) : j.j0(arr_b, v, v1, k$b0, arr_v);
    }

    private static final int j(int v, int v1, int v2, int v3) {
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j.c(((long)v) * (((long)v2) + 2L + ((long)v3) + ((long)v1)) - ((long)v1));
    }

    @r
    private static final String j0(byte[] arr_b, int v, int v1, b k$b0, int[] arr_v) {
        String s = k$b0.c();
        String s1 = k$b0.e();
        String s2 = k$b0.d();
        char[] arr_c = new char[j.j(v1 - v, s2.length(), s.length(), s1.length())];
        for(int v2 = j.h(arr_b, v, s, s1, arr_v, arr_c, 0); true; v2 = j.h(arr_b, v, s, s1, arr_v, arr_c, j.U(s2, arr_c, v2))) {
            ++v;
            if(v >= v1) {
                break;
            }
        }
        return v.x1(arr_c);
    }

    public static final int k(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v7 = (v - 1) / v1;
        int v8 = (v1 - 1) / v2;
        int v9 = v % v1;
        if(v9 != 0) {
            v1 = v9;
        }
        int v10 = v8 * v7 + (v1 - 1) / v2;
        return j.c(((long)v7) + ((long)v10) * ((long)v3) + ((long)(v - 1 - v7 - v10)) * ((long)v4) + ((long)v) * (((long)v5) + 2L + ((long)v6)));
    }

    @r
    private static final String k0(byte[] arr_b, int v, int v1, b k$b0, int[] arr_v) {
        int v2 = k$b0.d().length();
        if(v2 > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v3 = v1 - v;
        int v4 = 0;
        if(v2 == 0) {
            char[] arr_c = new char[j.c(((long)v3) * 2L)];
            while(v < v1) {
                v4 = j.i(arr_b, v, arr_v, arr_c, v4);
                ++v;
            }
            return v.x1(arr_c);
        }
        char[] arr_c1 = new char[j.c(((long)v3) * 3L - 1L)];
        char c = k$b0.d().charAt(0);
        int v5 = j.i(arr_b, v, arr_v, arr_c1, 0);
        for(int v6 = v + 1; v6 < v1; ++v6) {
            arr_c1[v5] = c;
            v5 = j.i(arr_b, v6, arr_v, arr_c1, v5 + 1);
        }
        return v.x1(arr_c1);
    }

    @r
    private static final byte l(String s, int v, int v1, k k0) {
        return (byte)j.B(s, v, v1, k0, 2);
    }

    @r
    private static final String l0(byte[] arr_b, int v, int v1, b k$b0, int[] arr_v) {
        int v10;
        int v9;
        int v2 = k$b0.g();
        int v3 = k$b0.f();
        String s = k$b0.c();
        String s1 = k$b0.e();
        String s2 = k$b0.d();
        String s3 = k$b0.h();
        int v4 = j.k(v1 - v, v2, v3, s3.length(), s2.length(), s.length(), s1.length());
        char[] arr_c = new char[v4];
        int v5 = v;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        while(v5 < v1) {
            if(v7 == v2) {
                arr_c[v6] = '\n';
                ++v6;
                v9 = 0;
                v10 = 0;
            }
            else if(v8 == v3) {
                v6 = j.U(s3, arr_c, v6);
                v9 = v7;
                v10 = 0;
            }
            else {
                v9 = v7;
                v10 = v8;
            }
            if(v10 != 0) {
                v6 = j.U(s2, arr_c, v6);
            }
            v6 = j.h(arr_b, v5, s, s1, arr_v, arr_c, v6);
            v8 = v10 + 1;
            v7 = v9 + 1;
            ++v5;
        }
        if(v6 != v4) {
            throw new IllegalStateException("Check failed.");
        }
        return v.x1(arr_c);
    }

    @h0(version = "1.9")
    @r
    public static final byte m(@l String s, @l k k0) {
        L.p(s, "<this>");
        L.p(k0, "format");
        return j.l(s, 0, s.length(), k0);
    }

    private static final long m0(long v, long v1, int v2) {
        return v <= 0L || v1 <= 0L ? 0L : (v + ((long)v2)) / (v1 + ((long)v2));
    }

    static byte n(String s, int v, int v1, k k0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        if((v2 & 4) != 0) {
            k0 = k.d.a();
        }
        return j.l(s, v, v1, k0);
    }

    public static byte o(String s, k k0, int v, Object object0) {
        if((v & 1) != 0) {
            k0 = k.d.a();
        }
        return j.m(s, k0);
    }

    @r
    private static final byte[] p(String s, int v, int v1, k k0) {
        c.a.a(v, v1, s.length());
        if(v == v1) {
            return new byte[0];
        }
        b k$b0 = k0.c();
        if(k$b0.j()) {
            byte[] arr_b = j.t(s, v, v1, k$b0);
            return arr_b == null ? j.w(s, v, v1, k$b0) : arr_b;
        }
        return j.w(s, v, v1, k$b0);
    }

    @h0(version = "1.9")
    @r
    @l
    public static final byte[] q(@l String s, @l k k0) {
        L.p(s, "<this>");
        L.p(k0, "format");
        return j.p(s, 0, s.length(), k0);
    }

    static byte[] r(String s, int v, int v1, k k0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        if((v2 & 4) != 0) {
            k0 = k.d.a();
        }
        return j.p(s, v, v1, k0);
    }

    public static byte[] s(String s, k k0, int v, Object object0) {
        if((v & 1) != 0) {
            k0 = k.d.a();
        }
        return j.q(s, k0);
    }

    // 去混淆评级： 低(20)
    @r
    private static final byte[] t(String s, int v, int v1, b k$b0) {
        return k$b0.k() ? j.v(s, v, v1, k$b0) : j.u(s, v, v1, k$b0);
    }

    @r
    private static final byte[] u(String s, int v, int v1, b k$b0) {
        String s1 = k$b0.c();
        String s2 = k$b0.e();
        String s3 = k$b0.d();
        long v2 = (long)s3.length();
        long v3 = ((long)s1.length()) + 2L + ((long)s2.length()) + v2;
        long v4 = (long)(v1 - v);
        int v5 = (int)((v4 + v2) / v3);
        if(((long)v5) * v3 - v2 != v4) {
            return null;
        }
        boolean z = k$b0.i();
        byte[] arr_b = new byte[v5];
        if(s1.length() != 0) {
            int v7 = s1.length();
            for(int v8 = 0; v8 < v7; ++v8) {
                if(!e.J(s1.charAt(v8), s.charAt(v + v8), z)) {
                    j.T(s, v, v1, s1, "byte prefix");
                }
            }
            v += s1.length();
        }
        String s4 = s2 + s3 + s1;
        for(int v9 = 0; v9 < v5 - 1; ++v9) {
            arr_b[v9] = j.M(s, v);
            v += 2;
            if(s4.length() != 0) {
                int v10 = s4.length();
                for(int v11 = 0; v11 < v10; ++v11) {
                    if(!e.J(s4.charAt(v11), s.charAt(v + v11), z)) {
                        j.T(s, v, v1, s4, "byte suffix + byte separator + byte prefix");
                    }
                }
                v += s4.length();
            }
        }
        arr_b[v5 - 1] = j.M(s, v);
        if(s2.length() != 0) {
            int v12 = s2.length();
            for(int v6 = 0; v6 < v12; ++v6) {
                if(!e.J(s2.charAt(v6), s.charAt(v + 2 + v6), z)) {
                    j.T(s, v + 2, v1, s2, "byte suffix");
                }
            }
        }
        return arr_b;
    }

    @r
    private static final byte[] v(String s, int v, int v1, b k$b0) {
        int v2 = k$b0.d().length();
        if(v2 > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v4 = v1 - v;
        int v5 = 2;
        if(v2 == 0) {
            if((v4 & 1) != 0) {
                return null;
            }
            byte[] arr_b = new byte[v4 >> 1];
            int v7 = 0;
            for(int v6 = 0; v6 < v4 >> 1; ++v6) {
                arr_b[v6] = j.M(s, v7);
                v7 += 2;
            }
            return arr_b;
        }
        if(v4 % 3 != 2) {
            return null;
        }
        int v8 = v4 / 3 + 1;
        byte[] arr_b1 = new byte[v8];
        int v9 = k$b0.d().charAt(0);
        arr_b1[0] = j.M(s, 0);
        for(int v3 = 1; v3 < v8; ++v3) {
            if(s.charAt(v5) != v9) {
                String s1 = k$b0.d();
                boolean z = k$b0.i();
                if(s1.length() != 0) {
                    int v10 = s1.length();
                    for(int v11 = 0; v11 < v10; ++v11) {
                        if(!e.J(s1.charAt(v11), s.charAt(v5 + v11), z)) {
                            j.T(s, v5, v1, s1, "byte separator");
                        }
                    }
                }
            }
            arr_b1[v3] = j.M(s, v5 + 1);
            v5 += 3;
        }
        return arr_b1;
    }

    @r
    private static final byte[] w(String s, int v, int v1, b k$b0) {
        int v20;
        int v17;
        int v16;
        int v13;
        int v10;
        int v9;
        int v2 = k$b0.g();
        int v3 = k$b0.f();
        String s1 = k$b0.c();
        String s2 = k$b0.e();
        String s3 = k$b0.d();
        String s4 = k$b0.h();
        boolean z = k$b0.i();
        int v4 = j.P(v1 - v, v2, v3, s4.length(), s3.length(), s1.length(), s2.length());
        byte[] arr_b = new byte[v4];
        int v5 = v;
        int v6 = 0;
        int v7 = 0;
        for(int v8 = 0; v5 < v1; v8 = v17) {
            if(v7 == v2) {
                v5 = j.e(s, v5, v1);
                v9 = 0;
                v8 = 0;
            }
            else if(v8 == v3) {
                if(s4.length() == 0) {
                    v10 = v7;
                }
                else {
                    int v11 = s4.length();
                    for(int v12 = 0; v12 < v11; ++v12) {
                        if(!e.J(s4.charAt(v12), s.charAt(v5 + v12), z)) {
                            j.T(s, v5, v1, s4, "group separator");
                        }
                    }
                    v10 = v7;
                    v5 += s4.length();
                }
                v9 = v10;
                v8 = 0;
            }
            else if(v8 == 0) {
                v9 = v7;
            }
            else {
                if(s3.length() == 0) {
                    v13 = v8;
                }
                else {
                    int v14 = s3.length();
                    for(int v15 = 0; v15 < v14; ++v15) {
                        if(!e.J(s3.charAt(v15), s.charAt(v5 + v15), z)) {
                            j.T(s, v5, v1, s3, "byte separator");
                        }
                    }
                    v13 = v8;
                    v5 += s3.length();
                }
                v9 = v7;
                v8 = v13;
            }
            if(s1.length() == 0) {
                v16 = v9 + 1;
                v17 = v8 + 1;
            }
            else {
                int v18 = s1.length();
                v16 = v9 + 1;
                for(int v19 = 0; v19 < v18; ++v19) {
                    if(!e.J(s1.charAt(v19), s.charAt(v5 + v19), z)) {
                        j.T(s, v5, v1, s1, "byte prefix");
                    }
                }
                v17 = v8 + 1;
                v5 += s1.length();
            }
            if(v1 - 2 < v5) {
                j.R(s, v5, v1, 2, true);
            }
            arr_b[v6] = j.M(s, v5);
            v5 += 2;
            if(s2.length() == 0) {
                v20 = v6 + 1;
            }
            else {
                int v21 = s2.length();
                for(int v22 = 0; v22 < v21; ++v22) {
                    if(!e.J(s2.charAt(v22), s.charAt(v5 + v22), z)) {
                        j.T(s, v5, v1, s2, "byte suffix");
                    }
                }
                v20 = v6 + 1;
                v5 += s2.length();
            }
            v6 = v20;
            v7 = v16;
        }
        if(v6 != v4) {
            arr_b = Arrays.copyOf(arr_b, v6);
            L.o(arr_b, "copyOf(...)");
        }
        return arr_b;
    }

    @r
    private static final int x(String s, int v, int v1, k k0) {
        return j.B(s, v, v1, k0, 8);
    }

    @h0(version = "1.9")
    @r
    public static final int y(@l String s, @l k k0) {
        L.p(s, "<this>");
        L.p(k0, "format");
        return j.x(s, 0, s.length(), k0);
    }

    static int z(String s, int v, int v1, k k0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        if((v2 & 4) != 0) {
            k0 = k.d.a();
        }
        return j.x(s, v, v1, k0);
    }
}

