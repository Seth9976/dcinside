package com.dcinside.app.rx;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rx.functions.p;
import rx.g;

public final class e {
    public static final class b implements p {
        private final Function1 a;

        public b(Function1 function10) {
            L.p(function10, "function");
            super();
            this.a = function10;
        }

        @Override  // rx.functions.p
        public final Object b(Object object0) {
            return this.a.invoke(object0);
        }
    }

    public static final d a(Object object0) {
        return new d(object0, null, 2, null);
    }

    public static final d b(Throwable throwable0) {
        L.p(throwable0, "<this>");
        return new d(null, throwable0, 1, null);
    }

    public static final g c(g g0) {
        @s0({"SMAP\nOptional.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Optional.kt\ncom/dcinside/app/rx/OptionalKt$asThrowNullObservable$1\n*L\n1#1,16:1\n*E\n"})
        public static final class a extends N implements Function1 {
            public static final a e;

            static {
                a.e = new a();
            }

            public a() {
                super(1);
            }

            public final g a(d d0) {
                if(d0.e() != null) {
                    return g.X1(d0.e());
                }
                return d0.f() == null ? g.X1(new NullPointerException("value is null")) : g.Q2(d0.f());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((d)object0));
            }
        }

        L.p(g0, "<this>");
        g g1 = g0.f2(new b(a.e));
        L.o(g1, "flatMap(...)");
        return g1;
    }
}

