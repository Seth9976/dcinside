package kotlinx.coroutines.flow;

import A3.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

final class s {
    static final class a extends N implements o {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(2);
        }

        @l
        public final Boolean a(@m Object object0, @m Object object1) {
            return Boolean.valueOf(L.g(object0, object1));
        }

        @Override  // A3.o
        public Object invoke(Object object0, Object object1) {
            return this.a(object0, object1);
        }
    }

    static final class b extends N implements Function1 {
        public static final b e;

        static {
            b.e = new b();
        }

        b() {
            super(1);
        }

        @Override  // kotlin.jvm.functions.Function1
        @m
        public final Object invoke(@m Object object0) {
            return object0;
        }
    }

    @l
    private static final Function1 a;
    @l
    private static final o b;

    static {
        s.a = b.e;
        s.b = a.e;
    }

    @l
    public static final i a(@l i i0) {
        return i0 instanceof U ? i0 : s.d(i0, s.a, s.b);
    }

    @l
    public static final i b(@l i i0, @l o o0) {
        L.n(o0, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        o o1 = (o)v0.q(o0, 2);
        return s.d(i0, s.a, o1);
    }

    @l
    public static final i c(@l i i0, @l Function1 function10) {
        return s.d(i0, function10, s.b);
    }

    private static final i d(i i0, Function1 function10, o o0) {
        return !(i0 instanceof g) || ((g)i0).b != function10 || ((g)i0).c != o0 ? new g(i0, function10, o0) : i0;
    }
}

