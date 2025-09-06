package com.fasterxml.jackson.core.io.doubleparser;

abstract class a extends g {
    public static final int g = 0x20;
    static final int h = 400;
    protected static final long i = 0x7FFFFFFFL;
    protected static final int j = 0x268826A1;

    protected static void h(boolean z, int v, int v1, int v2, long v3) {
        if(z || v < v1) {
            throw new NumberFormatException("illegal syntax");
        }
        if(v3 <= 0xFFFFFFFF80000000L || v3 > 0x7FFFFFFFL || v2 > 0x268826A1) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    protected static boolean i(int v) {
        return v >= 0x20;
    }
}

