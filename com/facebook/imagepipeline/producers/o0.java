package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class o0 implements h0 {
    final class a extends u {
        final o0 i;

        public a(@l n n0) {
            L.p(n0, "consumer");
            this.i = o00;
            super(n0);
        }

        @Override  // com.facebook.imagepipeline.producers.c
        public void i(Object object0, int v) {
            this.r(((com.facebook.imagepipeline.image.l)object0), v);
        }

        protected void r(@m com.facebook.imagepipeline.image.l l0, int v) {
            com.facebook.common.references.a a0 = null;
            try {
                if(com.facebook.imagepipeline.image.l.R(l0) && l0 != null) {
                    a0 = l0.f();
                }
                this.q().b(a0, v);
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }
    }

    @l
    private final h0 a;

    public o0(@l h0 h00) {
        L.p(h00, "inputProducer");
        super();
        this.a = h00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(@l n n0, @l j0 j00) {
        L.p(n0, "consumer");
        L.p(j00, "context");
        a o0$a0 = new a(this, n0);
        this.a.a(o0$a0, j00);
    }
}

