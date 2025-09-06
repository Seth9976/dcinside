package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.d;
import com.facebook.cache.disk.f;
import com.facebook.cache.disk.g.c;
import com.facebook.cache.disk.g;
import com.facebook.cache.disk.k;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import k1.n.a;
import k1.n;

@n(a.a)
public class l implements q {
    private m a;

    public l(m m0) {
        this.a = m0;
    }

    @Override  // com.facebook.imagepipeline.core.q
    public k a(d d0) {
        return l.b(d0, this.a.a(d0));
    }

    private static g b(d d0, f f0) {
        return l.c(d0, f0, Executors.newSingleThreadExecutor());
    }

    private static g c(d d0, f f0, Executor executor0) {
        return new g(f0, d0.i(), new c(d0.l(), d0.k(), d0.g()), d0.e(), d0.d(), d0.h(), executor0, d0.j());
    }
}

