package com.facebook.imagepipeline.transcoder;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class f implements d {
    private final int a;
    private final boolean b;
    @m
    private final d c;
    @m
    private final Integer d;
    private final boolean e;

    public f(int v, boolean z, @m d d0, @m Integer integer0, boolean z1) {
        this.a = v;
        this.b = z;
        this.c = d0;
        this.d = integer0;
        this.e = z1;
    }

    private final c a(X0.c c0, boolean z) {
        return this.c == null ? null : this.c.createImageTranscoder(c0, z);
    }

    private final c b(X0.c c0, boolean z) {
        Integer integer0 = this.d;
        if(integer0 == null) {
            return null;
        }
        if(integer0 != null && ((int)integer0) == 0) {
            return this.c(c0, z);
        }
        if(integer0 == null || ((int)integer0) != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return this.d(c0, z);
    }

    private final c c(X0.c c0, boolean z) {
        return com.facebook.imagepipeline.nativecode.c.a(this.a, this.b, this.e).createImageTranscoder(c0, z);
    }

    @Override  // com.facebook.imagepipeline.transcoder.d
    @l
    public c createImageTranscoder(@l X0.c c0, boolean z) {
        L.p(c0, "imageFormat");
        c c1 = this.a(c0, z);
        if(c1 == null) {
            c1 = this.b(c0, z);
        }
        if(c1 == null) {
            c1 = this.c(c0, z);
        }
        return c1 == null ? this.d(c0, z) : c1;
    }

    private final c d(X0.c c0, boolean z) {
        c c1 = new h(this.a).createImageTranscoder(c0, z);
        L.o(c1, "createImageTranscoder(...)");
        return c1;
    }
}

