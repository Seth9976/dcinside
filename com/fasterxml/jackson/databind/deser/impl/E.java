package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.std.J;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import java.lang.reflect.Member;
import java.util.HashMap;

public class e {
    protected final c a;
    protected final boolean b;
    protected final boolean c;
    protected final p[] d;
    protected int e;
    protected boolean f;
    protected y[] g;
    protected y[] h;
    protected y[] i;
    protected static final int j = 0;
    protected static final int k = 1;
    protected static final int l = 2;
    protected static final int m = 3;
    protected static final int n = 4;
    protected static final int o = 5;
    protected static final int p = 6;
    protected static final int q = 7;
    protected static final int r = 8;
    protected static final int s = 9;
    protected static final int t = 10;
    protected static final String[] u;

    static {
        e.u = new String[]{"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    }

    public e(c c0, t t0) {
        this.d = new p[11];
        this.e = 0;
        this.f = false;
        this.a = c0;
        this.b = t0.c();
        this.c = t0.a0(com.fasterxml.jackson.databind.t.q);
    }

    private m a(h h0, p p0, y[] arr_y) throws o {
        int v = 0;
        if(this.f && p0 != null) {
            if(arr_y != null) {
                for(int v1 = 0; v1 < arr_y.length; ++v1) {
                    if(arr_y[v1] == null) {
                        v = v1;
                        break;
                    }
                }
            }
            g g0 = h0.g0();
            m m0 = p0.E(v);
            b b0 = g0.n();
            if(b0 != null) {
                com.fasterxml.jackson.databind.introspect.o o0 = p0.B(v);
                Object object0 = b0.q(o0);
                return object0 == null ? b0.L0(g0, o0, m0) : m0.m0(h0.S(o0, object0));
            }
            return m0;
        }
        return null;
    }

    private k b(k k0) {
        if(k0 != null && this.b) {
            com.fasterxml.jackson.databind.util.h.i(((Member)k0.c()), this.c);
        }
        return k0;
    }

    // 去混淆评级： 低(20)
    protected boolean c(p p0) {
        return com.fasterxml.jackson.databind.util.h.Y(p0.m()) && "valueOf".equals(p0.getName());
    }

    // 去混淆评级： 低(20)
    protected void d(int v, boolean z, p p0, p p1) {
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", e.u[v], (z ? "explicitly marked" : "implicitly discovered"), p0, p1));
    }

    public void e(p p0, boolean z) {
        this.s(p0, 6, z);
    }

    public void f(p p0, boolean z) {
        this.s(p0, 4, z);
    }

    public void g(p p0, boolean z) {
        this.s(p0, 7, z);
    }

    public void h(p p0, boolean z, y[] arr_y, int v) {
        if(p0.E(v).m()) {
            if(this.s(p0, 10, z)) {
                this.h = arr_y;
            }
        }
        else if(this.s(p0, 8, z)) {
            this.g = arr_y;
        }
    }

    public void i(p p0, boolean z) {
        this.s(p0, 5, z);
    }

    public void j(p p0, boolean z) {
        this.s(p0, 2, z);
    }

    public void k(p p0, boolean z) {
        this.s(p0, 3, z);
    }

    public void l(p p0, boolean z, y[] arr_y) {
        if(this.s(p0, 9, z)) {
            if(arr_y.length > 1) {
                HashMap hashMap0 = new HashMap();
                for(int v = 0; v < arr_y.length; ++v) {
                    String s = arr_y[v].getName();
                    if(!s.isEmpty() || arr_y[v].z() == null) {
                        Integer integer0 = (Integer)hashMap0.put(s, v);
                        if(integer0 != null) {
                            throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", s, integer0, v, com.fasterxml.jackson.databind.util.h.l0(this.a.y())));
                        }
                    }
                }
            }
            this.i = arr_y;
        }
    }

    public void m(p p0, boolean z) {
        this.s(p0, 1, z);
    }

    public B n(h h0) throws o {
        m m0 = this.a(h0, this.d[8], this.g);
        m m1 = this.a(h0, this.d[10], this.h);
        B b0 = new J(h0.g0(), this.a.H());
        ((J)b0).U(this.d[0], this.d[8], m0, this.g, this.d[9], this.i);
        ((J)b0).N(this.d[10], m1, this.h);
        ((J)b0).V(this.d[1]);
        ((J)b0).S(this.d[2]);
        ((J)b0).T(this.d[3]);
        ((J)b0).P(this.d[4]);
        ((J)b0).R(this.d[5]);
        ((J)b0).O(this.d[6]);
        ((J)b0).Q(this.d[7]);
        return b0;
    }

    public boolean o() {
        return this.d[0] != null;
    }

    public boolean p() {
        return this.d[8] != null;
    }

    public boolean q() {
        return this.d[9] != null;
    }

    public void r(p p0) {
        this.d[0] = (p)this.b(p0);
    }

    protected boolean s(p p0, int v, boolean z) {
        int v1;
        this.f = true;
        p p1 = this.d[v];
        if(p1 != null) {
            if((this.e & 1 << v) == 0) {
                v1 = !z;
            }
            else {
                if(!z) {
                    return false;
                }
                v1 = 1;
            }
            if(v1 != 0 && p1.getClass() == p0.getClass()) {
                Class class0 = p1.F(0);
                Class class1 = p0.F(0);
                if(class0 == class1) {
                    if(this.c(p0)) {
                        return false;
                    }
                    if(!this.c(p1)) {
                        this.d(v, z, p1, p0);
                    }
                }
                else {
                    if(class1.isAssignableFrom(class0)) {
                        return false;
                    }
                    if(!class0.isAssignableFrom(class1)) {
                        if(class0.isPrimitive() == class1.isPrimitive()) {
                            this.d(v, z, p1, p0);
                        }
                        else if(class0.isPrimitive()) {
                            return false;
                        }
                    }
                }
            }
        }
        if(z) {
            this.e |= 1 << v;
        }
        this.d[v] = (p)this.b(p0);
        return true;
    }
}

