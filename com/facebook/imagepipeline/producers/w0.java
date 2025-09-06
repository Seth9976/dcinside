package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class w0 implements h0 {
    class com.facebook.imagepipeline.producers.w0.a extends u {
        final w0 i;

        private com.facebook.imagepipeline.producers.w0.a(com.facebook.imagepipeline.producers.n n0) {
            super(n0);
        }

        com.facebook.imagepipeline.producers.w0.a(com.facebook.imagepipeline.producers.n n0, x0 x00) {
            this(n0);
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void g() {
            this.q().a();
            this.r();
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void h(Throwable throwable0) {
            this.q().onFailure(throwable0);
            this.r();
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.q().b(object0, v);
            if(c.e(v)) {
                this.r();
            }
        }

        private void r() {
            class com.facebook.imagepipeline.producers.w0.a.a implements Runnable {
                final Pair a;
                final com.facebook.imagepipeline.producers.w0.a b;

                com.facebook.imagepipeline.producers.w0.a.a(Pair pair0) {
                    this.a = pair0;
                    super();
                }

                @Override
                public void run() {
                    w0.this.g(((com.facebook.imagepipeline.producers.n)this.a.first), ((j0)this.a.second));
                }
            }

            Pair pair0;
            synchronized(w0.this) {
                pair0 = (Pair)w0.this.d.poll();
                if(pair0 == null) {
                    --w0.this.c;
                }
            }
            if(pair0 != null) {
                w0.this.e.execute(new com.facebook.imagepipeline.producers.w0.a.a(this, pair0));
            }
        }
    }

    private final h0 a;
    private final int b;
    @p3.a("this")
    private int c;
    @p3.a("this")
    private final ConcurrentLinkedQueue d;
    private final Executor e;
    public static final String f = "ThrottlingProducer";

    public w0(int v, Executor executor0, h0 h00) {
        this.b = v;
        this.e = (Executor)com.facebook.common.internal.n.i(executor0);
        this.a = (h0)com.facebook.common.internal.n.i(h00);
        this.d = new ConcurrentLinkedQueue();
        this.c = 0;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        j00.i().b(j00, "ThrottlingProducer");
        synchronized(this) {
            int v1 = this.c;
            boolean z = true;
            if(v1 >= this.b) {
                Pair pair0 = Pair.create(n0, j00);
                this.d.add(pair0);
            }
            else {
                this.c = v1 + 1;
                z = false;
            }
        }
        if(!z) {
            this.g(n0, j00);
        }
    }

    void g(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        j00.i().j(j00, "ThrottlingProducer", null);
        com.facebook.imagepipeline.producers.w0.a w0$a0 = new com.facebook.imagepipeline.producers.w0.a(this, n0, null);
        this.a.a(w0$a0, j00);
    }
}

