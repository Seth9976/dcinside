package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.l;

public final class r implements d {
    public final com.facebook.imagepipeline.producers.q.d a;
    public final q b;
    public final int c;

    public r(com.facebook.imagepipeline.producers.q.d q$d0, q q0, int v) {
        this.a = q$d0;
        this.b = q0;
        this.c = v;
    }

    @Override  // com.facebook.imagepipeline.producers.H$d
    public final void a(l l0, int v) {
        com.facebook.imagepipeline.producers.q.d.s(this.a, this.b, this.c, l0, v);
    }
}

