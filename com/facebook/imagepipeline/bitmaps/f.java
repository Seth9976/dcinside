package com.facebook.imagepipeline.bitmaps;

import com.facebook.imagepipeline.core.a;
import com.facebook.imagepipeline.memory.N;
import com.facebook.imagepipeline.memory.k;
import com.facebook.imagepipeline.platform.d;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class f {
    @l
    public static final f a;

    static {
        f.a = new f();
    }

    @l
    @n
    public static final e a(@l N n0, @l d d0, @l a a0) {
        L.p(n0, "poolFactory");
        L.p(d0, "platformDecoder");
        L.p(a0, "closeableReferenceFactory");
        k k0 = n0.b();
        L.o(k0, "getBitmapPool(...)");
        return new com.facebook.imagepipeline.bitmaps.a(k0, a0);
    }
}

