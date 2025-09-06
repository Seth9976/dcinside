package kotlin;

import A3.a;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class f0 {
    @b0
    @h0(version = "1.3")
    @l
    public static final Object a(@l Throwable throwable0) {
        L.p(throwable0, "exception");
        return new b(throwable0);
    }

    @h0(version = "1.3")
    @f
    private static final Object b(Object object0, Function1 function10, Function1 function11) {
        L.p(function10, "onSuccess");
        L.p(function11, "onFailure");
        Throwable throwable0 = e0.e(object0);
        return throwable0 == null ? function10.invoke(object0) : function11.invoke(throwable0);
    }

    // 去混淆评级： 低(20)
    @h0(version = "1.3")
    @f
    private static final Object c(Object object0, Object object1) {
        return e0.i(object0) ? object1 : object0;
    }

    @h0(version = "1.3")
    @f
    private static final Object d(Object object0, Function1 function10) {
        L.p(function10, "onFailure");
        Throwable throwable0 = e0.e(object0);
        return throwable0 == null ? object0 : function10.invoke(throwable0);
    }

    @h0(version = "1.3")
    @f
    private static final Object e(Object object0) {
        f0.n(object0);
        return object0;
    }

    @h0(version = "1.3")
    @f
    private static final Object f(Object object0, Function1 function10) {
        L.p(function10, "transform");
        return e0.j(object0) ? e0.b(function10.invoke(object0)) : object0;
    }

    @h0(version = "1.3")
    @f
    private static final Object g(Object object0, Function1 function10) {
        L.p(function10, "transform");
        if(e0.j(object0)) {
            try {
                return e0.b(function10.invoke(object0));
            }
            catch(Throwable throwable0) {
                return e0.b(f0.a(throwable0));
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    private static final Object h(Object object0, Function1 function10) {
        L.p(function10, "action");
        Throwable throwable0 = e0.e(object0);
        if(throwable0 != null) {
            function10.invoke(throwable0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    private static final Object i(Object object0, Function1 function10) {
        L.p(function10, "action");
        if(e0.j(object0)) {
            function10.invoke(object0);
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    private static final Object j(Object object0, Function1 function10) {
        L.p(function10, "transform");
        Throwable throwable0 = e0.e(object0);
        return throwable0 == null ? object0 : e0.b(function10.invoke(throwable0));
    }

    @h0(version = "1.3")
    @f
    private static final Object k(Object object0, Function1 function10) {
        L.p(function10, "transform");
        Throwable throwable0 = e0.e(object0);
        if(throwable0 != null) {
            try {
                return e0.b(function10.invoke(throwable0));
            }
            catch(Throwable throwable1) {
                return e0.b(f0.a(throwable1));
            }
        }
        return object0;
    }

    @h0(version = "1.3")
    @f
    private static final Object l(a a0) {
        L.p(a0, "block");
        try {
            return e0.b(a0.invoke());
        }
        catch(Throwable throwable0) {
            return e0.b(f0.a(throwable0));
        }
    }

    @h0(version = "1.3")
    @f
    private static final Object m(Object object0, Function1 function10) {
        L.p(function10, "block");
        try {
            return e0.b(function10.invoke(object0));
        }
        catch(Throwable throwable0) {
            return e0.b(f0.a(throwable0));
        }
    }

    @b0
    @h0(version = "1.3")
    public static final void n(@l Object object0) {
        if(object0 instanceof b) {
            throw ((b)object0).a;
        }
    }
}

