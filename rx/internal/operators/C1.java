package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.functions.q;
import rx.g.b;
import rx.g;
import rx.i;
import rx.n;
import rx.schedulers.c;
import rx.subscriptions.e;

public final class c1 implements b {
    static final class a extends n {
        final n f;
        final q g;
        final rx.j.a h;
        final e i;
        final rx.internal.producers.a j;
        final AtomicInteger k;

        public a(n n0, q q0, rx.j.a j$a0, e e0, rx.internal.producers.a a0) {
            this.k = new AtomicInteger();
            this.f = n0;
            this.g = q0;
            this.h = j$a0;
            this.i = e0;
            this.j = a0;
        }

        @Override  // rx.h
        public void d() {
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.x(((g)object0));
        }

        public void x(g g0) {
            class rx.internal.operators.c1.a.a implements rx.functions.a {
                final g a;
                final a b;

                rx.internal.operators.c1.a.a(g g0) {
                    this.a = g0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    class rx.internal.operators.c1.a.a.a extends n {
                        boolean f;
                        final rx.functions.a g;
                        final rx.internal.operators.c1.a.a h;

                        rx.internal.operators.c1.a.a.a(rx.functions.a a0) {
                            this.g = a0;
                            super();
                        }

                        @Override  // rx.n
                        public void X(i i0) {
                            a.this.j.c(i0);
                        }

                        @Override  // rx.h
                        public void d() {
                            if(!this.f) {
                                this.f = true;
                                a.this.f.d();
                            }
                        }

                        @Override  // rx.h
                        public void onError(Throwable throwable0) {
                            if(!this.f) {
                                this.f = true;
                                Integer integer0 = a.this.k.get();
                                if(((Boolean)a.this.g.p(integer0, throwable0)).booleanValue() && !a.this.h.j()) {
                                    a.this.h.c(this.g);
                                    return;
                                }
                                a.this.f.onError(throwable0);
                            }
                        }

                        @Override  // rx.h
                        public void onNext(Object object0) {
                            if(!this.f) {
                                a.this.f.onNext(object0);
                                a.this.j.b(1L);
                            }
                        }
                    }

                    a.this.k.incrementAndGet();
                    rx.internal.operators.c1.a.a.a c1$a$a$a0 = new rx.internal.operators.c1.a.a.a(this, this);
                    a.this.i.b(c1$a$a$a0);
                    this.a.N6(c1$a$a$a0);
                }
            }

            rx.internal.operators.c1.a.a c1$a$a0 = new rx.internal.operators.c1.a.a(this, g0);
            this.h.c(c1$a$a0);
        }
    }

    final q a;

    public c1(q q0) {
        this.a = q0;
    }

    public n a(n n0) {
        rx.j.a j$a0 = c.m().a();
        n0.q(j$a0);
        e e0 = new e();
        n0.q(e0);
        rx.internal.producers.a a0 = new rx.internal.producers.a();
        n0.X(a0);
        return new a(n0, this.a, j$a0, e0, a0);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

