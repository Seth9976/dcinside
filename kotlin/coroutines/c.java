package kotlin.coroutines;

import A3.o;
import java.io.Serializable;
import kotlin.S0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@h0(version = "1.3")
@s0({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class c implements Serializable, g {
    @s0({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12757#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    static final class a implements Serializable {
        public static final class kotlin.coroutines.c.a.a {
            private kotlin.coroutines.c.a.a() {
            }

            public kotlin.coroutines.c.a.a(w w0) {
            }
        }

        @l
        private final g[] a;
        @l
        public static final kotlin.coroutines.c.a.a b;
        private static final long c;

        static {
            a.b = new kotlin.coroutines.c.a.a(null);
        }

        public a(@l g[] arr_g) {
            L.p(arr_g, "elements");
            super();
            this.a = arr_g;
        }

        @l
        public final g[] a() {
            return this.a;
        }

        private final Object b() {
            g[] arr_g = this.a;
            g g0 = i.a;
            for(int v = 0; v < arr_g.length; ++v) {
                g0 = g0.plus(arr_g[v]);
            }
            return g0;
        }
    }

    @l
    private final g a;
    @l
    private final b b;

    public c(@l g g0, @l b g$b0) {
        L.p(g0, "left");
        L.p(g$b0, "element");
        super();
        this.a = g0;
        this.b = g$b0;
    }

    private final boolean b(b g$b0) {
        return L.g(this.get(g$b0.getKey()), g$b0);
    }

    private final boolean d(c c0) {
        g g0;
        while(true) {
            if(!this.b(c0.b)) {
                return false;
            }
            g0 = c0.a;
            if(!(g0 instanceof c)) {
                break;
            }
            c0 = (c)g0;
        }
        L.n(g0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        return this.b(((b)g0));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return this == object0 || object0 instanceof c && ((c)object0).g() == this.g() && ((c)object0).d(this);
    }

    @Override  // kotlin.coroutines.g
    public Object fold(Object object0, @l o o0) {
        L.p(o0, "operation");
        return o0.invoke(this.a.fold(object0, o0), this.b);
    }

    private final int g() {
        int v = 2;
        c c0 = this;
        while(true) {
            c0 = c0.a instanceof c ? ((c)c0.a) : null;
            if(c0 == null) {
                break;
            }
            ++v;
        }
        return v;
    }

    @Override  // kotlin.coroutines.g
    @m
    public b get(@l kotlin.coroutines.g.c g$c0) {
        g g0;
        L.p(g$c0, "key");
        for(c c0 = this; true; c0 = (c)g0) {
            b g$b0 = c0.b.get(g$c0);
            if(g$b0 != null) {
                return g$b0;
            }
            g0 = c0.a;
            if(!(g0 instanceof c)) {
                break;
            }
        }
        return g0.get(g$c0);
    }

    private final Object h() {
        static final class kotlin.coroutines.c.c extends N implements o {
            final g[] e;
            final f f;

            kotlin.coroutines.c.c(g[] arr_g, f l0$f0) {
                this.e = arr_g;
                this.f = l0$f0;
                super(2);
            }

            public final void a(S0 s00, b g$b0) {
                L.p(s00, "<anonymous parameter 0>");
                L.p(g$b0, "element");
                int v = this.f.a;
                this.f.a = v + 1;
                this.e[v] = g$b0;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((S0)object0), ((b)object1));
                return S0.a;
            }
        }

        int v = this.g();
        g[] arr_g = new g[v];
        f l0$f0 = new f();
        kotlin.coroutines.c.c c$c0 = new kotlin.coroutines.c.c(arr_g, l0$f0);
        this.fold(S0.a, c$c0);
        if(l0$f0.a != v) {
            throw new IllegalStateException("Check failed.");
        }
        return new a(arr_g);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override  // kotlin.coroutines.g
    @l
    public g minusKey(@l kotlin.coroutines.g.c g$c0) {
        L.p(g$c0, "key");
        if(this.b.get(g$c0) != null) {
            return this.a;
        }
        g g0 = this.a.minusKey(g$c0);
        if(g0 == this.a) {
            return this;
        }
        return g0 == i.a ? this.b : new c(g0, this.b);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return kotlin.coroutines.g.a.a(this, g0);
    }

    @Override
    @l
    public String toString() {
        static final class kotlin.coroutines.c.b extends N implements o {
            public static final kotlin.coroutines.c.b e;

            static {
                kotlin.coroutines.c.b.e = new kotlin.coroutines.c.b();
            }

            kotlin.coroutines.c.b() {
                super(2);
            }

            public final String a(String s, b g$b0) {
                L.p(s, "acc");
                L.p(g$b0, "element");
                return s.length() == 0 ? g$b0.toString() : s + ", " + g$b0;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((String)object0), ((b)object1));
            }
        }

        return '[' + ((String)this.fold("", kotlin.coroutines.c.b.e)) + ']';
    }
}

