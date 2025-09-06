package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.n.c;
import com.fasterxml.jackson.annotation.n.d;
import com.fasterxml.jackson.core.w;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.introspect.A;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.node.a;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.util.l;
import j..util.Objects;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;

@b
public class m extends L implements k {
    protected final l d;
    protected final Boolean e;
    protected final l f;
    protected final l g;
    private static final long h = 1L;

    @Deprecated
    public m(l l0, Boolean boolean0) {
        this(l0, boolean0, null, null);
    }

    @Deprecated
    public m(l l0, Boolean boolean0, l l1) {
        this(l0, boolean0, l1, null);
    }

    public m(l l0, Boolean boolean0, l l1, l l2) {
        super(l0.m(), false);
        this.d = l0;
        this.e = boolean0;
        this.f = l1;
        this.g = l2;
    }

    protected static Boolean P(Class class0, d n$d0, boolean z, Boolean boolean0) {
        c n$c0 = n$d0 == null ? null : n$d0.m();
        if(n$c0 == null) {
            return boolean0;
        }
        if(n$c0 != c.a && n$c0 != c.c) {
            if(n$c0 != c.i && n$c0 != c.b) {
                if(n$c0 != c.d) {
                    throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", n$c0, class0.getName(), (z ? "class" : "property")));
                }
                return true;
            }
            return false;
        }
        return boolean0;
    }

    protected final boolean Q(I i0) {
        return this.e == null ? i0.D0(H.s) : this.e.booleanValue();
    }

    public static m R(Class class0, G g0, com.fasterxml.jackson.databind.c c0, d n$d0) {
        l l0 = l.f(g0, c0.A());
        l l1 = m.S(g0, class0, c0.A());
        l l2 = l.h(g0, c0.A());
        return new m(l0, m.P(class0, n$d0, true, null), l1, l2);
    }

    protected static l S(G g0, Class class0, com.fasterxml.jackson.databind.introspect.d d0) {
        com.fasterxml.jackson.databind.k k0 = A.a(g0.n().u(g0, d0), g0.c());
        return k0 == null ? null : l.j(g0, d0, k0);
    }

    public l T() {
        return this.d;
    }

    public final void U(Enum enum0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        l l0 = this.f;
        if(l0 != null) {
            k0.G4(l0.o(enum0));
            return;
        }
        if(this.Q(i0)) {
            k0.F3(enum0.ordinal());
            return;
        }
        if(i0.D0(H.r)) {
            k0.G4(this.g.o(enum0));
            return;
        }
        k0.G4(this.d.o(enum0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    @Deprecated
    public p a(I i0, Type type0) {
        if(this.Q(i0)) {
            return this.x("integer", true);
        }
        p p0 = this.x("string", true);
        if(type0 != null && i0.l(type0).p()) {
            a a0 = ((u)p0).d3("enum");
            for(Object object0: this.d.p()) {
                a0.T2(((w)object0).getValue());
            }
        }
        return p0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.k
    public r c(I i0, com.fasterxml.jackson.databind.d d0) throws o {
        d n$d0 = this.C(i0, d0, this.g());
        if(n$d0 != null) {
            Boolean boolean0 = m.P(this.g(), n$d0, false, this.e);
            return Objects.equals(boolean0, this.e) ? this : new m(this.d, boolean0, this.f, this.g);
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void e(g g0, com.fasterxml.jackson.databind.m m0) throws o {
        I i0 = g0.a();
        if(this.Q(i0)) {
            this.J(g0, m0, com.fasterxml.jackson.core.n.b.a);
            return;
        }
        com.fasterxml.jackson.databind.jsonFormatVisitors.m m1 = g0.g(m0);
        if(m1 != null) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            if(i0 == null || !i0.D0(H.r)) {
                for(Object object1: this.d.p()) {
                    linkedHashSet0.add(((w)object1).getValue());
                }
            }
            else {
                for(Object object0: this.g.p()) {
                    linkedHashSet0.add(((w)object0).getValue());
                }
            }
            m1.b(linkedHashSet0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.U(((Enum)object0), k0, i0);
    }
}

