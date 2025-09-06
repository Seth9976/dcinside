package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.d.a;
import com.fasterxml.jackson.annotation.n.d;
import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.jsontype.i;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.x;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class r extends b implements Serializable {
    protected final b a;
    protected final b b;
    private static final long c = 1L;

    public r(b b0, b b1) {
        this.a = b0;
        this.b = b1;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public d A(com.fasterxml.jackson.databind.introspect.b b0) {
        d n$d0 = this.a.A(b0);
        d n$d1 = this.b.A(b0);
        return n$d1 == null ? n$d0 : n$d1.C(n$d0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean A0(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        Boolean boolean0 = this.a.A0(t0, b0);
        return boolean0 == null ? this.b.A0(t0, b0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public Boolean B(com.fasterxml.jackson.databind.introspect.d d0) {
        Boolean boolean0 = this.a.B(d0);
        return boolean0 == null ? this.b.B(d0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean B0(com.fasterxml.jackson.databind.introspect.b b0) {
        Boolean boolean0 = this.a.B0(b0);
        return boolean0 == null ? this.b.B0(b0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public String C(k k0) {
        String s = this.a.C(k0);
        return s == null ? this.b.C(k0) : s;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public boolean C0(l l0) {
        return this.a.C0(l0) || this.b.C0(l0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public a D(k k0) {
        a d$a0 = this.a.D(k0);
        if(d$a0 == null || d$a0.h() == null) {
            a d$a1 = this.b.D(k0);
            if(d$a1 != null) {
                return d$a0 == null ? d$a1 : d$a0.l(d$a1.h());
            }
        }
        return d$a0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public boolean D0(com.fasterxml.jackson.databind.introspect.b b0) {
        return this.a.D0(b0) || this.b.D0(b0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public Object E(k k0) {
        Object object0 = this.a.E(k0);
        return object0 == null ? this.b.E(k0) : object0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.b
    public boolean E0(k k0) {
        return this.a.E0(k0) || this.b.E0(k0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object F(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.F(b0);
        return this.P0(object0, com.fasterxml.jackson.databind.s.a.class) ? object0 : this.O0(this.b.F(b0), com.fasterxml.jackson.databind.s.a.class);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean F0(k k0) {
        Boolean boolean0 = this.a.F0(k0);
        return boolean0 == null ? this.b.F0(k0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object G(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.G(b0);
        return this.P0(object0, com.fasterxml.jackson.databind.r.a.class) ? object0 : this.O0(this.b.G(b0), com.fasterxml.jackson.databind.r.a.class);
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.b
    public boolean G0(Annotation annotation0) {
        return this.a.G0(annotation0) || this.b.G0(annotation0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean H(com.fasterxml.jackson.databind.introspect.b b0) {
        Boolean boolean0 = this.a.H(b0);
        return boolean0 == null ? this.b.H(b0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean H0(com.fasterxml.jackson.databind.introspect.d d0) {
        Boolean boolean0 = this.a.H0(d0);
        return boolean0 == null ? this.b.H0(d0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public B I(com.fasterxml.jackson.databind.introspect.b b0) {
        B b1 = this.a.I(b0);
        if(b1 == null) {
            return this.b.I(b0);
        }
        if(b1 == B.g) {
            B b2 = this.b.I(b0);
            return b2 == null ? b1 : b2;
        }
        return b1;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean I0(k k0) {
        Boolean boolean0 = this.a.I0(k0);
        return boolean0 == null ? this.b.I0(k0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public B J(com.fasterxml.jackson.databind.introspect.b b0) {
        B b1 = this.a.J(b0);
        if(b1 == null) {
            return this.b.J(b0);
        }
        if(b1 == B.g) {
            B b2 = this.b.J(b0);
            return b2 == null ? b1 : b2;
        }
        return b1;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object K(com.fasterxml.jackson.databind.introspect.d d0) {
        Object object0 = this.a.K(d0);
        return object0 == null ? this.b.K(d0) : object0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object L(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.L(b0);
        return this.P0(object0, com.fasterxml.jackson.databind.r.a.class) ? object0 : this.O0(this.b.L(b0), com.fasterxml.jackson.databind.r.a.class);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public m L0(t t0, com.fasterxml.jackson.databind.introspect.b b0, m m0) throws o {
        return this.a.L0(t0, b0, this.b.L0(t0, b0, m0));
    }

    @Override  // com.fasterxml.jackson.databind.b
    public F M(com.fasterxml.jackson.databind.introspect.b b0) {
        F f0 = this.a.M(b0);
        return f0 == null ? this.b.M(b0) : f0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public m M0(t t0, com.fasterxml.jackson.databind.introspect.b b0, m m0) throws o {
        return this.a.M0(t0, b0, this.b.M0(t0, b0, m0));
    }

    @Override  // com.fasterxml.jackson.databind.b
    public F N(com.fasterxml.jackson.databind.introspect.b b0, F f0) {
        return this.a.N(b0, this.b.N(b0, f0));
    }

    @Override  // com.fasterxml.jackson.databind.b
    public l N0(t t0, l l0, l l1) {
        l l2 = this.a.N0(t0, l0, l1);
        return l2 == null ? this.b.N0(t0, l0, l1) : l2;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Class O(com.fasterxml.jackson.databind.introspect.d d0) {
        Class class0 = this.a.O(d0);
        return class0 == null ? this.b.O(d0) : class0;
    }

    // 去混淆评级： 低(30)
    protected Object O0(Object object0, Class class0) {
        return object0 != null && object0 != class0 && (!(object0 instanceof Class) || !h.U(((Class)object0))) ? object0 : null;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.databind.annotation.f.a P(com.fasterxml.jackson.databind.introspect.d d0) {
        com.fasterxml.jackson.databind.annotation.f.a f$a0 = this.a.P(d0);
        return f$a0 == null ? this.b.P(d0) : f$a0;
    }

    protected boolean P0(Object object0, Class class0) {
        if(object0 != null && object0 != class0) {
            return object0 instanceof Class ? !h.U(((Class)object0)) : true;
        }
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.annotation.H.d Q(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.H.d h$d0 = this.a.Q(t0, b0);
        return h$d0 == null ? this.b.Q(t0, b0) : h$d0;
    }

    public static b Q0(b b0, b b1) {
        if(b0 == null) {
            return b1;
        }
        return b1 == null ? b0 : new r(b0, b1);
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public String[] R(com.fasterxml.jackson.databind.introspect.b b0, boolean z) {
        String[] arr_s = this.a.R(b0, z);
        return arr_s == null ? this.b.R(b0, z) : arr_s;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.annotation.z.a S(com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.z.a z$a0 = this.a.S(b0);
        if(z$a0 != null && z$a0 != com.fasterxml.jackson.annotation.z.a.a) {
            return z$a0;
        }
        com.fasterxml.jackson.annotation.z.a z$a1 = this.b.S(b0);
        return z$a1 == null ? com.fasterxml.jackson.annotation.z.a.a : z$a1;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public List T(com.fasterxml.jackson.databind.introspect.b b0) {
        List list0 = this.a.T(b0);
        return list0 == null ? this.b.T(b0) : list0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public i U(t t0, k k0, m m0) {
        i i0 = this.a.U(t0, k0, m0);
        return i0 == null ? this.b.U(t0, k0, m0) : i0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public String V(com.fasterxml.jackson.databind.introspect.b b0) {
        String s = this.a.V(b0);
        return s != null && !s.isEmpty() ? s : this.b.V(b0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public String W(com.fasterxml.jackson.databind.introspect.b b0) {
        String s = this.a.W(b0);
        return s == null ? this.b.W(b0) : s;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.annotation.s.a X(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.s.a s$a0 = this.b.X(t0, b0);
        com.fasterxml.jackson.annotation.s.a s$a1 = this.a.X(t0, b0);
        return s$a0 == null ? s$a1 : s$a0.D(s$a1);
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public com.fasterxml.jackson.annotation.s.a Y(com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.s.a s$a0 = this.b.Y(b0);
        com.fasterxml.jackson.annotation.s.a s$a1 = this.a.Y(b0);
        return s$a0 == null ? s$a1 : s$a0.D(s$a1);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.annotation.u.b Z(com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.u.b u$b0 = this.b.Z(b0);
        com.fasterxml.jackson.annotation.u.b u$b1 = this.a.Z(b0);
        return u$b0 == null ? u$b1 : u$b0.o(u$b1);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.annotation.v.a a0(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.v.a v$a0 = this.b.a0(t0, b0);
        com.fasterxml.jackson.annotation.v.a v$a1 = this.a.a0(t0, b0);
        return v$a0 == null ? v$a1 : v$a0.g(v$a1);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Integer b0(com.fasterxml.jackson.databind.introspect.b b0) {
        Integer integer0 = this.a.b0(b0);
        return integer0 == null ? this.b.b0(b0) : integer0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public i c0(t t0, k k0, m m0) {
        i i0 = this.a.c0(t0, k0, m0);
        return i0 == null ? this.b.c0(t0, k0, m0) : i0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Collection d() {
        return this.e(new ArrayList());
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Collection e(Collection collection0) {
        this.a.e(collection0);
        this.b.e(collection0);
        return collection0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.databind.b.a e0(k k0) {
        com.fasterxml.jackson.databind.b.a b$a0 = this.a.e0(k0);
        return b$a0 == null ? this.b.e0(k0) : b$a0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public void f(t t0, com.fasterxml.jackson.databind.introspect.d d0, List list0) {
        this.a.f(t0, d0, list0);
        this.b.f(t0, d0, list0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public B f0(t t0, com.fasterxml.jackson.databind.introspect.i i0, B b0) {
        B b1 = this.b.f0(t0, i0, b0);
        return b1 == null ? this.a.f0(t0, i0, b0) : b1;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public M g(com.fasterxml.jackson.databind.introspect.d d0, M m0) {
        return this.a.g(d0, this.b.g(d0, m0));
    }

    @Override  // com.fasterxml.jackson.databind.b
    public B g0(com.fasterxml.jackson.databind.introspect.d d0) {
        B b0 = this.a.g0(d0);
        if(b0 == null) {
            return this.b.g0(d0);
        }
        if(b0.f()) {
            return b0;
        }
        B b1 = this.b.g0(d0);
        return b1 == null ? b0 : b1;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public String h(com.fasterxml.jackson.databind.introspect.d d0) {
        String s = this.a.h(d0);
        return s != null && !s.isEmpty() ? s : this.b.h(d0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object h0(k k0) {
        Object object0 = this.a.h0(k0);
        return object0 == null ? this.b.h0(k0) : object0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object i(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.i(b0);
        return this.P0(object0, com.fasterxml.jackson.databind.n.a.class) ? object0 : this.O0(this.b.i(b0), com.fasterxml.jackson.databind.n.a.class);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object i0(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.i0(b0);
        return object0 == null ? this.b.i0(b0) : object0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object j(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.j(b0);
        return this.P0(object0, com.fasterxml.jackson.databind.r.a.class) ? object0 : this.O0(this.b.j(b0), com.fasterxml.jackson.databind.r.a.class);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public String[] j0(com.fasterxml.jackson.databind.introspect.d d0) {
        String[] arr_s = this.a.j0(d0);
        return arr_s == null ? this.b.j0(d0) : arr_s;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.annotation.k.a k(t t0, com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.k.a k$a0 = this.a.k(t0, b0);
        return k$a0 == null ? this.b.k(t0, b0) : k$a0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean k0(com.fasterxml.jackson.databind.introspect.b b0) {
        Boolean boolean0 = this.a.k0(b0);
        return boolean0 == null ? this.b.k0(b0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public com.fasterxml.jackson.annotation.k.a l(com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.k.a k$a0 = this.a.l(b0);
        return k$a0 == null ? this.b.l(b0) : k$a0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Enum m(com.fasterxml.jackson.databind.introspect.d d0, Enum[] arr_enum) {
        Enum enum0 = this.a.m(d0, arr_enum);
        return enum0 == null ? this.b.m(d0, arr_enum) : enum0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.databind.annotation.g.b m0(com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.databind.annotation.g.b g$b0 = this.a.m0(b0);
        return g$b0 == null ? this.b.m0(b0) : g$b0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public Enum n(Class class0) {
        Enum enum0 = this.a.n(class0);
        return enum0 == null ? this.b.n(class0) : enum0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object n0(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.n0(b0);
        return this.P0(object0, com.fasterxml.jackson.databind.r.a.class) ? object0 : this.O0(this.b.n0(b0), com.fasterxml.jackson.databind.r.a.class);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object o(k k0) {
        Object object0 = this.a.o(k0);
        return object0 == null ? this.b.o(k0) : object0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public com.fasterxml.jackson.annotation.E.a o0(com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.annotation.E.a e$a0 = this.b.o0(b0);
        com.fasterxml.jackson.annotation.E.a e$a1 = this.a.o0(b0);
        return e$a0 == null ? e$a1 : e$a0.p(e$a1);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object p(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.p(b0);
        return object0 == null ? this.b.p(b0) : object0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public List p0(com.fasterxml.jackson.databind.introspect.b b0) {
        List list0 = this.a.p0(b0);
        List list1 = this.b.p0(b0);
        if(list0 != null && !list0.isEmpty()) {
            if(list1 != null && !list1.isEmpty()) {
                List list2 = new ArrayList(list0.size() + list1.size());
                ((ArrayList)list2).addAll(list0);
                ((ArrayList)list2).addAll(list1);
                return list2;
            }
            return list0;
        }
        return list1;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object q(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.q(b0);
        return this.P0(object0, com.fasterxml.jackson.databind.n.a.class) ? object0 : this.O0(this.b.q(b0), com.fasterxml.jackson.databind.n.a.class);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public String q0(com.fasterxml.jackson.databind.introspect.d d0) {
        String s = this.a.q0(d0);
        return s != null && !s.isEmpty() ? s : this.b.q0(d0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public void r(t t0, com.fasterxml.jackson.databind.introspect.d d0, Enum[] arr_enum, String[][] arr2_s) {
        this.b.r(t0, d0, arr_enum, arr2_s);
        this.a.r(t0, d0, arr_enum, arr2_s);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public i r0(t t0, com.fasterxml.jackson.databind.introspect.d d0, m m0) {
        i i0 = this.a.r0(t0, d0, m0);
        return i0 == null ? this.b.r0(t0, d0, m0) : i0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public void s(Class class0, Enum[] arr_enum, String[][] arr2_s) {
        this.b.s(class0, arr_enum, arr2_s);
        this.a.s(class0, arr_enum, arr2_s);
    }

    @Override  // com.fasterxml.jackson.databind.b
    public x s0(k k0) {
        x x0 = this.a.s0(k0);
        return x0 == null ? this.b.s0(k0) : x0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object t0(com.fasterxml.jackson.databind.introspect.d d0) {
        Object object0 = this.a.t0(d0);
        return object0 == null ? this.b.t0(d0) : object0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object u(t t0, com.fasterxml.jackson.databind.introspect.d d0) {
        Object object0 = this.a.u(t0, d0);
        return object0 == null ? this.b.u(t0, d0) : object0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Class[] u0(com.fasterxml.jackson.databind.introspect.b b0) {
        Class[] arr_class = this.a.u0(b0);
        return arr_class == null ? this.b.u0(b0) : arr_class;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public B v0(com.fasterxml.jackson.databind.introspect.b b0) {
        B b1 = this.a.v0(b0);
        if(b1 == null) {
            return this.b.v0(b0);
        }
        if(b1 == B.g) {
            B b2 = this.b.v0(b0);
            return b2 == null ? b1 : b2;
        }
        return b1;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public H version() {
        return this.a.version();
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public String w(Enum enum0) {
        String s = this.a.w(enum0);
        return s == null ? this.b.w(enum0) : s;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean w0(com.fasterxml.jackson.databind.introspect.b b0) {
        Boolean boolean0 = this.a.w0(b0);
        return boolean0 == null ? this.b.w0(b0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public String[] x(t t0, com.fasterxml.jackson.databind.introspect.d d0, Enum[] arr_enum, String[] arr_s) {
        return this.a.x(t0, d0, arr_enum, this.b.x(t0, d0, arr_enum, arr_s));
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public boolean x0(l l0) {
        return this.a.x0(l0) || this.b.x0(l0);
    }

    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public String[] y(Class class0, Enum[] arr_enum, String[] arr_s) {
        return this.a.y(class0, arr_enum, this.b.y(class0, arr_enum, arr_s));
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Boolean y0(com.fasterxml.jackson.databind.introspect.b b0) {
        Boolean boolean0 = this.a.y0(b0);
        return boolean0 == null ? this.b.y0(b0) : boolean0;
    }

    @Override  // com.fasterxml.jackson.databind.b
    public Object z(com.fasterxml.jackson.databind.introspect.b b0) {
        Object object0 = this.a.z(b0);
        return object0 == null ? this.b.z(b0) : object0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.b
    @Deprecated
    public boolean z0(l l0) {
        return this.a.z0(l0) || this.b.z0(l0);
    }
}

