package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigInteger;

public class u {
    private static final r a;
    private static final s b;
    private static final t c;

    static {
        u.a = new r();
        u.b = new s();
        u.c = new t();
    }

    public static BigInteger a(CharSequence charSequence0) {
        int v = charSequence0.length();
        return u.c.k(charSequence0, 0, v, 10);
    }

    public static BigInteger b(CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        return u.c.k(charSequence0, 0, v1, v);
    }

    public static BigInteger c(CharSequence charSequence0, int v, int v1) {
        return u.c.k(charSequence0, v, v1, 10);
    }

    public static BigInteger d(CharSequence charSequence0, int v, int v1, int v2) {
        return u.c.k(charSequence0, v, v1, v2);
    }

    public static BigInteger e(byte[] arr_b) {
        return u.a.k(arr_b, 0, arr_b.length, 10);
    }

    public static BigInteger f(byte[] arr_b, int v) {
        return u.a.k(arr_b, 0, arr_b.length, v);
    }

    public static BigInteger g(byte[] arr_b, int v, int v1) {
        return u.a.k(arr_b, v, v1, 10);
    }

    public static BigInteger h(byte[] arr_b, int v, int v1, int v2) {
        return u.a.k(arr_b, v, v1, v2);
    }

    public static BigInteger i(char[] arr_c) {
        return u.b.k(arr_c, 0, arr_c.length, 10);
    }

    public static BigInteger j(char[] arr_c, int v) {
        return u.b.k(arr_c, 0, arr_c.length, v);
    }

    public static BigInteger k(char[] arr_c, int v, int v1) {
        return u.b.k(arr_c, v, v1, 10);
    }

    public static BigInteger l(char[] arr_c, int v, int v1, int v2) {
        return u.b.k(arr_c, v, v1, v2);
    }
}

