package rx.internal.util;

import rx.internal.schedulers.b;
import rx.j.a;
import rx.j;
import rx.k.t;
import rx.k;
import rx.m;

public final class p extends k {
    static final class c implements t {
        private final b a;
        private final Object b;

        c(b b0, Object object0) {
            this.a = b0;
            this.b = object0;
        }

        public void a(m m0) {
            e p$e0 = new e(m0, this.b);
            m0.c(this.a.d(p$e0));
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((m)object0));
        }
    }

    static final class d implements t {
        private final j a;
        private final Object b;

        d(j j0, Object object0) {
            this.a = j0;
            this.b = object0;
        }

        public void a(m m0) {
            a j$a0 = this.a.a();
            m0.c(j$a0);
            j$a0.c(new e(m0, this.b));
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((m)object0));
        }
    }

    static final class e implements rx.functions.a {
        private final m a;
        private final Object b;

        e(m m0, Object object0) {
            this.a = m0;
            this.b = object0;
        }

        @Override  // rx.functions.a
        public void call() {
            try {
                this.a.e(this.b);
            }
            catch(Throwable throwable0) {
                this.a.onError(throwable0);
            }
        }
    }

    final Object b;

    protected p(Object object0) {
        class rx.internal.util.p.a implements t {
            final Object a;

            rx.internal.util.p.a(Object object0) {
            }

            public void a(m m0) {
                m0.e(this.a);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((m)object0));
            }
        }

        super(new rx.internal.util.p.a(object0));
        this.b = object0;
    }

    public static p P0(Object object0) {
        return new p(object0);
    }

    public Object Q0() {
        return this.b;
    }

    public k R0(rx.functions.p p0) {
        class rx.internal.util.p.b implements t {
            final rx.functions.p a;
            final p b;

            rx.internal.util.p.b(rx.functions.p p1) {
                this.a = p1;
                super();
            }

            public void a(m m0) {
                class rx.internal.util.p.b.a extends m {
                    final m b;
                    final rx.internal.util.p.b c;

                    rx.internal.util.p.b.a(m m0) {
                        this.b = m0;
                        super();
                    }

                    @Override  // rx.m
                    public void e(Object object0) {
                        this.b.e(object0);
                    }

                    @Override  // rx.m
                    public void onError(Throwable throwable0) {
                        this.b.onError(throwable0);
                    }
                }

                k k0 = (k)this.a.b(p.this.b);
                if(k0 instanceof p) {
                    m0.e(((p)k0).b);
                    return;
                }
                rx.internal.util.p.b.a p$b$a0 = new rx.internal.util.p.b.a(this, m0);
                m0.c(p$b$a0);
                k0.j0(p$b$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((m)object0));
            }
        }

        return k.n(new rx.internal.util.p.b(this, p0));
    }

    // 去混淆评级： 低(20)
    public k S0(j j0) {
        return j0 instanceof b ? k.n(new c(((b)j0), this.b)) : k.n(new d(j0, this.b));
    }
}

