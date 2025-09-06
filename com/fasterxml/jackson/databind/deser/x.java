package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.i;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.node.m;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.s;
import com.fasterxml.jackson.databind.t;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class x implements Serializable {
    static class a extends com.fasterxml.jackson.databind.deser.impl.z.a {
        private final x c;
        private final Object d;
        private final String e;

        public a(x x0, z z0, Class class0, Object object0, String s) {
            super(z0, class0);
            this.c = x0;
            this.d = object0;
            this.e = s;
        }

        @Override  // com.fasterxml.jackson.databind.deser.impl.z$a
        public void c(Object object0, Object object1) throws IOException {
            if(!this.d(object0)) {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + object0.toString() + "] that wasn\'t previously registered.");
            }
            this.c.o(this.d, this.e, object1);
        }
    }

    public static class b extends x implements Serializable {
        protected final m i;
        private static final long j = 1L;

        public b(d d0, k k0, com.fasterxml.jackson.databind.m m0, n n0, m m1) {
            super(d0, k0, m0, null, n0, null);
            this.i = m1;
        }

        @Override  // com.fasterxml.jackson.databind.deser.x
        protected void a(Object object0, Object object1, Object object2) throws Exception {
            this.q(object0, ((String)object1), ((p)object2));
        }

        @Override  // com.fasterxml.jackson.databind.deser.x
        public Object f(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
            return this.e.g(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.x
        public void g(com.fasterxml.jackson.core.n n0, h h0, Object object0, String s) throws IOException {
            this.q(object0, s, ((p)this.f(n0, h0)));
        }

        @Override  // com.fasterxml.jackson.databind.deser.x
        public x p(n n0) {
            return this;
        }

        protected void q(Object object0, String s, p p0) throws IOException {
            u u0;
            i i0 = (i)this.b;
            Object object1 = i0.q(object0);
            if(object1 == null) {
                u0 = this.i.y();
                i0.r(object0, u0);
            }
            else if(object1 instanceof u) {
                u0 = (u)object1;
            }
            else {
                throw o.p(null, String.format("Value \"any-setter\" \'%s\' not `ObjectNode` but %s", this.k(), com.fasterxml.jackson.databind.util.h.l0(object1.getClass())));
            }
            u0.t3(s, p0);
        }
    }

    public static class c extends x implements Serializable {
        protected final B i;
        private static final long j = 1L;

        public c(d d0, k k0, com.fasterxml.jackson.databind.m m0, s s0, n n0, f f0, B b0) {
            super(d0, k0, m0, s0, n0, f0);
            this.i = b0;
        }

        @Override  // com.fasterxml.jackson.databind.deser.x
        protected void a(Object object0, Object object1, Object object2) throws Exception {
            i i0 = (i)this.b;
            Map map0 = (Map)i0.q(object0);
            if(map0 == null) {
                map0 = this.q(null, i0, object0, object1);
            }
            map0.put(object1, object2);
        }

        @Override  // com.fasterxml.jackson.databind.deser.x
        public x p(n n0) {
            return new c(this.a, this.b, this.d, this.g, n0, this.f, this.i);
        }

        protected Map q(h h0, i i0, Object object0, Object object1) throws IOException {
            B b0 = this.i;
            if(b0 == null) {
                throw o.p(h0, String.format("Cannot create an instance of %s for use as \"any-setter\" \'%s\'", com.fasterxml.jackson.databind.util.h.l0(this.d.g()), this.a.getName()));
            }
            Map map0 = (Map)b0.A(h0);
            i0.r(object0, map0);
            return map0;
        }
    }

    public static class com.fasterxml.jackson.databind.deser.x.d extends x implements Serializable {
        private static final long i = 1L;

        public com.fasterxml.jackson.databind.deser.x.d(d d0, k k0, com.fasterxml.jackson.databind.m m0, s s0, n n0, f f0) {
            super(d0, k0, m0, s0, n0, f0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.x
        protected void a(Object object0, Object object1, Object object2) throws Exception {
            ((l)this.b).I(object0, new Object[]{object1, object2});
        }

        @Override  // com.fasterxml.jackson.databind.deser.x
        public x p(n n0) {
            return new com.fasterxml.jackson.databind.deser.x.d(this.a, this.b, this.d, this.g, n0, this.f);
        }
    }

    protected final d a;
    protected final k b;
    protected final boolean c;
    protected final com.fasterxml.jackson.databind.m d;
    protected n e;
    protected final f f;
    protected final s g;
    private static final long h = 1L;

    public x(d d0, k k0, com.fasterxml.jackson.databind.m m0, s s0, n n0, f f0) {
        this.a = d0;
        this.b = k0;
        this.d = m0;
        this.e = n0;
        this.f = f0;
        this.g = s0;
        this.c = k0 instanceof i;
    }

    protected abstract void a(Object arg1, Object arg2, Object arg3) throws Exception;

    protected void b(Exception exception0, Object object0, Object object1) throws IOException {
        if(exception0 instanceof IllegalArgumentException) {
            String s = com.fasterxml.jackson.databind.util.h.j(object1);
            StringBuilder stringBuilder0 = new StringBuilder("Problem deserializing \"any-property\" \'");
            stringBuilder0.append(object0);
            stringBuilder0.append("\' of class " + this.i() + " (expected type: ");
            stringBuilder0.append(this.d);
            stringBuilder0.append("; actual type: ");
            stringBuilder0.append(s);
            stringBuilder0.append(")");
            String s1 = com.fasterxml.jackson.databind.util.h.q(exception0);
            if(s1 == null) {
                stringBuilder0.append(" (no error message provided)");
            }
            else {
                stringBuilder0.append(", problem: ");
                stringBuilder0.append(s1);
            }
            throw new o(null, stringBuilder0.toString(), exception0);
        }
        com.fasterxml.jackson.databind.util.h.w0(exception0);
        com.fasterxml.jackson.databind.util.h.x0(exception0);
        Throwable throwable0 = com.fasterxml.jackson.databind.util.h.P(exception0);
        throw new o(null, com.fasterxml.jackson.databind.util.h.q(throwable0), throwable0);
    }

    public static x c(h h0, d d0, k k0, com.fasterxml.jackson.databind.m m0, n n0) {
        return new b(d0, k0, m0, n0, h0.k0());
    }

    public static x d(h h0, d d0, k k0, com.fasterxml.jackson.databind.m m0, s s0, n n0, f f0) {
        Class class0 = k0.f();
        if(class0 == Map.class) {
            class0 = LinkedHashMap.class;
        }
        return new c(d0, k0, m0, s0, n0, f0, com.fasterxml.jackson.databind.deser.impl.k.a(h0.g0(), class0));
    }

    public static x e(h h0, d d0, k k0, com.fasterxml.jackson.databind.m m0, s s0, n n0, f f0) {
        return new com.fasterxml.jackson.databind.deser.x.d(d0, k0, m0, s0, n0, f0);
    }

    public Object f(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        if(n0.Y3(r.v)) {
            return this.e.c(h0);
        }
        return this.f == null ? this.e.g(n0, h0) : this.e.i(n0, h0, this.f);
    }

    public void g(com.fasterxml.jackson.core.n n0, h h0, Object object0, String s) throws IOException {
        try {
            s s1 = this.g;
            String s2 = s1 == null ? s : s1.a(s, h0);
            this.o(object0, s2, this.f(n0, h0));
        }
        catch(z z0) {
            if(this.e.r() == null) {
                throw o.o(n0, "Unresolved forward reference but no identity info.", z0);
            }
            z0.G().a(new a(this, z0, this.d.g(), object0, s));
        }
    }

    public void h(g g0) {
        boolean z = g0.a0(t.q);
        this.b.k(z);
    }

    private String i() {
        return com.fasterxml.jackson.databind.util.h.l0(this.b.m());
    }

    public d j() {
        return this.a;
    }

    public String k() {
        return this.a.getName();
    }

    public com.fasterxml.jackson.databind.m l() {
        return this.d;
    }

    public boolean m() {
        return this.e != null;
    }

    Object n() {
        if(this.b == null || this.b.c() == null) {
            throw new IllegalArgumentException("Missing method/field (broken JDK (de)serialization?)");
        }
        return this;
    }

    public void o(Object object0, Object object1, Object object2) throws IOException {
        try {
            this.a(object0, object1, object2);
        }
        catch(IOException iOException0) {
            throw iOException0;
        }
        catch(Exception exception0) {
            this.b(exception0, object1, object2);
        }
    }

    public abstract x p(n arg1);

    @Override
    public String toString() {
        return "[any property on class " + this.i() + "]";
    }
}

