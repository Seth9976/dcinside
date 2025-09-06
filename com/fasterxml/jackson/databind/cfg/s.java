package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.S;
import com.fasterxml.jackson.annotation.u.b;
import com.fasterxml.jackson.core.C;
import com.fasterxml.jackson.core.E;
import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.core.v;
import com.fasterxml.jackson.core.z;
import com.fasterxml.jackson.databind.D;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.deser.o;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.introspect.M;
import com.fasterxml.jackson.databind.introspect.z.c;
import com.fasterxml.jackson.databind.jsontype.d;
import com.fasterxml.jackson.databind.ser.m;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.type.h;
import com.fasterxml.jackson.databind.w;
import com.fasterxml.jackson.databind.x.e;
import com.fasterxml.jackson.databind.x;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.function.Consumer;

public abstract class s {
    protected final x a;

    protected s(x x0) {
        this.a = x0;
    }

    public s A(a a0) {
        this.a.f3(a0);
        return this;
    }

    public s A0(h h0, Consumer consumer0) {
        consumer0.accept(this.a.e0(h0));
        return this;
    }

    public s B(DateFormat dateFormat0) {
        this.a.k3(dateFormat0);
        return this;
    }

    public s B0(Class class0, Consumer consumer0) {
        consumer0.accept(this.a.f0(class0));
        return this;
    }

    public s C(Boolean boolean0) {
        this.a.m3(boolean0);
        return this;
    }

    public s C0(Consumer consumer0) {
        consumer0.accept(this.a.c0());
        return this;
    }

    public s D(Locale locale0) {
        this.a.A3(locale0);
        return this.a();
    }

    public s D0(Class class0, Consumer consumer0) {
        consumer0.accept(this.a.g0(class0));
        return this;
    }

    public s E(Boolean boolean0) {
        this.a.o3(boolean0);
        return this;
    }

    public s F(v v0) {
        this.a.p3(v0);
        return this;
    }

    public s G(b u$b0) {
        this.a.r3(u$b0);
        return this.a();
    }

    public s H(com.fasterxml.jackson.annotation.E.a e$a0) {
        this.a.t3(e$a0);
        return this;
    }

    public s I(TimeZone timeZone0) {
        this.a.N3(timeZone0);
        return this;
    }

    public s J(com.fasterxml.jackson.core.k.b[] arr_k$b) {
        this.a.U0(arr_k$b);
        return this;
    }

    public s K(com.fasterxml.jackson.core.n.a[] arr_n$a) {
        this.a.V0(arr_n$a);
        return this;
    }

    public s L(z[] arr_z) {
        for(int v = 0; v < arr_z.length; ++v) {
            this.a.V0(new com.fasterxml.jackson.core.n.a[]{arr_z[v].f()});
        }
        return this;
    }

    public s M(C[] arr_c) {
        for(int v = 0; v < arr_c.length; ++v) {
            this.a.U0(new com.fasterxml.jackson.core.k.b[]{arr_c[v].f()});
        }
        return this;
    }

    public s N(i[] arr_i) {
        for(int v = 0; v < arr_i.length; ++v) {
            this.a.Q0(arr_i[v]);
        }
        return this;
    }

    public s O(t[] arr_t) {
        this.a.W0(arr_t);
        return this;
    }

    public s P(H[] arr_h) {
        for(int v = 0; v < arr_h.length; ++v) {
            this.a.S0(arr_h[v]);
        }
        return this;
    }

    public s Q(l[] arr_l) {
        for(int v = 0; v < arr_l.length; ++v) {
            this.a.n0(arr_l[v], false);
        }
        return this;
    }

    public s R(com.fasterxml.jackson.core.k.b[] arr_k$b) {
        this.a.d1(arr_k$b);
        return this;
    }

    public s S(com.fasterxml.jackson.core.n.a[] arr_n$a) {
        this.a.e1(arr_n$a);
        return this.a();
    }

    public s T(z[] arr_z) {
        for(int v = 0; v < arr_z.length; ++v) {
            this.a.e1(new com.fasterxml.jackson.core.n.a[]{arr_z[v].f()});
        }
        return this;
    }

    public s U(C[] arr_c) {
        for(int v = 0; v < arr_c.length; ++v) {
            this.a.d1(new com.fasterxml.jackson.core.k.b[]{arr_c[v].f()});
        }
        return this;
    }

    public s V(i[] arr_i) {
        for(int v = 0; v < arr_i.length; ++v) {
            this.a.Y0(arr_i[v]);
        }
        return this;
    }

    public s W(t[] arr_t) {
        this.a.f1(arr_t);
        return this;
    }

    public s X(H[] arr_h) {
        for(int v = 0; v < arr_h.length; ++v) {
            this.a.a1(arr_h[v]);
        }
        return this;
    }

    public s Y(l[] arr_l) {
        for(int v = 0; v < arr_l.length; ++v) {
            this.a.n0(arr_l[v], true);
        }
        return this;
    }

    public s Z(m m0) {
        this.a.w3(m0);
        return this;
    }

    protected final s a() [...] // Inlined contents

    public s a0() {
        return this.j(s.b0());
    }

    public s b(com.fasterxml.jackson.databind.introspect.a.b a$b0) {
        if(a$b0 == null) {
            a$b0 = new c();
        }
        this.a.c3(a$b0);
        return this;
    }

    public static List b0() {
        return s.c0(null);
    }

    public s c(d d0) {
        this.a.Q(d0);
        return this.a();
    }

    public static List c0(ClassLoader classLoader0) {
        List list0 = new ArrayList();
        for(Object object0: s.r0(w.class, classLoader0)) {
            ((ArrayList)list0).add(((w)object0));
        }
        return list0;
    }

