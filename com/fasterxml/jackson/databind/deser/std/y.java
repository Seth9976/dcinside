package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.cfg.c;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.type.a;
import com.fasterxml.jackson.databind.util.A;
import j..util.Objects;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

@b
public class y extends j implements com.fasterxml.jackson.databind.deser.j {
    protected final boolean j;
    protected final Class k;
    protected n l;
    protected final f m;
    protected final Object[] n;
    private static final long o = 1L;

    protected y(y y0, n n0, f f0, v v0, Boolean boolean0) {
        super(y0, v0, boolean0);
        this.k = y0.k;
        this.j = y0.j;
        this.n = y0.n;
        this.l = n0;
        this.m = f0;
    }

    public y(m m0, n n0, f f0) {
        super(m0, null, null);
        Class class0 = ((a)m0).E().g();
        this.k = class0;
        this.j = class0 == Object.class;
        this.l = n0;
        this.m = f0;
        this.n = ((a)m0).t0();
    }

    public y A1(f f0, n n0) {
        return this.B1(f0, n0, this.g, this.i);
    }

    public y B1(f f0, n n0, v v0, Boolean boolean0) {
        return !Objects.equals(boolean0, this.i) || v0 != this.g || n0 != this.l || f0 != this.m ? new y(this, n0, f0, v0, boolean0) : this;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws o {
        n n0 = this.l;
        Boolean boolean0 = this.g1(h0, d0, this.f.g(), com.fasterxml.jackson.annotation.n.a.a);
        n n1 = this.e1(h0, d0, n0);
        m m0 = this.f.E();
        n n2 = n1 == null ? h0.X(m0, d0) : h0.s0(n1, d0, m0);
        return this.B1((this.m == null ? this.m : this.m.g(d0)), n2, this.c1(h0, d0, n2), boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException, com.fasterxml.jackson.core.f {
        return this.v1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException, com.fasterxml.jackson.core.f {
        return this.w1(n0, h0, ((Object[])object0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return this.y1(n0, h0, f0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public com.fasterxml.jackson.databind.util.a m() {
        return com.fasterxml.jackson.databind.util.a.b;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public Object o(h h0) throws o {
        return this.n;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public n r1() {
        return this.l;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return this.l == null && this.m == null;
    }

    public Object[] v1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        Object object0;
        if(!n0.d4()) {
            return this.z1(n0, h0);
        }
        A a0 = h0.L0();
        Object[] arr_object = a0.i();
        f f0 = this.m;
        int v = 0;
        while(true) {
            try {
            label_6:
                r r0 = n0.m4();
                if(r0 == r.n) {
                    goto label_25;
                }
                if(r0 == r.v) {
                    if(this.h) {
                        goto label_6;
                    }
                    object0 = this.g.c(h0);
                }
                else {
                    object0 = f0 == null ? this.l.g(n0, h0) : this.l.i(n0, h0, f0);
                }
                if(v >= arr_object.length) {
                    arr_object = a0.c(arr_object);
                    v = 0;
                }
            }
            catch(Exception exception0) {
                throw o.C(exception0, arr_object, a0.d() + v);
            }
            try {
                arr_object[v] = object0;
                ++v;
                goto label_6;
            }
            catch(Exception exception0) {
            }
            break;
        }
        ++v;
        throw o.C(exception0, arr_object, a0.d() + v);
    label_25:
        Object[] arr_object1 = this.j ? a0.f(arr_object, v) : a0.g(arr_object, v, this.k);
        h0.k1(a0);
        return arr_object1;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.a;
    }

    public Object[] w1(com.fasterxml.jackson.core.n n0, h h0, Object[] arr_object) throws IOException {
        Object object0;
        if(!n0.d4()) {
            Object[] arr_object1 = this.z1(n0, h0);
            if(arr_object1 == null) {
                return arr_object;
            }
            Object[] arr_object2 = Arrays.copyOf(arr_object, arr_object1.length + arr_object.length);
            System.arraycopy(arr_object1, 0, arr_object2, arr_object.length, arr_object1.length);
            return arr_object2;
        }
        A a0 = h0.L0();
        int v = arr_object.length;
        Object[] arr_object3 = a0.j(arr_object, v);
        f f0 = this.m;
        while(true) {
            try {
            label_11:
                r r0 = n0.m4();
                if(r0 == r.n) {
                    goto label_30;
                }
                if(r0 == r.v) {
                    if(this.h) {
                        goto label_11;
                    }
                    object0 = this.g.c(h0);
                }
                else {
                    object0 = f0 == null ? this.l.g(n0, h0) : this.l.i(n0, h0, f0);
                }
                if(v >= arr_object3.length) {
                    arr_object3 = a0.c(arr_object3);
                    v = 0;
                }
            }
            catch(Exception exception0) {
                throw o.C(exception0, arr_object3, a0.d() + v);
            }
            try {
                arr_object3[v] = object0;
                ++v;
                goto label_11;
            }
            catch(Exception exception0) {
            }
            break;
        }
        ++v;
        throw o.C(exception0, arr_object3, a0.d() + v);
    label_30:
        Object[] arr_object4 = this.j ? a0.f(arr_object3, v) : a0.g(arr_object3, v, this.k);
        h0.k1(a0);
        return arr_object4;
    }

    protected Byte[] x1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        byte[] arr_b = n0.L0(h0.f0());
        Byte[] arr_byte = new Byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_byte[v] = (byte)arr_b[v];
        }
        return arr_byte;
    }

    public Object[] y1(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return (Object[])f0.d(n0, h0);
    }

    protected Object[] z1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        Object object0;
        if(this.i != Boolean.TRUE && (this.i != null || !h0.J0(i.s))) {
            if(n0.Y3(r.q)) {
                return this.k == Byte.class ? this.x1(n0, h0) : ((Object[])this.X(n0, h0));
            }
            return (Object[])h0.t0(this.f, n0);
        }
        if(n0.Y3(r.v)) {
            if(this.h) {
                return this.n;
            }
            object0 = this.g.c(h0);
        }
        else {
            if(n0.Y3(r.q)) {
                String s = n0.R2();
                if(s.isEmpty()) {
                    c c0 = h0.V(this.w(), this.s(), com.fasterxml.jackson.databind.cfg.f.j);
                    if(c0 != c.a) {
                        return (Object[])this.W(n0, h0, c0, this.s(), "empty String (\"\")");
                    }
                }
                else if(D.h0(s)) {
                    c c1 = h0.W(this.w(), this.s(), c.a);
                    if(c1 != c.a) {
                        return (Object[])this.W(n0, h0, c1, this.s(), "blank String (all whitespace)");
                    }
                }
            }
            object0 = this.m == null ? this.l.g(n0, h0) : this.l.i(n0, h0, this.m);
        }
        Object[] arr_object = this.j ? new Object[1] : ((Object[])Array.newInstance(this.k, 1));
        arr_object[0] = object0;
        return arr_object;
    }
}

