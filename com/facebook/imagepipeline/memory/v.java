package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import y4.l;
import z3.n;

public final class v {
    @l
    public static final v a = null;
    private static final int b = 5;
    private static final int c = 2;

    static {
        v.a = new v();
    }

    @l
    @n
    public static final O a() {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        sparseIntArray0.put(0x400, 5);
        sparseIntArray0.put(0x800, 5);
        sparseIntArray0.put(0x1000, 5);
        sparseIntArray0.put(0x2000, 5);
        sparseIntArray0.put(0x4000, 5);
        sparseIntArray0.put(0x8000, 5);
        sparseIntArray0.put(0x10000, 5);
        sparseIntArray0.put(0x20000, 5);
        sparseIntArray0.put(0x40000, 2);
        sparseIntArray0.put(0x80000, 2);
        sparseIntArray0.put(0x100000, 2);
        return new O(0xC00000, v.a.b(), sparseIntArray0);
    }

    private final int b() {
        int v = (int)Math.min(Runtime.getRuntime().maxMemory(), 0x7FFFFFFFL);
        return v >= 0x1000000 ? v / 4 * 3 : v / 2;
    }

    private final int c() [...] // 潜在的解密器
}

