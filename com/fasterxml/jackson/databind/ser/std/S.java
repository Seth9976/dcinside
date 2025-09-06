package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.E;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.e;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.h;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@b
public class s extends M implements e, k {
    static class a extends j {
        protected final j a;
        protected final Object b;

        public a(j j0, Object object0) {
            this.a = j0;
            this.b = object0;
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        public j b(d d0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        public String c() {
            return this.a.c();
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        public g d() {
            return this.a.d();
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        public com.fasterxml.jackson.annotation.H.a e() {
            return this.a.e();
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void i(Object object0, com.fasterxml.jackson.core.k k0, String s) throws IOException {
            this.a.i(this.b, k0, s);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void j(Object object0, com.fasterxml.jackson.core.k k0, String s) throws IOException {
            this.a.j(this.b, k0, s);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void k(Object object0, com.fasterxml.jackson.core.k k0, String s) throws IOException {
            this.a.k(this.b, k0, s);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void l(Object object0, com.fasterxml.jackson.core.k k0, String s) throws IOException {
            this.a.l(this.b, k0, s);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void m(Object object0, com.fasterxml.jackson.core.k k0, String s) throws IOException {
            this.a.m(this.b, k0, s);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void n(Object object0, com.fasterxml.jackson.core.k k0, String s) throws IOException {
            this.a.n(this.b, k0, s);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        public c o(com.fasterxml.jackson.core.k k0, c c0) throws IOException {
            c0.a = this.b;
            return this.a.o(k0, c0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void p(Object object0, com.fasterxml.jackson.core.k k0) throws IOException {
            this.a.p(this.b, k0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void q(Object object0, com.fasterxml.jackson.core.k k0, Class class0) throws IOException {
            this.a.q(this.b, k0, class0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void r(Object object0, com.fasterxml.jackson.core.k k0) throws IOException {
            this.a.r(this.b, k0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void s(Object object0, com.fasterxml.jackson.core.k k0, Class class0) throws IOException {
            this.a.s(this.b, k0, class0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void t(Object object0, com.fasterxml.jackson.core.k k0) throws IOException {
            this.a.t(this.b, k0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void u(Object object0, com.fasterxml.jackson.core.k k0, Class class0) throws IOException {
            this.a.u(this.b, k0, class0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        public c v(com.fasterxml.jackson.core.k k0, c c0) throws IOException {
            return this.a.v(k0, c0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void w(Object object0, com.fasterxml.jackson.core.k k0) throws IOException {
            this.a.w(this.b, k0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void x(Object object0, com.fasterxml.jackson.core.k k0) throws IOException {
            this.a.x(this.b, k0);
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.j
        @Deprecated
        public void y(Object object0, com.fasterxml.jackson.core.k k0) throws IOException {
            this.a.y(this.b, k0);
        }
    }

    protected final com.fasterxml.jackson.databind.introspect.k d;
    protected final j e;
    protected final r f;
    protected final d g;
    protected final m h;
    protected final boolean i;
    protected final Set j;
    protected transient com.fasterxml.jackson.databind.ser.impl.k k;

    @Deprecated
    public s(com.fasterxml.jackson.databind.introspect.k k0, j j0, r r0) {
        this(k0, j0, r0, Collections.emptySet());
    }

    public s(com.fasterxml.jackson.databind.introspect.k k0, j j0, r r0, Set set0) {
        super(k0.g());
        this.d = k0;
        this.h = k0.g();
        this.e = j0;
        this.f = r0;
        this.g = null;
        this.i = true;
        this.j = set0;
        this.k = com.fasterxml.jackson.databind.ser.impl.k.c();
    }

    @Deprecated
    public s(com.fasterxml.jackson.databind.introspect.k k0, r r0) {
        this(k0, null, r0, Collections.emptySet());
    }

    public s(s s0, d d0, j j0, r r0, boolean z) {
        super(s.R(s0.g()));
        this.d = s0.d;
        this.h = s0.h;
        this.e = j0;
        this.f = r0;
        this.g = d0;
        this.i = z;
        this.j = s0.j;
        this.k = com.fasterxml.jackson.databind.ser.impl.k.c();
    }

    protected boolean P(com.fasterxml.jackson.databind.jsonFormatVisitors.g g0, m m0, Class class0) throws o {
        com.fasterxml.jackson.databind.jsonFormatVisitors.m m1 = g0.g(m0);
        if(m1 != null) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            Object[] arr_object = class0.getEnumConstants();
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                try {
                    linkedHashSet0.add(String.valueOf(this.d.q(object0)));
                }
                catch(Exception exception0) {
                    while(exception0 instanceof InvocationTargetException && exception0.getCause() != null) {
                        exception0 = exception0.getCause();
                    }
                    h.v0(exception0);
                    throw o.D(exception0, object0, this.d.getName() + "()");
                }
            }
            m1.b(linkedHashSet0);
        }
        return true;
    }

    protected r Q(I i0, Class class0) throws o {
        r r0 = this.k.m(class0);
        if(r0 == null) {
            if(this.h.i()) {
                m m0 = i0.k(this.h, class0);
                r0 = s.S(i0.h0(m0, this.g), this.j);
                this.k = this.k.a(m0, r0).b;
                return r0;
            }
            r0 = s.S(i0.i0(class0, this.g), this.j);
            this.k = this.k.b(class0, r0).b;
        }
        return r0;
    }

    private static final Class R(Class class0) {
        return class0 == null ? Object.class : class0;
    }

    protected static r S(r r0, Set set0) {
        return r0 == null || set0.isEmpty() ? r0 : r0.r(set0);
    }

    public static s T(G g0, com.fasterxml.jackson.databind.introspect.k k0, j j0, r r0) {
        Set set0 = g0.n().X(g0, k0).i();
        return new s(k0, j0, s.S(r0, set0), set0);
    }

    protected boolean U(Class class0, r r0) {
        if(class0.isPrimitive()) {
            return class0 == Integer.TYPE || class0 == Boolean.TYPE || class0 == Double.TYPE ? this.F(r0) : false;
        }
        return class0 == String.class || class0 == Integer.class || class0 == Boolean.class || class0 == Double.class ? this.F(r0) : false;
    }

    protected s V(d d0, j j0, r r0, boolean z) {
        return this.g != d0 || this.e != j0 || this.f != r0 || z != this.i ? new s(this, d0, j0, r0, z) : this;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.ser.std.M
    @Deprecated
    public p a(I i0, Type type0) throws o {
        return this.f instanceof com.fasterxml.jackson.databind.jsonschema.c ? ((com.fasterxml.jackson.databind.jsonschema.c)this.f).a(i0, null) : com.fasterxml.jackson.databind.jsonschema.a.a();
    }

    @Override  // com.fasterxml.jackson.databind.ser.k
    public r c(I i0, d d0) throws o {
        j j0 = this.e == null ? this.e : this.e.b(d0);
        r r0 = this.f;
        if(r0 == null) {
            if(!i0.z(t.r) && !this.h.q()) {
                return d0 == this.g ? this : this.V(d0, j0, null, this.i);
            }
            r r1 = s.S(i0.h0(this.h, d0), this.j);
            return this.V(d0, j0, r1, this.U(this.h.g(), r1));
        }
        return this.V(d0, j0, i0.y0(r0, d0), this.i);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M, com.fasterxml.jackson.databind.jsonFormatVisitors.e
    public void e(com.fasterxml.jackson.databind.jsonFormatVisitors.g g0, m m0) throws o {
        Class class0 = this.d.m();
        if(class0 != null && h.Y(class0) && this.P(g0, m0, class0)) {
            return;
        }
        r r0 = this.f;
        if(r0 == null) {
            r0 = g0.a().k0(this.h, false, this.g);
            if(r0 == null) {
                g0.p(m0);
                return;
            }
        }
        r0.e(g0, this.h);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        Object object1 = this.d.q(object0);
        if(object1 == null) {
            return true;
        }
        r r0 = this.f;
        if(r0 == null) {
            try {
                return this.Q(i0, object1.getClass()).h(i0, object1);
            }
            catch(o o0) {
                throw new E(o0);
            }
        }
        return r0.h(i0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        Object object1;
        try {
            object1 = this.d.q(object0);
        }
        catch(Exception exception0) {
            this.O(i0, exception0, object0, this.d.getName() + "()");
            object1 = null;
        }
        if(object1 == null) {
            i0.X(k0);
            return;
        }
        r r0 = this.f == null ? this.Q(i0, object1.getClass()) : this.f;
        j j0 = this.e;
        if(j0 != null) {
            r0.n(object1, k0, i0, j0);
            return;
        }
        r0.m(object1, k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
        Object object1;
        try {
            object1 = this.d.q(object0);
        }
        catch(Exception exception0) {
            this.O(i0, exception0, object0, this.d.getName() + "()");
            object1 = null;
        }
        if(object1 == null) {
            i0.X(k0);
            return;
        }
        r r0 = this.f;
        if(r0 == null) {
            r0 = this.Q(i0, object1.getClass());
        }
        else if(this.i) {
            c c0 = j0.o(k0, j0.f(object0, com.fasterxml.jackson.core.r.q));
            r0.m(object1, k0, i0);
            j0.v(k0, c0);
            return;
        }
        r0.n(object1, k0, i0, new a(j0, object0));
    }

    @Override
    public String toString() {
        return "(@JsonValue serializer for method " + this.d.m() + "#" + this.d.getName() + ")";
    }
}

