package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.d.a;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.o;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.util.b;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class l extends y {
    protected final o p;
    protected final a q;
    protected y r;
    protected final int s;
    protected boolean t;
    private static final long u = 1L;

    protected l(B b0, m m0, B b1, f f0, b b2, o o0, int v, a d$a0, A a0) {
        super(b0, m0, b1, f0, b2, a0);
        this.p = o0;
        this.s = v;
        this.q = d$a0;
        this.r = null;
    }

    @Deprecated
    public l(B b0, m m0, B b1, f f0, b b2, o o0, int v, Object object0, A a0) {
        this(b0, m0, b1, f0, b2, o0, v, (object0 == null ? null : a.c(object0, null)), a0);
    }

    protected l(l l0, B b0) {
        super(l0, b0);
        this.p = l0.p;
        this.q = l0.q;
        this.r = l0.r;
        this.s = l0.s;
        this.t = l0.t;
    }

    protected l(l l0, n n0, v v0) {
        super(l0, n0, v0);
        this.p = l0.p;
        this.q = l0.q;
        this.r = l0.r;
        this.s = l0.s;
        this.t = l0.t;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public boolean J() {
        return this.t;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.deser.y
    public boolean K() {
        return this.q != null && !this.q.j(true);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void L() {
        this.t = true;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void M(Object object0, Object object1) throws IOException {
        this.X();
        this.r.M(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object N(Object object0, Object object1) throws IOException {
        this.X();
        return this.r.N(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y S(B b0) {
        return new l(this, b0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y T(v v0) {
        return new l(this, this.h, v0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public y V(n n0) {
        n n1 = this.h;
        if(n1 == n0) {
            return this;
        }
        v v0 = this.j;
        if(n1 == v0) {
            v0 = n0;
        }
        return new l(this, n0, v0);
    }

    private void W(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        String s = "No fallback setter/field defined for creator property " + com.fasterxml.jackson.databind.util.h.j0(this.getName());
        if(h0 == null) {
            throw com.fasterxml.jackson.databind.exc.b.H(n0, s, this.getType());
        }
        h0.D(this.getType(), s);
    }

    private final void X() throws IOException {
        if(this.r == null) {
            this.W(null, null);
        }
    }

    public static l Y(B b0, m m0, B b1, f f0, b b2, o o0, int v, a d$a0, A a0) {
        return new l(b0, m0, b1, f0, b2, o0, v, d$a0, a0);
    }

    @Deprecated
    public Object Z(h h0, Object object0) throws com.fasterxml.jackson.databind.o {
        if(this.q == null) {
            h0.E(com.fasterxml.jackson.databind.util.h.k(object0), String.format("Property %s (type %s) has no injectable value id configured", com.fasterxml.jackson.databind.util.h.j0(this.getName()), com.fasterxml.jackson.databind.util.h.j(this)));
        }
        return h0.Y(this.q.g(), this, object0);
    }

    @Deprecated
    public void a0(h h0, Object object0) throws IOException {
        this.M(object0, this.Z(h0, object0));
    }

    public void b0(y y0) {
        this.r = y0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Annotation getAnnotation(Class class0) {
        return this.p == null ? null : this.p.d(class0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.y
    public A getMetadata() {
        A a0 = super.getMetadata();
        return this.r == null ? a0 : a0.q(this.r.getMetadata().g());
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public k h() {
        return this.p;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void r(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        this.X();
        this.r.M(object0, this.q(n0, h0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object s(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        this.X();
        return this.r.N(object0, this.q(n0, h0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public String toString() {
        return "[creator property, name " + com.fasterxml.jackson.databind.util.h.j0(this.getName()) + "; inject id \'" + this.z() + "\']";
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public void w(g g0) {
        y y0 = this.r;
        if(y0 != null) {
            y0.w(g0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public int x() {
        return this.s;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y
    public Object z() {
        return this.q == null ? null : this.q.g();
    }
}

