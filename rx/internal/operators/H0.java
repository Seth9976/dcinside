package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.g.a;
import rx.g;
import rx.i;
import rx.n;
import rx.subscriptions.e;

public final class h0 implements a {
    static final class rx.internal.operators.h0.a extends n {
        private final rx.internal.producers.a f;
        private final n g;

        rx.internal.operators.h0.a(n n0, rx.internal.producers.a a0) {
            this.g = n0;
            this.f = a0;
        }

        @Override  // rx.n
        public void X(i i0) {
            this.f.c(i0);
        }

        @Override  // rx.h
        public void d() {
            this.g.d();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.g.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.g.onNext(object0);
            this.f.b(1L);
        }
    }

    static final class b extends n {
        private boolean f;
        private final n g;
        private final e h;
        private final rx.internal.producers.a i;
        private final g j;
        final AtomicInteger k;
        volatile boolean l;

        b(n n0, e e0, rx.internal.producers.a a0, g g0) {
            this.f = true;
            this.g = n0;
            this.h = e0;
            this.i = a0;
            this.j = g0;
            this.k = new AtomicInteger();
        }

        @Override  // rx.n
        public void X(i i0) {
            this.i.c(i0);
        }

        @Override  // rx.h
        public void d() {
            if(!this.f) {
                this.g.d();
                return;
            }
            if(!this.g.j()) {
                this.l = false;
                this.x(null);
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.g.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.f = false;
            this.g.onNext(object0);
            this.i.b(1L);
        }

        void x(g g0) {
            if(this.k.getAndIncrement() == 0) {
                while(!this.g.j()) {
                    if(!this.l) {
                        if(g0 == null) {
                            rx.internal.operators.h0.a h0$a0 = new rx.internal.operators.h0.a(this.g, this.i);
                            this.h.b(h0$a0);
                            this.l = true;
                            this.j.N6(h0$a0);
                        }
                        else {
                            this.l = true;
                            g0.N6(this);
                            g0 = null;
                        }
                    }
                    if(this.k.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }
    }

    final g a;
    final g b;

    public h0(g g0, g g1) {
        this.a = g0;
        this.b = g1;
    }

    public void a(n n0) {
        e e0 = new e();
        rx.internal.producers.a a0 = new rx.internal.producers.a();
        b h0$b0 = new b(n0, e0, a0, this.b);
        e0.b(h0$b0);
        n0.q(e0);
        n0.X(a0);
        h0$b0.x(this.a);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

