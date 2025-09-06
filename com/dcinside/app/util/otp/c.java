package com.dcinside.app.util.otp;

import com.google.common.collect.D3;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.r;
import y4.l;
import y4.m;

@s0({"SMAP\nBase32String.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base32String.kt\ncom/dcinside/app/util/otp/Base32String\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,104:1\n108#2:105\n80#2,22:106\n*S KotlinDebug\n*F\n+ 1 Base32String.kt\ncom/dcinside/app/util/otp/Base32String\n*L\n19#1:105\n19#1:106,22\n*E\n"})
public final class c {
    public static final class a extends Exception {
        public a(@m String s) {
            super(s);
        }
    }

    @l
    public static final c a = null;
    @l
    private static final String b = "-";
    @l
    private static final char[] c;
    private static final int d;
    private static final int e;
    @l
    private static final Map f;

    static {
        c.a = new c();
        char[] arr_c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray();
        L.o(arr_c, "toCharArray(...)");
        c.c = arr_c;
        c.d = arr_c.length - 1;
        c.e = Integer.numberOfTrailingZeros(arr_c.length);
        HashMap hashMap0 = D3.a0(arr_c.length);
        L.o(hashMap0, "newHashMapWithExpectedSize(...)");
        c.f = hashMap0;
        for(int v = 0; v < arr_c.length; ++v) {
            c.f.put(Character.valueOf(c.c[v]), v);
        }
    }

    @l
    public final byte[] a(@m String s) throws a {
        if(s == null) {
            return new byte[0];
        }
        int v1 = s.length() - 1;
        int v2 = 0;
        boolean z = false;
        while(v2 <= v1) {
            boolean z1 = L.t(s.charAt((z ? v1 : v2)), 0x20) <= 0;
            if(z) {
                if(!z1) {
                    break;
                }
                --v1;
            }
            else if(z1) {
                ++v2;
            }
            else {
                z = true;
            }
        }
        String s1 = s.subSequence(v2, v1 + 1).toString();
        String s2 = new r("-").m(s1, "");
        String s3 = new r(" ").m(s2, "");
        String s4 = new r("[=]*$").o(s3, "");
        Locale locale0 = Locale.US;
        L.o(locale0, "US");
        String s5 = s4.toUpperCase(locale0);
        L.o(s5, "toUpperCase(...)");
        if(s5.length() == 0) {
            return new byte[0];
        }
        byte[] arr_b = new byte[s5.length() * c.e / 8];
        char[] arr_c = s5.toCharArray();
        L.o(arr_c, "toCharArray(...)");
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            int v6 = arr_c[v];
            Map map0 = c.f;
            if(!map0.containsKey(Character.valueOf(((char)v6)))) {
                throw new a("Illegal character: " + ((char)v6));
            }
            Object object0 = map0.get(Character.valueOf(((char)v6)));
            L.m(object0);
            v3 = v3 << c.e | ((Number)object0).intValue() & c.d;
            v4 += c.e;
            if(v4 >= 8) {
                arr_b[v5] = (byte)(v3 >> v4 - 8);
                v4 -= 8;
                ++v5;
            }
        }
        return arr_b;
    }

    @l
    public final String b(@l byte[] arr_b) {
        L.p(arr_b, "data");
        if(arr_b.length == 0) {
            return "";
        }
        if(arr_b.length >= 0x10000000) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v = 1;
        StringBuilder stringBuilder0 = new StringBuilder((arr_b.length * 8 + c.e - 1) / c.e);
        int v1 = arr_b[0];
        int v2 = 8;
        while(v2 > 0 || v < arr_b.length) {
            int v3 = c.e;
            if(v2 < v3) {
                if(v < arr_b.length) {
                    v1 = v1 << 8 | arr_b[v] & 0xFF;
                    v2 += 8;
                    ++v;
                }
                else {
                    int v4 = v3 - v2;
                    v1 <<= v4;
                    v2 += v4;
                }
            }
            int v5 = c.d & v1 >> v2 - v3;
            v2 -= v3;
            stringBuilder0.append(c.c[v5]);
        }
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }
}

