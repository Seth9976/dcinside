package kotlin;

import A3.a;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;

class j0 {
    @f
    private static final Void a() {
        throw new K(null, 1, null);
    }

    @f
    private static final Void b(String s) {
        L.p(s, "reason");
        throw new K("An operation is not implemented: " + s);
    }

    @h0(version = "1.1")
    @f
    private static final Object c(Object object0, Function1 function10) {
        L.p(function10, "block");
        function10.invoke(object0);
        return object0;
    }

    @f
    private static final Object d(Object object0, Function1 function10) {
        L.p(function10, "block");
        function10.invoke(object0);
        return object0;
    }

    @f
    private static final Object e(Object object0, Function1 function10) {
        L.p(function10, "block");
        return function10.invoke(object0);
    }

    @f
    private static final void f(int v, Function1 function10) {
        L.p(function10, "action");
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(v1);
        }
    }

    @f
    private static final Object g(a a0) {
        L.p(a0, "block");
        return a0.invoke();
    }

    @f
    private static final Object h(Object object0, Function1 function10) {
        L.p(function10, "block");
        return function10.invoke(object0);
    }

    @h0(version = "1.1")
    @f
    private static final Object i(Object object0, Function1 function10) {
        L.p(function10, "predicate");
        return ((Boolean)function10.invoke(object0)).booleanValue() ? object0 : null;
    }

    @h0(version = "1.1")
    @f
    private static final Object j(Object object0, Function1 function10) {
        L.p(function10, "predicate");
        return ((Boolean)function10.invoke(object0)).booleanValue() ? null : object0;
    }

    @f
    private static final Object k(Object object0, Function1 function10) {
        L.p(function10, "block");
        return function10.invoke(object0);
    }
}

