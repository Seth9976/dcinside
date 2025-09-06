package com.fasterxml.jackson.core.io.doubleparser;

public class y {
    private static final v a;
    private static final w b;
    private static final x c;

    static {
        y.a = new v();
        y.b = new w();
        y.c = new x();
    }

    public static double a(CharSequence charSequence0) throws NumberFormatException {
        return y.b(charSequence0, 0, charSequence0.length());
    }

    public static double b(CharSequence charSequence0, int v, int v1) throws NumberFormatException {
        return Double.longBitsToDouble(y.c.k(charSequence0, v, v1));
    }

    public static double c(byte[] arr_b) throws NumberFormatException {
        return y.d(arr_b, 0, arr_b.length);
    }

    public static double d(byte[] arr_b, int v, int v1) throws NumberFormatException {
        return Double.longBitsToDouble(y.a.k(arr_b, v, v1));
    }

    public static double e(char[] arr_c) throws NumberFormatException {
        return y.f(arr_c, 0, arr_c.length);
    }

    public static double f(char[] arr_c, int v, int v1) throws NumberFormatException {
        return Double.longBitsToDouble(y.b.k(arr_c, v, v1));
    }
}

