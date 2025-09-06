package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.impl.v;
import com.fasterxml.jackson.databind.deser.impl.y;
import com.fasterxml.jackson.databind.deser.w;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.s;
import com.fasterxml.jackson.databind.t;
import java.io.IOException;
import java.util.EnumMap;

public class n extends j implements com.fasterxml.jackson.databind.deser.j, w {
    protected final Class j;
    protected s k;
    protected com.fasterxml.jackson.databind.n l;
    protected final f m;
    protected final B n;
    protected com.fasterxml.jackson.databind.n o;
    protected v p;
    private static final long q = 1L;

    protected n(n n0, s s0, com.fasterxml.jackson.databind.n n1, f f0, com.fasterxml.jackson.databind.deser.v v0) {
        super(n0, v0, n0.i);
        this.j = n0.j;
        this.k = s0;
        this.l = n1;
        this.m = f0;
        this.n = n0.n;
        this.o = n0.o;
        this.p = n0.p;
    }

    public n(m m0, B b0, s s0, com.fasterxml.jackson.databind.n n0, f f0, com.fasterxml.jackson.databind.deser.v v0) {
        super(m0, v0, null);
        this.j = m0.N().g();
        this.k = s0;
        this.l = n0;
        this.m = f0;
        this.n = b0;
    }

