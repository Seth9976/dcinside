package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.n.d;
import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.I;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.E;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.M;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.introspect.r;
import com.fasterxml.jackson.databind.jsontype.i;
import com.fasterxml.jackson.databind.util.x;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class b implements I, Serializable {
    public static class a {
        public static enum com.fasterxml.jackson.databind.b.a.a {
            MANAGED_REFERENCE,
            BACK_REFERENCE;

        }

        private final com.fasterxml.jackson.databind.b.a.a a;
        private final String b;

        public a(com.fasterxml.jackson.databind.b.a.a b$a$a0, String s) {
            this.a = b$a$a0;
            this.b = s;
        }

        public static a a(String s) {
            return new a(com.fasterxml.jackson.databind.b.a.a.b, s);
        }

        public String b() {
            return this.b;
        }

        public com.fasterxml.jackson.databind.b.a.a c() {
            return this.a;
        }

        public boolean d() {
            return this.a == com.fasterxml.jackson.databind.b.a.a.b;
        }

        public boolean e() {
            return this.a == com.fasterxml.jackson.databind.b.a.a.a;
        }

        public static a f(String s) {
            return new a(com.fasterxml.jackson.databind.b.a.a.a, s);
        }
    }

    public interface com.fasterxml.jackson.databind.b.b {
        Boolean a(t arg1, com.fasterxml.jackson.databind.introspect.b arg2);

        String b(t arg1, com.fasterxml.jackson.databind.introspect.b arg2);

        Boolean c(t arg1, com.fasterxml.jackson.databind.introspect.b arg2);

        Boolean d(t arg1, com.fasterxml.jackson.databind.introspect.b arg2);
    }

    public d A(com.fasterxml.jackson.databind.introspect.b b0) {
        return d.c();
    }

    public Boolean A0(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    @Deprecated
    public Boolean B(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    // 去混淆评级： 低(20)
    public Boolean B0(com.fasterxml.jackson.databind.introspect.b b0) {
        return !(b0 instanceof l) || !this.C0(((l)b0)) ? null : true;
    }

    public String C(k k0) {
        return null;
    }

    @Deprecated
    public boolean C0(l l0) {
        return false;
    }

    public com.fasterxml.jackson.annotation.d.a D(k k0) {
        Object object0 = this.E(k0);
        return object0 == null ? null : com.fasterxml.jackson.annotation.d.a.e(object0);
    }

    @Deprecated
    public boolean D0(com.fasterxml.jackson.databind.introspect.b b0) {
        return false;
    }

    @Deprecated
    public Object E(k k0) {
        return null;
    }

    public boolean E0(k k0) {
        return false;
    }

    public Object F(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Boolean F0(k k0) {
        return null;
    }

    public Object G(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public boolean G0(Annotation annotation0) {
        return false;
    }

    public Boolean H(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Boolean H0(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public B I(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Boolean I0(k k0) {
        return null;
    }

    public B J(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public static b J0() {
        return E.b;
    }

    public Object K(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public static b K0(b b0, b b1) {
        return new r(b0, b1);
    }

    public Object L(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public m L0(t t0, com.fasterxml.jackson.databind.introspect.b b0, m m0) throws o {
        return m0;
    }

    public F M(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public m M0(t t0, com.fasterxml.jackson.databind.introspect.b b0, m m0) throws o {
        return m0;
    }

    public F N(com.fasterxml.jackson.databind.introspect.b b0, F f0) {
        return f0;
    }

    public l N0(t t0, l l0, l l1) {
        return null;
    }

    public Class O(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public com.fasterxml.jackson.databind.annotation.f.a P(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public com.fasterxml.jackson.annotation.H.d Q(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    @Deprecated
    public String[] R(com.fasterxml.jackson.databind.introspect.b b0, boolean z) {
        return null;
    }

    public com.fasterxml.jackson.annotation.z.a S(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public List T(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public i U(t t0, k k0, m m0) {
        return null;
    }

    public String V(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public String W(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public com.fasterxml.jackson.annotation.s.a X(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        return this.Y(b0);
    }

    @Deprecated
    public com.fasterxml.jackson.annotation.s.a Y(com.fasterxml.jackson.databind.introspect.b b0) {
        return com.fasterxml.jackson.annotation.s.a.g();
    }

    public com.fasterxml.jackson.annotation.u.b Z(com.fasterxml.jackson.databind.introspect.b b0) {
        return com.fasterxml.jackson.annotation.u.b.d();
    }

    protected Annotation a(com.fasterxml.jackson.databind.introspect.b b0, Class class0) {
        return b0.d(class0);
    }

    public com.fasterxml.jackson.annotation.v.a a0(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        return com.fasterxml.jackson.annotation.v.a.d();
    }

    protected boolean b(com.fasterxml.jackson.databind.introspect.b b0, Class class0) {
        return b0.h(class0);
    }

    public Integer b0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    protected boolean c(com.fasterxml.jackson.databind.introspect.b b0, Class[] arr_class) {
        return b0.i(arr_class);
    }

    public i c0(t t0, k k0, m m0) {
        return null;
    }

    public Collection d() {
        return Collections.singletonList(this);
    }

    public Collection e(Collection collection0) {
        collection0.add(this);
        return collection0;
    }

    public a e0(k k0) {
        return null;
    }

    public void f(t t0, com.fasterxml.jackson.databind.introspect.d d0, List list0) {
    }

    public B f0(t t0, com.fasterxml.jackson.databind.introspect.i i0, B b0) {
        return null;
    }

    public M g(com.fasterxml.jackson.databind.introspect.d d0, M m0) {
        return m0;
    }

    public B g0(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public String h(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public Object h0(k k0) {
        return null;
    }

    public Object i(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Object i0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Object j(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public String[] j0(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public com.fasterxml.jackson.annotation.k.a k(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        if(this.D0(b0)) {
            com.fasterxml.jackson.annotation.k.a k$a0 = this.l(b0);
            return k$a0 == null ? com.fasterxml.jackson.annotation.k.a.a : k$a0;
        }
        return null;
    }

    public Boolean k0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    @Deprecated
    public com.fasterxml.jackson.annotation.k.a l(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Enum m(com.fasterxml.jackson.databind.introspect.d d0, Enum[] arr_enum) {
        return this.n(d0.f());
    }

    public com.fasterxml.jackson.databind.annotation.g.b m0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    @Deprecated
    public Enum n(Class class0) {
        return null;
    }

    public Object n0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Object o(k k0) {
        return null;
    }

    public com.fasterxml.jackson.annotation.E.a o0(com.fasterxml.jackson.databind.introspect.b b0) {
        return com.fasterxml.jackson.annotation.E.a.d();
    }

    public Object p(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public List p0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Object q(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public String q0(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public void r(t t0, com.fasterxml.jackson.databind.introspect.d d0, Enum[] arr_enum, String[][] arr2_s) {
    }

    public i r0(t t0, com.fasterxml.jackson.databind.introspect.d d0, m m0) {
        return null;
    }

    @Deprecated
    public void s(Class class0, Enum[] arr_enum, String[][] arr2_s) {
    }

    public x s0(k k0) {
        return null;
    }

    public Object t0(com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public Object u(t t0, com.fasterxml.jackson.databind.introspect.d d0) {
        return null;
    }

    public Class[] u0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public B v0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    @Override  // com.fasterxml.jackson.core.I
    public abstract H version();

    @Deprecated
    public String w(Enum enum0) {
        return enum0.name();
    }

    // 去混淆评级： 低(20)
    public Boolean w0(com.fasterxml.jackson.databind.introspect.b b0) {
        return !(b0 instanceof l) || !this.x0(((l)b0)) ? null : true;
    }

    public String[] x(t t0, com.fasterxml.jackson.databind.introspect.d d0, Enum[] arr_enum, String[] arr_s) {
        return arr_s;
    }

    @Deprecated
    public boolean x0(l l0) {
        return false;
    }

    @Deprecated
    public String[] y(Class class0, Enum[] arr_enum, String[] arr_s) {
        return arr_s;
    }

    public Boolean y0(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    public Object z(com.fasterxml.jackson.databind.introspect.b b0) {
        return null;
    }

    @Deprecated
    public boolean z0(l l0) {
        return false;
    }
}

