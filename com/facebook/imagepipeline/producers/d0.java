package com.facebook.imagepipeline.producers;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.j;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.g;
import com.facebook.imagepipeline.request.f;
import java.util.Map;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class d0 implements h0 {
    class com.facebook.imagepipeline.producers.d0.a extends u {
        private final l0 i;
        private final j0 j;
        private final f k;
        @p3.a("PostprocessorConsumer.this")
        private boolean l;
        @h
        @p3.a("PostprocessorConsumer.this")
        private com.facebook.common.references.a m;
        @p3.a("PostprocessorConsumer.this")
        private int n;
        @p3.a("PostprocessorConsumer.this")
        private boolean o;
        @p3.a("PostprocessorConsumer.this")
        private boolean p;
        final d0 q;

        public com.facebook.imagepipeline.producers.d0.a(com.facebook.imagepipeline.producers.n n0, l0 l00, f f0, j0 j00) {
            class com.facebook.imagepipeline.producers.d0.a.a extends com.facebook.imagepipeline.producers.f {
                final d0 a;
                final com.facebook.imagepipeline.producers.d0.a b;

                com.facebook.imagepipeline.producers.d0.a.a(d0 d00) {
                    this.a = d00;
                    super();
                }

                @Override  // com.facebook.imagepipeline.producers.f
                public void b() {
                    com.facebook.imagepipeline.producers.d0.a.this.D();
                }
            }

            super(n0);
            this.m = null;
            this.n = 0;
            this.o = false;
            this.p = false;
            this.i = l00;
            this.k = f0;
            this.j = j00;
            j00.n(new com.facebook.imagepipeline.producers.d0.a.a(this, d00));
        }

        private void A(com.facebook.common.references.a a0, int v) {
            com.facebook.common.internal.n.d(Boolean.valueOf(com.facebook.common.references.a.s(a0)));
            if(!this.J(((e)a0.n()))) {
                this.F(a0, v);
                return;
            }
            this.i.b(this.j, "PostprocessorProducer");
            com.facebook.common.references.a a1 = null;
            try {
                try {
                    a1 = this.H(((e)a0.n()));
                    goto label_14;
                }
                catch(Exception exception0) {
                }
                Map map0 = this.B(this.i, this.j, this.k);
                this.i.k(this.j, "PostprocessorProducer", exception0, map0);
                this.E(exception0);
            }
            catch(Throwable throwable0) {
                com.facebook.common.references.a.j(a1);
                throw throwable0;
            }
            com.facebook.common.references.a.j(null);
            return;
            try {
            label_14:
                Map map1 = this.B(this.i, this.j, this.k);
                this.i.j(this.j, "PostprocessorProducer", map1);
                this.F(a1, v);
            }
            catch(Throwable throwable0) {
                com.facebook.common.references.a.j(a1);
                throw throwable0;
            }
            com.facebook.common.references.a.j(a1);
        }

        @h
        private Map B(l0 l00, j0 j00, f f0) {
            return l00.f(j00, "PostprocessorProducer") ? j.of("Postprocessor", f0.getName()) : null;
        }

        private boolean C() {
            synchronized(this) {
            }
            return this.l;
        }

        private void D() {
            if(this.z()) {
                this.q().a();
            }
        }

        private void E(Throwable throwable0) {
            if(this.z()) {
                this.q().onFailure(throwable0);
            }
        }

        private void F(@h com.facebook.common.references.a a0, int v) {
            boolean z = c.e(v);
            if(!z && !this.C() || z && this.z()) {
                this.q().b(a0, v);
            }
        }

        protected void G(@h com.facebook.common.references.a a0, int v) {
            if(!com.facebook.common.references.a.s(a0)) {
                if(c.e(v)) {
                    this.F(null, v);
                }
                return;
            }
            this.L(a0, v);
        }

        private com.facebook.common.references.a H(e e0) {
            Bitmap bitmap0 = ((g)e0).D3();
            com.facebook.common.references.a a0 = this.k.b(bitmap0, d0.this.b);
            int v = ((g)e0).k3();
            int v1 = ((g)e0).A0();
            try {
                g g0 = com.facebook.imagepipeline.image.f.d(a0, e0.I(), v, v1);
                g0.k(((g)e0).getExtras());
                return com.facebook.common.references.a.t(g0);
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }

        private boolean I() {
            synchronized(this) {
                if(!this.l && this.o && !this.p && com.facebook.common.references.a.s(this.m)) {
                    this.p = true;
                    return true;
                }
                return false;
            }
        }

        private boolean J(e e0) {
            return e0 instanceof g;
        }

        private void K() {
            class b implements Runnable {
                final com.facebook.imagepipeline.producers.d0.a a;

                @Override
                public void run() {
                    int v1;
                    com.facebook.common.references.a a0;
                    synchronized(com.facebook.imagepipeline.producers.d0.a.this) {
                        a0 = com.facebook.imagepipeline.producers.d0.a.this.m;
                        v1 = com.facebook.imagepipeline.producers.d0.a.this.n;
                        com.facebook.imagepipeline.producers.d0.a.this.m = null;
                        com.facebook.imagepipeline.producers.d0.a.this.o = false;
                    }
                    if(com.facebook.common.references.a.s(a0)) {
                        try {
                            com.facebook.imagepipeline.producers.d0.a.this.A(a0, v1);
                        }
                        finally {
                            com.facebook.common.references.a.j(a0);
                        }
                    }
                    com.facebook.imagepipeline.producers.d0.a.this.y();
                }
            }

            d0.this.c.execute(new b(this));
        }

        private void L(@h com.facebook.common.references.a a0, int v) {
            com.facebook.common.references.a a1;
            synchronized(this) {
                if(this.l) {
                    return;
                }
                a1 = this.m;
                this.m = com.facebook.common.references.a.e(a0);
                this.n = v;
                this.o = true;
                boolean z = this.I();
            }
            com.facebook.common.references.a.j(a1);
            if(z) {
                this.K();
            }
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void g() {
            this.D();
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void h(Throwable throwable0) {
            this.E(throwable0);
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.G(((com.facebook.common.references.a)object0), v);
        }

        private void y() {
            synchronized(this) {
                this.p = false;
                boolean z = this.I();
            }
            if(z) {
                this.K();
            }
        }

        private boolean z() {
            com.facebook.common.references.a a0;
            synchronized(this) {
                if(this.l) {
                    return false;
                }
                a0 = this.m;
                this.m = null;
                this.l = true;
            }
            com.facebook.common.references.a.j(a0);
            return true;
        }
    }

    class com.facebook.imagepipeline.producers.d0.b extends u implements com.facebook.imagepipeline.request.h {
        @p3.a("RepeatedPostprocessorConsumer.this")
        private boolean i;
        @h
        @p3.a("RepeatedPostprocessorConsumer.this")
        private com.facebook.common.references.a j;
        final d0 k;

        private com.facebook.imagepipeline.producers.d0.b(com.facebook.imagepipeline.producers.d0.a d0$a0, com.facebook.imagepipeline.request.g g0, j0 j00) {
            class com.facebook.imagepipeline.producers.d0.b.a extends com.facebook.imagepipeline.producers.f {
                final d0 a;
                final com.facebook.imagepipeline.producers.d0.b b;

                com.facebook.imagepipeline.producers.d0.b.a(d0 d00) {
                    this.a = d00;
                    super();
                }

                @Override  // com.facebook.imagepipeline.producers.f
                public void b() {
                    if(com.facebook.imagepipeline.producers.d0.b.this.s()) {
                        com.facebook.imagepipeline.producers.d0.b.this.q().a();
                    }
                }
            }

            super(d0$a0);
            this.i = false;
            this.j = null;
            g0.c(this);
            j00.n(new com.facebook.imagepipeline.producers.d0.b.a(this, d00));
        }

        com.facebook.imagepipeline.producers.d0.b(com.facebook.imagepipeline.producers.d0.a d0$a0, com.facebook.imagepipeline.request.g g0, j0 j00, e0 e00) {
            this(d0$a0, g0, j00);
        }

        @Override  // com.facebook.imagepipeline.request.h
        public void d() {
            synchronized(this) {
                this.v();
            }
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void g() {
            if(this.s()) {
                this.q().a();
            }
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void h(Throwable throwable0) {
            if(this.s()) {
                this.q().onFailure(throwable0);
            }
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(Object object0, int v) {
            this.t(((com.facebook.common.references.a)object0), v);
        }

        private boolean s() {
            com.facebook.common.references.a a0;
            synchronized(this) {
                if(this.i) {
                    return false;
                }
                a0 = this.j;
                this.j = null;
                this.i = true;
            }
            com.facebook.common.references.a.j(a0);
            return true;
        }

        protected void t(com.facebook.common.references.a a0, int v) {
            if(c.f(v)) {
                return;
            }
            this.u(a0);
            this.v();
        }

        private void u(com.facebook.common.references.a a0) {
            com.facebook.common.references.a a1;
            synchronized(this) {
                if(this.i) {
                    return;
                }
                a1 = this.j;
                this.j = com.facebook.common.references.a.e(a0);
            }
            com.facebook.common.references.a.j(a1);
        }

        @SuppressLint({"WrongConstant"})
        private void v() {
            com.facebook.common.references.a a0;
            synchronized(this) {
                if(this.i) {
                    return;
                }
                a0 = com.facebook.common.references.a.e(this.j);
            }
            try {
                this.q().b(a0, 0);
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }
    }

    class com.facebook.imagepipeline.producers.d0.c extends u {
        final d0 i;

        private com.facebook.imagepipeline.producers.d0.c(com.facebook.imagepipeline.producers.d0.a d0$a0) {
            super(d0$a0);
        }

        com.facebook.imagepipeline.producers.d0.c(com.facebook.imagepipeline.producers.d0.a d0$a0, e0 e00) {
            this(d0$a0);
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.r(((com.facebook.common.references.a)object0), v);
        }

        protected void r(@h com.facebook.common.references.a a0, int v) {
            if(c.f(v)) {
                return;
            }
            this.q().b(a0, v);
        }
    }

    private final h0 a;
    private final com.facebook.imagepipeline.bitmaps.e b;
    private final Executor c;
    public static final String d = "PostprocessorProducer";
    @VisibleForTesting
    static final String e = "Postprocessor";

    public d0(h0 h00, com.facebook.imagepipeline.bitmaps.e e0, Executor executor0) {
        this.a = (h0)com.facebook.common.internal.n.i(h00);
        this.b = e0;
        this.c = (Executor)com.facebook.common.internal.n.i(executor0);
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        l0 l00 = j00.i();
        f f0 = j00.b().p();
        com.facebook.common.internal.n.i(f0);
        com.facebook.imagepipeline.producers.d0.a d0$a0 = new com.facebook.imagepipeline.producers.d0.a(this, n0, l00, f0, j00);
        com.facebook.imagepipeline.producers.d0.b d0$b0 = f0 instanceof com.facebook.imagepipeline.request.g ? new com.facebook.imagepipeline.producers.d0.b(this, d0$a0, ((com.facebook.imagepipeline.request.g)f0), j00, null) : new com.facebook.imagepipeline.producers.d0.c(this, d0$a0, null);
        this.a.a(d0$b0, j00);
    }
}

