package kotlin.jvm.internal;

import java.util.List;
import kotlin.h0;
import kotlin.reflect.d;
import kotlin.reflect.g;
import kotlin.reflect.h;
import kotlin.reflect.i;
import kotlin.reflect.k;
import kotlin.reflect.l;
import kotlin.reflect.m;
import kotlin.reflect.p;
import kotlin.reflect.q;
import kotlin.reflect.r;
import kotlin.reflect.s;
import kotlin.reflect.t;
import kotlin.reflect.v;

public class n0 {
    private static final String a = "kotlin.jvm.functions.";

    public d a(Class class0) {
        return new u(class0);
    }

    public d b(Class class0, String s) {
        return new u(class0);
    }

    public i c(G g0) [...] // Inlined contents

    public d d(Class class0) {
        return new u(class0);
    }

    public d e(Class class0, String s) {
        return new u(class0);
    }

    public h f(Class class0, String s) {
        return new c0(class0, s);
    }

    @h0(version = "1.6")
    public s g(s s0) {
        return new x0(s0.p(), s0.c(), ((x0)s0).z(), ((x0)s0).v() | 2);
    }

    public k h(V v0) [...] // Inlined contents

    public l i(X x0) [...] // Inlined contents

    public m j(Z z0) [...] // Inlined contents

    @h0(version = "1.6")
    public s k(s s0) {
        return new x0(s0.p(), s0.c(), ((x0)s0).z(), ((x0)s0).v() | 4);
    }

    @h0(version = "1.6")
    public s l(s s0, s s1) {
        return new x0(s0.p(), s0.c(), s1, ((x0)s0).v());
    }

    public p m(e0 e00) [...] // Inlined contents

    public q n(g0 g00) [...] // Inlined contents

    public r o(i0 i00) [...] // Inlined contents

    @h0(version = "1.3")
    public String p(E e0) {
        String s = e0.getClass().getGenericInterfaces()[0].toString();
        return s.startsWith("kotlin.jvm.functions.") ? s.substring(21) : s;
    }

    @h0(version = "1.1")
    public String q(N n0) {
        return this.p(n0);
    }

    @h0(version = "1.4")
    public void r(t t0, List list0) {
        ((w0)t0).f(list0);
    }

    @h0(version = "1.4")
    public s s(g g0, List list0, boolean z) {
        return new x0(g0, list0, z);
    }

    @h0(version = "1.4")
    public t t(Object object0, String s, v v0, boolean z) {
        return new w0(object0, s, v0, z);
    }
}

