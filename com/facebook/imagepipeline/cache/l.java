package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.m;
import java.io.OutputStream;

public final class l implements m {
    public final com.facebook.imagepipeline.image.l a;
    public final com.facebook.imagepipeline.cache.m b;

    public l(com.facebook.imagepipeline.image.l l0, com.facebook.imagepipeline.cache.m m0) {
        this.a = l0;
        this.b = m0;
    }

    @Override  // com.facebook.cache.common.m
    public final void a(OutputStream outputStream0) {
        com.facebook.imagepipeline.cache.m.D(this.a, this.b, outputStream0);
    }
}

