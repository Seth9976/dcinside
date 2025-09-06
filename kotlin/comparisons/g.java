package kotlin.comparisons;

import A3.o;
import java.util.Comparator;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

class g {
    // 检测为 Lambda 实现
    private static final int A(Comparator comparator0, Comparator comparator1, Object object0, Object object1) [...]

    @f
    private static final Comparator B(Comparator comparator0, Comparator comparator1, Function1 function10) {
        public static final class kotlin.comparisons.g.f implements Comparator {
            final Comparator a;
            final Comparator b;
            final Function1 c;

            public kotlin.comparisons.g.f(Comparator comparator0, Comparator comparator1, Function1 function10) {
                this.a = comparator0;
                this.b = comparator1;
                this.c = function10;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v = this.a.compare(object0, object1);
                if(v == 0) {
                    Object object2 = this.c.invoke(object0);
                    Object object3 = this.c.invoke(object1);
                    return this.b.compare(object2, object3);
                }
                return v;
            }
        }

        L.p(comparator0, "<this>");
        L.p(comparator1, "comparator");
        L.p(function10, "selector");
        return new kotlin.comparisons.g.f(comparator0, comparator1, function10);
    }

    @f
    private static final Comparator C(Comparator comparator0, Function1 function10) {
        public static final class e implements Comparator {
            final Comparator a;
            final Function1 b;

            public e(Comparator comparator0, Function1 function10) {
                this.a = comparator0;
                this.b = function10;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v = this.a.compare(object0, object1);
                return v == 0 ? a.l(((Comparable)this.b.invoke(object0)), ((Comparable)this.b.invoke(object1))) : v;
            }
        }

        L.p(comparator0, "<this>");
        L.p(function10, "selector");
        return new e(comparator0, function10);
    }

    @f
    private static final Comparator D(Comparator comparator0, Comparator comparator1, Function1 function10) {
        public static final class h implements Comparator {
            final Comparator a;
            final Comparator b;
            final Function1 c;

            public h(Comparator comparator0, Comparator comparator1, Function1 function10) {
                this.a = comparator0;
                this.b = comparator1;
                this.c = function10;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v = this.a.compare(object0, object1);
                if(v == 0) {
                    Object object2 = this.c.invoke(object1);
                    Object object3 = this.c.invoke(object0);
                    return this.b.compare(object2, object3);
                }
                return v;
            }
        }

        L.p(comparator0, "<this>");
        L.p(comparator1, "comparator");
        L.p(function10, "selector");
        return new h(comparator0, comparator1, function10);
    }

    @f
    private static final Comparator E(Comparator comparator0, Function1 function10) {
        public static final class kotlin.comparisons.g.g implements Comparator {
            final Comparator a;
            final Function1 b;

            public kotlin.comparisons.g.g(Comparator comparator0, Function1 function10) {
                this.a = comparator0;
                this.b = function10;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v = this.a.compare(object0, object1);
                return v == 0 ? a.l(((Comparable)this.b.invoke(object1)), ((Comparable)this.b.invoke(object0))) : v;
            }
        }

        L.p(comparator0, "<this>");
        L.p(function10, "selector");
        return new kotlin.comparisons.g.g(comparator0, function10);
    }

    @f
    private static final Comparator F(Comparator comparator0, o o0) {
        public static final class i implements Comparator {
            final Comparator a;
            final o b;

            public i(Comparator comparator0, o o0) {
                this.a = comparator0;
                this.b = o0;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v = this.a.compare(object0, object1);
                return v == 0 ? ((Number)this.b.invoke(object0, object1)).intValue() : v;
            }
        }

        L.p(comparator0, "<this>");
        L.p(o0, "comparison");
        return new i(comparator0, o0);
    }

    @l
    public static final Comparator G(@l Comparator comparator0, @l Comparator comparator1) {
        L.p(comparator0, "<this>");
        L.p(comparator1, "comparator");
        return (Object object0, Object object1) -> {
            L.p(comparator0, "$this_thenDescending");
            L.p(comparator1, "$comparator");
            int v = comparator0.compare(object0, object1);
            return v == 0 ? comparator1.compare(object1, object0) : v;
        };
    }

    // 检测为 Lambda 实现
    private static final int H(Comparator comparator0, Comparator comparator1, Object object0, Object object1) [...]

    @f
    private static final Comparator f(Comparator comparator0, Function1 function10) {
        public static final class b implements Comparator {
            final Comparator a;
            final Function1 b;

            public b(Comparator comparator0, Function1 function10) {
                this.a = comparator0;
                this.b = function10;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                Object object2 = this.b.invoke(object0);
                Object object3 = this.b.invoke(object1);
                return this.a.compare(object2, object3);
            }
        }

        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        return new b(comparator0, function10);
    }

    @f
    private static final Comparator g(Function1 function10) {
        public static final class kotlin.comparisons.g.a implements Comparator {
            final Function1 a;

            public kotlin.comparisons.g.a(Function1 function10) {
                this.a = function10;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                return a.l(((Comparable)this.a.invoke(object0)), ((Comparable)this.a.invoke(object1)));
            }
        }

        L.p(function10, "selector");
        return new kotlin.comparisons.g.a(function10);
    }

