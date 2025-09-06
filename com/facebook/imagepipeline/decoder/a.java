package com.facebook.imagepipeline.decoder;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a extends RuntimeException {
    @l
    private final com.facebook.imagepipeline.image.l a;

    public a(@m String s, @l com.facebook.imagepipeline.image.l l0) {
        L.p(l0, "encodedImage");
        super(s);
        this.a = l0;
    }

    public a(@m String s, @m Throwable throwable0, @l com.facebook.imagepipeline.image.l l0) {
        L.p(l0, "encodedImage");
        super(s, throwable0);
        this.a = l0;
    }

    @l
    public final com.facebook.imagepipeline.image.l a() {
        return this.a;
    }
}

