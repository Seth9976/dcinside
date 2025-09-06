package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.e;
import com.facebook.common.internal.j;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.image.m;
import com.facebook.imagepipeline.image.r;
import com.facebook.imagepipeline.request.d;
import com.facebook.imagepipeline.systrace.b;
import java.util.Map;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class i implements h0 {
    private final B a;
    private final com.facebook.imagepipeline.cache.n b;
    private final h0 c;
    public static final String d = "BitmapMemoryCacheProducer";
    public static final String e = "cached_value_found";
    private static final String f = "pipe_bg";

    public i(B b0, com.facebook.imagepipeline.cache.n n0, h0 h00) {
        this.a = b0;
        this.b = n0;
        this.c = h00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        Map map0;
        e e0;
        l0 l00;
        try {
            if(b.e()) {
                b.a("BitmapMemoryCacheProducer#produceResults");
            }
            l00 = j00.i();
            l00.b(j00, "BitmapMemoryCacheProducer");
            d d0 = j00.b();
            Object object0 = j00.c();
            e0 = this.b.c(d0, object0);
            map0 = null;
            com.facebook.common.references.a a0 = j00.b().C(1) ? this.a.get(e0) : null;
            if(a0 != null) {
                i.f(((m)a0.n()), j00);
                boolean z = ((com.facebook.imagepipeline.image.e)a0.n()).I().a();
                if(z) {
                    l00.j(j00, "BitmapMemoryCacheProducer", (l00.f(j00, "BitmapMemoryCacheProducer") ? j.of("cached_value_found", "true") : null));
                    l00.a(j00, "BitmapMemoryCacheProducer", true);
                    j00.o("memory_bitmap", "pipe_bg");
                    n0.c(1.0f);
                }
                n0.b(a0, z);
                a0.close();
                if(z) {
                    goto label_20;
                }
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_42;
        }
    label_20:
        if(b.e()) {
            b.c();
        }
        return;
        try {
        label_23:
            if(j00.w().b() < com.facebook.imagepipeline.request.d.d.e.b()) {
                com.facebook.imagepipeline.producers.n n1 = this.g(n0, e0, j00.b().C(2));
                if(l00.f(j00, "BitmapMemoryCacheProducer")) {
                    map0 = j.of("cached_value_found", "false");
                }
                l00.j(j00, "BitmapMemoryCacheProducer", map0);
                if(b.e()) {
                    b.a("mInputProducer.produceResult");
                }
                this.c.a(n1, j00);
                if(b.e()) {
                    b.c();
                }
                goto label_33;
            }
            goto label_36;
        }
        catch(Throwable throwable0) {
            goto label_42;
        }
    label_33:
        if(b.e()) {
            b.c();
        }
        return;
        try {
        label_36:
            l00.j(j00, "BitmapMemoryCacheProducer", (l00.f(j00, "BitmapMemoryCacheProducer") ? j.of("cached_value_found", "false") : null));
            l00.a(j00, "BitmapMemoryCacheProducer", false);
            j00.o("memory_bitmap", "pipe_bg");
            n0.b(null, 1);
            goto label_45;
        }
        catch(Throwable throwable0) {
        }
    label_42:
        if(b.e()) {
            b.c();
        }
        throw throwable0;
    label_45:
        if(b.e()) {
            b.c();
        }
    }

    protected String d() [...] // 潜在的解密器

    protected String e() [...] // 潜在的解密器

    private static void f(m m0, j0 j00) {
        j00.k(m0.getExtras());
    }

    protected com.facebook.imagepipeline.producers.n g(com.facebook.imagepipeline.producers.n n0, e e0, boolean z) {
        class com.facebook.imagepipeline.producers.i.a extends u {
            final e i;
            final boolean j;
            final i k;

            com.facebook.imagepipeline.producers.i.a(com.facebook.imagepipeline.producers.n n0, e e0, boolean z) {
                this.i = e0;
                this.j = z;
                super(n0);
            }

            @Override  // com.facebook.imagepipeline.producers.c
            public void i(@h Object object0, int v) {
                this.r(((com.facebook.common.references.a)object0), v);
            }

            public void r(@h com.facebook.common.references.a a0, int v) {
                com.facebook.common.references.a a2;
                com.facebook.common.references.a a1;
                try {
                    if(b.e()) {
                        b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                    }
                    boolean z = c.e(v);
                    a1 = null;
                    if(a0 != null) {
                        if(!((com.facebook.imagepipeline.image.e)a0.n()).V3() && !c.n(v, 8)) {
                            if(!z) {
                                a2 = i.this.a.get(this.i);
                                if(a2 != null) {
                                    goto label_9;
                                }
                            }
                            goto label_22;
                        }
                        goto label_37;
                    }
                    goto label_41;
                }
                catch(Throwable throwable0) {
                    goto label_45;
                }
                try {
                label_9:
                    r r0 = ((com.facebook.imagepipeline.image.e)a0.n()).I();
                    r r1 = ((com.facebook.imagepipeline.image.e)a2.n()).I();
                    if(r1.a() || r1.c() >= r0.c()) {
                        this.q().b(a2, v);
                        goto label_17;
                    }
                    goto label_21;
                }
                catch(Throwable throwable1) {
                    try {
                        com.facebook.common.references.a.j(a2);
                        throw throwable1;
                    label_17:
                        com.facebook.common.references.a.j(a2);
                    }
                    catch(Throwable throwable0) {
                        goto label_45;
                    }
                }
                if(b.e()) {
                    b.c();
                }
                return;
                try {
                label_21:
                    com.facebook.common.references.a.j(a2);
                label_22:
                    if(this.j) {
                        a1 = i.this.a.c(this.i, a0);
                    }
                    try {
                        if(z) {
                            this.q().c(1.0f);
                        }
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
                catch(Throwable throwable0) {
                    goto label_45;
                }
                if(b.e()) {
                    b.c();
                }
                return;
                try {
                label_37:
                    this.q().b(a0, v);
                }
                catch(Throwable throwable0) {
                    goto label_45;
                }
                if(b.e()) {
                    b.c();
                }
                return;
            label_41:
                if(z) {
                    try {
                        this.q().b(null, v);
                        goto label_48;
                    }
                    catch(Throwable throwable0) {
                    }
                label_45:
                    if(b.e()) {
                        b.c();
                    }
                    throw throwable0;
                }
            label_48:
                if(b.e()) {
                    b.c();
                }
            }
        }

        return new com.facebook.imagepipeline.producers.i.a(this, n0, e0, z);
    }
}

