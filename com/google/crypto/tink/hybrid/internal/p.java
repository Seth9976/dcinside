package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.A1;
import com.google.crypto.tink.proto.v1;
import com.google.crypto.tink.proto.w1;
import com.google.crypto.tink.proto.x1;
import com.google.crypto.tink.subtle.h;
import com.google.crypto.tink.subtle.w.b;
import java.security.GeneralSecurityException;

public final class p {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[x1.values().length];
            a.a = arr_v;
            try {
                arr_v[x1.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x1.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x1.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;

    static {
        p.a = new byte[]{0};
        p.b = new byte[]{0, 0x20};
        p.c = new byte[]{0, 16};
        p.d = new byte[]{0, 17};
        p.e = new byte[]{0, 18};
        p.f = new byte[]{0, 1};
        p.g = new byte[]{0, 2};
        p.h = new byte[]{0, 3};
        p.i = new byte[]{0, 1};
        p.j = new byte[]{0, 2};
        p.k = new byte[]{0, 3};
        p.l = new byte[0];
        p.m = new byte[]{75, 69, 77};
        p.n = new byte[]{72, 80, 75, 69};
        p.o = new byte[]{72, 80, 75, 69, 45, 0x76, 49};
    }

    static byte[] a(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        return h.d(new byte[][]{p.n, arr_b, arr_b1, arr_b2});
    }

    public static byte[] b(int v, int v1) {
        byte[] arr_b = new byte[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_b[v2] = (byte)(v1 >> (v - v2 - 1) * 8 & 0xFF);
        }
        return arr_b;
    }

    static byte[] c(byte[] arr_b) throws GeneralSecurityException [...] // 潜在的解密器

    static byte[] d(String s, byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return h.d(new byte[][]{p.o, arr_b1, s.getBytes(z.a), arr_b});
    }

    static byte[] e(String s, byte[] arr_b, byte[] arr_b1, int v) throws GeneralSecurityException {
        return h.d(new byte[][]{p.b(2, v), p.o, arr_b1, s.getBytes(z.a), arr_b});
    }

    static b f(x1 x10) throws GeneralSecurityException {
        switch(x10) {
            case 1: {
                return b.a;
            }
            case 2: {
                return b.b;
            }
            case 3: {
                return b.c;
            }
            default: {
                throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
            }
        }
    }

    static void g(A1 a10) throws GeneralSecurityException {
        if(a10.Y0() == x1.b || a10.Y0() == x1.g) {
            throw new GeneralSecurityException("Invalid KEM param: " + a10.Y0().name());
        }
        if(a10.c1() == w1.b || a10.c1() == w1.f) {
            throw new GeneralSecurityException("Invalid KDF param: " + a10.c1().name());
        }
        if(a10.R() == v1.b || a10.R() == v1.f) {
            throw new GeneralSecurityException("Invalid AEAD param: " + a10.R().name());
        }
    }
}

