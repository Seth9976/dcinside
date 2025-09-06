package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.impl.v;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.t;
import java.io.IOException;

class p extends D implements j {
    protected final m f;
    protected final l g;
    protected final n h;
    protected final B i;
    protected final y[] j;
    protected final boolean k;
    private volatile transient v l;
    private static final long m = 1L;

    protected p(p p0, n n0) {
        super(p0.a);
        this.f = p0.f;
        this.g = p0.g;
        this.k = p0.k;
        this.i = p0.i;
        this.j = p0.j;
        this.h = n0;
    }

    public p(Class class0, l l0) {
        super(class0);
        this.g = l0;
        this.k = false;
        this.f = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public p(Class class0, l l0, m m0, B b0, y[] arr_y) {
        super(class0);
        this.g = l0;
        this.k = true;
        if(m0.j(String.class) || m0.j(CharSequence.class)) {
            m0 = null;
        }
        this.f = m0;
        this.h = null;
        this.i = b0;
        this.j = arr_y;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws o {
        if(this.h == null) {
            return this.f == null || this.j != null ? this : new p(this, h0.X(this.f, d0));
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public B e() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        String s;
        n n1 = this.h;
        if(n1 != null) {
            s = n1.g(n0, h0);
            return this.g.I(this.a, new Object[]{s});
        }
        if(this.k) {
            if(this.j != null) {
                if(n0.e4()) {
                    v v0 = this.l;
                    if(v0 == null) {
                        boolean z = h0.z(t.y);
                        v0 = v.d(h0, this.i, this.j, z);
                        this.l = v0;
                    }
                    n0.m4();
                    return this.s1(n0, h0, v0);
                }
                if(!this.i.i()) {
                    m m0 = this.l1(h0);
                    r r0 = n0.Y();
                    String s1 = com.fasterxml.jackson.databind.util.h.Q(m0);
                    String s2 = r.j(r0);
                    return h0.Z0(m0, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects Object Value, got %s (`JsonToken.%s`)", new Object[]{s1, this.g, s2, r0.name()});
                }
            }
            r r1 = n0.Y();
            boolean z1 = r1 == r.m && h0.J0(i.t);
            if(z1) {
                r1 = n0.m4();
            }
            if(r1 != null && r1.g()) {
                String s3 = n0.F3();
                if(z1 && n0.m4() != r.n) {
                    this.m1(n0, h0);
                }
                s = s3;
                try {
                    return this.g.I(this.a, new Object[]{s});
                }
                catch(Exception exception0) {
                    Throwable throwable0 = com.fasterxml.jackson.databind.util.h.y0(exception0);
                    return !(throwable0 instanceof IllegalArgumentException) || !h0.J0(i.z) ? h0.o0(this.a, s, throwable0) : null;
                }
            }
            m m1 = this.l1(h0);
            String s4 = com.fasterxml.jackson.databind.util.h.Q(m1);
            String s5 = r.j(r1);
            return h0.Z0(m1, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects String Value, got %s (`JsonToken.%s`)", new Object[]{s4, this.g, s5, r1.name()});
        }
        n0.I4();
        try {
            return this.g.w();
        }
        catch(Exception exception1) {
            Throwable throwable1 = com.fasterxml.jackson.databind.util.h.y0(exception1);
            return h0.o0(this.a, null, throwable1);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return f0.c(n0, h0);
    }

    protected final Object r1(com.fasterxml.jackson.core.n n0, h h0, y y0) throws IOException {
        try {
            return y0.q(n0, h0);
        }
        catch(Exception exception0) {
            return this.u1(exception0, this.s(), y0.getName(), h0);
        }
    }

    protected Object s1(com.fasterxml.jackson.core.n n0, h h0, v v0) throws IOException {
        com.fasterxml.jackson.databind.deser.impl.y y0 = v0.h(n0, h0, null);
        for(r r0 = n0.Y(); r0 == r.o; r0 = n0.m4()) {
            String s = n0.T();
            n0.m4();
            y y1 = v0.f(s);
            if(!y0.l(s) || y1 != null) {
                if(y1 == null) {
                    n0.I4();
                }
                else {
                    y0.b(y1, this.r1(n0, h0, y1));
                }
            }
        }
        return v0.a(h0, y0);
    }

    private Throwable t1(Throwable throwable0, h h0) throws IOException {
        Throwable throwable1 = com.fasterxml.jackson.databind.util.h.P(throwable0);
        com.fasterxml.jackson.databind.util.h.v0(throwable1);
        boolean z = h0 == null || h0.J0(i.r);
        if(throwable1 instanceof IOException) {
            if(!z || !(throwable1 instanceof com.fasterxml.jackson.core.f)) {
                throw (IOException)throwable1;
            }
        }
        else if(!z) {
            com.fasterxml.jackson.databind.util.h.x0(throwable1);
        }
        return throwable1;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return true;
    }

    protected Object u1(Throwable throwable0, Object object0, String s, h h0) throws IOException {
        throw o.D(this.t1(throwable0, h0), object0, s);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.i;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(g g0) {
        return false;
    }
}

