package com.facebook.imagepipeline.producers;

import android.graphics.ColorSpace;
import com.facebook.common.memory.j;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.request.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class N implements h0 {
    private final Executor a;
    private final j b;

    protected N(Executor executor0, j j0) {
        this.a = executor0;
        this.b = j0;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        class com.facebook.imagepipeline.producers.N.a extends r0 {
            final d k;
            final l0 l;
            final j0 m;
            final N n;

            com.facebook.imagepipeline.producers.N.a(com.facebook.imagepipeline.producers.n n1, l0 l00, j0 j00, String s, d d0, l0 l01, j0 j01) {
                this.k = d0;
                this.l = l01;
                this.m = j01;
                super(n1, l00, j00, s);
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected void b(@h Object object0) {
                this.j(((l)object0));
            }

            @Override  // com.facebook.common.executors.i
            @h
            protected Object c() throws Exception {
                return this.k();
            }

            protected void j(@h l l0) {
                l.c(l0);
            }

            @h
            protected l k() throws Exception {
                l l0 = N.this.d(this.k);
                if(l0 == null) {
                    String s = N.this.f();
                    this.l.a(this.m, s, false);
                    this.m.o("local", "fetch");
                    return null;
                }
                l0.T();
                String s1 = N.this.f();
                this.l.a(this.m, s1, true);
                this.m.o("local", "fetch");
                ColorSpace colorSpace0 = l0.j();
                this.m.f("image_color_space", colorSpace0);
                return l0;
            }
        }


        class b extends f {
            final r0 a;
            final N b;

            b(r0 r00) {
                this.a = r00;
                super();
            }

            @Override  // com.facebook.imagepipeline.producers.f
            public void b() {
                this.a.a();
            }
        }

        l0 l00 = j00.i();
        d d0 = j00.b();
        j00.o("local", "fetch");
        com.facebook.imagepipeline.producers.N.a n$a0 = new com.facebook.imagepipeline.producers.N.a(this, n0, l00, j00, this.f(), d0, l00, j00);
        j00.n(new b(this, n$a0));
        this.a.execute(n$a0);
    }

    protected l c(InputStream inputStream0, int v) throws IOException {
        com.facebook.common.references.a a0;
        try {
            a0 = v > 0 ? com.facebook.common.references.a.t(this.b.e(inputStream0, v)) : com.facebook.common.references.a.t(this.b.a(inputStream0));
            return new l(a0);
        }
        finally {
            com.facebook.common.internal.d.b(inputStream0);
            com.facebook.common.references.a.j(a0);
        }
    }

    @h
    protected abstract l d(d arg1) throws IOException;

    protected l e(InputStream inputStream0, int v) throws IOException {
        return this.c(inputStream0, v);
    }

    protected abstract String f();
}

