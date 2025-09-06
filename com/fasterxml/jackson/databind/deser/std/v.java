package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.k;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.s;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

@b
public class v extends j implements com.fasterxml.jackson.databind.deser.j {
    protected final s j;
    protected final n k;
    protected final f l;
    private static final long m = 1L;

    protected v(v v0) {
        super(v0);
        this.j = v0.j;
        this.k = v0.k;
        this.l = v0.l;
    }

    protected v(v v0, s s0, n n0, f f0) {
        super(v0);
        this.j = s0;
        this.k = n0;
        this.l = f0;
    }

    public v(m m0, s s0, n n0, f f0) {
        super(m0);
        if(m0.b() != 2) {
            throw new IllegalArgumentException("Missing generic type information for " + m0);
        }
        this.j = s0;
        this.k = n0;
        this.l = f0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws o {
        s s0 = this.j;
        if(s0 == null) {
            s0 = h0.Z(this.f.y(0), d0);
        }
        else if(s0 instanceof k) {
            s0 = ((k)s0).a(h0, d0);
        }
        n n0 = this.e1(h0, d0, this.k);
        m m0 = this.f.y(1);
        n n1 = n0 == null ? h0.X(m0, d0) : h0.s0(n0, d0, m0);
        return this.x1(s0, (this.l == null ? this.l : this.l.g(d0)), n1);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException, com.fasterxml.jackson.core.f {
        return this.v1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException, com.fasterxml.jackson.core.f {
        return this.w1(n0, h0, ((Map.Entry)object0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return f0.e(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public n r1() {
        return this.k;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public m s1() {
        return this.f.y(1);
    }

    public Map.Entry v1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        Object object1;
        r r0 = n0.Y();
        if(r0 == r.k) {
            r0 = n0.m4();
        }
        else if(r0 != r.o && r0 != r.l) {
            return r0 == r.m ? ((Map.Entry)this.U(n0, h0)) : ((Map.Entry)h0.t0(this.l1(h0), n0));
        }
        if(r0 != r.o) {
            return r0 == r.l ? ((Map.Entry)h0.a1(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0])) : ((Map.Entry)h0.v0(this.s(), n0));
        }
        n n1 = this.k;
        f f0 = this.l;
        String s = n0.T();
        Object object0 = this.j.a(s, h0);
        r r1 = n0.m4();
        try {
            if(r1 == r.v) {
                object1 = n1.c(h0);
            }
            else if(f0 == null) {
                object1 = n1.g(n0, h0);
            }
            else {
                object1 = n1.i(n0, h0, f0);
            }
        }
        catch(Exception exception0) {
            this.t1(h0, exception0, Map.Entry.class, s);
            object1 = null;
        }
        r r2 = n0.m4();
        if(r2 != r.l) {
            if(r2 == r.o) {
                h0.a1(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: \'%s\')", new Object[]{n0.T()});
                return null;
            }
            h0.a1(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + r2, new Object[0]);
            return null;
        }
        return new AbstractMap.SimpleEntry(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.c;
    }

    public Map.Entry w1(com.fasterxml.jackson.core.n n0, h h0, Map.Entry map$Entry0) throws IOException {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    protected v x1(s s0, f f0, n n0) {
        return this.j != s0 || this.k != n0 || this.l != f0 ? new v(this, s0, n0, f0) : this;
    }
}

