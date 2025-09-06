package rx.functions;

public final class A {
    private A() {
        throw new IllegalStateException("No instances!");
    }

    public static y a(a a0) {
        static final class b implements y {
            final a a;

            b(a a0) {
                this.a = a0;
                super();
            }

            public Void a(Object[] arr_object) {
                if(arr_object.length != 0) {
                    throw new IllegalArgumentException("Action0 expecting 0 arguments.");
                }
                this.a.call();
                return null;
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a(arr_object);
            }
        }

        return new b(a0);
    }

    public static y b(rx.functions.b b0) {
        static final class c implements y {
            final rx.functions.b a;

            c(rx.functions.b b0) {
                this.a = b0;
                super();
            }

            public Void a(Object[] arr_object) {
                if(arr_object.length != 1) {
                    throw new IllegalArgumentException("Action1 expecting 1 argument.");
                }
                this.a.b(arr_object[0]);
                return null;
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a(arr_object);
            }
        }

        return new c(b0);
    }

    public static y c(rx.functions.c c0) {
        static final class d implements y {
            final rx.functions.c a;

            d(rx.functions.c c0) {
                this.a = c0;
                super();
            }

            public Void a(Object[] arr_object) {
                if(arr_object.length != 2) {
                    throw new IllegalArgumentException("Action3 expecting 2 arguments.");
                }
                this.a.p(arr_object[0], arr_object[1]);
                return null;
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a(arr_object);
            }
        }

        return new d(c0);
    }

    public static y d(rx.functions.d d0) {
        static final class e implements y {
            final rx.functions.d a;

            e(rx.functions.d d0) {
                this.a = d0;
                super();
            }

            public Void a(Object[] arr_object) {
                if(arr_object.length != 3) {
                    throw new IllegalArgumentException("Action3 expecting 3 arguments.");
                }
                this.a.m(arr_object[0], arr_object[1], arr_object[2]);
                return null;
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a(arr_object);
            }
        }

        return new e(d0);
    }

    public static y e(o o0) {
        static final class f implements y {
            final o a;

            f(o o0) {
                this.a = o0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 0) {
                    throw new IllegalArgumentException("Func0 expecting 0 arguments.");
                }
                return this.a.call();
            }
        }

        return new f(o0);
    }

    public static y f(p p0) {
        static final class g implements y {
            final p a;

            g(p p0) {
                this.a = p0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 1) {
                    throw new IllegalArgumentException("Func1 expecting 1 argument.");
                }
                return this.a.b(arr_object[0]);
            }
        }

        return new g(p0);
    }

    public static y g(q q0) {
        static final class h implements y {
            final q a;

            h(q q0) {
                this.a = q0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 2) {
                    throw new IllegalArgumentException("Func2 expecting 2 arguments.");
                }
                return this.a.p(arr_object[0], arr_object[1]);
            }
        }

        return new h(q0);
    }

    public static y h(r r0) {
        static final class i implements y {
            final r a;

            i(r r0) {
                this.a = r0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 3) {
                    throw new IllegalArgumentException("Func3 expecting 3 arguments.");
                }
                return this.a.m(arr_object[0], arr_object[1], arr_object[2]);
            }
        }

        return new i(r0);
    }

    public static y i(s s0) {
        static final class j implements y {
            final s a;

            j(s s0) {
                this.a = s0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 4) {
                    throw new IllegalArgumentException("Func4 expecting 4 arguments.");
                }
                return this.a.n(arr_object[0], arr_object[1], arr_object[2], arr_object[3]);
            }
        }

        return new j(s0);
    }

    public static y j(t t0) {
        static final class k implements y {
            final t a;

            k(t t0) {
                this.a = t0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 5) {
                    throw new IllegalArgumentException("Func5 expecting 5 arguments.");
                }
                return this.a.f(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4]);
            }
        }

        return new k(t0);
    }

    public static y k(u u0) {
        static final class l implements y {
            final u a;

            l(u u0) {
                this.a = u0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 6) {
                    throw new IllegalArgumentException("Func6 expecting 6 arguments.");
                }
                return this.a.k(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5]);
            }
        }

        return new l(u0);
    }

    public static y l(v v0) {
        static final class m implements y {
            final v a;

            m(v v0) {
                this.a = v0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 7) {
                    throw new IllegalArgumentException("Func7 expecting 7 arguments.");
                }
                return this.a.i(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6]);
            }
        }

        return new m(v0);
    }

    public static y m(w w0) {
        static final class n implements y {
            final w a;

            n(w w0) {
                this.a = w0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 8) {
                    throw new IllegalArgumentException("Func8 expecting 8 arguments.");
                }
                return this.a.g(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6], arr_object[7]);
            }
        }

        return new n(w0);
    }

    public static y n(x x0) {
        static final class rx.functions.A.a implements y {
            final x a;

            rx.functions.A.a(x x0) {
                this.a = x0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                if(arr_object.length != 9) {
                    throw new IllegalArgumentException("Func9 expecting 9 arguments.");
                }
                return this.a.h(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6], arr_object[7], arr_object[8]);
            }
        }

        return new rx.functions.A.a(x0);
    }
}

