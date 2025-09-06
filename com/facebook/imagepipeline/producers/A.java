package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.l;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.imagepipeline.producers.a implements h0 {
    static class com.facebook.imagepipeline.producers.a.a extends u {
        private com.facebook.imagepipeline.producers.a.a(com.facebook.imagepipeline.producers.n n0) {
            super(n0);
        }

        com.facebook.imagepipeline.producers.a.a(com.facebook.imagepipeline.producers.n n0, b b0) {
            this(n0);
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.r(((l)object0), v);
        }

        protected void r(@h l l0, int v) {
            if(l0 == null) {
                this.q().b(null, v);
                return;
            }
            if(!l.L(l0)) {
                l0.T();
            }
            this.q().b(l0, v);
        }
    }

    private final h0 a;

    public com.facebook.imagepipeline.producers.a(h0 h00) {
        this.a = h00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        com.facebook.imagepipeline.producers.a.a a$a0 = new com.facebook.imagepipeline.producers.a.a(n0, null);
        this.a.a(a$a0, j00);
    }
}

