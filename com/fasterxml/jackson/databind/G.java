package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.cfg.a;
import com.fasterxml.jackson.databind.cfg.c;
import com.fasterxml.jackson.databind.cfg.e;
import com.fasterxml.jackson.databind.cfg.f;
import com.fasterxml.jackson.databind.cfg.j;
import com.fasterxml.jackson.databind.cfg.k;
import com.fasterxml.jackson.databind.cfg.l;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.cfg.u;
import com.fasterxml.jackson.databind.deser.o;
import com.fasterxml.jackson.databind.introspect.J;
import com.fasterxml.jackson.databind.node.m;
import com.fasterxml.jackson.databind.type.h;
import com.fasterxml.jackson.databind.util.D;
import java.io.Serializable;

public final class g extends u implements Serializable {
    private static final int A = 0;
    protected final com.fasterxml.jackson.databind.util.u q;
    protected final m r;
    protected final e s;
    protected final j t;
    protected final int u;
    protected final int v;
    protected final int w;
    protected final int x;
    protected final int y;
    private static final long z = 2L;

    static {
        g.A = t.d(i.class);
    }

    public g(a a0, com.fasterxml.jackson.databind.jsontype.e e0, J j0, D d0, com.fasterxml.jackson.databind.cfg.i i0, e e1, com.fasterxml.jackson.databind.cfg.m m0) {
        super(a0, e0, j0, d0, i0, m0);
        this.u = g.A;
        this.q = null;
        this.r = m.d;
        this.t = null;
        this.s = e1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
    }

    private g(g g0, long v, int v1, int v2, int v3, int v4, int v5) {
        super(g0, v);
        this.u = v1;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = v2;
        this.w = v3;
        this.x = v4;
        this.y = v5;
    }

