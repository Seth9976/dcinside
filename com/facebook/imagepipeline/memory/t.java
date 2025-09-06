package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import y4.l;
import z3.n;

public final class t {
    @l
    public static final t a = null;
    private static final int b = 0x4000;
    private static final int c = 5;
    private static final int d = 0x14000;
    private static final int e = 0x100000;

    static {
        t.a = new t();
    }

    @l
    @n
    public static final O a() {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        sparseIntArray0.put(0x4000, 5);
        return new O(0x14000, 0x100000, sparseIntArray0);
    }
}

