package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.l;
import kotlin.h0;
import kotlin.reflect.d;
import kotlin.reflect.g;
import kotlin.reflect.h;
import kotlin.reflect.i;
import kotlin.reflect.k;
import kotlin.reflect.m;
import kotlin.reflect.p;
import kotlin.reflect.q;
import kotlin.reflect.r;
import kotlin.reflect.s;
import kotlin.reflect.t;
import kotlin.reflect.u;
import kotlin.reflect.v;

public class m0 {
    private static final n0 a = null;
    static final String b = " (Kotlin reflection is not available)";
    private static final d[] c;

    static {
        n0 n00 = null;
        try {
            n00 = (n0)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        }
        catch(ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException unused_ex) {
        }
        if(n00 == null) {
            n00 = new n0();
        }
        m0.a = n00;
        m0.c = new d[0];
    }

    @h0(version = "1.4")
    public static s A(Class class0) {
        d d0 = m0.d(class0);
        List list0 = Collections.emptyList();
        return m0.a.s(d0, list0, false);
    }

    @h0(version = "1.4")
    public static s B(Class class0, u u0) {
        d d0 = m0.d(class0);
        List list0 = Collections.singletonList(u0);
        return m0.a.s(d0, list0, false);
    }

    @h0(version = "1.4")
    public static s C(Class class0, u u0, u u1) {
        d d0 = m0.d(class0);
        List list0 = Arrays.asList(new u[]{u0, u1});
        return m0.a.s(d0, list0, false);
    }

    @h0(version = "1.4")
    public static s D(Class class0, u[] arr_u) {
        d d0 = m0.d(class0);
        List list0 = l.Ky(arr_u);
        return m0.a.s(d0, list0, false);
    }

    @h0(version = "1.4")
    public static s E(g g0) {
        List list0 = Collections.emptyList();
        return m0.a.s(g0, list0, false);
    }

    @h0(version = "1.4")
    public static t F(Object object0, String s, v v0, boolean z) {
        return m0.a.t(object0, s, v0, z);
    }

    public static d a(Class class0) {
        return m0.a.a(class0);
    }

    public static d b(Class class0, String s) {
        return m0.a.b(class0, s);
    }

    public static i c(G g0) {
        return g0;
    }

    public static d d(Class class0) [...] // Inlined contents

    public static d e(Class class0, String s) {
        return m0.a.e(class0, s);
    }

    public static d[] f(Class[] arr_class) {
        if(arr_class.length == 0) {
            return m0.c;
        }
        d[] arr_d = new d[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_d[v] = m0.d(arr_class[v]);
        }
        return arr_d;
    }

    @h0(version = "1.4")
    public static h g(Class class0) {
        return m0.a.f(class0, "");
    }

    public static h h(Class class0, String s) {
        return m0.a.f(class0, s);
    }

    @h0(version = "1.6")
    public static s i(s s0) {
        return m0.a.g(s0);
    }

    public static k j(V v0) {
        return v0;
    }

    public static kotlin.reflect.l k(X x0) {
        return x0;
    }

    public static m l(Z z0) {
        return z0;
    }

    @h0(version = "1.6")
    public static s m(s s0) {
        return m0.a.k(s0);
    }

    @h0(version = "1.4")
    public static s n(Class class0) {
        d d0 = m0.d(class0);
        List list0 = Collections.emptyList();
        return m0.a.s(d0, list0, true);
    }

    @h0(version = "1.4")
    public static s o(Class class0, u u0) {
        d d0 = m0.d(class0);
        List list0 = Collections.singletonList(u0);
        return m0.a.s(d0, list0, true);
    }

    @h0(version = "1.4")
    public static s p(Class class0, u u0, u u1) {
        d d0 = m0.d(class0);
        List list0 = Arrays.asList(new u[]{u0, u1});
        return m0.a.s(d0, list0, true);
    }

    @h0(version = "1.4")
    public static s q(Class class0, u[] arr_u) {
        d d0 = m0.d(class0);
        List list0 = l.Ky(arr_u);
        return m0.a.s(d0, list0, true);
    }

    @h0(version = "1.4")
    public static s r(g g0) {
        List list0 = Collections.emptyList();
        return m0.a.s(g0, list0, true);
    }

    @h0(version = "1.6")
    public static s s(s s0, s s1) {
        return m0.a.l(s0, s1);
    }

    public static p t(e0 e00) {
        return e00;
    }

    public static q u(g0 g00) {
        return g00;
    }

    public static r v(i0 i00) {
        return i00;
    }

    @h0(version = "1.3")
    public static String w(E e0) {
        return m0.a.p(e0);
    }

    @h0(version = "1.1")
    public static String x(N n0) {
        return m0.a.q(n0);
    }

    @h0(version = "1.4")
    public static void y(t t0, s s0) {
        List list0 = Collections.singletonList(s0);
        m0.a.r(t0, list0);
    }

    @h0(version = "1.4")
    public static void z(t t0, s[] arr_s) {
        List list0 = l.Ky(arr_s);
        m0.a.r(t0, list0);
    }
}

