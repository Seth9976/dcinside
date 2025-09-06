package kotlinx.coroutines.flow.internal;

import A3.p;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.n;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;

public final class w {
    final class a extends H implements p, n {
        public static final a a;

        static {
            a.a = new a();
        }

        a() {
            super(3, j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @m
        public final Object a(@l j j0, @m Object object0, @l d d0) {
            return j0.emit(object0, d0);
        }

        @Override  // A3.p
        public Object invoke(Object object0, Object object1, Object object2) {
            return this.a(((j)object0), object1, ((d)object2));
        }
    }

    @l
    private static final p a;

    static {
        L.n(a.a, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        w.a = (p)v0.q(a.a, 3);
    }

    private static void b() {
    }
}

