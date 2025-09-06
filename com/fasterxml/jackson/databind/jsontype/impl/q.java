package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.b;
import com.fasterxml.jackson.annotation.H.d;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.jsontype.i;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import java.util.Collection;

public class q implements i {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            a.b = arr_v;
            try {
                arr_v[b.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.b.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.h.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[com.fasterxml.jackson.annotation.H.a.values().length];
            a.a = arr_v1;
            try {
                arr_v1[com.fasterxml.jackson.annotation.H.a.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.H.a.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.H.a.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.H.a.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.H.a.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected b a;
    protected com.fasterxml.jackson.annotation.H.a b;
    protected String c;
    protected boolean d;
    protected Boolean e;
    protected Class f;
    protected g g;

    public q() {
        this.d = false;
    }

    protected q(b h$b0, com.fasterxml.jackson.annotation.H.a h$a0, String s) {
        this.d = false;
        this.a = h$b0;
        this.b = h$a0;
        this.c = s;
    }

    public q(d h$d0) {
        this.d = false;
        if(h$d0 != null) {
            this.G(h$d0);
        }
    }

    protected q(q q0, Class class0) {
        this.a = q0.a;
        this.b = q0.b;
        this.c = q0.c;
        this.d = q0.d;
        this.g = q0.g;
        this.f = class0;
        this.e = q0.e;
    }

    protected com.fasterxml.jackson.databind.jsontype.d A(t t0, m m0, com.fasterxml.jackson.databind.jsontype.d d0) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", h.j(d0), h.j(m0.g())));
    }

    public com.fasterxml.jackson.databind.jsontype.d B(t t0) {
        return t0.O();
    }

    public q C(boolean z) {
        this.d = z;
        return this;
    }

    public q D(String s) {
        if(s == null || s.isEmpty()) {
            s = this.a.a();
        }
        this.c = s;
        return this;
    }

    protected com.fasterxml.jackson.databind.jsontype.d E(t t0, m m0) {
        com.fasterxml.jackson.databind.jsontype.d d0 = this.B(t0);
        if(this.a == b.c || this.a == b.d) {
            com.fasterxml.jackson.databind.jsontype.d.b d$b0 = d0.a(t0, m0);
            if(d$b0 == com.fasterxml.jackson.databind.jsontype.d.b.b) {
                return this.A(t0, m0, d0);
            }
            if(d$b0 == com.fasterxml.jackson.databind.jsontype.d.b.a) {
                return com.fasterxml.jackson.databind.jsontype.impl.m.d;
            }
        }
        return d0;
    }

    public q F(Class class0) {
        if(this.f == class0) {
            return this;
        }
        h.B0(q.class, this, "withDefaultImpl");
        return new q(this, class0);
    }

    public q G(d h$d0) {
        b h$b0 = h$d0.g();
        this.a = h$b0;
        if(h$b0 == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this.b = h$d0.i();
        this.c = q.m(h$d0.j(), this.a);
        this.f = h$d0.f();
        this.d = h$d0.h();
        this.e = h$d0.k();
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public i a(boolean z) {
        return this.C(z);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public i b(d h$d0) {
        return this.G(h$d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public f c(com.fasterxml.jackson.databind.g g0, m m0, Collection collection0) {
        if(this.a == b.b) {
            return null;
        }
        if(m0.isPrimitive()) {
            return null;
        }
        g g1 = this.s(g0, m0, this.E(g0, m0), collection0, false, true);
        m m1 = this.q(g0, m0);
        if(this.a == b.g) {
            return new c(m0, g1, m1, g0, collection0);
        }
        switch(this.b) {
            case 1: {
                return new com.fasterxml.jackson.databind.jsontype.impl.a(m0, g1, this.c, this.d, m1);
            }
            case 3: {
                return new j(m0, g1, this.c, this.d, m1);
            }
            case 4: {
                return new com.fasterxml.jackson.databind.jsontype.impl.f(m0, g1, this.c, this.d, m1);
            }
            case 2: 
            case 5: {
                return new com.fasterxml.jackson.databind.jsontype.impl.h(m0, g1, this.c, this.d, m1, this.b, this.n(g0, m0));
            }
            default: {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.b);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public i d(b h$b0, g g0) {
        return this.w(h$b0, g0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public i e(String s) {
        return this.D(s);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public i f(Class class0) {
        return this.p(class0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public com.fasterxml.jackson.databind.jsontype.j g(G g0, m m0, Collection collection0) {
        if(this.a == b.b) {
            return null;
        }
        if(m0.isPrimitive()) {
            return null;
        }
        if(this.a == b.g) {
            return com.fasterxml.jackson.databind.jsontype.impl.d.E();
        }
        g g1 = this.s(g0, m0, this.B(g0), collection0, true, false);
        switch(this.b) {
            case 1: {
                return new com.fasterxml.jackson.databind.jsontype.impl.b(g1, null);
            }
            case 2: {
                return new com.fasterxml.jackson.databind.jsontype.impl.i(g1, null, this.c);
            }
            case 3: {
                return new k(g1, null);
            }
            case 4: {
                return new com.fasterxml.jackson.databind.jsontype.impl.g(g1, null, this.c);
            }
            case 5: {
                return new e(g1, null, this.c);
            }
            default: {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.b);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public i h(com.fasterxml.jackson.annotation.H.a h$a0) {
        return this.u(h$a0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public i i(d h$d0, g g0) {
        return this.x(h$d0, g0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public i j(Class class0) {
        return this.F(class0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.i
    public Class k() {
        return this.f;
    }

    protected boolean l(com.fasterxml.jackson.databind.g g0, m m0) {
        return g0.n().Q(g0, com.fasterxml.jackson.databind.introspect.e.n(g0, m0.g())) != null;
    }

    protected static String m(String s, b h$b0) {
        return s == null ? h$b0.a() : s;
    }

    protected boolean n(com.fasterxml.jackson.databind.g g0, m m0) {
        if(this.e != null && m0.n()) {
            return this.e.booleanValue();
        }
        return g0.a0(com.fasterxml.jackson.databind.t.u) ? true : this.l(g0, m0);
    }

    protected boolean o(t t0, m m0) [...] // Inlined contents

    public q p(Class class0) {
        this.f = class0;
        return this;
    }

    protected m q(com.fasterxml.jackson.databind.g g0, m m0) {
        Class class0 = this.f;
        if(class0 != null) {
            if(class0 == Void.class || class0 == com.fasterxml.jackson.databind.annotation.k.class) {
                return g0.S().f0(this.f);
            }
            if(m0.j(class0)) {
                return m0;
            }
            if(m0.b0(this.f)) {
                return g0.S().b0(m0, this.f);
            }
            if(m0.j(this.f)) {
                return m0;
            }
        }
        return !g0.a0(com.fasterxml.jackson.databind.t.s) || m0.k() ? null : m0;
    }

    public String r() {
        return this.c;
    }

    protected g s(t t0, m m0, com.fasterxml.jackson.databind.jsontype.d d0, Collection collection0, boolean z, boolean z1) {
        g g0 = this.g;
        if(g0 != null) {
            return g0;
        }
        b h$b0 = this.a;
        if(h$b0 != null) {
            switch(h$b0) {
                case 1: 
                case 2: {
                    return l.j(m0, t0, d0);
                }
                case 3: {
                    return n.l(m0, t0, d0);
                }
                case 4: {
                    return o.j(t0, m0, collection0, z, z1);
                }
                case 5: {
                    return u.j(t0, m0, collection0, z, z1);
                }
                case 6: {
                    return null;
                }
                default: {
                    throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.a);
                }
            }
        }
        throw new IllegalStateException("Cannot build, \'init()\' not yet called");
    }

    public q u(com.fasterxml.jackson.annotation.H.a h$a0) {
        if(h$a0 == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this.b = h$a0;
        return this;
    }

    public q w(b h$b0, g g0) {
        if(h$b0 == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this.a = h$b0;
        this.g = g0;
        this.c = h$b0.a();
        return this;
    }

    public q x(d h$d0, g g0) {
        this.g = g0;
        if(h$d0 != null) {
            this.G(h$d0);
        }
        return this;
    }

    public boolean y() {
        return this.d;
    }

    public static q z() {
        d h$d0 = d.d(b.b, null, null, null, false, null);
        return new q().G(h$d0);
    }
}

