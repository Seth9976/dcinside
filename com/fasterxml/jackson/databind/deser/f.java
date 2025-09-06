package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.annotation.f.a;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.deser.impl.E;
import com.fasterxml.jackson.databind.deser.impl.s;
import com.fasterxml.jackson.databind.deser.impl.u;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class f {
    protected final g a;
    protected final h b;
    protected final c c;
    protected final Map d;
    protected List e;
    protected HashMap f;
    protected HashSet g;
    protected HashSet h;
    protected B i;
    protected s j;
    protected x k;
    protected boolean l;
    protected l m;
    protected a n;

    public f(c c0, h h0) {
        this.d = new LinkedHashMap();
        this.c = c0;
        this.b = h0;
        this.a = h0.g0();
    }

    protected f(f f0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.d = linkedHashMap0;
        this.c = f0.c;
        this.b = f0.b;
        this.a = f0.a;
        linkedHashMap0.putAll(f0.d);
        this.e = f.c(f0.e);
        this.f = f.b(f0.f);
        this.g = f0.g;
        this.h = f0.h;
        this.i = f0.i;
        this.j = f0.j;
        this.k = f0.k;
        this.l = f0.l;
        this.m = f0.m;
        this.n = f0.n;
    }

    public boolean A(com.fasterxml.jackson.databind.B b0) {
        return this.r(b0) != null;
    }

    public y B(com.fasterxml.jackson.databind.B b0) {
        return (y)this.d.remove(b0.d());
    }

    public void C(x x0) {
        if(this.k != null && x0 != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.k = x0;
    }

    public void D(boolean z) {
        this.l = z;
    }

    public void E(s s0) {
        this.j = s0;
    }

    public void F(l l0, a f$a0) {
        this.m = l0;
        this.n = f$a0;
    }

    public void G(B b0) {
        this.i = b0;
    }

    protected Map a(Collection collection0) {
        b b0 = this.a.n();
        Map map0 = null;
        if(b0 != null) {
            for(Object object0: collection0) {
                y y0 = (y)object0;
                List list0 = b0.T(y0.h());
                if(list0 != null && !list0.isEmpty()) {
                    if(map0 == null) {
                        map0 = new HashMap();
                    }
                    map0.put(y0.getName(), list0);
                }
            }
        }
        return map0 == null ? Collections.emptyMap() : map0;
    }

    private static HashMap b(HashMap hashMap0) {
        return hashMap0 == null ? null : new HashMap(hashMap0);
    }

    private static List c(List list0) {
        return list0 == null ? null : new ArrayList(list0);
    }

    protected boolean d() {
        Boolean boolean0 = this.c.l(null).h(com.fasterxml.jackson.annotation.n.a.b);
        return boolean0 == null ? this.a.a0(t.y) : boolean0.booleanValue();
    }

    protected void e(Collection collection0) throws o {
        if(this.a.c()) {
            for(Object object0: collection0) {
                y y0 = (y)object0;
                try {
                    y0.w(this.a);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    this.f(illegalArgumentException0);
                }
            }
        }
        x x0 = this.k;
        if(x0 != null) {
            try {
                x0.h(this.a);
            }
            catch(IllegalArgumentException illegalArgumentException1) {
                this.f(illegalArgumentException1);
            }
        }
        l l0 = this.m;
        if(l0 != null) {
            try {
                l0.k(this.a.a0(t.q));
            }
            catch(IllegalArgumentException illegalArgumentException2) {
                this.f(illegalArgumentException2);
            }
        }
    }

    protected void f(IllegalArgumentException illegalArgumentException0) throws o {
        try {
            this.b.X0(this.c, illegalArgumentException0.getMessage(), new Object[0]);
        }
        catch(com.fasterxml.jackson.databind.f f0) {
            if(f0.getCause() == null) {
                f0.initCause(illegalArgumentException0);
            }
            throw f0;
        }
    }

    public void g(String s, y y0) throws o {
        if(this.f == null) {
            this.f = new HashMap(4);
        }
        if(this.a.c()) {
            try {
                y0.w(this.a);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                this.f(illegalArgumentException0);
            }
        }
        this.f.put(s, y0);
    }

    public void h(y y0) {
        this.m(y0);
    }

    public void i(String s) {
        if(this.g == null) {
            this.g = new HashSet();
        }
        this.g.add(s);
    }

    public void j(String s) {
        if(this.h == null) {
            this.h = new HashSet();
        }
        this.h.add(s);
    }

    public void k(com.fasterxml.jackson.databind.B b0, m m0, com.fasterxml.jackson.databind.util.b b1, k k0, Object object0) throws o {
        if(this.e == null) {
            this.e = new ArrayList();
        }
        if(this.a.c()) {
            try {
                k0.k(this.a.a0(t.q));
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                this.f(illegalArgumentException0);
            }
        }
        this.e.add(new E(b0, m0, k0, object0));
    }

    public void l(y y0, boolean z) {
        String s = y0.getName();
        this.d.put(s, y0);
    }

    public void m(y y0) {
        String s = y0.getName();
        y y1 = (y)this.d.put(s, y0);
        if(y1 != null && y1 != y0) {
            throw new IllegalArgumentException("Duplicate property \'" + y0.getName() + "\' for " + this.c.H());
        }
    }

    public n n() throws o {
        int v;
        Collection collection0 = this.d.values();
        this.e(collection0);
        Map map0 = this.a(collection0);
        boolean z = this.d();
        com.fasterxml.jackson.databind.deser.impl.c c0 = com.fasterxml.jackson.databind.deser.impl.c.m(this.a, collection0, map0, z);
        c0.k();
        boolean z1 = this.a.a0(t.v);
        if(z1) {
            for(Object object0: collection0) {
                if(!((y)object0).I()) {
                    continue;
                }
                v = 1;
                goto label_15;
            }
        }
        v = !z1;
    label_15:
        if(this.j != null) {
            c0 = c0.F(new u(this.j, A.i));
        }
        return new com.fasterxml.jackson.databind.deser.c(this, this.c, c0, this.f, this.g, this.l, this.h, ((boolean)v));
    }

    public com.fasterxml.jackson.databind.deser.a o() {
        return new com.fasterxml.jackson.databind.deser.a(this, this.c, this.f, this.d);
    }

    public n p(m m0, String s) throws o {
        int v = 1;
        l l0 = this.m;
        if(l0 != null) {
            Class class0 = l0.N();
            Class class1 = m0.g();
            if(class0 != class1 && !class0.isAssignableFrom(class1) && !class1.isAssignableFrom(class0)) {
                Object[] arr_object1 = {this.m.n(), com.fasterxml.jackson.databind.util.h.D(class0), com.fasterxml.jackson.databind.util.h.Q(m0)};
                this.b.D(this.c.H(), String.format("Build method `%s` has wrong return type (%s), not compatible with POJO type (%s)", arr_object1));
            }
        }
        else if(!s.isEmpty()) {
            Object[] arr_object = {com.fasterxml.jackson.databind.util.h.Q(this.c.H()), s};
            this.b.D(this.c.H(), String.format("Builder class %s does not have build method (name: \'%s\')", arr_object));
        }
        Collection collection0 = this.d.values();
        this.e(collection0);
        Map map0 = this.a(collection0);
        boolean z = this.d();
        com.fasterxml.jackson.databind.deser.impl.c c0 = com.fasterxml.jackson.databind.deser.impl.c.m(this.a, collection0, map0, z);
        c0.k();
        boolean z1 = this.a.a0(t.v);
        if(z1) {
            for(Object object0: collection0) {
                if(!((y)object0).I()) {
                    continue;
                }
                goto label_26;
            }
        }
        v = !z1;
    label_26:
        if(this.j != null) {
            c0 = c0.F(new u(this.j, A.i));
        }
        return this.q(m0, c0, ((boolean)v));
    }

    protected n q(m m0, com.fasterxml.jackson.databind.deser.impl.c c0, boolean z) {
        return new i(this, this.c, m0, c0, this.f, this.g, this.l, this.h, z);
    }

    public y r(com.fasterxml.jackson.databind.B b0) {
        return (y)this.d.get(b0.d());
    }

    public x s() {
        return this.k;
    }

    public l t() {
        return this.m;
    }

    public a u() {
        return this.n;
    }

    public List v() {
        return this.e;
    }

    public s w() {
        return this.j;
    }

    public Iterator x() {
        return this.d.values().iterator();
    }

    public B y() {
        return this.i;
    }

    public boolean z(String s) {
        return q.c(s, this.g, this.h);
    }
}

