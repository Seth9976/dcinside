package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import y4.l;
import z3.n;

public final class s {
    @l
    public static final s a;
    private static final int b;
    @l
    private static final SparseIntArray c;

    static {
        s.a = new s();
        s.c = new SparseIntArray(0);
    }

    @l
    @n
    public static final O a() {
        return new O(0, s.a.b(), s.c);
    }

    private final int b() {
        int v = (int)Math.min(Runtime.getRuntime().maxMemory(), 0x7FFFFFFFL);
        return v <= 0x1000000 ? v / 2 : v / 4 * 3;
    }
}

