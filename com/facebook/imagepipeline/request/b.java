package com.facebook.imagepipeline.request;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class b extends a implements g {
    @m
    private h c;

    @Override  // com.facebook.imagepipeline.request.g
    public void c(@l h h0) {
        synchronized(this) {
            L.p(h0, "runner");
            this.c = h0;
        }
    }

    public final void g() {
        h h0 = this.c;
        if(h0 != null) {
            h0.d();
        }
    }
}

