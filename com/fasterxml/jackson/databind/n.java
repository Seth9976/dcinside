package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.databind.deser.impl.s;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.util.Collection;

public abstract class n implements v {
    public static abstract class a extends n {
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public Object c(h h0) throws o {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public com.fasterxml.jackson.databind.util.a d() {
        return com.fasterxml.jackson.databind.util.a.b;
    }

    @Override  // com.fasterxml.jackson.databind.deser.v
    public Object f(h h0) throws o {
        return this.c(h0);
    }

    public abstract Object g(com.fasterxml.jackson.core.n arg1, h arg2) throws IOException, f;

    public Object h(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException, f {
        h0.n0(this);
        return this.g(n0, h0);
    }

    public Object i(com.fasterxml.jackson.core.n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException, f {
        return f0.c(n0, h0);
    }

    public Object j(com.fasterxml.jackson.core.n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0, Object object0) throws IOException, f {
        h0.n0(this);
        return this.i(n0, h0, f0);
    }

    public y k(String s) {
        throw new IllegalArgumentException("Cannot handle managed/back reference \'" + s + "\': type: value deserializer of type " + this.getClass().getName() + " does not support them");
    }

    public n l() {
        return null;
    }

    public com.fasterxml.jackson.databind.util.a m() {
        return com.fasterxml.jackson.databind.util.a.c;
    }

    @Deprecated
    public Object n() {
        return null;
    }

    public Object o(h h0) throws o {
        return this.c(h0);
    }

    public Collection p() {
        return null;
    }

    @Deprecated
    public Object q() [...] // Inlined contents

    public s r() {
        return null;
    }

    public Class s() {
        return null;
    }

    public boolean u() {
        return false;
    }

    public com.fasterxml.jackson.databind.type.h w() {
        return null;
    }

    public n x(n n0) {
        throw new UnsupportedOperationException();
    }

    public Boolean y(g g0) {
        return null;
    }

    public n z(x x0) {
        return this;
    }
}

