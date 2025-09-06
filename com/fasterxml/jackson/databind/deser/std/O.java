package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.n.a;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.impl.q;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import j..util.Objects;
import java.io.IOException;
import java.util.EnumSet;

public class o extends D implements j {
    protected final m f;
    protected n g;
    protected final v h;
    protected final boolean i;
    protected final Boolean j;
    private static final long k = 1L;

    protected o(o o0, n n0, v v0, Boolean boolean0) {
        super(o0);
        this.f = o0.f;
        this.g = n0;
        this.h = v0;
        this.i = q.e(v0);
        this.j = boolean0;
    }

    @Deprecated
    protected o(o o0, n n0, Boolean boolean0) {
        this(o0, n0, o0.h, boolean0);
    }

    public o(m m0, n n0) {
        super(EnumSet.class);
        this.f = m0;
        if(!m0.p()) {
            throw new IllegalArgumentException("Type " + m0 + " not Java Enum type");
        }
        this.g = n0;
        this.j = null;
        this.h = null;
        this.i = false;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws com.fasterxml.jackson.databind.o {
        n n1;
        Boolean boolean0 = this.g1(h0, d0, EnumSet.class, a.a);
        n n0 = this.g;
        if(n0 == null) {
            n1 = h0.X(this.f, d0);
            return this.x1(n1, this.c1(h0, d0, n1), boolean0);
        }
        n1 = h0.s0(n0, d0, this.f);
        return this.x1(n1, this.c1(h0, d0, n1), boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException, f {
        return this.t1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException, f {
        return this.u1(n0, h0, ((EnumSet)object0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
        return f0.d(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.util.a m() {
        return com.fasterxml.jackson.databind.util.a.c;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(h h0) throws com.fasterxml.jackson.databind.o {
        return this.s1();
    }

    protected final EnumSet r1(com.fasterxml.jackson.core.n n0, h h0, EnumSet enumSet0) throws IOException {
        Enum enum0;
        try {
            r r0;
            while((r0 = n0.m4()) != r.n) {
                if(r0 == r.v) {
                    if(this.i) {
                        continue;
                    }
                    enum0 = (Enum)this.h.c(h0);
                }
                else {
                    enum0 = (Enum)this.g.g(n0, h0);
                }
                if(enum0 != null) {
                    enumSet0.add(enum0);
                }
            }
            return enumSet0;
        }
        catch(Exception exception0) {
        }
        throw com.fasterxml.jackson.databind.o.C(exception0, enumSet0, enumSet0.size());
    }

    private EnumSet s1() {
        return EnumSet.noneOf(this.f.g());
    }

    public EnumSet t1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        EnumSet enumSet0 = this.s1();
        return n0.d4() ? this.r1(n0, h0, enumSet0) : this.v1(n0, h0, enumSet0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return this.f.S() == null;
    }

    public EnumSet u1(com.fasterxml.jackson.core.n n0, h h0, EnumSet enumSet0) throws IOException {
        return n0.d4() ? this.r1(n0, h0, enumSet0) : this.v1(n0, h0, enumSet0);
    }

    protected EnumSet v1(com.fasterxml.jackson.core.n n0, h h0, EnumSet enumSet0) throws IOException {
        if(this.j != Boolean.TRUE && (this.j != null || !h0.J0(i.s))) {
            return (EnumSet)h0.v0(EnumSet.class, n0);
        }
        if(n0.Y3(r.v)) {
            return (EnumSet)h0.t0(this.f, n0);
        }
        try {
            Enum enum0 = (Enum)this.g.g(n0, h0);
            if(enum0 != null) {
                enumSet0.add(enum0);
                return enumSet0;
            }
            return enumSet0;
        }
        catch(Exception exception0) {
            throw com.fasterxml.jackson.databind.o.C(exception0, enumSet0, enumSet0.size());
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.b;
    }

    public o w1(n n0) {
        return this.g == n0 ? this : new o(this, n0, this.h, this.j);
    }

    public o x1(n n0, v v0, Boolean boolean0) {
        return !Objects.equals(this.j, boolean0) || this.g != n0 || this.h != n0 ? new o(this, n0, v0, boolean0) : this;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(g g0) {
        return true;
    }

    @Deprecated
    public o y1(n n0, Boolean boolean0) {
        return this.x1(n0, this.h, boolean0);
    }
}

