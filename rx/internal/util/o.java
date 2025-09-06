package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.exceptions.c;
import rx.functions.p;
import rx.g.a;
import rx.g;
import rx.i;
import rx.internal.schedulers.b;
import rx.j;
import rx.n;
import rx.observers.h;

public final class o extends g {
    static final class d implements a {
        final Object a;

        d(Object object0) {
            this.a = object0;
        }

        public void a(n n0) {
            n0.X(o.B7(n0, this.a));
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((n)object0));
        }
    }

    static final class e implements a {
        final Object a;
        final p b;

        e(Object object0, p p0) {
            this.a = object0;
            this.b = p0;
        }

        public void a(n n0) {
            n0.X(new f(n0, this.a, this.b));
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((n)object0));
        }
    }

    static final class f extends AtomicBoolean implements rx.functions.a, i {
        final n a;
        final Object b;
        final p c;
        private static final long d = 0xDDC5E0DB04FDBA8DL;

        public f(n n0, Object object0, p p0) {
            this.a = n0;
            this.b = object0;
            this.c = p0;
        }

        @Override  // rx.functions.a
        public void call() {
            Object object0;
            n n0 = this.a;
            if(n0.j()) {
                return;
            }
            try {
                object0 = this.b;
                n0.onNext(object0);
            }
            catch(Throwable throwable0) {
                c.g(throwable0, n0, object0);
                return;
            }
            if(n0.j()) {
                return;
            }
            n0.d();
        }

        @Override  // rx.i
        public void request(long v) {
            int v1 = Long.compare(v, 0L);
            if(v1 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + v);
            }
            if(v1 != 0 && this.compareAndSet(false, true)) {
                rx.o o0 = (rx.o)this.c.b(this);
                this.a.q(o0);
            }
        }

        @Override
        public String toString() {
            return "ScalarAsyncProducer[" + this.b + ", " + this.get() + "]";
        }
    }

    static final class rx.internal.util.o.g implements i {
        final n a;
        final Object b;
        boolean c;

        public rx.internal.util.o.g(n n0, Object object0) {
            this.a = n0;
            this.b = object0;
        }

        @Override  // rx.i
        public void request(long v) {
            Object object0;
            if(this.c) {
                return;
            }
            int v1 = Long.compare(v, 0L);
            if(v1 < 0) {
                throw new IllegalStateException("n >= required but it was " + v);
            }
            if(v1 == 0) {
                return;
            }
            this.c = true;
            n n0 = this.a;
            if(n0.j()) {
                return;
            }
            try {
                object0 = this.b;
                n0.onNext(object0);
            }
            catch(Throwable throwable0) {
                c.g(throwable0, n0, object0);
                return;
            }
            if(n0.j()) {
                return;
            }
            n0.d();
        }
    }

    final Object b;
    static final boolean c;

    static {
        o.c = false;
    }

    protected o(Object object0) {
        super(rx.plugins.c.G(new d(object0)));
        this.b = object0;
    }

    public static o A7(Object object0) {
        return new o(object0);
    }

    static i B7(n n0, Object object0) {
        return o.c ? new rx.internal.producers.f(n0, object0) : new rx.internal.util.o.g(n0, object0);
    }

    public Object C7() {
        return this.b;
    }

    public g D7(p p0) {
        class rx.internal.util.o.c implements a {
            final p a;
            final o b;

            rx.internal.util.o.c(p p0) {
                this.a = p0;
                super();
            }

            public void a(n n0) {
                g g0 = (g)this.a.b(o.this.b);
                if(g0 instanceof o) {
                    n0.X(o.B7(n0, ((o)g0).b));
                    return;
                }
                g0.N6(h.f(n0));
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        return g.M6(new rx.internal.util.o.c(this, p0));
    }

    public g E7(j j0) {
        class rx.internal.util.o.a implements p {
            final b a;
            final o b;

            rx.internal.util.o.a(b b0) {
                this.a = b0;
                super();
            }

            public rx.o a(rx.functions.a a0) {
                return this.a.d(a0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((rx.functions.a)object0));
            }
        }


        class rx.internal.util.o.b implements p {
            final j a;
            final o b;

            rx.internal.util.o.b(j j0) {
                this.a = j0;
                super();
            }

            public rx.o a(rx.functions.a a0) {
                class rx.internal.util.o.b.a implements rx.functions.a {
                    final rx.functions.a a;
                    final rx.j.a b;
                    final rx.internal.util.o.b c;

                    rx.internal.util.o.b.a(rx.functions.a a0, rx.j.a j$a0) {
                        this.a = a0;
                        this.b = j$a0;
                        super();
                    }

                    @Override  // rx.functions.a
                    public void call() {
                        try {
                            this.a.call();
                        }
                        finally {
                            this.b.l();
                        }
                    }
                }

                rx.o o0 = this.a.a();
                ((rx.j.a)o0).c(new rx.internal.util.o.b.a(this, a0, ((rx.j.a)o0)));
                return o0;
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((rx.functions.a)object0));
            }
        }

        rx.internal.util.o.a o$a0;
        if(j0 instanceof b) {
            o$a0 = new rx.internal.util.o.a(this, ((b)j0));
            return g.M6(new e(this.b, o$a0));
        }
        o$a0 = new rx.internal.util.o.b(this, j0);
        return g.M6(new e(this.b, o$a0));
    }
}