    public s d(d d0, e x$e0) {
        this.a.R(d0, x$e0);
        return this;
    }

    public s d0(q q0) {
        this.a.y3(q0);
        return this;
    }

    public s e(d d0, e x$e0, com.fasterxml.jackson.annotation.H.a h$a0) {
        this.a.S(d0, x$e0, h$a0);
        return this;
    }

    public s e0(com.fasterxml.jackson.databind.l l0) {
        this.a.z3(l0);
        return this;
    }

    public s f(d d0, e x$e0, String s) {
        this.a.T(d0, x$e0, s);
        return this;
    }

    public boolean f0(com.fasterxml.jackson.core.k.b k$b0) {
        return this.a.F1(k$b0);
    }

    public s g(o o0) {
        this.a.U(o0);
        return this;
    }

    public boolean g0(com.fasterxml.jackson.core.n.a n$a0) {
        return this.a.G1(n$a0);
    }

    public s h(Class class0, Class class1) {
        this.a.V(class0, class1);
        return this;
    }

    public boolean h0(i i0) {
        return this.a.J1(i0);
    }

    public s i(w w0) {
        this.a.V2(w0);
        return this;
    }

    public boolean i0(t t0) {
        return this.a.K1(t0);
    }

    public s j(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.i(((w)object0));
        }
        return this;
    }

    public boolean j0(H h0) {
        return this.a.L1(h0);
    }

    public s k(w[] arr_w) {
        for(int v = 0; v < arr_w.length; ++v) {
            this.i(arr_w[v]);
        }
        return this;
    }

    public s k0(com.fasterxml.jackson.databind.node.m m0) {
        this.a.F3(m0);
        return this;
    }

    public s l(com.fasterxml.jackson.databind.b b0) {
        this.a.d3(b0);
        return this;
    }

    public s l0(d d0) {
        this.a.G3(d0);
        return this;
    }

    public x m() {
        return this.a;
    }

    public s m0(D d0) {
        this.a.I3(d0);
        return this;
    }

    public s n(com.fasterxml.jackson.databind.cfg.b b0) {
        this.a.g3(b0);
        return this;
    }

    public s n0(Collection collection0) {
        this.a.Y2(collection0);
        return this;
    }

    public s o() {
        this.a.b0();
        return this;
    }

    public s o0(com.fasterxml.jackson.databind.jsontype.c[] arr_c) {
        this.a.Z2(arr_c);
        return this;
    }

    public s p(com.fasterxml.jackson.core.k.b k$b0, boolean z) {
        this.a.h0(k$b0, z);
        return this;
    }

    public s p0(Class[] arr_class) {
        this.a.a3(arr_class);
        return this;
    }

    public s q(com.fasterxml.jackson.core.n.a n$a0, boolean z) {
        this.a.i0(n$a0, z);
        return this;
    }

    public s q0(Class class0) {
        this.a.V(class0, null);
        return this;
    }

    public s r(z z0, boolean z1) {
        this.a.i0(z0.f(), z1);
        return this;
    }

    private static ServiceLoader r0(Class class0, ClassLoader classLoader0) {
        static final class com.fasterxml.jackson.databind.cfg.s.a implements PrivilegedAction {
            final ClassLoader a;
            final Class b;

            com.fasterxml.jackson.databind.cfg.s.a(ClassLoader classLoader0, Class class0) {
                this.a = classLoader0;
                this.b = class0;
                super();
            }

            public ServiceLoader a() {
                return this.a == null ? ServiceLoader.load(this.b) : ServiceLoader.load(this.b, this.a);
            }

            @Override
            public Object run() {
                return this.a();
            }
        }

        if(System.getSecurityManager() == null) {
            return classLoader0 == null ? ServiceLoader.load(class0) : ServiceLoader.load(class0, classLoader0);
        }
        return (ServiceLoader)AccessController.doPrivileged(new com.fasterxml.jackson.databind.cfg.s.a(classLoader0, class0));
    }

    public s s(C c0, boolean z) {
        this.a.h0(c0.f(), z);
        return this;
    }

    public s s0(com.fasterxml.jackson.annotation.u.a u$a0) {
        this.a.J3(u$a0);
        return this;
    }

    public s t(i i0, boolean z) {
        this.a.j0(i0, z);
        return this;
    }

    public s t0(com.fasterxml.jackson.databind.ser.s s0) {
        this.a.K3(s0);
        return this;
    }

    public s u(t t0, boolean z) {
        this.a.k0(t0, z);
        return this;
    }

    public s u0(com.fasterxml.jackson.databind.jsontype.i i0) {
        this.a.u3(i0);
        return this;
    }

    public s v(H h0, boolean z) {
        this.a.m0(h0, z);
        return this;
    }

    public E v0() {
        return this.a.T3();
    }

    public s w(l l0, boolean z) {
        this.a.n0(l0, z);
        return this;
    }

    public s w0(com.fasterxml.jackson.databind.jsontype.e e0) {
        this.a.M3(e0);
        return this;
    }

    public s x(j j0) {
        this.a.j3(j0);
        return this;
    }

    public s x0(com.fasterxml.jackson.databind.type.q q0) {
        this.a.O3(q0);
        return this;
    }

    public s y() {
        this.a.O0();
        return this;
    }

    public s y0(S s0, com.fasterxml.jackson.annotation.h.c h$c0) {
        this.a.P3(s0, h$c0);
        return this;
    }

    public s z(k k0) {
        this.a.l3(k0);
        return this;
    }

    public s z0(M m0) {
        this.a.Q3(m0);
        return this;
    }
}

