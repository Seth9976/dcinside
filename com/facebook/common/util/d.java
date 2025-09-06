package com.facebook.common.util;

import k1.n.a;
import k1.n;

@n(a.a)
public class d {
    private static final char[] a;
    private static final char[] b;
    private static final char[] c;
    private static final byte[] d;

    static {
        d.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        d.b = new char[0x100];
        d.c = new char[0x100];
        for(int v1 = 0; v1 < 0x100; ++v1) {
            d.b[v1] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}[v1 >> 4 & 15];
            d.c[v1] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}[v1 & 15];
        }
        d.d = new byte[103];
        for(int v2 = 0; v2 <= 70; ++v2) {
            d.d[v2] = -1;
        }
        for(byte b = 0; b < 10; b = (byte)(b + 1)) {
            d.d[b + 0x30] = b;
        }
        for(int v = 0; v < 6; v = (byte)(v + 1)) {
            d.d[v + 65] = (byte)(v + 10);
            d.d[v + 97] = (byte)(v + 10);
        }
    }

    public static String a(int v) {
        if(v > 0xFF || v < 0) {
            throw new IllegalArgumentException("The int converting to hex should be in range 0~255");
        }
        return d.b[v] + String.valueOf(d.c[v]);
    }

    public static byte[] b(String s) {
        int v = s.length();
        if((v & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] arr_b = new byte[v >> 1];
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = v1 + 1;
            int v4 = s.charAt(v1);
            if(v4 > 102) {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + s);
            }
            byte[] arr_b1 = d.d;
            int v5 = arr_b1[v4];
            if(v5 == -1) {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + s);
            }
            v1 += 2;
            int v6 = s.charAt(v3);
            if(v6 > 102) {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + s);
            }
            int v7 = arr_b1[v6];
            if(v7 == -1) {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + s);
            }
            arr_b[v2] = (byte)(v7 | v5 << 4);
        }
        return arr_b;
    }

    public static String c(byte[] arr_b, boolean z) {
        char[] arr_c = new char[arr_b.length * 2];
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            int v2 = arr_b[v] & 0xFF;
            if(v2 == 0 && z) {
                break;
            }
            int v3 = v1 + 1;
            arr_c[v1] = d.b[v2];
            v1 += 2;
            arr_c[v3] = d.c[v2];
        }
        return new String(arr_c, 0, v1);
    }

    public static byte[] d(String s) {
        return d.b(s.replaceAll(" ", ""));
    }
}

