package com.fasterxml.jackson.core.io.doubleparser;

abstract class b extends g {
    private static final int g = 0x268826A1;
    private static final int h = 0x20000000;
    static final int i = 400;

    protected static void h(int v) {
        if(v > 0x268826A1) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    protected static void i(int v) {
        if(v > 0x20000000) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    protected static boolean j(int v) {
        return v > 18;
    }
}

