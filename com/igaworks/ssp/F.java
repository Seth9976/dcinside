package com.igaworks.ssp;

public abstract class f {
    private static char[] a;
    private static byte[] b;

    static {
        f.a = new char[0x40];
        int v1 = 0;
        char c = 'A';
        while(c <= 90) {
            f.a[v1] = c;
            c = (char)(c + 1);
            ++v1;
        }
        char c1 = 'a';
        while(c1 <= 0x7A) {
            f.a[v1] = c1;
            c1 = (char)(c1 + 1);
            ++v1;
        }
        char c2 = '0';
        while(c2 <= 57) {
            f.a[v1] = c2;
            c2 = (char)(c2 + 1);
            ++v1;
        }
        char[] arr_c = f.a;
        arr_c[v1] = '+';
        arr_c[v1 + 1] = '/';
        f.b = new byte[0x80];
        for(int v2 = 0; true; ++v2) {
            byte[] arr_b = f.b;
            if(v2 >= arr_b.length) {
                break;
            }
            arr_b[v2] = -1;
        }
        for(int v = 0; v < 0x40; ++v) {
            f.b[f.a[v]] = (byte)v;
        }
    }

    public static String a(String s) {
        return s == null || s.equals("") ? "" : new String(f.a(s.getBytes()));
    }

    public static char[] a(byte[] arr_b) {
        return f.a(arr_b, arr_b.length);
    }

    public static char[] a(byte[] arr_b, int v) {
        int v8;
        int v7;
        int v1 = (v * 4 + 2) / 3;
        char[] arr_c = new char[(v + 2) / 3 * 4];
        int v3 = 0;
        for(int v2 = 0; v2 < v; v2 = v4) {
            int v4 = v2 + 1;
            int v5 = arr_b[v2];
            if(v4 < v) {
                int v6 = arr_b[v4] & 0xFF;
                v4 = v2 + 2;
                v7 = v6;
            }
            else {
                v7 = 0;
            }
            if(v4 < v) {
                v8 = arr_b[v4] & 0xFF;
                ++v4;
            }
            else {
                v8 = 0;
            }
            char[] arr_c1 = f.a;
            arr_c[v3] = arr_c1[(v5 & 0xFF) >>> 2];
            arr_c[v3 + 1] = arr_c1[(v5 & 3) << 4 | v7 >>> 4];
            char c = '=';
            arr_c[v3 + 2] = v3 + 2 >= v1 ? '=' : arr_c1[(v7 & 15) << 2 | v8 >>> 6];
            if(v3 + 3 < v1) {
                c = arr_c1[v8 & 0x3F];
            }
            arr_c[v3 + 3] = c;
            v3 += 4;
        }
        return arr_c;
    }
}