    @Deprecated
    public n(m m0, s s0, com.fasterxml.jackson.databind.n n0, f f0) {
        this(m0, null, s0, n0, f0, null);
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public com.fasterxml.jackson.databind.n a(h h0, d d0) throws o {
        s s0 = this.k == null ? h0.Z(this.f.N(), d0) : this.k;
        com.fasterxml.jackson.databind.n n0 = this.l;
        m m0 = this.f.E();
        com.fasterxml.jackson.databind.n n1 = n0 == null ? h0.X(m0, d0) : h0.s0(n0, d0, m0);
        return this.z1(s0, n1, (this.m == null ? this.m : this.m.g(d0)), this.c1(h0, d0, n1));
    }

    @Override  // com.fasterxml.jackson.databind.deser.w
    public void b(h h0) throws o {
        B b0 = this.n;
        if(b0 != null) {
            if(b0.l()) {
                m m0 = this.n.H(h0.g0());
                if(m0 == null) {
                    String s = this.n.getClass().getName();
                    h0.D(this.f, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for \'canCreateUsingDelegate()\', but null for \'getDelegateType()\'", this.f, s));
                }
                this.o = this.f1(h0, m0, null);
                return;
            }
            if(this.n.j()) {
                m m1 = this.n.E(h0.g0());
                if(m1 == null) {
                    String s1 = this.n.getClass().getName();
                    h0.D(this.f, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for \'canCreateUsingArrayDelegate()\', but null for \'getArrayDelegateType()\'", this.f, s1));
                }
                this.o = this.f1(h0, m1, null);
                return;
            }
            if(this.n.h()) {
                boolean z = h0.z(t.y);
                this.p = v.d(h0, this.n, this.n.I(h0.g0()), z);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D, com.fasterxml.jackson.databind.deser.B$c
    public B e() {
        return this.n;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException, com.fasterxml.jackson.core.f {
        return this.x1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException, com.fasterxml.jackson.core.f {
        return this.y1(n0, h0, ((EnumMap)object0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return f0.e(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public Object o(h h0) throws o {
        return this.w1(h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public com.fasterxml.jackson.databind.n r1() {
        return this.l;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return this.l == null && this.k == null && this.m == null;
    }

    public EnumMap v1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        Object object0;
        String s;
        v v0 = this.p;
        y y0 = v0.h(n0, h0, null);
        if(n0.e4()) {
            s = n0.h4();
        }
        else {
            s = n0.Y3(r.o) ? n0.T() : null;
        }
        while(s != null) {
            r r0 = n0.m4();
            com.fasterxml.jackson.databind.deser.y y1 = v0.f(s);
            if(y1 == null) {
                Enum enum0 = (Enum)this.k.a(s, h0);
                if(enum0 == null) {
                    if(!h0.J0(i.z)) {
                        return (EnumMap)h0.C0(this.j, s, "value not one of declared Enum instance names for %s", new Object[]{this.f.N()});
                    }
                    n0.m4();
                    n0.I4();
                }
                else {
                    try {
                        if(r0 != r.v) {
                            object0 = this.m == null ? this.l.g(n0, h0) : this.l.i(n0, h0, this.m);
                            goto label_31;
                        }
                        else if(!this.h) {
                            object0 = this.g.c(h0);
                            goto label_31;
                        }
                        goto label_32;
                    }
                    catch(Exception exception1) {
                    }
                    this.t1(h0, exception1, this.f.g(), s);
                    return null;
                label_31:
                    y0.d(enum0, object0);
                }
            }
            else if(y0.b(y1, y1.q(n0, h0))) {
                n0.m4();
                try {
                    return this.y1(n0, h0, ((EnumMap)v0.a(h0, y0)));
                }
                catch(Exception exception0) {
                    return (EnumMap)this.t1(h0, exception0, this.f.g(), s);
                }
            }
        label_32:
            s = n0.h4();
        }
        try {
            return (EnumMap)v0.a(h0, y0);
        }
        catch(Exception exception2) {
            this.t1(h0, exception2, this.f.g(), null);
            return null;
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.c;
    }

    protected EnumMap w1(h h0) throws o {
        B b0 = this.n;
        if(b0 == null) {
            return new EnumMap(this.j);
        }
        try {
            return b0.k() ? ((EnumMap)this.n.A(h0)) : ((EnumMap)h0.p0(this.s(), this.e(), null, "no default constructor found", new Object[0]));
        }
        catch(IOException iOException0) {
            return (EnumMap)com.fasterxml.jackson.databind.util.h.u0(h0, iOException0);
        }
    }

    public EnumMap x1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        if(this.p != null) {
            return this.v1(n0, h0);
        }
        com.fasterxml.jackson.databind.n n1 = this.o;
        if(n1 != null) {
            Object object0 = n1.g(n0, h0);
            return (EnumMap)this.n.C(h0, object0);
        }
        switch(n0.d0()) {
            case 3: {
                return (EnumMap)this.U(n0, h0);
            }
            case 1: 
            case 2: 
            case 5: {
                return this.y1(n0, h0, this.w1(h0));
            }
            case 6: {
                return (EnumMap)this.X(n0, h0);
            }
            default: {
                return (EnumMap)h0.t0(this.l1(h0), n0);
            }
        }
    }

    public EnumMap y1(com.fasterxml.jackson.core.n n0, h h0, EnumMap enumMap0) throws IOException {
        Object object0;
        String s;
        n0.C4(enumMap0);
        com.fasterxml.jackson.databind.n n1 = this.l;
        f f0 = this.m;
        if(n0.e4()) {
            s = n0.h4();
        }
        else {
            r r0 = n0.Y();
            r r1 = r.o;
            if(r0 != r1) {
                if(r0 == r.l) {
                    return enumMap0;
                }
                h0.i1(this, r1, null, new Object[0]);
            }
            s = n0.T();
        }
        while(s != null) {
            Enum enum0 = (Enum)this.k.a(s, h0);
            r r2 = n0.m4();
            if(enum0 == null) {
                if(!h0.J0(i.z)) {
                    return (EnumMap)h0.C0(this.j, s, "value not one of declared Enum instance names for %s", new Object[]{this.f.N()});
                }
                n0.I4();
            }
            else {
                try {
                    if(r2 != r.v) {
                        object0 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
                        goto label_29;
                    }
                    else if(!this.h) {
                        object0 = this.g.c(h0);
                        goto label_29;
                    }
                    goto label_30;
                }
                catch(Exception exception0) {
                    return (EnumMap)this.t1(h0, exception0, enumMap0, s);
                }
            label_29:
                enumMap0.put(enum0, object0);
            }
        label_30:
            s = n0.h4();
        }
        return enumMap0;
    }

    public n z1(s s0, com.fasterxml.jackson.databind.n n0, f f0, com.fasterxml.jackson.databind.deser.v v0) {
        return s0 != this.k || v0 != this.g || n0 != this.l || f0 != this.m ? new n(this, s0, n0, f0, v0) : this;
    }
}

