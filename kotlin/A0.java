package kotlin;

import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.reflect.k;
import kotlin.reflect.l;
import kotlin.reflect.o;
import kotlin.reflect.p;
import kotlin.reflect.q;

public final class a0 {
    @h0(version = "1.4")
    @f
    private static final Object a(p p0, Object object0, o o0) {
        L.p(p0, "<this>");
        L.p(o0, "property");
        return p0.get();
    }

    @h0(version = "1.4")
    @f
    private static final Object b(q q0, Object object0, o o0) {
        L.p(q0, "<this>");
        L.p(o0, "property");
        return q0.get(object0);
    }

    @h0(version = "1.4")
    @f
    private static final void c(k k0, Object object0, o o0, Object object1) {
        L.p(k0, "<this>");
        L.p(o0, "property");
        k0.set(object1);
    }

    @h0(version = "1.4")
    @f
    private static final void d(l l0, Object object0, o o0, Object object1) {
        L.p(l0, "<this>");
        L.p(o0, "property");
        l0.Q(object0, object1);
    }
}

