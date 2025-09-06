package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.type.n;
import com.fasterxml.jackson.databind.util.h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class u extends w implements Serializable {
    private static final long a = 2L;
    private static final Class b;
    private static final Class c;
    private static final Class d;
    protected static final t e;
    protected static final t f;
    protected static final t g;
    protected static final t h;
    protected static final t i;

    static {
        u.b = Object.class;
        u.c = String.class;
        u.d = p.class;
        u.e = t.V(null, n.t0(String.class), e.h(String.class));
        Class class0 = Boolean.TYPE;
        u.f = t.V(null, n.t0(class0), e.h(class0));
        Class class1 = Integer.TYPE;
        u.g = t.V(null, n.t0(class1), e.h(class1));
        Class class2 = Long.TYPE;
        u.h = t.V(null, n.t0(class2), e.h(class2));
        u.i = t.V(null, n.t0(Object.class), e.h(Object.class));
    }

    public t A(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0) {
        t t1 = this.j(t0, m0);
        return t1 == null ? t.V(t0, m0, this.m(t0, m0, w$a0)) : t1;
    }

    public t B(G g0, m m0, a w$a0) {
        t t0 = this.j(g0, m0);
        if(t0 == null) {
            t0 = this.i(g0, m0);
            return t0 == null ? t.W(this.n(g0, m0, w$a0, true)) : t0;
        }
        return t0;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w
    public w a() {
        return new u();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w
    public c b(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0) {
        return this.u(t0, m0, w$a0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w
    public c c(g g0, m m0, a w$a0) {
        return this.w(g0, m0, w$a0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w
    public c d(g g0, m m0, a w$a0) {
        return this.x(g0, m0, w$a0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w
    @Deprecated
    public c e(g g0, m m0, a w$a0) {
        return this.y(g0, m0, w$a0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w
    public c f(g g0, m m0, a w$a0, c c0) {
        return this.z(g0, m0, w$a0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w
    public c g(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0) {
        return this.A(t0, m0, w$a0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.w
    public c h(G g0, m m0, a w$a0) {
        return this.B(g0, m0, w$a0);
    }

    // 去混淆评级： 低(20)
    protected t i(com.fasterxml.jackson.databind.cfg.t t0, m m0) {
        return this.k(m0) ? t.V(t0, m0, this.l(t0, m0, t0)) : null;
    }

    protected t j(com.fasterxml.jackson.databind.cfg.t t0, m m0) {
        Class class0 = m0.g();
        if(class0.isPrimitive()) {
            if(class0 == Integer.TYPE) {
                return u.g;
            }
            if(class0 == Long.TYPE) {
                return u.h;
            }
            return class0 == Boolean.TYPE ? u.f : null;
        }
        if(h.a0(class0)) {
            if(class0 == u.b) {
                return u.i;
            }
            if(class0 == u.c) {
                return u.e;
            }
            if(class0 == Integer.class) {
                return u.g;
            }
            if(class0 == Long.class) {
                return u.h;
            }
            return class0 == Boolean.class ? u.f : null;
        }
        return u.d.isAssignableFrom(class0) ? t.V(t0, m0, e.h(class0)) : null;
    }

    protected boolean k(m m0) {
        if(m0.o() && !m0.l()) {
            Class class0 = m0.g();
            return h.a0(class0) && (Collection.class.isAssignableFrom(class0) || Map.class.isAssignableFrom(class0));
        }
        return false;
    }

    protected d l(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0) {
        return e.i(t0, m0, w$a0);
    }

    protected d m(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0) {
        return e.m(t0, m0, w$a0);
    }

    protected com.fasterxml.jackson.databind.introspect.G n(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0, boolean z) {
        d d0 = this.l(t0, m0, w$a0);
        return m0.Z() ? this.r(t0, d0, m0, z, t0.l().c(t0, d0)) : this.r(t0, d0, m0, z, t0.l().b(t0, d0));
    }

    @Deprecated
    protected com.fasterxml.jackson.databind.introspect.G o(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0, boolean z, String s) {
        d d0 = this.l(t0, m0, w$a0);
        return this.r(t0, d0, m0, z, new com.fasterxml.jackson.databind.introspect.z.c().i(s).b(t0, d0));
    }

    protected com.fasterxml.jackson.databind.introspect.G p(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0, c c0, boolean z) {
        d d0 = this.l(t0, m0, w$a0);
        return this.r(t0, d0, m0, z, t0.l().a(t0, d0, c0));
    }

    @Deprecated
    protected com.fasterxml.jackson.databind.introspect.G q(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0, boolean z) {
        return this.p(t0, m0, w$a0, null, z);
    }

    protected com.fasterxml.jackson.databind.introspect.G r(com.fasterxml.jackson.databind.cfg.t t0, d d0, m m0, boolean z, com.fasterxml.jackson.databind.introspect.a a0) {
        return new com.fasterxml.jackson.databind.introspect.G(t0, z, m0, d0, a0);
    }

    @Deprecated
    protected com.fasterxml.jackson.databind.introspect.G s(com.fasterxml.jackson.databind.cfg.t t0, d d0, m m0, boolean z, String s) {
        return new com.fasterxml.jackson.databind.introspect.G(t0, z, m0, d0, s);
    }

    public t u(com.fasterxml.jackson.databind.cfg.t t0, m m0, a w$a0) {
        t t1 = this.j(t0, m0);
        return t1 == null ? t.V(t0, m0, this.l(t0, m0, w$a0)) : t1;
    }

    public t w(g g0, m m0, a w$a0) {
        t t0 = this.j(g0, m0);
        if(t0 == null) {
            t0 = this.i(g0, m0);
            return t0 == null ? t.U(this.n(g0, m0, w$a0, false)) : t0;
        }
        return t0;
    }

    public t x(g g0, m m0, a w$a0) {
        t t0 = this.j(g0, m0);
        if(t0 == null) {
            t0 = this.i(g0, m0);
            return t0 == null ? t.U(this.n(g0, m0, w$a0, false)) : t0;
        }
        return t0;
    }

    @Deprecated
    public t y(g g0, m m0, a w$a0) {
        return t.U(this.p(g0, m0, w$a0, null, false));
    }

    public t z(g g0, m m0, a w$a0, c c0) {
        return t.U(this.p(g0, m0, w$a0, c0, false));
    }
}

