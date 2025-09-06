package com.dcinside.app.rx;

import A3.o;
import java.util.Iterator;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.r0;
import rx.g;
import y4.l;

public final class c implements rx.g.c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final c a() {
            c c0 = b.a.a();
            L.n(c0, "null cannot be cast to non-null type com.dcinside.app.rx.MapWithIndex<T of com.dcinside.app.rx.MapWithIndex.Companion.instance>");
            return c0;
        }
    }

    static final class b {
        @l
        public static final b a;
        @l
        private static final c b;

        static {
            b.a = new b();
            b.b = new c();
        }

        @l
        public final c a() {
            return b.b;
        }
    }

    static final class com.dcinside.app.rx.c.c implements B3.a, Iterable {
        public static final class com.dcinside.app.rx.c.c.a {
            private com.dcinside.app.rx.c.c.a() {
            }

            public com.dcinside.app.rx.c.c.a(w w0) {
            }

            @l
            public final com.dcinside.app.rx.c.c a() {
                return com.dcinside.app.rx.c.c.b.a.a();
            }
        }

        static final class com.dcinside.app.rx.c.c.b {
            @l
            public static final com.dcinside.app.rx.c.c.b a;
            @l
            private static final com.dcinside.app.rx.c.c b;

            static {
                com.dcinside.app.rx.c.c.b.a = new com.dcinside.app.rx.c.c.b();
                com.dcinside.app.rx.c.c.b.b = new com.dcinside.app.rx.c.c();
            }

            @l
            public final com.dcinside.app.rx.c.c a() {
                return com.dcinside.app.rx.c.c.b.b;
            }
        }

        @l
        public static final com.dcinside.app.rx.c.c.a a;

        static {
            com.dcinside.app.rx.c.c.a = new com.dcinside.app.rx.c.c.a(null);
        }

        @Override
        @l
        public Iterator iterator() {
            public static final class com.dcinside.app.rx.c.c.c implements B3.a, Iterator {
                private long a;

                @l
                public Long a() {
                    long v = this.a + 1L;
                    this.a = v;
                    return v;
                }

                @Override
                public boolean hasNext() {
                    return true;
                }

                @Override
                public Object next() {
                    return this.a();
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }

            return new com.dcinside.app.rx.c.c.c();
        }
    }

    @l
    public static final a a;

    static {
        c.a = new a(null);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.c(((g)object0));
    }

    @l
    public g c(@l g g0) {
        static final class d extends N implements o {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(2);
            }

            public final V a(Object object0, Long long0) {
                return r0.a(long0, object0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, ((Long)object1));
            }
        }

        L.p(g0, "source");
        g g1 = g0.y7(com.dcinside.app.rx.c.c.a.a(), (Object object0, Object object1) -> {
            L.p(d.e, "$tmp0");
            return (V)d.e.invoke(object0, object1);
        });
        L.o(g1, "zipWith(...)");
        return g1;
    }

    // 检测为 Lambda 实现
    private static final V d(o o0, Object object0, Object object1) [...]
}

