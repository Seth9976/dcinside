package com.facebook.imagepipeline.memory;

import k1.G;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class j {
    @l
    public static final j a = null;
    private static final long b = 0x400L;
    private static final long c = 0x100000L;
    @f
    public static final int d;
    private static int e;
    @m
    private static volatile h f;

    static {
        j j0 = new j();
        j.a = j0;
        j.d = j0.b();
        j.e = 0x180;
    }

    @G
    @l
    @n
    public static final h a() {
        if(j.f == null) {
            Class class0 = j.class;
            synchronized(class0) {
                if(j.f == null) {
                    j.f = new h(j.e, j.d);
                }
            }
        }
        h h0 = j.f;
        L.m(h0);
        return h0;
    }

    private final int b() {
        int v = (int)Math.min(Runtime.getRuntime().maxMemory(), 0x7FFFFFFFL);
        return ((long)v) <= 0x1000000L ? v / 2 : v / 4 * 3;
    }

    @n
    public static final void c(@l i i0) {
        L.p(i0, "bitmapCounterConfig");
        if(j.f != null) {
            throw new IllegalStateException("BitmapCounter has already been created! `BitmapCounterProvider.initialize(...)` should only be called before `BitmapCounterProvider.get()` or not at all!");
        }
        j.e = i0.a();
    }
}

