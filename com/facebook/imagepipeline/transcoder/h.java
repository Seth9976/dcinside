package com.facebook.imagepipeline.transcoder;

import k1.n.a;
import k1.n;

@n(a.a)
public class h implements d {
    private final int a;

    public h(int v) {
        this.a = v;
    }

    @Override  // com.facebook.imagepipeline.transcoder.d
    public c createImageTranscoder(X0.c c0, boolean z) {
        return new g(z, this.a);
    }
}

