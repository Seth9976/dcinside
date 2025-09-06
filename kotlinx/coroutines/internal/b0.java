package kotlinx.coroutines.internal;

import A3.o;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.k1;
import y4.l;
import y4.m;
import z3.f;

public final class b0 {
    static final class a extends N implements o {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(2);
        }

        @m
        public final Object a(@m Object object0, @l b g$b0) {
            if(g$b0 instanceof k1) {
                Integer integer0 = object0 instanceof Integer ? ((Integer)object0) : null;
                int v = integer0 == null ? 1 : ((int)integer0);
                return v != 0 ? ((int)(v + 1)) : g$b0;
            }
            return object0;
        }

        @Override  // A3.o
        public Object invoke(Object object0, Object object1) {
            return this.a(object0, ((b)object1));
        }
    }

    static final class kotlinx.coroutines.internal.b0.b extends N implements o {
        public static final kotlinx.coroutines.internal.b0.b e;

        static {
            kotlinx.coroutines.internal.b0.b.e = new kotlinx.coroutines.internal.b0.b();
        }

        kotlinx.coroutines.internal.b0.b() {
            super(2);
        }

        @m
        public final k1 a(@m k1 k10, @l b g$b0) {
            if(k10 != null) {
                return k10;
            }
            return g$b0 instanceof k1 ? ((k1)g$b0) : null;
        }

        @Override  // A3.o
        public Object invoke(Object object0, Object object1) {
            return this.a(((k1)object0), ((b)object1));
        }
    }

    static final class c extends N implements o {
        public static final c e;

        static {
            c.e = new c();
        }

        c() {
            super(2);
        }

        @l
        public final h0 a(@l h0 h00, @l b g$b0) {
            if(g$b0 instanceof k1) {
                h00.a(((k1)g$b0), ((k1)g$b0).d1(h00.a));
            }
            return h00;
        }

        @Override  // A3.o
        public Object invoke(Object object0, Object object1) {
            return this.a(((h0)object0), ((b)object1));
        }
    }

    @l
    @f
    public static final V a;
    @l
    private static final o b;
    @l
    private static final o c;
    @l
    private static final o d;

    static {
        b0.a = new V("NO_THREAD_ELEMENTS");
        b0.b = a.e;
        b0.c = kotlinx.coroutines.internal.b0.b.e;
        b0.d = c.e;
    }

    public static final void a(@l g g0, @m Object object0) {
        if(object0 == b0.a) {
            return;
        }
        if(object0 instanceof h0) {
            ((h0)object0).b(g0);
            return;
        }
        Object object1 = g0.fold(null, b0.c);
        L.n(object1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((k1)object1).L(g0, object0);
    }

    @l
    public static final Object b(@l g g0) {
        Object object0 = g0.fold(0, b0.b);
        L.m(object0);
        return object0;
    }

    @m
    public static final Object c(@l g g0, @m Object object0) {
        if(object0 == null) {
            object0 = b0.b(g0);
        }
        if(object0 == 0) {
            return b0.a;
        }
        if(object0 instanceof Integer) {
            return g0.fold(new h0(g0, ((Number)object0).intValue()), b0.d);
        }
        L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((k1)object0).d1(g0);
    }
}

