package com.google.common.net;

import J1.b;
import com.google.common.base.H;
import com.google.common.escape.l;

@b
@a
public final class k extends l {
    private final boolean c;
    private final boolean[] d;
    private static final char[] e;
    private static final char[] f;

    static {
        k.e = new char[]{'+'};
        k.f = "0123456789ABCDEF".toCharArray();
    }

    public k(String s, boolean z) {
        H.E(s);
        if(s.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always \'safe\' and should not be explicitly specified");
        }
        if(z && (s + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789").contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a \'safe\' character");
        }
        this.c = z;
        this.d = k.h((s + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    @Override  // com.google.common.escape.l
    public String b(String s) {
        H.E(s);
        int v = s.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = s.charAt(v1);
            if(v2 < this.d.length && this.d[v2]) {
                ++v1;
                continue;
            }
            return this.e(s, v1);
        }
        return s;
    }

    @Override  // com.google.common.escape.l
    @o3.a
    protected char[] d(int v) {
        if(v < this.d.length && this.d[v]) {
            return null;
        }
        if(v == 0x20 && this.c) {
            return k.e;
        }
        if(v <= 0x7F) {
            char[] arr_c = new char[3];
            arr_c[0] = '%';
            arr_c[2] = k.f[v & 15];
            arr_c[1] = k.f[v >>> 4];
            return arr_c;
        }
        if(v <= 0x7FF) {
            char[] arr_c1 = new char[6];
            arr_c1[0] = '%';
            arr_c1[3] = '%';
            arr_c1[5] = k.f[v & 15];
            arr_c1[4] = k.f[v >>> 4 & 3 | 8];
            arr_c1[2] = k.f[v >>> 6 & 15];
            arr_c1[1] = k.f[v >>> 10 | 12];
            return arr_c1;
        }
        if(v <= 0xFFFF) {
            char[] arr_c2 = new char[9];
            arr_c2[0] = '%';
            arr_c2[1] = 'E';
            arr_c2[3] = '%';
            arr_c2[6] = '%';
            arr_c2[8] = k.f[v & 15];
            arr_c2[7] = k.f[v >>> 4 & 3 | 8];
            arr_c2[5] = k.f[v >>> 6 & 15];
            arr_c2[4] = k.f[v >>> 10 & 3 | 8];
            arr_c2[2] = k.f[v >>> 12];
            return arr_c2;
        }
        if(v > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid unicode character value " + v);
        }
        char[] arr_c3 = new char[12];
        arr_c3[0] = '%';
        arr_c3[1] = 'F';
        arr_c3[3] = '%';
        arr_c3[6] = '%';
        arr_c3[9] = '%';
        arr_c3[11] = k.f[v & 15];
        arr_c3[10] = k.f[v >>> 4 & 3 | 8];
        arr_c3[8] = k.f[v >>> 6 & 15];
        arr_c3[7] = k.f[v >>> 10 & 3 | 8];
        arr_c3[5] = k.f[v >>> 12 & 15];
        arr_c3[4] = k.f[v >>> 16 & 3 | 8];
        arr_c3[2] = k.f[v >>> 18 & 7];
        return arr_c3;
    }

    @Override  // com.google.common.escape.l
    protected int g(CharSequence charSequence0, int v, int v1) {
        H.E(charSequence0);
        while(v < v1) {
            int v2 = charSequence0.charAt(v);
            if(v2 >= this.d.length || !this.d[v2]) {
                break;
            }
            ++v;
        }
        return v;
    }

    private static boolean[] h(String s) {
        char[] arr_c = s.toCharArray();
        int v = -1;
        for(int v2 = 0; v2 < arr_c.length; ++v2) {
            v = Math.max(arr_c[v2], v);
        }
        boolean[] arr_z = new boolean[v + 1];
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            arr_z[arr_c[v1]] = true;
        }
        return arr_z;
    }
}

