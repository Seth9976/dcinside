package rx.functions;

public final class m {
    static final class l implements b {
        final a a;

        public l(a a0) {
            this.a = a0;
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a.call();
        }
    }

    static final class rx.functions.m.m implements a, b, c, d, e, f, g, h, i, j, rx.functions.l {
        @Override  // rx.functions.b
        public void b(Object object0) {
        }

        @Override  // rx.functions.a
        public void call() {
        }

        @Override  // rx.functions.l
        public void call(Object[] arr_object) {
        }

        @Override  // rx.functions.f
        public void f(Object object0, Object object1, Object object2, Object object3, Object object4) {
        }

        @Override  // rx.functions.i
        public void g(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        }

        @Override  // rx.functions.j
        public void h(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        }

        @Override  // rx.functions.h
        public void i(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
        }

        @Override  // rx.functions.g
        public void k(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        }

        @Override  // rx.functions.d
        public void m(Object object0, Object object1, Object object2) {
        }

        @Override  // rx.functions.e
        public void n(Object object0, Object object1, Object object2, Object object3) {
        }

        @Override  // rx.functions.c
        public void p(Object object0, Object object1) {
        }
    }

    static enum n implements b {
        INSTANCE;

        public void a(Throwable throwable0) {
            throw new rx.exceptions.g(throwable0);
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((Throwable)object0));
        }
    }

    private static final rx.functions.m.m a;

    static {
        m.a = new rx.functions.m.m();
    }

    private m() {
        throw new IllegalStateException("No instances!");
    }

    public static rx.functions.m.m a() {
        return m.a;
    }

    public static b b() {
        return n.a;
    }

    public static b c(a a0) {
        return new l(a0);
    }

    public static o d(a a0) {
        return m.e(a0, null);
    }

    public static o e(a a0, Object object0) {
        static final class rx.functions.m.c implements o {
            final a a;
            final Object b;

            rx.functions.m.c(a a0, Object object0) {
                this.a = a0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.o
            public Object call() {
                this.a.call();
                return this.b;
            }
        }

        return new rx.functions.m.c(a0, object0);
    }

    public static p f(b b0) {
        return m.g(b0, null);
    }

    public static p g(b b0, Object object0) {
        static final class rx.functions.m.d implements p {
            final b a;
            final Object b;

            rx.functions.m.d(b b0, Object object0) {
                this.a = b0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                this.a.b(object0);
                return this.b;
            }
        }

        return new rx.functions.m.d(b0, object0);
    }

    public static q h(c c0) {
        return m.i(c0, null);
    }

    public static q i(c c0, Object object0) {
        static final class rx.functions.m.e implements q {
            final c a;
            final Object b;

            rx.functions.m.e(c c0, Object object0) {
                this.a = c0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                this.a.p(object0, object1);
                return this.b;
            }
        }

        return new rx.functions.m.e(c0, object0);
    }

    public static r j(d d0) {
        return m.k(d0, null);
    }

    public static r k(d d0, Object object0) {
        static final class rx.functions.m.f implements r {
            final d a;
            final Object b;

            rx.functions.m.f(d d0, Object object0) {
                this.a = d0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.r
            public Object m(Object object0, Object object1, Object object2) {
                this.a.m(object0, object1, object2);
                return this.b;
            }
        }

        return new rx.functions.m.f(d0, object0);
    }

    public static s l(e e0) {
        return m.m(e0, null);
    }

    public static s m(e e0, Object object0) {
        static final class rx.functions.m.g implements s {
            final e a;
            final Object b;

            rx.functions.m.g(e e0, Object object0) {
                this.a = e0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.s
            public Object n(Object object0, Object object1, Object object2, Object object3) {
                this.a.n(object0, object1, object2, object3);
                return this.b;
            }
        }

        return new rx.functions.m.g(e0, object0);
    }

    public static t n(f f0) {
        return m.o(f0, null);
    }

    public static t o(f f0, Object object0) {
        static final class rx.functions.m.h implements t {
            final f a;
            final Object b;

            rx.functions.m.h(f f0, Object object0) {
                this.a = f0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.t
            public Object f(Object object0, Object object1, Object object2, Object object3, Object object4) {
                this.a.f(object0, object1, object2, object3, object4);
                return this.b;
            }
        }

        return new rx.functions.m.h(f0, object0);
    }

    public static u p(g g0) {
        return m.q(g0, null);
    }

    public static u q(g g0, Object object0) {
        static final class rx.functions.m.i implements u {
            final g a;
            final Object b;

            rx.functions.m.i(g g0, Object object0) {
                this.a = g0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.u
            public Object k(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
                this.a.k(object0, object1, object2, object3, object4, object5);
                return this.b;
            }
        }

        return new rx.functions.m.i(g0, object0);
    }

    public static v r(h h0) {
        return m.s(h0, null);
    }

    public static v s(h h0, Object object0) {
        static final class rx.functions.m.j implements v {
            final h a;
            final Object b;

            rx.functions.m.j(h h0, Object object0) {
                this.a = h0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.v
            public Object i(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
                this.a.i(object0, object1, object2, object3, object4, object5, object6);
                return this.b;
            }
        }

        return new rx.functions.m.j(h0, object0);
    }

    public static w t(i i0) {
        return m.u(i0, null);
    }

    public static w u(i i0, Object object0) {
        static final class k implements w {
            final i a;
            final Object b;

            k(i i0, Object object0) {
                this.a = i0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.w
            public Object g(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
                this.a.g(object0, object1, object2, object3, object4, object5, object6, object7);
                return this.b;
            }
        }

        return new k(i0, object0);
    }

    public static x v(j j0) {
        return m.w(j0, null);
    }

    public static x w(j j0, Object object0) {
        static final class rx.functions.m.a implements x {
            final j a;
            final Object b;

            rx.functions.m.a(j j0, Object object0) {
                this.a = j0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.x
            public Object h(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
                this.a.h(object0, object1, object2, object3, object4, object5, object6, object7, object8);
                return this.b;
            }
        }

        return new rx.functions.m.a(j0, object0);
    }

    public static y x(rx.functions.l l0) {
        return m.y(l0, null);
    }

    public static y y(rx.functions.l l0, Object object0) {
        static final class rx.functions.m.b implements y {
            final rx.functions.l a;
            final Object b;

            rx.functions.m.b(rx.functions.l l0, Object object0) {
                this.a = l0;
                this.b = object0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                this.a.call(arr_object);
                return this.b;
            }
        }

        return new rx.functions.m.b(l0, object0);
    }
}

