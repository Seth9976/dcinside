package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.e;
import com.facebook.common.internal.j;
import com.facebook.common.internal.q;
import com.facebook.imagepipeline.cache.m;
import com.facebook.imagepipeline.core.c;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.request.d;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class w implements h0 {
    private final q a;
    private final com.facebook.imagepipeline.cache.n b;
    private final h0 c;
    public static final String d = "DiskCacheProducer";
    public static final String e = "cached_value_found";
    public static final String f = "encodedImageSize";

    public w(q q0, com.facebook.imagepipeline.cache.n n0, h0 h00) {
        this.a = q0;
        this.b = n0;
        this.c = h00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        d d0 = j00.b();
        if(!j00.b().C(16)) {
            this.g(n0, j00);
            return;
        }
        j00.i().b(j00, "DiskCacheProducer");
        Object object0 = j00.c();
        e e0 = this.b.b(d0, object0);
        c c0 = (c)this.a.get();
        m m0 = v.a(d0, c0.b(), c0.c(), c0.e());
        if(m0 == null) {
            j00.i().k(j00, "DiskCacheProducer", new com.facebook.imagepipeline.producers.v.a("Got no disk cache for CacheChoice: " + d0.f().ordinal().toString()), null);
            this.g(n0, j00);
            return;
        }
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        m0.r(e0, atomicBoolean0).q(this.h(n0, j00));
        this.i(atomicBoolean0, j00);
    }

    @VisibleForTesting
    @h
    static Map e(l0 l00, j0 j00, boolean z, int v) {
        if(!l00.f(j00, "DiskCacheProducer")) {
            return null;
        }
        return z ? j.of("cached_value_found", "true", "encodedImageSize", String.valueOf(v)) : j.of("cached_value_found", "false");
    }

    // 去混淆评级： 低(30)
    private static boolean f(bolts.j j0) {
        return j0.H() || j0.J() && j0.E() instanceof CancellationException;
    }

    private void g(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        if(j00.w().b() >= com.facebook.imagepipeline.request.d.d.c.b()) {
            j00.o("disk", "nil-result_read");
            n0.b(null, 1);
            return;
        }
        this.c.a(n0, j00);
    }

    private bolts.h h(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        class com.facebook.imagepipeline.producers.w.a implements bolts.h {
            final l0 a;
            final j0 b;
            final com.facebook.imagepipeline.producers.n c;
            final w d;

            com.facebook.imagepipeline.producers.w.a(l0 l00, j0 j00, com.facebook.imagepipeline.producers.n n0) {
                this.a = l00;
                this.b = j00;
                this.c = n0;
                super();
            }

            @Override  // bolts.h
            @h
            public Object a(bolts.j j0) throws Exception {
                return this.b(j0);
            }

            @h
            public Void b(bolts.j j0) throws Exception {
                if(w.f(j0)) {
                    this.a.d(this.b, "DiskCacheProducer", null);
                    this.c.a();
                    return null;
                }
                if(j0.J()) {
                    Exception exception0 = j0.E();
                    this.a.k(this.b, "DiskCacheProducer", exception0, null);
                    w.this.c.a(this.c, this.b);
                    return null;
                }
                l l0 = (l)j0.F();
                if(l0 != null) {
                    int v = l0.getSize();
                    Map map0 = w.e(this.a, this.b, true, v);
                    this.a.j(this.b, "DiskCacheProducer", map0);
                    this.a.a(this.b, "DiskCacheProducer", true);
                    this.b.q("disk");
                    this.c.c(1.0f);
                    this.c.b(l0, 1);
                    l0.close();
                    return null;
                }
                Map map1 = w.e(this.a, this.b, false, 0);
                this.a.j(this.b, "DiskCacheProducer", map1);
                w.this.c.a(this.c, this.b);
                return null;
            }
        }

        return new com.facebook.imagepipeline.producers.w.a(this, j00.i(), j00, n0);
    }

    private void i(AtomicBoolean atomicBoolean0, j0 j00) {
        class b extends f {
            final AtomicBoolean a;
            final w b;

            b(AtomicBoolean atomicBoolean0) {
                this.a = atomicBoolean0;
                super();
            }

            @Override  // com.facebook.imagepipeline.producers.f
            public void b() {
                this.a.set(true);
            }
        }

        j00.n(new b(this, atomicBoolean0));
    }
}

