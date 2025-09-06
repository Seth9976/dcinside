package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.core.E;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.cfg.y;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.std.H;
import com.fasterxml.jackson.databind.ser.std.P;
import com.fasterxml.jackson.databind.ser.std.u;
import com.fasterxml.jackson.databind.type.l;
import com.fasterxml.jackson.databind.util.e;
import com.fasterxml.jackson.databind.x;
import com.fasterxml.jackson.databind.z;
import j..util.Collection.-EL;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class h extends b implements Serializable {
    private static final long d = 1L;
    public static final h e;

    static {
        h.e = new h(null);
    }

    protected h(y y0) {
        super(y0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.b
    protected Iterable A() {
        return this.a.f();
    }

    @Override  // com.fasterxml.jackson.databind.ser.b
    public s O(y y0) {
        if(this.a == y0) {
            return this;
        }
        if(this.getClass() != h.class) {
            throw new IllegalStateException("Subtype of BeanSerializerFactory (" + this.getClass().getName() + ") has not properly overridden method \'withAdditionalSerializers\': cannot instantiate subtype with additional serializer definitions");
        }
        return new h(y0);
    }

    // 检测为 Lambda 实现
    public static boolean P(v v0) [...]

    protected d Q(I i0, v v0, n n0, boolean z, k k0) throws o {
        B b0 = v0.a();
        m m0 = k0.g();
        com.fasterxml.jackson.databind.d.b d$b0 = new com.fasterxml.jackson.databind.d.b(b0, m0, v0.d(), k0, v0.getMetadata());
        r r0 = this.K(i0, k0);
        if(r0 instanceof q) {
            ((q)r0).b(i0);
        }
        r r1 = i0.y0(r0, d$b0);
        if(!m0.o() && !m0.s()) {
            return n0.c(i0, v0, m0, r1, this.h0(m0, i0.r0(), k0), null, k0, z);
        }
        j j0 = this.g0(m0, i0.r0(), k0);
        return n0.c(i0, v0, m0, r1, this.h0(m0, i0.r0(), k0), j0, k0, z);
    }

    protected r R(I i0, m m0, c c0, boolean z) throws o {
        r r0;
        G g0 = i0.r0();
        if(m0.o()) {
            if(!z) {
                z = this.N(g0, c0);
            }
            r0 = this.q(i0, m0, c0, z);
            if(r0 != null) {
                return r0;
            }
        }
        else {
            if(m0.s()) {
                r0 = this.F(i0, ((l)m0), c0, z);
            }
            else {
                r r1 = null;
                for(Object object0: this.A()) {
                    r1 = ((t)object0).b(g0, m0, c0);
                    if(r1 != null) {
                        break;
                    }
                }
                r0 = r1;
            }
            if(r0 == null) {
                r0 = this.H(i0, m0, c0);
            }
        }
        if(r0 == null) {
            r0 = this.I(m0, g0, c0, z);
            if(r0 == null) {
                r0 = this.J(i0, m0, c0, z);
                if(r0 == null) {
                    r0 = this.c0(i0, m0, c0, z);
                    if(r0 == null) {
                        r0 = i0.x0(c0.y());
                    }
                }
            }
        }
        if(r0 != null && this.a.b()) {
            for(Object object1: this.a.e()) {
                r0 = ((i)object1).i(g0, c0, r0);
            }
        }
        return r0;
    }

    protected r S(I i0, m m0, c c0) throws o {
        String s = e.a(m0);
        return s != null && i0.r0().b(m0.g()) == null ? new com.fasterxml.jackson.databind.ser.impl.t(m0, s) : null;
    }

    // 去混淆评级： 低(35)
    protected boolean T(I i0, m m0) {
        Class class0 = m0.g();
        return x.class.isAssignableFrom(class0) || com.fasterxml.jackson.databind.y.class.isAssignableFrom(class0) || z.class.isAssignableFrom(class0) || com.fasterxml.jackson.databind.e.class.isAssignableFrom(class0) || E.class.isAssignableFrom(class0) || com.fasterxml.jackson.core.n.class.isAssignableFrom(class0) || com.fasterxml.jackson.core.k.class.isAssignableFrom(class0);
    }

    protected r U(I i0, m m0, c c0, boolean z) throws o {
        r r2;
        Class class0 = Object.class;
        if(c0.y() == class0) {
            return i0.x0(class0);
        }
        r r0 = this.S(i0, m0, c0);
        if(r0 != null) {
            return r0;
        }
        if(this.T(i0, m0)) {
            return new P(m0);
        }
        G g0 = i0.r0();
        f f0 = this.W(c0);
        f0.m(g0);
        List list0 = this.e0(i0, c0, f0);
        List list1 = list0 == null ? new ArrayList() : this.n0(i0, c0, f0, list0);
        i0.o().f(g0, c0.A(), list1);
        if(this.a.b()) {
            for(Object object0: this.a.e()) {
                list1 = ((i)object0).a(g0, c0, list1);
            }
        }
        List list2 = this.a0(g0, c0, this.b0(g0, c0, list1));
        if(this.a.b()) {
            for(Object object1: this.a.e()) {
                list2 = ((i)object1).j(g0, c0, list2);
            }
        }
        f0.p(this.Y(i0, c0, list2));
        f0.q(list2);
        f0.n(this.D(g0, c0));
        k k0 = c0.b();
        if(k0 != null) {
            m m1 = k0.g();
            m m2 = m1.E();
            j j0 = this.d(g0, m2);
            r r1 = this.K(i0, k0);
            if(r1 == null) {
                r1 = u.f0(null, m1, g0.a0(com.fasterxml.jackson.databind.t.r), j0, null, null, null);
            }
            f0.l(new a(new com.fasterxml.jackson.databind.d.b(B.a(k0.getName()), m2, null, k0, A.j), k0, r1));
        }
        this.k0(g0, f0);
        if(this.a.b()) {
            for(Object object2: this.a.e()) {
                f0 = ((i)object2).k(g0, c0, f0);
            }
        }
        try {
            r2 = f0.a();
        }
        catch(RuntimeException runtimeException0) {
            return (r)i0.K0(c0, "Failed to construct BeanSerializer for %s: (%s) %s", new Object[]{c0.H(), runtimeException0.getClass().getName(), runtimeException0.getMessage()});
        }
        if(r2 == null) {
            if(m0.Z() && !com.fasterxml.jackson.databind.util.z.d(m0.g())) {
                return f0.b();
            }
            r2 = this.G(g0, m0, c0, z);
            if(r2 == null && c0.I()) {
                return f0.b();
            }
        }
        return r2;
    }

    @Deprecated
    protected r V(I i0, c c0) throws o {
        return this.U(i0, c0.H(), c0, i0.z(com.fasterxml.jackson.databind.t.r));
    }

    protected f W(c c0) {
        return new f(c0);
    }

    protected d X(d d0, Class[] arr_class) {
        return com.fasterxml.jackson.databind.ser.impl.d.a(d0, arr_class);
    }

    protected com.fasterxml.jackson.databind.ser.impl.i Y(I i0, c c0, List list0) throws o {
        F f0 = c0.G();
        if(f0 == null) {
            return null;
        }
        Class class0 = f0.c();
        if(class0 == com.fasterxml.jackson.annotation.O.d.class) {
            String s = f0.d().d();
            int v = list0.size();
            for(int v1 = 0; v1 != v; ++v1) {
                d d0 = (d)list0.get(v1);
                if(s.equals(d0.getName())) {
                    if(v1 > 0) {
                        list0.remove(v1);
                        list0.add(0, d0);
                    }
                    return com.fasterxml.jackson.databind.ser.impl.i.a(d0.getType(), null, new com.fasterxml.jackson.databind.ser.impl.j(f0, d0), f0.b());
                }
            }
            throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", com.fasterxml.jackson.databind.util.h.Q(c0.H()), com.fasterxml.jackson.databind.util.h.j0(s)));
        }
        return com.fasterxml.jackson.databind.ser.impl.i.a(i0.x().n0(i0.l(class0), N.class)[0], f0.d(), i0.B(c0.A(), f0), f0.b());
    }

    protected n Z(G g0, c c0) {
        return new n(g0, c0);
    }

    protected List a0(G g0, c c0, List list0) {
        com.fasterxml.jackson.annotation.s.a s$a0 = g0.D(c0.y(), c0.A());
        Set set0 = null;
        Set set1 = s$a0 == null ? null : s$a0.i();
        com.fasterxml.jackson.annotation.v.a v$a0 = g0.H(c0.y(), c0.A());
        if(v$a0 != null) {
            set0 = v$a0.f();
        }
        if(set0 != null || set1 != null && !set1.isEmpty()) {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(com.fasterxml.jackson.databind.util.q.c(((d)object0).getName(), set1, set0)) {
                    iterator0.remove();
                }
            }
        }
        return list0;
    }

    protected List b0(G g0, c c0, List list0) {
        Class class0 = CharSequence.class;
        if(c0.H().a0(class0) && list0.size() == 1) {
            k k0 = ((d)list0.get(0)).h();
            if(k0 instanceof com.fasterxml.jackson.databind.introspect.l && "isEmpty".equals(k0.getName()) && k0.m() == class0) {
                list0.remove(0);
            }
        }
        return list0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.b
    public r c(I i0, m m0) throws o {
        m m1;
        G g0 = i0.r0();
        c c0 = g0.j1(m0);
        r r0 = this.K(i0, c0.A());
        if(r0 != null) {
            return r0;
        }
        com.fasterxml.jackson.databind.b b0 = g0.n();
        boolean z = false;
        if(b0 == null) {
            m1 = m0;
        }
        else {
            try {
                m1 = b0.M0(g0, c0.A(), m0);
            }
            catch(o o0) {
                return (r)i0.K0(c0, o0.getMessage(), new Object[0]);
            }
        }
        if(m1 != m0) {
            if(!m1.j(m0.g())) {
                c0 = g0.j1(m1);
            }
            z = true;
        }
        com.fasterxml.jackson.databind.util.j j0 = c0.w();
        if(j0 == null) {
            return this.R(i0, m1, c0, z);
        }
        m m2 = j0.b(i0.x());
        if(!m2.j(m1.g())) {
            c0 = g0.j1(m2);
            r0 = this.K(i0, c0.A());
        }
        if(r0 == null && !m2.Y()) {
            r0 = this.R(i0, m2, c0, true);
        }
        return new H(j0, m2, r0);
    }

    // 去混淆评级： 低(20)
    public r c0(I i0, m m0, c c0, boolean z) throws o {
        return this.i0(m0.g()) || com.fasterxml.jackson.databind.util.h.Y(m0.g()) ? this.U(i0, m0, c0, z) : null;
    }

    protected List e0(I i0, c c0, f f0) throws o {
        List list0 = c0.u();
        G g0 = i0.r0();
        this.m0(g0, c0, list0);
        if(g0.a0(com.fasterxml.jackson.databind.t.k)) {
            this.o0(g0, c0, list0);
        }
        if(list0.isEmpty()) {
            return null;
        }
        boolean z = this.N(g0, c0);
        n n0 = this.Z(g0, c0);
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            v v0 = (v)object0;
            k k0 = v0.u();
            if(!v0.O()) {
                com.fasterxml.jackson.databind.b.a b$a0 = v0.s();
                if(b$a0 != null && b$a0.d()) {
                }
                else if(k0 instanceof com.fasterxml.jackson.databind.introspect.l) {
                    ((ArrayList)list1).add(this.Q(i0, v0, n0, z, ((com.fasterxml.jackson.databind.introspect.l)k0)));
                }
                else {
                    ((ArrayList)list1).add(this.Q(i0, v0, n0, z, ((com.fasterxml.jackson.databind.introspect.i)k0)));
                }
            }
            else if(k0 != null) {
                f0.r(k0);
            }
        }
        return list1;
    }

    @Deprecated
    public r f0(I i0, m m0, c c0) throws o {
        return this.c0(i0, m0, c0, i0.z(com.fasterxml.jackson.databind.t.r));
    }

    public j g0(m m0, G g0, k k0) throws o {
        m m1 = m0.E();
        com.fasterxml.jackson.databind.jsontype.i i0 = g0.n().U(g0, k0, m0);
        return i0 == null ? this.d(g0, m1) : i0.g(g0, m1, g0.Q().d(g0, k0, m1));
    }

    public j h0(m m0, G g0, k k0) throws o {
        com.fasterxml.jackson.databind.jsontype.i i0 = g0.n().c0(g0, k0, m0);
        return i0 == null ? this.d(g0, m0) : i0.g(g0, m0, g0.Q().d(g0, k0, m0));
    }

    protected boolean i0(Class class0) {
        return com.fasterxml.jackson.databind.util.h.g(class0) == null && !com.fasterxml.jackson.databind.util.h.g0(class0);
    }

    // 去混淆评级： 低(20)
    private static boolean j0(v v0) {
        return !v0.l() && !v0.M();
    }

    protected void k0(G g0, f f0) {
        List list0 = f0.i();
        boolean z = g0.a0(com.fasterxml.jackson.databind.t.v);
        int v = list0.size();
        d[] arr_d = new d[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            d d0 = (d)list0.get(v1);
            Class[] arr_class = d0.K();
            if(arr_class != null && arr_class.length != 0) {
                ++v2;
                arr_d[v1] = this.X(d0, arr_class);
            }
            else if(z) {
                arr_d[v1] = d0;
            }
        }
        if(z && v2 == 0) {
            return;
        }
        f0.o(arr_d);
    }

    protected void m0(G g0, c c0, List list0) {
        com.fasterxml.jackson.databind.b b0 = g0.n();
        HashMap hashMap0 = new HashMap();
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            v v0 = (v)object0;
            if(v0.u() == null) {
                iterator0.remove();
            }
            else {
                Class class0 = v0.F();
                Boolean boolean0 = (Boolean)hashMap0.get(class0);
                if(boolean0 == null) {
                    boolean0 = g0.s(class0).f();
                    if(boolean0 == null) {
                        Boolean boolean1 = b0.H0(g0.W(class0).A());
                        boolean0 = boolean1 == null ? Boolean.FALSE : boolean1;
                    }
                    hashMap0.put(class0, boolean0);
                }
                if(boolean0.booleanValue()) {
                    iterator0.remove();
                }
            }
        }
    }

    protected List n0(I i0, c c0, f f0, List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            d d0 = (d)list0.get(v1);
            j j0 = d0.J();
            if(j0 != null && j0.e() == com.fasterxml.jackson.annotation.H.a.d) {
                B b0 = B.a(j0.c());
                for(Object object0: list0) {
                    if(((d)object0) != d0 && ((d)object0).V(b0)) {
                        d0.z(null);
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return list0;
    }

    protected void o0(G g0, c c0, List list0) {
        Collection.-EL.removeIf(list0, (v v0) -> h.j0(v0));
    }
}

