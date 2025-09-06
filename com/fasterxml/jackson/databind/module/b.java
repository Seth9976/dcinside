package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.deser.s.a;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.s;
import com.fasterxml.jackson.databind.type.d;
import com.fasterxml.jackson.databind.type.e;
import com.fasterxml.jackson.databind.type.i;
import com.fasterxml.jackson.databind.type.j;
import com.fasterxml.jackson.databind.type.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class b extends a implements Serializable {
    protected HashMap a;
    protected boolean b;
    private static final long c = 1L;

    public b() {
        this.a = null;
        this.b = false;
    }

    public b(Map map0) {
        this.a = null;
        this.b = false;
        this.m(map0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public boolean a(g g0, Class class0) {
        return this.a != null && this.a.containsKey(new com.fasterxml.jackson.databind.type.b(class0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n b(m m0, g g0, c c0) throws o {
        return this.k(m0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n c(e e0, g g0, c c0, f f0, n n0) throws o {
        return this.k(e0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n d(com.fasterxml.jackson.databind.type.a a0, g g0, c c0, f f0, n n0) throws o {
        return this.k(a0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n e(l l0, g g0, c c0, f f0, n n0) throws o {
        return this.k(l0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n f(Class class0, g g0, c c0) throws o {
        HashMap hashMap0 = this.a;
        if(hashMap0 == null) {
            return null;
        }
        n n0 = (n)hashMap0.get(new com.fasterxml.jackson.databind.type.b(class0));
        return n0 != null || !this.b || !class0.isEnum() ? n0 : ((n)this.a.get(new com.fasterxml.jackson.databind.type.b(Enum.class)));
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n g(i i0, g g0, c c0, s s0, f f0, n n0) throws o {
        return this.k(i0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n h(Class class0, g g0, c c0) throws o {
        return this.a == null ? null : ((n)this.a.get(new com.fasterxml.jackson.databind.type.b(class0)));
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n i(d d0, g g0, c c0, f f0, n n0) throws o {
        return this.k(d0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.s$a
    public n j(j j0, g g0, c c0, s s0, f f0, n n0) throws o {
        return this.k(j0);
    }

    private final n k(m m0) {
        return this.a == null ? null : ((n)this.a.get(new com.fasterxml.jackson.databind.type.b(m0.g())));
    }

    public void l(Class class0, n n0) {
        com.fasterxml.jackson.databind.type.b b0 = new com.fasterxml.jackson.databind.type.b(class0);
        if(this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(b0, n0);
        if(class0 == Enum.class) {
            this.b = true;
        }
    }

    public void m(Map map0) {
        for(Object object0: map0.entrySet()) {
            this.l(((Class)((Map.Entry)object0).getKey()), ((n)((Map.Entry)object0).getValue()));
        }
    }
}

