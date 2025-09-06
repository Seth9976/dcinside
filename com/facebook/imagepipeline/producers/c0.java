package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.e;
import com.facebook.common.internal.j;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.request.d;
import com.facebook.imagepipeline.request.f;
import com.facebook.imagepipeline.request.g;
import java.util.Map;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class c0 implements h0 {
    public static class com.facebook.imagepipeline.producers.c0.a extends u {
        private final e i;
        private final boolean j;
        private final B k;
        private final boolean l;

        public com.facebook.imagepipeline.producers.c0.a(com.facebook.imagepipeline.producers.n n0, e e0, boolean z, B b0, boolean z1) {
            super(n0);
            this.i = e0;
            this.j = z;
            this.k = b0;
            this.l = z1;
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.r(((com.facebook.common.references.a)object0), v);
        }

        protected void r(@h com.facebook.common.references.a a0, int v) {
            com.facebook.common.references.a a1 = null;
            if(a0 == null) {
                if(c.e(v)) {
                    this.q().b(null, v);
                }
                return;
            }
            if(c.f(v) && !this.j) {
                return;
            }
            if(this.l) {
                a1 = this.k.c(this.i, a0);
            }
            try {
                this.q().c(1.0f);
                com.facebook.imagepipeline.producers.n n0 = this.q();
                if(a1 != null) {
                    a0 = a1;
                }
                n0.b(a0, v);
            }
            finally {
                com.facebook.common.references.a.j(a1);
            }
        }
    }

    private final B a;
    private final com.facebook.imagepipeline.cache.n b;
    private final h0 c;
    public static final String d = "PostprocessedBitmapMemoryCacheProducer";
    @VisibleForTesting
    static final String e = "cached_value_found";

    public c0(B b0, com.facebook.imagepipeline.cache.n n0, h0 h00) {
        this.a = b0;
        this.b = n0;
        this.c = h00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        l0 l00 = j00.i();
        d d0 = j00.b();
        Object object0 = j00.c();
        f f0 = d0.p();
        if(f0 != null && f0.a() != null) {
            l00.b(j00, "PostprocessedBitmapMemoryCacheProducer");
            e e0 = this.b.a(d0, object0);
            Map map0 = null;
            com.facebook.common.references.a a0 = j00.b().C(1) ? this.a.get(e0) : null;
            if(a0 != null) {
                if(l00.f(j00, "PostprocessedBitmapMemoryCacheProducer")) {
                    map0 = j.of("cached_value_found", "true");
                }
                l00.j(j00, "PostprocessedBitmapMemoryCacheProducer", map0);
                l00.a(j00, "PostprocessedBitmapMemoryCacheProducer", true);
                j00.o("memory_bitmap", "postprocessed");
                n0.c(1.0f);
                n0.b(a0, 1);
                a0.close();
                return;
            }
            boolean z = j00.b().C(2);
            com.facebook.imagepipeline.producers.c0.a c0$a0 = new com.facebook.imagepipeline.producers.c0.a(n0, e0, f0 instanceof g, this.a, z);
            if(l00.f(j00, "PostprocessedBitmapMemoryCacheProducer")) {
                map0 = j.of("cached_value_found", "false");
            }
            l00.j(j00, "PostprocessedBitmapMemoryCacheProducer", map0);
            this.c.a(c0$a0, j00);
            return;
        }
        this.c.a(n0, j00);
    }

    protected String c() [...] // Inlined contents
}

