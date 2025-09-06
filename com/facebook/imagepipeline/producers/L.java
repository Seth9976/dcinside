package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.d;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class l implements h0 {
    class com.facebook.imagepipeline.producers.l.a extends u {
        private j0 i;
        final l j;

        private com.facebook.imagepipeline.producers.l.a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
            super(n0);
            this.i = j00;
        }

        com.facebook.imagepipeline.producers.l.a(com.facebook.imagepipeline.producers.n n0, j0 j00, m m0) {
            this(n0, j00);
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void h(@h Throwable throwable0) {
            l.this.b.a(this.q(), this.i);
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.r(((com.facebook.imagepipeline.image.l)object0), v);
        }

        protected void r(@h com.facebook.imagepipeline.image.l l0, int v) {
            d d0 = this.i.b();
            boolean z = c.e(v);
            boolean z1 = A0.c(l0, d0.v());
            if(l0 != null && (z1 || d0.n())) {
                if(!z || !z1) {
                    this.q().b(l0, v & -2);
                }
                else {
                    this.q().b(l0, v);
                }
            }
            if(z && !z1 && !d0.m()) {
                com.facebook.imagepipeline.image.l.c(l0);
                l.this.b.a(this.q(), this.i);
            }
        }
    }

    private final h0 a;
    private final h0 b;

    public l(h0 h00, h0 h01) {
        this.a = h00;
        this.b = h01;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        com.facebook.imagepipeline.producers.l.a l$a0 = new com.facebook.imagepipeline.producers.l.a(this, n0, j00, null);
        this.a.a(l$a0, j00);
    }
}