    @l
    public static Comparator h(@l Function1[] arr_function1) {
        L.p(arr_function1, "selectors");
        if(arr_function1.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return (Object object0, Object object1) -> {
            L.p(arr_function1, "$selectors");
            return g.p(object0, object1, arr_function1);
        };
    }

    // 检测为 Lambda 实现
    private static final int i(Function1[] arr_function1, Object object0, Object object1) [...]

    @f
    private static final Comparator j(Comparator comparator0, Function1 function10) {
        public static final class d implements Comparator {
            final Comparator a;
            final Function1 b;

            public d(Comparator comparator0, Function1 function10) {
                this.a = comparator0;
                this.b = function10;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                Object object2 = this.b.invoke(object1);
                Object object3 = this.b.invoke(object0);
                return this.a.compare(object2, object3);
            }
        }

        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        return new d(comparator0, function10);
    }

    @f
    private static final Comparator k(Function1 function10) {
        public static final class c implements Comparator {
            final Function1 a;

            public c(Function1 function10) {
                this.a = function10;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                return a.l(((Comparable)this.a.invoke(object1)), ((Comparable)this.a.invoke(object0)));
            }
        }

        L.p(function10, "selector");
        return new c(function10);
    }

    public static int l(@m Comparable comparable0, @m Comparable comparable1) {
        if(comparable0 == comparable1) {
            return 0;
        }
        if(comparable0 == null) {
            return -1;
        }
        return comparable1 == null ? 1 : comparable0.compareTo(comparable1);
    }

    @f
    private static final int m(Object object0, Object object1, Comparator comparator0, Function1 function10) {
        L.p(comparator0, "comparator");
        L.p(function10, "selector");
        return comparator0.compare(function10.invoke(object0), function10.invoke(object1));
    }

    @f
    private static final int n(Object object0, Object object1, Function1 function10) {
        L.p(function10, "selector");
        return a.l(((Comparable)function10.invoke(object0)), ((Comparable)function10.invoke(object1)));
    }

    public static int o(Object object0, Object object1, @l Function1[] arr_function1) {
        L.p(arr_function1, "selectors");
        if(arr_function1.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return g.p(object0, object1, arr_function1);
    }

    private static final int p(Object object0, Object object1, Function1[] arr_function1) {
        for(int v = 0; v < arr_function1.length; ++v) {
            Function1 function10 = arr_function1[v];
            int v1 = a.l(((Comparable)function10.invoke(object0)), ((Comparable)function10.invoke(object1)));
            if(v1 != 0) {
                return v1;
            }
        }
        return 0;
    }

    @l
    public static Comparator q() {
        L.n(j.a, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return j.a;
    }

    @f
    private static final Comparator r() {
        return g.s(a.q());
    }

    @l
    public static final Comparator s(@l Comparator comparator0) {
        L.p(comparator0, "comparator");
        return (Object object0, Object object1) -> {
            L.p(comparator0, "$comparator");
            if(object0 == object1) {
                return 0;
            }
            if(object0 == null) {
                return -1;
            }
            return object1 == null ? 1 : comparator0.compare(object0, object1);
        };
    }

    // 检测为 Lambda 实现
    private static final int t(Comparator comparator0, Object object0, Object object1) [...]

    @f
    private static final Comparator u() {
        return g.v(a.q());
    }

    @l
    public static final Comparator v(@l Comparator comparator0) {
        L.p(comparator0, "comparator");
        return (Object object0, Object object1) -> {
            L.p(comparator0, "$comparator");
            if(object0 == object1) {
                return 0;
            }
            if(object0 == null) {
                return 1;
            }
            return object1 == null ? -1 : comparator0.compare(object0, object1);
        };
    }

    // 检测为 Lambda 实现
    private static final int w(Comparator comparator0, Object object0, Object object1) [...]

    @l
    public static Comparator x() {
        L.n(k.a, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return k.a;
    }

    @l
    public static final Comparator y(@l Comparator comparator0) {
        L.p(comparator0, "<this>");
        if(comparator0 instanceof kotlin.comparisons.l) {
            return ((kotlin.comparisons.l)comparator0).b();
        }
        j j0 = j.a;
        if(L.g(comparator0, j0)) {
            L.n(k.a, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return k.a;
        }
        if(L.g(comparator0, k.a)) {
            L.n(j0, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return j0;
        }
        return new kotlin.comparisons.l(comparator0);
    }

    @l
    public static final Comparator z(@l Comparator comparator0, @l Comparator comparator1) {
        L.p(comparator0, "<this>");
        L.p(comparator1, "comparator");
        return (Object object0, Object object1) -> {
            L.p(comparator0, "$this_then");
            L.p(comparator1, "$comparator");
            int v = comparator0.compare(object0, object1);
            return v == 0 ? comparator1.compare(object0, object1) : v;
        };
    }
}

