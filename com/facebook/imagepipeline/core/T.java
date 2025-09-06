package com.facebook.imagepipeline.core;

import bolts.h;
import bolts.j;
import com.facebook.cache.common.e;

public final class t implements h {
    public final c a;
    public final e b;

    public t(c c0, e e0) {
        this.a = c0;
        this.b = e0;
    }

    @Override  // bolts.h
    public final Object a(j j0) {
        return x.U(this.a, this.b, j0);
    }
}

