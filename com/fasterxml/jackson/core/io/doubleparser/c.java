package com.fasterxml.jackson.core.io.doubleparser;

public class C {
    private static final z a;
    private static final A b;
    private static final B c;

    static {
        C.a = new z();
        C.b = new A();
        C.c = new B();
    }

    public static float a(CharSequence charSequence0) throws NumberFormatException {
        return C.b(charSequence0, 0, charSequence0.length());
    }

    public static float b(CharSequence charSequence0, int v, int v1) throws NumberFormatException {
        return Float.intBitsToFloat(((int)C.c.k(charSequence0, v, v1)));
    }

    public static float c(byte[] arr_b) throws NumberFormatException {
        return C.d(arr_b, 0, arr_b.length);
    }

    public static float d(byte[] arr_b, int v, int v1) throws NumberFormatException {
        return Float.intBitsToFloat(((int)C.a.k(arr_b, v, v1)));
    }

    public static float e(char[] arr_c) throws NumberFormatException {
        return C.f(arr_c, 0, arr_c.length);
    }

    public static float f(char[] arr_c, int v, int v1) throws NumberFormatException {
        return Float.intBitsToFloat(((int)C.b.k(arr_c, v, v1)));
    }
}

