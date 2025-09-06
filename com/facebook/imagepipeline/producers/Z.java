package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.request.d;
import java.io.Closeable;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class z extends W {
    private final com.facebook.imagepipeline.cache.n g;

    public z(com.facebook.imagepipeline.cache.n n0, boolean z, h0 h00) {
        super(h00, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z);
        this.g = n0;
    }

    @Override  // com.facebook.imagepipeline.producers.W
    @h
    public Closeable g(@h Closeable closeable0) {
        return this.l(((l)closeable0));
    }

    @Override  // com.facebook.imagepipeline.producers.W
    protected Object j(j0 j00) {
        return this.m(j00);
    }

    @h
    public l l(@h l l0) {
        return l.b(l0);
    }

    protected Pair m(j0 j00) {
        d d0 = j00.b();
        Object object0 = j00.c();
        return Pair.create(this.g.b(d0, object0), j00.w());
    }
}

