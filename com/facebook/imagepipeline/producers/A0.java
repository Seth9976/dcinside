package com.facebook.imagepipeline.producers;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.e;
import com.facebook.common.internal.q;
import com.facebook.common.memory.j;
import com.facebook.imagepipeline.common.b;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.request.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class a0 implements h0 {
    static class c extends u {
        private final q i;
        private final e j;
        private final j k;
        private final com.facebook.common.memory.a l;
        @h
        private final l m;
        private final boolean n;
        private static final int o = 0x4000;

        private c(com.facebook.imagepipeline.producers.n n0, q q0, e e0, j j0, com.facebook.common.memory.a a0, @h l l0, boolean z) {
            super(n0);
            this.i = q0;
            this.j = e0;
            this.k = j0;
            this.l = a0;
            this.m = l0;
            this.n = z;
        }

        c(com.facebook.imagepipeline.producers.n n0, q q0, e e0, j j0, com.facebook.common.memory.a a0, l l0, boolean z, b0 b00) {
            this(n0, q0, e0, j0, a0, l0, z);
        }

        @Override  // com.facebook.imagepipeline.producers.c
        public void i(@h Object object0, int v) {
            this.t(((l)object0), v);
        }

        private void r(InputStream inputStream0, OutputStream outputStream0, int v) throws IOException {
            byte[] arr_b = (byte[])this.l.get(0x4000);
            int v1 = v;
            try {
                while(v1 > 0) {
                    int v3 = inputStream0.read(arr_b, 0, Math.min(0x4000, v1));
                    if(v3 < 0) {
                        break;
                    }
                    if(v3 > 0) {
                        outputStream0.write(arr_b, 0, v3);
                        v1 -= v3;
                    }
                }
            }
            finally {
                this.l.a(arr_b);
            }
            if(v1 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", v, v1));
            }
        }

        private com.facebook.common.memory.l s(l l0, l l1) throws IOException {
            int v = ((b)com.facebook.common.internal.n.i(l1.i())).a;
            int v1 = l1.getSize();
            com.facebook.common.memory.l l2 = this.k.d(v1 + v);
            this.r(l0.p(), l2, v);
            this.r(l1.p(), l2, l1.getSize());
            return l2;
        }

        public void t(@h l l0, int v) {
            if(com.facebook.imagepipeline.producers.c.f(v)) {
                return;
            }
            if(this.m != null && l0 != null && l0.i() != null) {
                try {
                    this.u(this.s(this.m, l0));
                }
                catch(IOException iOException0) {
                    x0.a.v("PartialDiskCacheProducer", "Error while merging image data", iOException0);
                    this.q().onFailure(iOException0);
                }
                finally {
                    l0.close();
                    this.m.close();
                }
                ((com.facebook.imagepipeline.core.c)this.i.get()).c().A(this.j);
                return;
            }
            if(this.n && com.facebook.imagepipeline.producers.c.n(v, 8) && com.facebook.imagepipeline.producers.c.e(v) && l0 != null && l0.n() != X0.c.d) {
                ((com.facebook.imagepipeline.core.c)this.i.get()).c().x(this.j, l0);
                this.q().b(l0, v);
                return;
            }
            this.q().b(l0, v);
        }

        private void u(com.facebook.common.memory.l l0) {
            Throwable throwable1;
            l l1;
            com.facebook.common.references.a a0 = com.facebook.common.references.a.t(l0.a());
            try {
                l1 = new l(a0);
            }
            catch(Throwable throwable0) {
                l1 = null;
                throwable1 = throwable0;
                l.c(l1);
                com.facebook.common.references.a.j(a0);
                throw throwable1;
            }
            try {
                l1.T();
                this.q().b(l1, 1);
            }
            catch(Throwable throwable1) {
                l.c(l1);
                com.facebook.common.references.a.j(a0);
                throw throwable1;
            }
            l.c(l1);
            com.facebook.common.references.a.j(a0);
        }
    }

    private final q a;
    private final com.facebook.imagepipeline.cache.n b;
    private final j c;
    private final com.facebook.common.memory.a d;
    private final h0 e;
    public static final String f = "PartialDiskCacheProducer";
    public static final String g = "cached_value_found";
    public static final String h = "encodedImageSize";

    public a0(q q0, com.facebook.imagepipeline.cache.n n0, j j0, com.facebook.common.memory.a a0, h0 h00) {
        this.a = q0;
        this.b = n0;
        this.c = j0;
        this.d = a0;
        this.e = h00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        d d0 = j00.b();
        boolean z = j00.b().C(16);
        if(!z && !j00.b().C(0x20)) {
            this.e.a(n0, j00);
            return;
        }
        l0 l00 = j00.i();
        l00.b(j00, "PartialDiskCacheProducer");
        Uri uri0 = a0.e(d0);
        Object object0 = j00.c();
        e e0 = this.b.d(d0, uri0, object0);
        if(!z) {
            l00.j(j00, "PartialDiskCacheProducer", a0.f(l00, j00, false, 0));
            this.i(n0, j00, e0, null);
            return;
        }
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        ((com.facebook.imagepipeline.core.c)this.a.get()).c().r(e0, atomicBoolean0).q(this.h(n0, j00, e0));
        this.j(atomicBoolean0, j00);
    }

    private static Uri e(d d0) {
        return d0.z().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    @VisibleForTesting
    @h
    static Map f(l0 l00, j0 j00, boolean z, int v) {
        if(!l00.f(j00, "PartialDiskCacheProducer")) {
            return null;
        }
        return z ? com.facebook.common.internal.j.of("cached_value_found", "true", "encodedImageSize", String.valueOf(v)) : com.facebook.common.internal.j.of("cached_value_found", "false");
    }

    // 去混淆评级： 低(30)
    private static boolean g(bolts.j j0) {
        return j0.H() || j0.J() && j0.E() instanceof CancellationException;
    }

    private bolts.h h(com.facebook.imagepipeline.producers.n n0, j0 j00, e e0) {
        class com.facebook.imagepipeline.producers.a0.a implements bolts.h {
            final l0 a;
            final j0 b;
            final com.facebook.imagepipeline.producers.n c;
            final e d;
            final a0 e;

            com.facebook.imagepipeline.producers.a0.a(l0 l00, j0 j00, com.facebook.imagepipeline.producers.n n0, e e0) {
                this.a = l00;
                this.b = j00;
                this.c = n0;
                this.d = e0;
                super();
            }

            @Override  // bolts.h
            @h
            public Object a(bolts.j j0) throws Exception {
                return this.b(j0);
            }

            @h
            public Void b(bolts.j j0) throws Exception {
                if(a0.g(j0)) {
                    this.a.d(this.b, "PartialDiskCacheProducer", null);
                    this.c.a();
                    return null;
                }
                if(j0.J()) {
                    Exception exception0 = j0.E();
                    this.a.k(this.b, "PartialDiskCacheProducer", exception0, null);
                    a0.this.i(this.c, this.b, this.d, null);
                    return null;
                }
                l l0 = (l)j0.F();
                if(l0 != null) {
                    int v = l0.getSize();
                    Map map0 = a0.f(this.a, this.b, true, v);
                    this.a.j(this.b, "PartialDiskCacheProducer", map0);
                    b b0 = b.l(l0.getSize() - 1);
                    l0.f0(b0);
                    int v1 = l0.getSize();
                    d d0 = this.b.b();
                    if(b0.e(d0.e())) {
                        this.b.o("disk", "partial");
                        this.a.a(this.b, "PartialDiskCacheProducer", true);
                        this.c.b(l0, 9);
                        return null;
                    }
                    this.c.b(l0, 8);
                    q0 q00 = new q0(com.facebook.imagepipeline.request.e.e(d0).D(b.h(v1 - 1)).b(), this.b);
                    a0.this.i(this.c, q00, this.d, l0);
                    return null;
                }
                Map map1 = a0.f(this.a, this.b, false, 0);
                this.a.j(this.b, "PartialDiskCacheProducer", map1);
                a0.this.i(this.c, this.b, this.d, null);
                return null;
            }
        }

        return new com.facebook.imagepipeline.producers.a0.a(this, j00.i(), j00, n0, e0);
    }

    private void i(com.facebook.imagepipeline.producers.n n0, j0 j00, e e0, @h l l0) {
        boolean z = j00.b().C(0x20);
        c a0$c0 = new c(n0, this.a, e0, this.c, this.d, l0, z, null);
        this.e.a(a0$c0, j00);
    }

    private void j(AtomicBoolean atomicBoolean0, j0 j00) {
        class com.facebook.imagepipeline.producers.a0.b extends f {
            final AtomicBoolean a;
            final a0 b;

            com.facebook.imagepipeline.producers.a0.b(AtomicBoolean atomicBoolean0) {
                this.a = atomicBoolean0;
                super();
            }

            @Override  // com.facebook.imagepipeline.producers.f
            public void b() {
                this.a.set(true);
            }
        }

        j00.n(new com.facebook.imagepipeline.producers.a0.b(this, atomicBoolean0));
    }
}

