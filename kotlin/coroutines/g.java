package kotlin.coroutines;

import A3.o;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

@h0(version = "1.3")
public interface g {
    public static final class a {
        @l
        public static g a(@l g g0, @l g g1) {
            static final class kotlin.coroutines.g.a.a extends N implements o {
                public static final kotlin.coroutines.g.a.a e;

                static {
                    kotlin.coroutines.g.a.a.e = new kotlin.coroutines.g.a.a();
                }

                kotlin.coroutines.g.a.a() {
                    super(2);
                }

                public final g a(g g0, b g$b0) {
                    L.p(g0, "acc");
                    L.p(g$b0, "element");
                    g g1 = g0.minusKey(g$b0.getKey());
                    i i0 = i.a;
                    if(g1 != i0) {
                        kotlin.coroutines.e.b e$b0 = e.z8;
                        e e0 = (e)g1.get(e$b0);
                        if(e0 == null) {
                            return new c(g1, g$b0);
                        }
                        g g2 = g1.minusKey(e$b0);
                        return g2 == i0 ? new c(g$b0, e0) : new c(new c(g2, g$b0), e0);
                    }
                    return g$b0;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((g)object0), ((b)object1));
                }
            }

            L.p(g1, "context");
            return g1 == i.a ? g0 : ((g)g1.fold(g0, kotlin.coroutines.g.a.a.e));
        }
    }

    public interface b extends g {
        public static final class kotlin.coroutines.g.b.a {
            public static Object a(@l b g$b0, Object object0, @l o o0) {
                L.p(o0, "operation");
                return o0.invoke(object0, g$b0);
            }

            @m
            public static b b(@l b g$b0, @l kotlin.coroutines.g.c g$c0) {
                L.p(g$c0, "key");
                if(L.g(g$b0.getKey(), g$c0)) {
                    L.n(g$b0, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return g$b0;
                }
                return null;
            }

            @l
            public static g c(@l b g$b0, @l kotlin.coroutines.g.c g$c0) {
                L.p(g$c0, "key");
                return L.g(g$b0.getKey(), g$c0) ? i.a : g$b0;
            }

            @l
            public static g d(@l b g$b0, @l g g0) {
                L.p(g0, "context");
                return a.a(g$b0, g0);
            }
        }

        @Override  // kotlin.coroutines.g
        Object fold(Object arg1, @l o arg2);

        @Override  // kotlin.coroutines.g
        @m
        b get(@l kotlin.coroutines.g.c arg1);

        @l
        kotlin.coroutines.g.c getKey();

        @Override  // kotlin.coroutines.g
        @l
        g minusKey(@l kotlin.coroutines.g.c arg1);
    }

    public interface kotlin.coroutines.g.c {
    }

    Object fold(Object arg1, @l o arg2);

    @m
    b get(@l kotlin.coroutines.g.c arg1);

    @l
    g minusKey(@l kotlin.coroutines.g.c arg1);

    @l
    g plus(@l g arg1);
}

