package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.O.d;
import com.fasterxml.jackson.annotation.P;
import com.fasterxml.jackson.annotation.s.a;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.D;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.cfg.o;
import com.fasterxml.jackson.databind.deser.impl.C;
import com.fasterxml.jackson.databind.deser.impl.s;
import com.fasterxml.jackson.databind.deser.impl.w;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.i;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.jsontype.impl.r;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.E;
import com.fasterxml.jackson.databind.util.e;
import com.fasterxml.jackson.databind.util.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class g extends b implements Serializable {
    private static final long j = 1L;
    private static final Class[] k;
    public static final g l;

    static {
        g.k = new Class[]{Throwable.class};
        g.l = new g(new o());
    }

    public g(o o0) {
        super(o0);
    }

    protected void A0(h h0, c c0, f f0) throws com.fasterxml.jackson.databind.o {
        List list0 = c0.g();
        if(list0 != null) {
            for(Object object0: list0) {
                f0.g(((v)object0).r(), this.K0(h0, c0, ((v)object0), ((v)object0).E()));
            }
        }
    }

    protected void B0(h h0, c c0, f f0) throws com.fasterxml.jackson.databind.o {
        l l1;
        y y0;
        Set set2;
        Set set0;
        y[] arr_y = c0.H().k() ? null : f0.y().I(h0.g0());
        a s$a0 = h0.g0().D(c0.y(), c0.A());
        if(s$a0 == null) {
            set0 = Collections.emptySet();
        }
        else {
            f0.D(s$a0.p());
            set0 = s$a0.h();
            for(Object object0: set0) {
                f0.i(((String)object0));
            }
        }
        com.fasterxml.jackson.annotation.v.a v$a0 = h0.g0().H(c0.y(), c0.A());
        if(v$a0 == null) {
            set2 = null;
        }
        else {
            Set set1 = v$a0.f();
            if(set1 != null) {
                for(Object object1: set1) {
                    f0.j(((String)object1));
                }
            }
            set2 = set1;
        }
        k k0 = c0.d();
        if(k0 == null) {
            Set set3 = c0.F();
            if(set3 != null) {
                for(Object object2: set3) {
                    f0.i(((String)object2));
                }
            }
        }
        else {
            f0.C(this.I0(h0, c0, k0));
        }
        boolean z = h0.z(t.d) && h0.z(t.h);
        List list0 = this.N0(h0, c0, f0, c0.u(), set0, set2);
        if(this.b.e()) {
            for(Object object3: this.b.b()) {
                list0 = ((com.fasterxml.jackson.databind.deser.h)object3).k(h0.g0(), c0, list0);
            }
        }
        for(Object object4: list0) {
            v v0 = (v)object4;
            if(v0.L()) {
                y0 = this.K0(h0, c0, v0, v0.G().E(0));
            }
            else if(v0.I()) {
                y0 = this.K0(h0, c0, v0, v0.y().g());
            }
            else {
                com.fasterxml.jackson.databind.introspect.l l0 = v0.z();
                if(l0 != null) {
                    if(!z || !this.y0(l0.f())) {
                        if(!v0.H() && v0.getMetadata().g() != null) {
                            y0 = this.L0(h0, c0, v0);
                            goto label_63;
                        }
                    }
                    else if(!f0.z(v0.getName())) {
                        y0 = this.L0(h0, c0, v0);
                        goto label_63;
                    }
                }
                y0 = null;
            }
        label_63:
            if(arr_y != null && v0.H()) {
                String s = v0.getName();
                int v1 = 0;
                while(true) {
                    l1 = null;
                    if(v1 < arr_y.length) {
                        y y1 = arr_y[v1];
                        if(!s.equals(y1.getName()) || !(y1 instanceof l)) {
                            ++v1;
                            continue;
                        }
                        else {
                            l1 = (l)y1;
                        }
                    }
                    break;
                }
                if(l1 == null) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v2 = 0; v2 < arr_y.length; ++v2) {
                        arrayList0.add(arr_y[v2].getName());
                    }
                    h0.W0(c0, v0, "Could not find creator property with name %s (known Creator properties: %s)", new Object[]{com.fasterxml.jackson.databind.util.h.j0(s), arrayList0});
                }
                else {
                    if(y0 != null) {
                        l1.b0(y0);
                    }
                    Class[] arr_class = v0.t();
                    if(arr_class == null) {
                        arr_class = c0.j();
                    }
                    l1.Q(arr_class);
                    f0.h(l1);
                }
            }
            else if(y0 != null) {
                Class[] arr_class1 = v0.t();
                if(arr_class1 == null) {
                    arr_class1 = c0.j();
                }
                y0.Q(arr_class1);
                f0.m(y0);
            }
        }
    }

    protected void C0(h h0, c c0, f f0) throws com.fasterxml.jackson.databind.o {
        Map map0 = c0.n();
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Object object1 = ((Map.Entry)object0).getValue();
                f0.k(B.a(((k)object1).getName()), ((k)object1).g(), c0.z(), ((k)object1), ((Map.Entry)object0).getKey());
            }
        }
    }

    protected void D0(h h0, c c0, f f0) throws com.fasterxml.jackson.databind.o {
        y y1;
        N n0;
        m m0;
        F f1 = c0.G();
        if(f1 == null) {
            return;
        }
        Class class0 = f1.c();
        P p0 = h0.C(c0.A(), f1);
        if(class0 == d.class) {
            B b0 = f1.d();
            y y0 = f0.r(b0);
            if(y0 == null) {
                throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", com.fasterxml.jackson.databind.util.h.Q(c0.H()), com.fasterxml.jackson.databind.util.h.i0(b0)));
            }
            w w0 = new w(f1.f());
            m0 = y0.getType();
            n0 = w0;
            y1 = y0;
        }
        else {
            m m1 = h0.x().n0(h0.R(class0), N.class)[0];
            n0 = h0.B(c0.A(), f1);
            m0 = m1;
            y1 = null;
        }
        f0.E(s.a(m0, f1.d(), n0, h0.c0(m0), y1, p0));
    }

    @Deprecated
    protected void E0(h h0, c c0, f f0) throws com.fasterxml.jackson.databind.o {
        this.A0(h0, c0, f0);
    }

    public n F0(h h0, m m0, c c0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.deser.B b0;
        try {
            b0 = this.m(h0, c0);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            return new com.fasterxml.jackson.databind.deser.impl.f(noClassDefFoundError0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw com.fasterxml.jackson.databind.exc.b.G(h0.m0(), com.fasterxml.jackson.databind.util.h.q(illegalArgumentException0), c0, null).A(illegalArgumentException0);
        }
        f f0 = this.J0(h0, c0);
        f0.G(b0);
        this.B0(h0, c0, f0);
        this.D0(h0, c0, f0);
        this.A0(h0, c0, f0);
        this.C0(h0, c0, f0);
        com.fasterxml.jackson.databind.g g0 = h0.g0();
        if(this.b.e()) {
            for(Object object0: this.b.b()) {
                f0 = ((com.fasterxml.jackson.databind.deser.h)object0).j(g0, c0, f0);
            }
        }
        n n0 = !m0.k() || b0.m() ? f0.n() : f0.o();
        if(this.b.e()) {
            for(Object object1: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object1).d(g0, c0, n0);
            }
        }
        return n0;
    }

    protected n G0(h h0, m m0, c c0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.deser.B b0;
        try {
            b0 = this.m(h0, c0);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            return new com.fasterxml.jackson.databind.deser.impl.f(noClassDefFoundError0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw com.fasterxml.jackson.databind.exc.b.G(h0.m0(), com.fasterxml.jackson.databind.util.h.q(illegalArgumentException0), c0, null);
        }
        com.fasterxml.jackson.databind.g g0 = h0.g0();
        f f0 = this.J0(h0, c0);
        f0.G(b0);
        this.B0(h0, c0, f0);
        this.D0(h0, c0, f0);
        this.A0(h0, c0, f0);
        this.C0(h0, c0, f0);
        com.fasterxml.jackson.databind.annotation.f.a f$a0 = c0.t();
        String s = f$a0 == null ? "build" : f$a0.a;
        com.fasterxml.jackson.databind.introspect.l l0 = c0.r(s, null);
        if(l0 != null && g0.c()) {
            com.fasterxml.jackson.databind.util.h.i(l0.L(), g0.a0(t.q));
        }
        f0.F(l0, f$a0);
        if(this.b.e()) {
            for(Object object0: this.b.b()) {
                f0 = ((com.fasterxml.jackson.databind.deser.h)object0).j(g0, c0, f0);
            }
        }
        n n0 = f0.p(m0, s);
        if(this.b.e()) {
            for(Object object1: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object1).d(g0, c0, n0);
            }
        }
        return n0;
    }

    public n H0(h h0, m m0, c c0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.g g0 = h0.g0();
        f f0 = this.J0(h0, c0);
        f0.G(this.m(h0, c0));
        this.B0(h0, c0, f0);
        Iterator iterator0 = f0.x();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if("setCause".equals(((y)object0).h().getName())) {
                iterator0.remove();
                break;
            }
            if(false) {
                break;
            }
        }
        com.fasterxml.jackson.databind.introspect.l l0 = c0.r("initCause", g.k);
        if(l0 != null) {
            D d0 = g0.P();
            y y0 = this.K0(h0, c0, E.S(h0.g0(), l0, new B((d0 == null ? "cause" : d0.d(g0, l0, "cause")))), l0.E(0));
            if(y0 != null) {
                f0.l(y0, true);
            }
        }
        if(this.b.e()) {
            for(Object object1: this.b.b()) {
                f0 = ((com.fasterxml.jackson.databind.deser.h)object1).j(g0, c0, f0);
            }
        }
        n n0 = f0.n();
        if(n0 instanceof com.fasterxml.jackson.databind.deser.c) {
            n0 = com.fasterxml.jackson.databind.deser.std.N.K2(h0, ((com.fasterxml.jackson.databind.deser.c)n0));
        }
        if(this.b.e()) {
            for(Object object2: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object2).d(g0, c0, n0);
            }
        }
        return n0;
    }

    protected x I0(h h0, c c0, k k0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.d.b d$b0;
        m m1;
        m m0;
        if(k0 instanceof com.fasterxml.jackson.databind.introspect.l) {
            m0 = ((com.fasterxml.jackson.databind.introspect.l)k0).E(0);
            m1 = this.u0(h0, k0, ((com.fasterxml.jackson.databind.introspect.l)k0).E(1));
            d$b0 = new com.fasterxml.jackson.databind.d.b(B.a(k0.getName()), m1, null, k0, A.j);
            goto label_13;
        }
        if(k0 instanceof i) {
            m m2 = ((i)k0).g();
            if(m2.r()) {
                m m3 = this.u0(h0, k0, m2);
                m0 = m3.N();
                com.fasterxml.jackson.databind.d.b d$b1 = new com.fasterxml.jackson.databind.d.b(B.a(k0.getName()), m3, null, k0, A.j);
                m1 = m3.E();
                d$b0 = d$b1;
            label_13:
                com.fasterxml.jackson.databind.s s0 = this.o0(h0, k0);
                if(s0 == null) {
                    s0 = (com.fasterxml.jackson.databind.s)m0.S();
                }
                if(s0 == null) {
                    s0 = h0.Z(m0, d$b0);
                }
                else if(s0 instanceof com.fasterxml.jackson.databind.deser.k) {
                    s0 = ((com.fasterxml.jackson.databind.deser.k)s0).a(h0, d$b0);
                }
                n n0 = this.k0(h0, k0);
                if(n0 == null) {
                    n0 = (n)m1.S();
                }
                if(n0 != null) {
                    n0 = h0.r0(n0, d$b0, m1);
                }
                Object object0 = m1.R();
                return k0 instanceof i ? x.d(h0, d$b0, k0, m1, s0, n0, ((com.fasterxml.jackson.databind.jsontype.f)object0)) : x.e(h0, d$b0, k0, m1, s0, n0, ((com.fasterxml.jackson.databind.jsontype.f)object0));
            }
            Class class0 = p.class;
            if(!m2.j(class0) && !m2.j(u.class)) {
                return (x)h0.D(c0.H(), String.format("Unsupported type for any-setter: %s -- only support `Map`s, `JsonNode` and `ObjectNode` ", com.fasterxml.jackson.databind.util.h.Q(m2)));
            }
            m m4 = this.u0(h0, k0, m2);
            m m5 = h0.R(class0);
            return x.c(h0, new com.fasterxml.jackson.databind.d.b(B.a(k0.getName()), m4, null, k0, A.j), k0, m5, h0.c0(m5));
        }
        return (x)h0.D(c0.H(), String.format("Unrecognized mutator type for any-setter: %s", com.fasterxml.jackson.databind.util.h.l0(k0.getClass())));
    }

    protected f J0(h h0, c c0) {
        return new f(c0, h0);
    }

    protected y K0(h h0, c c0, v v0, m m0) throws com.fasterxml.jackson.databind.o {
        k k0 = v0.C();
        if(k0 == null) {
            h0.W0(c0, v0, "No non-constructor mutator available", new Object[0]);
        }
        m m1 = this.u0(h0, k0, m0);
        Object object0 = m1.R();
        y y0 = k0 instanceof com.fasterxml.jackson.databind.introspect.l ? new com.fasterxml.jackson.databind.deser.impl.o(v0, m1, ((com.fasterxml.jackson.databind.jsontype.f)object0), c0.z(), ((com.fasterxml.jackson.databind.introspect.l)k0)) : new com.fasterxml.jackson.databind.deser.impl.i(v0, m1, ((com.fasterxml.jackson.databind.jsontype.f)object0), c0.z(), ((i)k0));
        n n0 = this.n0(h0, k0);
        if(n0 == null) {
            n0 = (n)m1.S();
        }
        if(n0 != null) {
            y0 = y0.V(h0.r0(n0, y0, m1));
        }
        com.fasterxml.jackson.databind.b.a b$a0 = v0.s();
        if(b$a0 != null && b$a0.e()) {
            y0.O(b$a0.b());
        }
        F f0 = v0.p();
        if(f0 != null) {
            y0.P(f0);
        }
        return y0;
    }

    protected y L0(h h0, c c0, v v0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.introspect.l l0 = v0.z();
        m m0 = this.u0(h0, l0, l0.g());
        y y0 = new com.fasterxml.jackson.databind.deser.impl.A(v0, m0, ((com.fasterxml.jackson.databind.jsontype.f)m0.R()), c0.z(), l0);
        n n0 = this.n0(h0, l0);
        if(n0 == null) {
            n0 = (n)m0.S();
        }
        return n0 == null ? y0 : y0.V(h0.r0(n0, y0, m0));
    }

    @Deprecated
    protected List M0(h h0, c c0, f f0, List list0, Set set0) throws com.fasterxml.jackson.databind.o {
        return this.N0(h0, c0, f0, list0, set0, null);
    }

    protected List N0(h h0, c c0, f f0, List list0, Set set0, Set set1) {
        List list1 = new ArrayList(Math.max(4, list0.size()));
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            v v0 = (v)object0;
            String s = v0.getName();
            if(!q.c(s, set0, set1)) {
                if(!v0.H()) {
                    Class class0 = v0.F();
                    if(class0 != null && this.P0(h0.g0(), v0, class0, hashMap0)) {
                        f0.i(s);
                        continue;
                    }
                }
                ((ArrayList)list1).add(v0);
            }
        }
        return list1;
    }

    protected n O0(h h0, m m0, c c0) throws com.fasterxml.jackson.databind.o {
        n n0 = this.m0(h0, m0, c0);
        if(n0 != null && this.b.e()) {
            for(Object object0: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object0).d(h0.g0(), c0, n0);
            }
        }
        return n0;
    }

    protected boolean P0(com.fasterxml.jackson.databind.g g0, v v0, Class class0, Map map0) {
        Boolean boolean1;
        Boolean boolean0 = (Boolean)map0.get(class0);
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        if(class0 == String.class || class0.isPrimitive()) {
            boolean1 = Boolean.FALSE;
        }
        else {
            boolean1 = g0.s(class0).f();
            if(boolean1 == null) {
                boolean1 = g0.n().H0(g0.W(class0).A());
                if(boolean1 == null) {
                    boolean1 = Boolean.FALSE;
                }
            }
        }
        map0.put(class0, boolean1);
        return boolean1.booleanValue();
    }

    protected boolean Q0(Class class0) {
        String s = com.fasterxml.jackson.databind.util.h.g(class0);
        if(s != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + class0.getName() + " (of type " + s + ") as a Bean");
        }
        if(com.fasterxml.jackson.databind.util.h.g0(class0)) {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + class0.getName() + " as a Bean");
        }
        String s1 = com.fasterxml.jackson.databind.util.h.d0(class0, true);
        if(s1 != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + class0.getName() + " (of type " + s1 + ") as a Bean");
        }
        return true;
    }

    protected m R0(h h0, m m0, c c0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.a()) {
            m m1 = ((com.fasterxml.jackson.databind.a)object0).b(h0.g0(), c0);
            if(m1 != null) {
                return m1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n b(h h0, m m0, c c0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.g g0 = h0.g0();
        n n0 = this.L(m0, g0, c0);
        if(n0 != null) {
            if(this.b.e()) {
                for(Object object0: this.b.b()) {
                    n0 = ((com.fasterxml.jackson.databind.deser.h)object0).d(h0.g0(), c0, n0);
                }
            }
            return n0;
        }
        if(m0.u()) {
            return this.H0(h0, m0, c0);
        }
        if(m0.k() && !m0.isPrimitive() && !m0.p()) {
            m m1 = this.R0(h0, m0, c0);
            if(m1 != null) {
                return this.F0(h0, m1, g0.o1(m1));
            }
        }
        n n1 = this.O0(h0, m0, c0);
        if(n1 != null) {
            return n1;
        }
        if(!this.Q0(m0.g())) {
            return null;
        }
        this.z0(h0, m0, c0);
        n n2 = this.x0(h0, m0, c0);
        return n2 == null ? this.F0(h0, m0, c0) : n2;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.deser.q
    public n c(h h0, m m0, c c0, Class class0) throws com.fasterxml.jackson.databind.o {
        return h0.z(t.t) ? this.G0(h0, m0, h0.g0().q1(h0.x().P(class0, m0.D()), c0)) : this.G0(h0, m0, h0.g0().q1(h0.R(class0), c0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.b
    public com.fasterxml.jackson.databind.deser.q w0(o o0) {
        if(this.b == o0) {
            return this;
        }
        com.fasterxml.jackson.databind.util.h.B0(g.class, this, "withConfig");
        return new g(o0);
    }

    protected n x0(h h0, m m0, c c0) throws com.fasterxml.jackson.databind.o {
        String s = e.a(m0);
        return s != null && h0.g0().b(m0.g()) == null ? new C(m0, s) : null;
    }

    // 去混淆评级： 低(20)
    private boolean y0(Class class0) {
        return Collection.class.isAssignableFrom(class0) || Map.class.isAssignableFrom(class0);
    }

    protected void z0(h h0, m m0, c c0) throws com.fasterxml.jackson.databind.o {
        r.a().b(h0, m0, c0);
    }
}

