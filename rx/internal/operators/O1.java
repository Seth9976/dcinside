package rx.internal.operators;

import rx.g.a;
import rx.g;
import rx.i;
import rx.j;
import rx.n;

public final class o1 implements a {
    static final class rx.internal.operators.o1.a extends n implements rx.functions.a {
        final n f;
        final boolean g;
        final rx.j.a h;
        g i;
        Thread j;

        rx.internal.operators.o1.a(n n0, boolean z, rx.j.a j$a0, g g0) {
            this.f = n0;
            this.g = z;
            this.h = j$a0;
            this.i = g0;
        }

        @Override  // rx.n
        public void X(i i0) {
            class rx.internal.operators.o1.a.a implements i {
                final i a;
                final rx.internal.operators.o1.a b;

                rx.internal.operators.o1.a.a(i i0) {
                    this.a = i0;
                    super();
                }

                @Override  // rx.i
                public void request(long v) {
                    class rx.internal.operators.o1.a.a.a implements rx.functions.a {
                        final long a;
                        final rx.internal.operators.o1.a.a b;

                        rx.internal.operators.o1.a.a.a(long v) {
                            this.a = v;
                            super();
                        }

                        @Override  // rx.functions.a
                        public void call() {
                            rx.internal.operators.o1.a.a.this.a.request(this.a);
                        }
                    }

                    if(rx.internal.operators.o1.a.this.j != Thread.currentThread()) {
                        rx.internal.operators.o1.a o1$a0 = rx.internal.operators.o1.a.this;
                        if(o1$a0.g) {
                            rx.internal.operators.o1.a.a.a o1$a$a$a0 = new rx.internal.operators.o1.a.a.a(this, v);
                            o1$a0.h.c(o1$a$a$a0);
                            return;
                        }
                    }
                    this.a.request(v);
                }
            }

            rx.internal.operators.o1.a.a o1$a$a0 = new rx.internal.operators.o1.a.a(this, i0);
            this.f.X(o1$a$a0);
        }

        @Override  // rx.functions.a
        public void call() {
            g g0 = this.i;
            this.i = null;
            this.j = Thread.currentThread();
            g0.N6(this);
        }

        @Override  // rx.h
        public void d() {
            try {
                this.f.d();
            }
            finally {
                this.h.l();
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            try {
                this.f.onError(throwable0);
            }
            finally {
                this.h.l();
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.f.onNext(object0);
        }
    }

    final j a;
    final g b;
    final boolean c;

    public o1(g g0, j j0, boolean z) {
        this.a = j0;
        this.b = g0;
        this.c = z;
    }

    public void a(n n0) {
        rx.j.a j$a0 = this.a.a();
        rx.internal.operators.o1.a o1$a0 = new rx.internal.operators.o1.a(n0, this.c, j$a0, this.b);
        n0.q(o1$a0);
        n0.q(j$a0);
        j$a0.c(o1$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

