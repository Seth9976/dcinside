package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.e;
import com.facebook.common.internal.q;
import com.facebook.imagepipeline.cache.m;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.request.d;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class x implements h0 {
    static class com.facebook.imagepipeline.producers.x.a extends u {
        private final j0 i;
        private final q j;
        private final com.facebook.imagepipeline.cache.n k;

        private com.facebook.imagepipeline.producers.x.a(com.facebook.imagepipeline.producers.n n0, j0 j00, q q0, com.facebook.imagepipeline.cache.n n1) {
            super(n0);
            this.i = j00;
            this.j = q0;
            this.k = n1;
        }

        com.facebook.imagepipeline.producers.x.a(com.facebook.imagepipeline.producers.n n0, j0 j00, q q0, com.facebook.imagepipeline.cache.n n1, y y0) {
            this(n0, j00, q0, n1);
        }

        @Override  // com.facebook.imagepipeline.producers.c
        public void i(@h Object object0, int v) {
            this.r(((l)object0), v);
        }

        public void r(@h l l0, int v) {
            this.i.i().b(this.i, "DiskCacheWriteProducer");
            if(!c.f(v) && l0 != null && !c.m(v, 10) && l0.n() != X0.c.d) {
                d d0 = this.i.b();
                Object object0 = this.i.c();
                e e0 = this.k.b(d0, object0);
                com.facebook.imagepipeline.core.c c0 = (com.facebook.imagepipeline.core.c)this.j.get();
                m m0 = v.a(d0, c0.b(), c0.c(), c0.e());
                if(m0 == null) {
                    l0 l00 = this.i.i();
                    com.facebook.imagepipeline.producers.v.a v$a0 = new com.facebook.imagepipeline.producers.v.a("Got no disk cache for CacheChoice: " + d0.f().ordinal().toString());
                    l00.k(this.i, "DiskCacheWriteProducer", v$a0, null);
                    this.q().b(l0, v);
                    return;
                }
                m0.x(e0, l0);
                this.i.i().j(this.i, "DiskCacheWriteProducer", null);
                this.q().b(l0, v);
                return;
            }
            this.i.i().j(this.i, "DiskCacheWriteProducer", null);
            this.q().b(l0, v);
        }
    }

    private final q a;
    private final com.facebook.imagepipeline.cache.n b;
    private final h0 c;
    @VisibleForTesting
    static final String d = "DiskCacheWriteProducer";

    public x(q q0, com.facebook.imagepipeline.cache.n n0, h0 h00) {
        this.a = q0;
        this.b = n0;
        this.c = h00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        this.c(n0, j00);
    }

    private void c(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        if(j00.w().b() >= com.facebook.imagepipeline.request.d.d.c.b()) {
            j00.o("disk", "nil-result_write");
            n0.b(null, 1);
            return;
        }
        if(j00.b().C(0x20)) {
            n0 = new com.facebook.imagepipeline.producers.x.a(n0, j00, this.a, this.b, null);
        }
        this.c.a(n0, j00);
    }
}

