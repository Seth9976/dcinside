package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.q;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.e;
import com.facebook.imagepipeline.request.d;
import com.facebook.imagepipeline.systrace.b;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class k implements h0 {
    static class com.facebook.imagepipeline.producers.k.a extends u {
        private final j0 i;
        private final B j;
        private final q k;
        private final com.facebook.imagepipeline.cache.n l;
        private final e m;
        private final e n;

        public com.facebook.imagepipeline.producers.k.a(com.facebook.imagepipeline.producers.n n0, j0 j00, B b0, q q0, com.facebook.imagepipeline.cache.n n1, e e0, e e1) {
            super(n0);
            this.i = j00;
            this.j = b0;
            this.k = q0;
            this.l = n1;
            this.m = e0;
            this.n = e1;
        }

        @Override  // com.facebook.imagepipeline.producers.c
        public void i(@h Object object0, int v) {
            this.r(((com.facebook.common.references.a)object0), v);
        }

        public void r(@h com.facebook.common.references.a a0, int v) {
            try {
                if(b.e()) {
                    b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if(!c.f(v) && a0 != null && !c.m(v, 8)) {
                    d d0 = this.i.b();
                    Object object0 = this.i.c();
                    com.facebook.cache.common.e e0 = this.l.b(d0, object0);
                    String s = (String)this.i.v("origin");
                    if(s != null && s.equals("memory_bitmap")) {
                        if(this.i.e().q().F() && !this.m.b(e0)) {
                            this.j.b(e0);
                            this.m.a(e0);
                        }
                        if(this.i.e().q().D() && !this.n.b(e0)) {
                            com.facebook.imagepipeline.core.c c0 = (com.facebook.imagepipeline.core.c)this.k.get();
                            (d0.f() == com.facebook.imagepipeline.request.d.b.a ? c0.c() : c0.b()).h(e0);
                            this.n.a(e0);
                        }
                    }
                    this.q().b(a0, v);
                    goto label_16;
                }
                goto label_19;
            }
            catch(Throwable throwable0) {
                goto label_22;
            }
        label_16:
            if(b.e()) {
                b.c();
            }
            return;
            try {
            label_19:
                this.q().b(a0, v);
                goto label_25;
            }
            catch(Throwable throwable0) {
            }
        label_22:
            if(b.e()) {
                b.c();
            }
            throw throwable0;
        label_25:
            if(b.e()) {
                b.c();
            }
        }
    }

    private final B a;
    private final q b;
    private final com.facebook.imagepipeline.cache.n c;
    private final h0 d;
    private final e e;
    private final e f;
    public static final String g = "BitmapProbeProducer";

    public k(B b0, q q0, com.facebook.imagepipeline.cache.n n0, e e0, e e1, h0 h00) {
        this.a = b0;
        this.b = q0;
        this.c = n0;
        this.e = e0;
        this.f = e1;
        this.d = h00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        try {
            if(b.e()) {
                b.a("BitmapProbeProducer#produceResults");
            }
            l0 l00 = j00.i();
            l00.b(j00, "BitmapProbeProducer");
            com.facebook.imagepipeline.producers.k.a k$a0 = new com.facebook.imagepipeline.producers.k.a(n0, j00, this.a, this.b, this.c, this.e, this.f);
            l00.j(j00, "BitmapProbeProducer", null);
            if(b.e()) {
                b.a("mInputProducer.produceResult");
            }
            this.d.a(k$a0, j00);
            if(b.e()) {
                b.c();
            }
        }
        finally {
            if(b.e()) {
                b.c();
            }
        }
    }

    protected String c() [...] // Inlined contents
}

