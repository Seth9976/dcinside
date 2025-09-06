package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.deser.impl.q;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.jsonFormatVisitors.l;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.K;
import com.fasterxml.jackson.databind.util.b;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public abstract class y extends com.fasterxml.jackson.databind.introspect.y implements Serializable {
    public static abstract class a extends y {
        protected final y p;

        protected a(y y0) {
            super(y0);
            this.p = y0;
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public String A() {
            return this.p.A();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public F C() {
            return this.p.C();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public int D() {
            return this.p.D();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public n E() {
            return this.p.E();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public f F() {
            return this.p.F();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public boolean G() {
            return this.p.G();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public boolean H() {
            return this.p.H();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public boolean I() {
            return this.p.I();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public boolean K() {
            return this.p.K();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public void M(Object object0, Object object1) throws IOException {
            this.p.M(object0, object1);
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public Object N(Object object0, Object object1) throws IOException {
            return this.p.N(object0, object1);
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public boolean R(Class class0) {
            return this.p.R(class0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public y S(B b0) {
            return this.W(this.p.S(b0));
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public y T(v v0) {
            return this.W(this.p.T(v0));
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public y V(n n0) {
            return this.W(this.p.V(n0));
        }

        protected y W(y y0) {
            return y0 == this.p ? this : this.Y(y0);
        }

        public y X() {
            return this.p;
        }

        protected abstract y Y(y arg1);

        @Override  // com.fasterxml.jackson.databind.deser.y
        public Annotation getAnnotation(Class class0) {
            return this.p.getAnnotation(class0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public k h() {
            return this.p.h();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public void p(int v) {
            this.p.p(v);
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public void r(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
            this.p.r(n0, h0, object0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public Object s(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
            return this.p.s(n0, h0, object0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public void w(g g0) {
            this.p.w(g0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public int x() {
            return this.p.x();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        protected Class y() {
            return this.p.y();
        }

        @Override  // com.fasterxml.jackson.databind.deser.y
        public Object z() {
            return this.p.z();
        }
    }

    protected final B d;
    protected final m e;
    protected final B f;
    protected final transient b g;
    protected final n h;
    protected final f i;
    protected final v j;
    protected String k;
    protected F l;
    protected K m;
    protected int n;
    protected static final n o;

    static {
        y.o = new com.fasterxml.jackson.databind.deser.impl.h("No _valueDeserializer assigned");
    }

    protected y(B b0, m m0, A a0, n n0) {
        super(a0);
        this.n = -1;
        this.d = b0 == null ? B.h : b0.h();
        this.e = m0;
        this.f = null;
        this.g = null;
        this.m = null;
        this.i = null;
        this.h = n0;
        this.j = n0;
    }

    protected y(B b0, m m0, B b1, f f0, b b2, A a0) {
        super(a0);
        this.n = -1;
        this.d = b0 == null ? B.h : b0.h();
        this.e = m0;
        this.f = b1;
        this.g = b2;
        this.m = null;
        if(f0 != null) {
            f0 = f0.g(this);
        }
        this.i = f0;
        this.h = y.o;
        this.j = y.o;
    }

    protected y(y y0) {
        super(y0);
        this.d = y0.d;
        this.e = y0.e;
        this.f = y0.f;
        this.g = y0.g;
        this.h = y0.h;
        this.i = y0.i;
        this.k = y0.k;
        this.n = y0.n;
        this.m = y0.m;
        this.l = y0.l;
        this.j = y0.j;
    }

    protected y(y y0, B b0) {
        super(y0);
        this.d = b0;
        this.e = y0.e;
        this.f = y0.f;
        this.g = y0.g;
        this.h = y0.h;
        this.i = y0.i;
        this.k = y0.k;
        this.n = y0.n;
        this.m = y0.m;
        this.l = y0.l;
        this.j = y0.j;
    }

    protected y(y y0, n n0, v v0) {
        super(y0);
        this.d = y0.d;
        this.e = y0.e;
        this.f = y0.f;
        this.g = y0.g;
        this.i = y0.i;
        this.k = y0.k;
        this.n = y0.n;
        this.h = n0 == null ? y.o : n0;
        this.m = y0.m;
        this.l = y0.l;
        if(v0 == y.o) {
            v0 = this.h;
        }
        this.j = v0;
    }

    protected y(com.fasterxml.jackson.databind.introspect.v v0, m m0, f f0, b b0) {
        this(v0.a(), m0, v0.d(), f0, b0, v0.getMetadata());
    }

    public String A() {
        return this.k;
    }

    public v B() {
        return this.j;
    }

    public F C() {
        return this.l;
    }

    public int D() {
        return this.n;
    }

    public n E() {
        return this.h == y.o ? null : this.h;
    }

    public f F() {
        return this.i;
    }

    public boolean G() {
        return this.h != null && this.h != y.o;
    }

    public boolean H() {
        return this.i != null;
    }

    public boolean I() {
        return this.m != null;
    }

    public boolean J() {
        return false;
    }

    public boolean K() {
        return false;
    }

    public void L() {
    }

    public abstract void M(Object arg1, Object arg2) throws IOException;

    public abstract Object N(Object arg1, Object arg2) throws IOException;

    public void O(String s) {
        this.k = s;
    }

    public void P(F f0) {
        this.l = f0;
    }

    public void Q(Class[] arr_class) {
        if(arr_class == null) {
            this.m = null;
            return;
        }
        this.m = K.a(arr_class);
    }

    public boolean R(Class class0) {
        return this.m == null || this.m.b(class0);
    }

    public abstract y S(B arg1);

    public abstract y T(v arg1);

    public y U(String s) {
        B b0 = this.d == null ? new B(s) : this.d.m(s);
        return b0 == this.d ? this : this.S(b0);
    }

    public abstract y V(n arg1);

    @Override  // com.fasterxml.jackson.databind.d
    public B a() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.d
    public Annotation b(Class class0) {
        return this.g.a(class0);
    }

    @Override  // com.fasterxml.jackson.databind.d
    public B d() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.d
    public void g(l l0, I i0) throws o {
        if(this.c()) {
            l0.l(this);
            return;
        }
        l0.i(this);
    }

    @Override  // com.fasterxml.jackson.databind.d
    public abstract Annotation getAnnotation(Class arg1);

    @Override  // com.fasterxml.jackson.databind.d
    public final String getName() {
        return this.d.d();
    }

    @Override  // com.fasterxml.jackson.databind.d
    public m getType() {
        return this.e;
    }

    @Override  // com.fasterxml.jackson.databind.d
    public abstract k h();

    protected IOException l(com.fasterxml.jackson.core.n n0, Exception exception0) throws IOException {
        com.fasterxml.jackson.databind.util.h.w0(exception0);
        com.fasterxml.jackson.databind.util.h.x0(exception0);
        Throwable throwable0 = com.fasterxml.jackson.databind.util.h.P(exception0);
        throw o.o(n0, com.fasterxml.jackson.databind.util.h.q(throwable0), throwable0);
    }

    @Deprecated
    protected IOException m(Exception exception0) throws IOException {
        return this.l(null, exception0);
    }

    protected void n(com.fasterxml.jackson.core.n n0, Exception exception0, Object object0) throws IOException {
        if(exception0 instanceof IllegalArgumentException) {
            String s = com.fasterxml.jackson.databind.util.h.j(object0);
            StringBuilder stringBuilder0 = new StringBuilder("Problem deserializing property \'");
            stringBuilder0.append(this.getName());
            stringBuilder0.append("\' (expected type: ");
            stringBuilder0.append(this.getType());
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
            throw o.o(n0, stringBuilder0.toString(), exception0);
        }
        this.l(n0, exception0);
    }

    protected void o(Exception exception0, Object object0) throws IOException {
        this.n(null, exception0, object0);
    }

    public void p(int v) {
        if(this.n != -1) {
            throw new IllegalStateException("Property \'" + this.getName() + "\' already had index (" + this.n + "), trying to assign " + v);
        }
        this.n = v;
    }

    public final Object q(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        if(n0.Y3(r.v)) {
            return this.j.c(h0);
        }
        f f0 = this.i;
        if(f0 != null) {
            return this.h.i(n0, h0, f0);
        }
        Object object0 = this.h.g(n0, h0);
        return object0 == null ? this.j.c(h0) : object0;
    }

    public abstract void r(com.fasterxml.jackson.core.n arg1, h arg2, Object arg3) throws IOException;

    public abstract Object s(com.fasterxml.jackson.core.n arg1, h arg2, Object arg3) throws IOException;

    @Override
    public String toString() {
        return "[property \'" + this.getName() + "\']";
    }

    public final Object u(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        if(n0.Y3(r.v)) {
            return q.e(this.j) ? object0 : this.j.c(h0);
        }
        if(this.i != null) {
            return h0.X(h0.x().f0(object0.getClass()), this).h(n0, h0, object0);
        }
        Object object1 = this.h.h(n0, h0, object0);
        if(object1 == null) {
            return q.e(this.j) ? object0 : this.j.c(h0);
        }
        return object1;
    }

    public void w(g g0) {
    }

    public int x() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property \'%s\' (of type %s)", this.getName(), this.getClass().getName()));
    }

    protected Class y() {
        return this.h().m();
    }

    public Object z() {
        return null;
    }
}

