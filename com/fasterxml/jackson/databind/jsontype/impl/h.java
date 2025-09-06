package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.H;
import java.io.IOException;

public class h extends a {
    protected final com.fasterxml.jackson.annotation.H.a k;
    protected final boolean l;
    protected final String m;
    private static final long n = 1L;

    public h(h h0, d d0) {
        super(h0, d0);
        String s;
        d d1 = this.c;
        if(d1 == null) {
            s = String.format("missing type id property \'%s\'", this.e);
        }
        else {
            String s1 = d1.getName();
            s = String.format("missing type id property \'%s\' (for POJO property \'%s\')", this.e, s1);
        }
        this.m = s;
        this.k = h0.k;
        this.l = h0.l;
    }

    @Deprecated
    public h(m m0, g g0, String s, boolean z, m m1) {
        this(m0, g0, s, z, m1, com.fasterxml.jackson.annotation.H.a.a);
    }

    @Deprecated
    public h(m m0, g g0, String s, boolean z, m m1, com.fasterxml.jackson.annotation.H.a h$a0) {
        this(m0, g0, s, z, m1, h$a0, true);
    }

    public h(m m0, g g0, String s, boolean z, m m1, com.fasterxml.jackson.annotation.H.a h$a0, boolean z1) {
        super(m0, g0, s, z, m1);
        String s1;
        d d0 = this.c;
        if(d0 == null) {
            s1 = String.format("missing type id property \'%s\'", this.e);
        }
        else {
            String s2 = d0.getName();
            s1 = String.format("missing type id property \'%s\' (for POJO property \'%s\')", this.e, s2);
        }
        this.m = s1;
        this.k = h$a0;
        this.l = z1;
    }

    @Deprecated
    protected Object A(n n0, com.fasterxml.jackson.databind.h h0, H h1) throws IOException {
        return this.B(n0, h0, h1, null);
    }

    protected Object B(n n0, com.fasterxml.jackson.databind.h h0, H h1, String s) throws IOException {
        if(!this.l()) {
            Object object0 = f.a(n0, h0, this.b);
            if(object0 != null) {
                return object0;
            }
            if(n0.d4()) {
                return super.c(n0, h0);
            }
            if(n0.Y3(r.q) && h0.J0(i.v) && n0.R2().trim().isEmpty()) {
                return null;
            }
        }
        com.fasterxml.jackson.databind.n n1 = this.o(h0);
        if(n1 == null) {
            m m0 = this.l ? this.q(h0, s) : this.b;
            if(m0 == null) {
                return null;
            }
            n1 = h0.X(m0, this.c);
        }
        if(h1 != null) {
            h1.p3();
            n0 = h1.b5(n0);
            n0.m4();
        }
        return n1.g(n0, h0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.jsontype.impl.a
    public Object c(n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
        return n0.Y3(r.m) ? super.d(n0, h0) : this.e(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.a
    public Object e(n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
        if(n0.w()) {
            Object object0 = n0.n3();
            if(object0 != null) {
                return this.n(n0, h0, object0);
            }
        }
        r r0 = n0.Y();
        H h1 = null;
        if(r0 == r.k) {
            r0 = n0.m4();
        }
        else if(r0 != r.o) {
            return this.B(n0, h0, null, this.m);
        }
        boolean z = h0.z(t.y);
        while(r0 == r.o) {
            String s = n0.T();
            n0.m4();
            if(s.equals(this.e) || z && s.equalsIgnoreCase(this.e)) {
                String s1 = n0.F3();
                if(s1 != null) {
                    return this.z(n0, h0, h1, s1);
                }
            }
            if(h1 == null) {
                h1 = h0.O(n0);
            }
            h1.v3(s);
            h1.T(n0);
            r0 = n0.m4();
        }
        return this.B(n0, h0, h1, this.m);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.a
    public f g(d d0) {
        return d0 == this.c ? this : new h(this, d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.a
    public com.fasterxml.jackson.annotation.H.a k() {
        return this.k;
    }

    protected Object z(n n0, com.fasterxml.jackson.databind.h h0, H h1, String s) throws IOException {
        com.fasterxml.jackson.databind.n n1 = this.p(h0, s);
        if(this.f) {
            if(h1 == null) {
                h1 = h0.O(n0);
            }
            h1.v3(n0.T());
            h1.d(s);
        }
        if(h1 != null) {
            n0.L();
            n0 = com.fasterxml.jackson.core.util.m.O4(false, h1.b5(n0), n0);
        }
        if(n0.Y() != r.l) {
            n0.m4();
        }
        return n1.g(n0, h0);
    }
}

