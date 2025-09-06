package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.f;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class f0 implements h0 {
    static class com.facebook.imagepipeline.producers.f0.a {
        final com.facebook.imagepipeline.producers.n a;
        final j0 b;
        final long c;

        com.facebook.imagepipeline.producers.f0.a(com.facebook.imagepipeline.producers.n n0, j0 j00, long v) {
            this.a = n0;
            this.b = j00;
            this.c = v;
        }
    }

    static class b implements Comparator {
        public int b(com.facebook.imagepipeline.producers.f0.a f0$a0, com.facebook.imagepipeline.producers.f0.a f0$a1) {
            f f0 = f0$a0.b.a();
            f f1 = f0$a1.b.a();
            if(f0 == f1) {
                return Double.compare(f0$a0.c, f0$a1.c);
            }
            return f0.ordinal() <= f1.ordinal() ? 1 : -1;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((com.facebook.imagepipeline.producers.f0.a)object0), ((com.facebook.imagepipeline.producers.f0.a)object1));
        }
    }

    class c extends u {
        final f0 i;

        private c(com.facebook.imagepipeline.producers.n n0) {
            super(n0);
        }

        c(com.facebook.imagepipeline.producers.n n0, g0 g00) {
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
            if(com.facebook.imagepipeline.producers.c.e(v)) {
                this.r();
            }
        }

        private void r() {
            class com.facebook.imagepipeline.producers.f0.c.a implements Runnable {
                final com.facebook.imagepipeline.producers.f0.a a;
                final c b;

                com.facebook.imagepipeline.producers.f0.c.a(com.facebook.imagepipeline.producers.f0.a f0$a0) {
                    this.a = f0$a0;
                    super();
                }

                @Override
                public void run() {
                    f0.this.h(this.a);
                }
            }

            com.facebook.imagepipeline.producers.f0.a f0$a0;
            synchronized(f0.this) {
                f0$a0 = (com.facebook.imagepipeline.producers.f0.a)f0.this.c.poll();
                if(f0$a0 == null) {
                    --f0.this.e;
                }
            }
            if(f0$a0 != null) {
                f0.this.d.execute(new com.facebook.imagepipeline.producers.f0.c.a(this, f0$a0));
            }
        }
    }

    private final h0 a;
    private final int b;
    @p3.a("this")
    private final Queue c;
    private final Executor d;
    @p3.a("this")
    private int e;
    public static final String f = "PriorityStarvingThrottlingProducer";

    public f0(int v, Executor executor0, h0 h00) {
        this.b = v;
        this.d = (Executor)com.facebook.common.internal.n.i(executor0);
        this.a = (h0)com.facebook.common.internal.n.i(h00);
        this.c = new PriorityQueue(11, new b());
        this.e = 0;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        long v = System.nanoTime();
        j00.i().b(j00, "PriorityStarvingThrottlingProducer");
        synchronized(this) {
            int v2 = this.e;
            boolean z = true;
            if(v2 >= this.b) {
                com.facebook.imagepipeline.producers.f0.a f0$a0 = new com.facebook.imagepipeline.producers.f0.a(n0, j00, v);
                this.c.add(f0$a0);
            }
            else {
                this.e = v2 + 1;
                z = false;
            }
        }
        if(!z) {
            this.h(new com.facebook.imagepipeline.producers.f0.a(n0, j00, v));
        }
    }

    private void h(com.facebook.imagepipeline.producers.f0.a f0$a0) {
        f0$a0.b.i().j(f0$a0.b, "PriorityStarvingThrottlingProducer", null);
        c f0$c0 = new c(this, f0$a0.a, null);
        this.a.a(f0$c0, f0$a0.b);
    }
}

