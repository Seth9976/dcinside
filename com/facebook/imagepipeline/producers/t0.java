package com.facebook.imagepipeline.producers;

import android.os.Looper;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nThreadHandoffProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadHandoffProducer.kt\ncom/facebook/imagepipeline/producers/ThreadHandoffProducer\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,72:1\n40#2,9:73\n*S KotlinDebug\n*F\n+ 1 ThreadHandoffProducer.kt\ncom/facebook/imagepipeline/producers/ThreadHandoffProducer\n*L\n22#1:73,9\n*E\n"})
public final class t0 implements h0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        // 去混淆评级： 低(20)
        private final String c(j0 j00) {
            return e1.a.b() ? "ThreadHandoffProducer_produceResults_" + j00.getId() : null;
        }

        private final boolean d(j0 j00) {
            return j00.e().q().k() ? Looper.getMainLooper().getThread() != Thread.currentThread() : false;
        }
    }

    @l
    private final h0 a;
    @l
    private final u0 b;
    @l
    public static final a c = null;
    @l
    public static final String d = "BackgroundThreadHandoffProducer";

    static {
        t0.c = new a(null);
    }

    public t0(@l h0 h00, @l u0 u00) {
        L.p(h00, "inputProducer");
        L.p(u00, "threadHandoffProducerQueue");
        super();
        this.a = h00;
        this.b = u00;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(@l n n0, @l j0 j00) {
        public static final class b extends f {
            final r0 a;
            final t0 b;

            b(r0 r00, t0 t00) {
                this.a = r00;
                this.b = t00;
                super();
            }

            @Override  // com.facebook.imagepipeline.producers.f
            public void b() {
                this.a.a();
                this.b.d().a(this.a);
            }
        }


        public static final class c extends r0 {
            final n k;
            final l0 l;
            final j0 m;
            final t0 n;

            c(n n0, l0 l00, j0 j00, t0 t00) {
                this.k = n0;
                this.l = l00;
                this.m = j00;
                this.n = t00;
                super(n0, l00, j00, "BackgroundThreadHandoffProducer");
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected void b(Object object0) {
            }

            @Override  // com.facebook.common.executors.i
            protected Object c() throws Exception {
                return null;
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected void f(Object object0) {
                this.l.j(this.m, "BackgroundThreadHandoffProducer", null);
                this.n.c().a(this.k, this.m);
            }
        }

        L.p(n0, "consumer");
        L.p(j00, "context");
        if(!com.facebook.imagepipeline.systrace.b.e()) {
            l0 l00 = j00.i();
            a t0$a0 = t0.c;
            if(t0$a0.d(j00)) {
                l00.b(j00, "BackgroundThreadHandoffProducer");
                l00.j(j00, "BackgroundThreadHandoffProducer", null);
                this.a.a(n0, j00);
                return;
            }
            c t0$c0 = new c(n0, l00, j00, this);
            j00.n(new b(t0$c0, this));
            Runnable runnable0 = e1.a.a(t0$c0, t0$a0.c(j00));
            this.b.c(runnable0);
            return;
        }
        com.facebook.imagepipeline.systrace.b.a("ThreadHandoffProducer#produceResults");
        try {
            l0 l01 = j00.i();
            a t0$a1 = t0.c;
            if(t0$a1.d(j00)) {
                l01.b(j00, "BackgroundThreadHandoffProducer");
                l01.j(j00, "BackgroundThreadHandoffProducer", null);
                this.a.a(n0, j00);
                return;
            }
            c t0$c1 = new c(n0, l01, j00, this);
            j00.n(new b(t0$c1, this));
            Runnable runnable1 = e1.a.a(t0$c1, t0$a1.c(j00));
            this.b.c(runnable1);
        }
        finally {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @l
    public final h0 c() {
        return this.a;
    }

    @l
    public final u0 d() {
        return this.b;
    }
}

