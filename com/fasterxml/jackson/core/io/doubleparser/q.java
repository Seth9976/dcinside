package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigDecimal;

public class q {
    private static final n a;
    private static final o b;
    private static final p c;

    static {
        q.a = new n();
        q.b = new o();
        q.c = new p();
    }

    public static BigDecimal a(CharSequence charSequence0) throws NumberFormatException {
        return q.b(charSequence0, 0, charSequence0.length());
    }

    public static BigDecimal b(CharSequence charSequence0, int v, int v1) throws NumberFormatException {
        return q.c.j(charSequence0, v, v1);
    }

    public static BigDecimal c(byte[] arr_b) throws NumberFormatException {
        return q.d(arr_b, 0, arr_b.length);
    }

    public static BigDecimal d(byte[] arr_b, int v, int v1) throws NumberFormatException {
        return q.a.j(arr_b, v, v1);
    }

    public static BigDecimal e(char[] arr_c) throws NumberFormatException {
        return q.f(arr_c, 0, arr_c.length);
    }

    public static BigDecimal f(char[] arr_c, int v, int v1) throws NumberFormatException {
        return q.b.j(arr_c, v, v1);
    }
}

