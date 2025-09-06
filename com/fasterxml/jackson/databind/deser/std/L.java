package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.impl.s;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.deser.w;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.a;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.util.Collection;

public abstract class l extends D implements j, w {
    protected final n f;
    private static final long g = 1L;

    public l(n n0) {
        super(n0.s());
        this.f = n0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws o {
        m m0 = h0.R(this.f.s());
        n n0 = h0.s0(this.f, d0, m0);
        return n0 == this.f ? this : this.r1(n0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.w
    public void b(h h0) throws o {
        n n0 = this.f;
        if(n0 instanceof w) {
            ((w)n0).b(h0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object c(h h0) throws o {
        return this.f.c(h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public a d() {
        return this.f.d();
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object f(h h0) throws o {
        return this.f.f(h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        return this.f.g(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException {
        return this.f.h(n0, h0, object0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return this.f.i(n0, h0, f0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public y k(String s) {
        return this.f.k(s);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public n l() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public a m() {
        return this.f.m();
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(h h0) throws o {
        return this.f.o(h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Collection p() {
        return this.f.p();
    }

    @Override  // com.fasterxml.jackson.databind.n
    public s r() {
        return this.f.r();
    }

    protected abstract n r1(n arg1);

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return this.f.u();
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return this.f.w();
    }

    @Override  // com.fasterxml.jackson.databind.n
    public n x(n n0) {
        return n0 == this.f ? this : this.r1(n0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(g g0) {
        return this.f.y(g0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public n z(x x0) {
        n n0 = this.f.z(x0);
        return n0 == this.f ? this : this.r1(n0);
    }
}