    private g(g g0, B b0) {
        super(g0, b0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    private g(g g0, a a0) {
        super(g0, a0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    private g(g g0, j j0) {
        super(g0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = j0;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    protected g(g g0, k k0) {
        super(g0, k0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    protected g(g g0, com.fasterxml.jackson.databind.cfg.m m0) {
        super(g0, m0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    protected g(g g0, J j0) {
        super(g0, j0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    private g(g g0, com.fasterxml.jackson.databind.jsontype.e e0) {
        super(g0, e0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    protected g(g g0, com.fasterxml.jackson.databind.jsontype.e e0, J j0, D d0, com.fasterxml.jackson.databind.cfg.i i0, e e1) {
        super(g0, e0, j0, d0, i0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.t = g0.t;
        this.s = e1;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    private g(g g0, m m0) {
        super(g0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = m0;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    private g(g g0, com.fasterxml.jackson.databind.util.u u0) {
        super(g0);
        this.u = g0.u;
        this.q = u0;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    private g(g g0, Class class0) {
        super(g0, class0);
        this.u = g0.u;
        this.q = g0.q;
        this.r = g0.r;
        this.s = g0.s;
        this.t = g0.t;
        this.v = g0.v;
        this.w = g0.w;
        this.x = g0.x;
        this.y = g0.y;
    }

    public g A1(k k0) {
        return k0 == this.j ? this : new g(this, k0);
    }

    public g B1(com.fasterxml.jackson.databind.jsontype.e e0) {
        return this.g == e0 ? this : new g(this, e0);
    }

    public g C1(m m0) {
        return this.r == m0 ? this : new g(this, m0);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.u
    public u D0(com.fasterxml.jackson.databind.jsontype.e e0) {
        return this.B1(e0);
    }

    public g D1(d[] arr_d) {
        if(arr_d.length > 0 && arr_d[0] instanceof com.fasterxml.jackson.core.json.e) {
            return this.Y0(arr_d);
        }
        int v1 = this.x;
        int v2 = this.y;
        for(int v = 0; v < arr_d.length; ++v) {
            int v3 = arr_d[v].a();
            v1 |= v3;
            v2 |= v3;
        }
        return this.x != v1 || this.y != v2 ? new g(this, this.a, this.u, this.v, this.w, v1, v2) : this;
    }

    public g E1(com.fasterxml.jackson.core.n.a[] arr_n$a) {
        int v1 = this.v;
        int v2 = this.w;
        for(int v = 0; v < arr_n$a.length; ++v) {
            int v3 = arr_n$a[v].d();
            v1 |= v3;
            v2 |= v3;
        }
        return this.v != v1 || this.w != v2 ? new g(this, this.a, this.u, v1, v2, this.x, this.y) : this;
    }

    public g F1(i[] arr_i) {
        int v1 = this.u;
        for(int v = 0; v < arr_i.length; ++v) {
            v1 |= arr_i[v].a();
        }
        return v1 == this.u ? this : new g(this, this.a, v1, this.v, this.w, this.x, this.y);
    }

    // 去混淆评级： 低(20)
    public g G1(o o0) {
        return com.fasterxml.jackson.databind.util.u.a(this.q, o0) ? this : new g(this, new com.fasterxml.jackson.databind.util.u(o0, this.q));
    }

    public g H1() {
        return this.q == null ? this : new g(this, null);
    }

    public g I1(B b0) {
        if(b0 == null) {
            return this.h == null ? this : new g(this, null);
        }
        return b0.equals(this.h) ? this : new g(this, b0);
    }

    public g J1(Class class0) {
        return this.i == class0 ? this : new g(this, class0);
    }

    public g K1(d d0) {
        if(d0 instanceof com.fasterxml.jackson.core.json.e) {
            return this.a1(new d[]{d0});
        }
        int v = d0.a();
        int v1 = this.x & ~v;
        int v2 = d0.a();
        int v3 = this.y | v2;
        return this.x != v1 || this.y != v3 ? new g(this, this.a, this.u, this.v, this.w, v1, v3) : this;
    }

    public g L1(com.fasterxml.jackson.core.n.a n$a0) {
        int v = this.v & ~n$a0.d();
        int v1 = this.w | n$a0.d();
        return this.v != v || this.w != v1 ? new g(this, this.a, this.u, v, v1, this.x, this.y) : this;
    }

    public g M1(i i0) {
        int v = this.u & ~i0.a();
        return v == this.u ? this : new g(this, this.a, v, this.v, this.w, this.x, this.y);
    }

    public g N1(i i0, i[] arr_i) {
        int v1 = ~i0.a() & this.u;
        for(int v = 0; v < arr_i.length; ++v) {
            v1 &= ~arr_i[v].a();
        }
        return v1 == this.u ? this : new g(this, this.a, v1, this.v, this.w, this.x, this.y);
    }

    public g O1(d[] arr_d) {
        if(arr_d.length > 0 && arr_d[0] instanceof com.fasterxml.jackson.core.json.e) {
            return this.a1(arr_d);
        }
        int v1 = this.x;
        int v2 = this.y;
        for(int v = 0; v < arr_d.length; ++v) {
            int v3 = arr_d[v].a();
            v1 &= ~v3;
            v2 |= v3;
        }
        return this.x != v1 || this.y != v2 ? new g(this, this.a, this.u, this.v, this.w, v1, v2) : this;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.u
    public u P0(B b0) {
        return this.I1(b0);
    }

    public g P1(com.fasterxml.jackson.core.n.a[] arr_n$a) {
        int v1 = this.v;
        int v2 = this.w;
        for(int v = 0; v < arr_n$a.length; ++v) {
            int v3 = arr_n$a[v].d();
            v1 &= ~v3;
            v2 |= v3;
        }
        return this.v != v1 || this.w != v2 ? new g(this, this.a, this.u, v1, v2, this.x, this.y) : this;
    }

    public g Q1(i[] arr_i) {
        int v1 = this.u;
        for(int v = 0; v < arr_i.length; ++v) {
            v1 &= ~arr_i[v].a();
        }
        return v1 == this.u ? this : new g(this, this.a, v1, this.v, this.w, this.x, this.y);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.u
    public u R0(Class class0) {
        return this.J1(class0);
    }

    protected final g W0(com.fasterxml.jackson.databind.cfg.m m0) {
        return new g(this, m0);
    }

    protected final g X0(a a0) {
        return this.b == a0 ? this : new g(this, a0);
    }

    private g Y0(d[] arr_d) {
        int v = this.v;
        int v1 = this.w;
        int v2 = this.x;
        int v3 = this.y;
        for(int v4 = 0; v4 < arr_d.length; ++v4) {
            d d0 = arr_d[v4];
            int v5 = d0.a();
            v2 |= v5;
            v3 |= v5;
            if(d0 instanceof com.fasterxml.jackson.core.json.e) {
                com.fasterxml.jackson.core.n.a n$a0 = ((com.fasterxml.jackson.core.json.e)d0).f();
                if(n$a0 != null) {
                    int v6 = n$a0.d();
                    v |= v6;
                    v1 |= v6;
                }
            }
        }
        return this.x != v2 || this.y != v3 || this.v != v || this.w != v1 ? new g(this, this.a, this.u, v, v1, v2, v3) : this;
    }

    protected final g Z0(long v) {
        return new g(this, v, this.u, this.v, this.w, this.x, this.y);
    }

    private g a1(d[] arr_d) {
        int v = this.v;
        int v1 = this.w;
        int v2 = this.x;
        int v3 = this.y;
        for(int v4 = 0; v4 < arr_d.length; ++v4) {
            d d0 = arr_d[v4];
            int v5 = d0.a();
            v2 &= ~v5;
            v3 |= v5;
            if(d0 instanceof com.fasterxml.jackson.core.json.e) {
                com.fasterxml.jackson.core.n.a n$a0 = ((com.fasterxml.jackson.core.json.e)d0).f();
                if(n$a0 != null) {
                    int v6 = n$a0.d();
                    v &= ~v6;
                    v1 |= v6;
                }
            }
        }
        return this.x != v2 || this.y != v3 || this.v != v || this.w != v1 ? new g(this, this.a, this.u, v, v1, v2, v3) : this;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public final boolean b0(l l0) {
        return this.m.e(l0);
    }

    public c c1(h h0, Class class0, f f0) {
        return this.s.e(this, h0, class0, f0);
    }

    public c d1(h h0, Class class0, c c0) {
        return this.s.f(this, h0, class0, c0);
    }

    public com.fasterxml.jackson.databind.jsontype.f e1(com.fasterxml.jackson.databind.m m0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.introspect.d d0 = this.W(m0.g()).A();
        com.fasterxml.jackson.databind.jsontype.i i0 = this.n().r0(this, d0, m0);
        if(i0 == null) {
            i0 = this.J(m0);
            return i0 == null ? null : i0.c(this, m0, null);
        }
        return i0.c(this, m0, this.Q().e(this, d0));
    }

    protected a f1() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.t
    public boolean g0() {
        return this.h == null ? this.t1(i.u) : !this.h.i();
    }

    public j g1() {
        return this.t == null ? j.e : this.t;
    }

    public final int h1() {
        return this.u;
    }

    public final m i1() {
        return this.r;
    }

    public com.fasterxml.jackson.databind.util.u j1() {
        return this.q;
    }

    public final boolean k1(int v) {
        return (this.u & v) == v;
    }

    public final boolean l1(int v) {
        return (v & this.u) != 0;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.u
    protected u m0(com.fasterxml.jackson.databind.cfg.m m0) {
        return this.W0(m0);
    }

    public n m1(n n0) {
        int v = this.w;
        if(v != 0) {
            n0.q4(this.v, v);
        }
        int v1 = this.y;
        if(v1 != 0) {
            n0.p4(this.x, v1);
        }
        return n0;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.u
    protected u n0(a a0) {
        return this.X0(a0);
    }

    public n n1(n n0, com.fasterxml.jackson.core.e e0) {
        int v = this.w;
        if(v != 0) {
            n0.q4(this.v, v);
        }
        int v1 = this.y;
        if(v1 != 0) {
            n0.p4(this.x, v1);
        }
        if(e0 != null) {
            n0.H4(e0);
        }
        return n0;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.u
    protected u o0(long v) {
        return this.Z0(v);
    }

    public com.fasterxml.jackson.databind.c o1(com.fasterxml.jackson.databind.m m0) {
        return this.r().d(this, m0, this);
    }

    @Deprecated
    public com.fasterxml.jackson.databind.c p1(com.fasterxml.jackson.databind.m m0) {
        return this.r().e(this, m0, this);
    }

    public com.fasterxml.jackson.databind.c q1(com.fasterxml.jackson.databind.m m0, com.fasterxml.jackson.databind.c c0) {
        return this.r().f(this, m0, this, c0);
    }

    public com.fasterxml.jackson.databind.c r1(com.fasterxml.jackson.databind.m m0) {
        return this.r().c(this, m0, this);
    }

    public final boolean s1(com.fasterxml.jackson.core.n.a n$a0, com.fasterxml.jackson.core.h h0) {
        return (n$a0.d() & this.w) == 0 ? h0.O(n$a0) : (n$a0.d() & this.v) != 0;
    }

    public final boolean t1(i i0) {
        return (i0.a() & this.u) != 0;
    }

    public final boolean u1() {
        return i.q.b(this.u);
    }

    public g v1(d d0) {
        if(d0 instanceof com.fasterxml.jackson.core.json.e) {
            return this.Y0(new d[]{d0});
        }
        int v = d0.a();
        int v1 = this.x | v;
        int v2 = d0.a();
        int v3 = this.y | v2;
        return this.x != v1 || this.y != v3 ? new g(this, this.a, this.u, this.v, this.w, v1, v3) : this;
    }

    public g w1(com.fasterxml.jackson.core.n.a n$a0) {
        int v = this.v | n$a0.d();
        int v1 = this.w | n$a0.d();
        return this.v != v || this.w != v1 ? new g(this, this.a, this.u, v, v1, this.x, this.y) : this;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.u
    public u x0(k k0) {
        return this.A1(k0);
    }

    public g x1(i i0) {
        int v = this.u | i0.a();
        return v == this.u ? this : new g(this, this.a, v, this.v, this.w, this.x, this.y);
    }

    public g y1(i i0, i[] arr_i) {
        int v1 = i0.a() | this.u;
        for(int v = 0; v < arr_i.length; ++v) {
            v1 |= arr_i[v].a();
        }
        return v1 == this.u ? this : new g(this, this.a, v1, this.v, this.w, this.x, this.y);
    }

    public g z1(j j0) {
        return this.t == j0 ? this : new g(this, j0);
    }
}

