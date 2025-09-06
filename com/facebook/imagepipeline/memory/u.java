package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import y4.l;
import z3.n;

public final class u {
    @l
    public static final u a = null;
    public static final int b = 0x400000;
    private static final int c = 0x20000;
    private static final int d;

    static {
        u.a = new u();
        u.d = Runtime.getRuntime().availableProcessors();
    }

    @l
    @n
    public static final SparseIntArray a(int v, int v1, int v2) {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        while(v <= v1) {
            sparseIntArray0.put(v, v2);
            v *= 2;
        }
        return sparseIntArray0;
    }

    @l
    @n
    public static final O b() {
        SparseIntArray sparseIntArray0 = u.a(0x20000, 0x400000, u.d);
        return new O(0x400000, u.d * 0x400000, sparseIntArray0, 0x20000, 0x400000, u.d);
    }

    public final int c() {
        return u.d;
    }
}

