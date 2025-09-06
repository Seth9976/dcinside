package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.deser.e;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.util.Set;

public class a extends e {
    protected final e B;
    protected final y[] C;
    protected final l D;
    protected final m E;
    private static final long F = 1L;

    public a(e e0, m m0, y[] arr_y, l l0) {
        super(e0);
        this.B = e0;
        this.E = m0;
        this.C = arr_y;
        this.D = l0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    protected e F1() {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public Object M1(n n0, h h0) throws IOException {
        return this.s2(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException {
        if(!n0.d4()) {
            return this.v2(h0, this.s2(n0, h0));
        }
        if(!this.m) {
            return this.v2(h0, this.u2(n0, h0));
        }
        Object object0 = this.h.A(h0);
        y[] arr_y = this.C;
        for(int v = 0; true; ++v) {
            if(n0.m4() == r.n) {
                return this.v2(h0, object0);
            }
            if(v == arr_y.length) {
                if(!this.s && h0.J0(i.g)) {
                    h0.c1(this.s(), "Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[]{((int)arr_y.length)});
                }
                while(n0.m4() != r.n) {
                    n0.I4();
                }
                return this.v2(h0, object0);
            }
            y y0 = arr_y[v];
            if(y0 == null) {
                n0.I4();
            }
            else {
                try {
                    object0 = y0.s(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, y0.getName(), h0);
                }
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(n n0, h h0, Object object0) throws IOException {
        return this.B.h(n0, h0, object0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e l2(c c0) {
        return new a(this.B.l2(c0), this.E, this.C, this.D);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e m2(Set set0, Set set1) {
        return new a(this.B.m2(set0, set1), this.E, this.C, this.D);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e o2(boolean z) {
        return new a(this.B.o2(z), this.E, this.C, this.D);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e p2(s s0) {
        return new a(this.B.p2(s0), this.E, this.C, this.D);
    }

    protected Object s2(n n0, h h0) throws IOException {
        m m0 = this.l1(h0);
        r r0 = n0.Y();
        r r1 = n0.Y();
        return h0.u0(m0, r0, n0, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", new Object[]{this.f.g().getName(), r1});
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    protected final Object t1(n n0, h h0) throws IOException {
        v v0 = this.k;
        com.fasterxml.jackson.databind.deser.impl.y y0 = v0.h(n0, h0, this.y);
        y[] arr_y = this.C;
        Class class0 = this.t ? h0.n() : null;
        Object object0 = null;
        for(int v1 = 0; n0.m4() != r.n; ++v1) {
            y y1 = v1 >= arr_y.length ? null : arr_y[v1];
            if(y1 == null) {
                n0.I4();
            }
            else if(class0 != null && !y1.R(class0)) {
                n0.I4();
            }
            else if(object0 == null) {
                String s = y1.getName();
                y y2 = v0.f(s);
                if(!y0.l(s) || y2 != null) {
                    if(y2 == null) {
                        y0.e(y1, y1.q(n0, h0));
                    }
                    else if(y0.b(y2, y2.q(n0, h0))) {
                        try {
                            object0 = v0.a(h0, y0);
                        }
                        catch(Exception exception1) {
                            this.q2(exception1, this.f.g(), s, h0);
                            continue;
                        }
                        if(object0.getClass() != this.f.g()) {
                            Object[] arr_object = {com.fasterxml.jackson.databind.util.h.Q(this.f), object0.getClass().getName()};
                            return h0.D(this.f, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", arr_object));
                        }
                    }
                }
            }
            else {
                try {
                    object0 = y1.s(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, y1.getName(), h0);
                }
            }
        }
        if(object0 == null) {
            try {
                return v0.a(h0, y0);
            }
            catch(Exception exception2) {
                return this.r2(exception2, h0);
            }
        }
        return object0;
    }

    protected Object u2(n n0, h h0) throws IOException {
        if(this.l) {
            return this.O1(n0, h0);
        }
        Object object0 = this.h.A(h0);
        if(this.o != null) {
            this.f2(h0, object0);
        }
        Class class0 = this.t ? h0.n() : null;
        y[] arr_y = this.C;
        int v = 0;
        while(true) {
            r r0 = n0.m4();
            r r1 = r.n;
            if(r0 == r1) {
                return object0;
            }
            if(v == arr_y.length) {
                if(!this.s && h0.J0(i.g)) {
                    h0.i1(this, r1, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", new Object[]{((int)arr_y.length)});
                }
                while(n0.m4() != r.n) {
                    n0.I4();
                }
                return object0;
            }
            y y0 = arr_y[v];
            ++v;
            if(y0 != null && (class0 == null || y0.R(class0))) {
                try {
                    y0.s(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, y0.getName(), h0);
                }
            }
            else {
                n0.I4();
            }
        }
    }

    protected final Object v2(h h0, Object object0) throws IOException {
        try {
            return this.D.L().invoke(object0, null);
        }
        catch(Exception exception0) {
            return this.r2(exception0, h0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public Boolean y(g g0) {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public com.fasterxml.jackson.databind.n z(x x0) {
        return this.B.z(x0);
    }
}

