package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.request.d;
import java.io.Closeable;
import k1.n.a;
import k1.n;

@n(a.a)
public class h extends W {
    private final com.facebook.imagepipeline.cache.n g;

    public h(com.facebook.imagepipeline.cache.n n0, h0 h00) {
        super(h00, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.g = n0;
    }

    @Override  // com.facebook.imagepipeline.producers.W
    @o3.h
    public Closeable g(@o3.h Closeable closeable0) {
        return this.l(((com.facebook.common.references.a)closeable0));
    }

    @Override  // com.facebook.imagepipeline.producers.W
    protected Object j(j0 j00) {
        return this.m(j00);
    }

    @o3.h
    public com.facebook.common.references.a l(@o3.h com.facebook.common.references.a a0) {
        return com.facebook.common.references.a.e(a0);
    }

    protected Pair m(j0 j00) {
        d d0 = j00.b();
        Object object0 = j00.c();
        return Pair.create(this.g.c(d0, object0), j00.w());
    }
}

