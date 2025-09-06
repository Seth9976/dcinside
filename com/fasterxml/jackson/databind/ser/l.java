package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.cfg.b;
import com.fasterxml.jackson.databind.cfg.q;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsonschema.c;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.ser.impl.w;
import com.fasterxml.jackson.databind.util.h;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public abstract class l extends I implements Serializable {
    public static final class a extends l {
        private static final long u = 1L;

        public a() {
        }

        protected a(I i0, G g0, s s0) {
            super(i0, g0, s0);
        }

        public a(a l$a0) {
            super(l$a0);
        }

        protected a(a l$a0, b b0) {
            super(l$a0, b0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.l
        public l Z0() {
            return new a(this);
        }

        @Override  // com.fasterxml.jackson.databind.ser.l
        public l a1(G g0, s s0) {
            return this.k1(g0, s0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.l
        public l j1(b b0) {
            return new a(this, b0);
        }

        public a k1(G g0, s s0) {
            return new a(this, g0, s0);
        }
    }

    protected transient Map q;
    protected transient ArrayList r;
    protected transient k s;
    private static final long t = 1L;

    protected l() {
    }

    protected l(I i0, G g0, s s0) {
        super(i0, g0, s0);
    }

    protected l(l l0) {
        super(l0);
    }

    protected l(l l0, b b0) {
        super(l0, new r(b0.g2(l0.b)));
    }

    @Override  // com.fasterxml.jackson.databind.I
    public Object B0(v v0, Class class0) {
        if(class0 == null) {
            return null;
        }
        boolean z = this.b.M() == null;
        return h.n(class0, this.b.c());
    }

    @Override  // com.fasterxml.jackson.databind.I
    public boolean C0(Object object0) throws o {
        if(object0 == null) {
            return true;
        }
        try {
            return object0.equals(null);
        }
        catch(Exception exception0) {
            Object[] arr_object = {object0.getClass().getName(), exception0.getClass().getName(), h.q(exception0)};
            this.I0(object0.getClass(), String.format("Problem determining whether filter of type \'%s\' should filter out `null` values: (%s) %s", arr_object), exception0);
            return false;
        }
    }

    @Override  // com.fasterxml.jackson.databind.I
    public com.fasterxml.jackson.databind.r N0(com.fasterxml.jackson.databind.introspect.b b0, Object object0) throws o {
        com.fasterxml.jackson.databind.r r0 = null;
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof com.fasterxml.jackson.databind.r) {
            return this.O(((com.fasterxml.jackson.databind.r)object0));
        }
        if(!(object0 instanceof Class)) {
            this.D(b0.g(), "AnnotationIntrospector returned serializer definition of type " + object0.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
        }
        if(((Class)object0) != com.fasterxml.jackson.databind.r.a.class && !h.U(((Class)object0))) {
            if(!com.fasterxml.jackson.databind.r.class.isAssignableFrom(((Class)object0))) {
                this.D(b0.g(), "AnnotationIntrospector returned Class " + ((Class)object0).getName() + "; expected Class<JsonSerializer>");
            }
            q q0 = this.b.M();
            if(q0 != null) {
                r0 = q0.h(this.b, b0, ((Class)object0));
            }
            return r0 == null ? this.O(((com.fasterxml.jackson.databind.r)h.n(((Class)object0), this.b.c()))) : this.O(r0);
        }
        return null;
    }

    protected Map S0() {
        return this.D0(H.B) ? new HashMap() : new IdentityHashMap();
    }

    private final void T0(k k0, Object object0, com.fasterxml.jackson.databind.r r0) throws IOException {
        try {
            r0.m(object0, k0, this);
        }
        catch(Exception exception0) {
            throw this.W0(k0, exception0);
        }
    }

    private final void U0(k k0, Object object0, com.fasterxml.jackson.databind.r r0, B b0) throws IOException {
        try {
            k0.D4();
            k0.s3(b0.k(this.b));
            r0.m(object0, k0, this);
            k0.p3();
        }
        catch(Exception exception0) {
            throw this.W0(k0, exception0);
        }
    }

    protected void V0(k k0) throws IOException {
        try {
            this.t0().m(null, k0, this);
        }
        catch(Exception exception0) {
            throw this.W0(k0, exception0);
        }
    }

    private IOException W0(k k0, Exception exception0) {
        if(exception0 instanceof IOException) {
            return (IOException)exception0;
        }
        String s = h.q(exception0);
        if(s == null) {
            s = "[no message for " + exception0.getClass().getName() + "]";
        }
        return new o(k0, s, exception0);
    }

    public void X0(m m0, g g0) throws o {
        if(m0 == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        g0.j(this);
        this.o0(m0, null).e(g0, m0);
    }

    public int Y0() {
        return this.e.i();
    }

    public l Z0() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    public abstract l a1(G arg1, s arg2);

    public void c1() {
        this.e.g();
    }

    @Deprecated
    public com.fasterxml.jackson.databind.jsonschema.a d1(Class class0) throws o {
        com.fasterxml.jackson.databind.r r0 = this.q0(class0, null);
        p p0 = r0 instanceof c ? ((c)r0).a(this, null) : com.fasterxml.jackson.databind.jsonschema.a.a();
        if(!(p0 instanceof u)) {
            throw new IllegalArgumentException("Class " + class0.getName() + " would not be serialized as a JSON object and therefore has no schema");
        }
        return new com.fasterxml.jackson.databind.jsonschema.a(((u)p0));
    }

    public boolean e1(Class class0, AtomicReference atomicReference0) {
        if(class0 == Object.class && !this.b.l1(H.e)) {
            return true;
        }
        try {
            return this.M(class0) == null ? false : true;
        }
        catch(o o0) {
            if(atomicReference0 != null) {
                atomicReference0.set(o0);
            }
            return false;
        }
        catch(RuntimeException runtimeException0) {
            if(atomicReference0 == null) {
                throw runtimeException0;
            }
            atomicReference0.set(runtimeException0);
            return false;
        }
    }

    public void f1(k k0, Object object0, m m0, com.fasterxml.jackson.databind.r r0, j j0) throws IOException {
        boolean z;
        this.s = k0;
        if(object0 == null) {
            this.V0(k0);
            return;
        }
        if(m0 != null && !m0.g().isAssignableFrom(object0.getClass())) {
            this.P(object0, m0);
        }
        if(r0 == null) {
            r0 = m0 == null || !m0.o() ? this.q0(object0.getClass(), null) : this.o0(m0, null);
        }
        B b0 = this.b.p0();
        if(b0 == null) {
            z = this.b.l1(H.c);
            if(z) {
                k0.D4();
                Class class0 = object0.getClass();
                k0.s3(this.b.k(class0).k(this.b));
            }
        }
        else if(b0.i()) {
            z = false;
        }
        else {
            k0.D4();
            k0.v3(b0.d());
            z = true;
        }
        try {
            r0.n(object0, k0, this, j0);
            if(z) {
                k0.p3();
            }
        }
        catch(Exception exception0) {
            throw this.W0(k0, exception0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.I
    public w g0(Object object0, N n0) {
        Map map0 = this.q;
        if(map0 == null) {
            this.q = this.S0();
        }
        else {
            w w0 = (w)map0.get(object0);
            if(w0 != null) {
                return w0;
            }
        }
        N n1 = null;
        ArrayList arrayList0 = this.r;
        if(arrayList0 == null) {
            this.r = new ArrayList(8);
        }
        else {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                N n2 = (N)this.r.get(v1);
                if(n2.a(n0)) {
                    n1 = n2;
                    break;
                }
            }
        }
        if(n1 == null) {
            n1 = n0.h(this);
            this.r.add(n1);
        }
        w w1 = new w(n1);
        this.q.put(object0, w1);
        return w1;
    }

    public void g1(k k0, Object object0) throws IOException {
        this.s = k0;
        if(object0 == null) {
            this.V0(k0);
            return;
        }
        Class class0 = object0.getClass();
        com.fasterxml.jackson.databind.r r0 = this.m0(class0, true, null);
        B b0 = this.b.p0();
        if(b0 == null) {
            if(this.b.l1(H.c)) {
                this.U0(k0, object0, r0, this.b.k(class0));
                return;
            }
        }
        else if(!b0.i()) {
            this.U0(k0, object0, r0, b0);
            return;
        }
        this.T0(k0, object0, r0);
    }

    public void h1(k k0, Object object0, m m0) throws IOException {
        this.s = k0;
        if(object0 == null) {
            this.V0(k0);
            return;
        }
        if(!m0.g().isAssignableFrom(object0.getClass())) {
            this.P(object0, m0);
        }
        com.fasterxml.jackson.databind.r r0 = this.k0(m0, true, null);
        B b0 = this.b.p0();
        if(b0 == null) {
            if(this.b.l1(H.c)) {
                this.U0(k0, object0, r0, this.b.j(m0));
                return;
            }
        }
        else if(!b0.i()) {
            this.U0(k0, object0, r0, b0);
            return;
        }
        this.T0(k0, object0, r0);
    }

    public void i1(k k0, Object object0, m m0, com.fasterxml.jackson.databind.r r0) throws IOException {
        B b1;
        this.s = k0;
        if(object0 == null) {
            this.V0(k0);
            return;
        }
        if(m0 != null && !m0.g().isAssignableFrom(object0.getClass())) {
            this.P(object0, m0);
        }
        if(r0 == null) {
            r0 = this.k0(m0, true, null);
        }
        B b0 = this.b.p0();
        if(b0 == null) {
            if(this.b.l1(H.c)) {
                if(m0 == null) {
                    Class class0 = object0.getClass();
                    b1 = this.b.k(class0);
                }
                else {
                    b1 = this.b.j(m0);
                }
                this.U0(k0, object0, r0, b1);
                return;
            }
        }
        else if(!b0.i()) {
            this.U0(k0, object0, r0, b0);
            return;
        }
        this.T0(k0, object0, r0);
    }

    public abstract l j1(b arg1);

    @Override  // com.fasterxml.jackson.databind.I
    public k w0() {
        return this.s;
    }
}

