package com.facebook.imagepipeline.core;

import bolts.f;
import bolts.h;
import bolts.j;
import com.facebook.cache.common.e;
import com.facebook.imagepipeline.request.d;

public final class u implements h {
    public final x a;
    public final d b;
    public final e c;
    public final h d;
    public final f e;

    public u(x x0, d d0, e e0, h h0, f f0) {
        this.a = x0;
        this.b = d0;
        this.c = e0;
        this.d = h0;
        this.e = f0;
    }

    @Override  // bolts.h
    public final Object a(j j0) {
        return x.R(this.a, this.b, this.c, this.d, this.e, j0);
    }
}

