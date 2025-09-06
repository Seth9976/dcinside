package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;

public class s extends z {
    private static final long c = 1L;
    public static final s d;

    static {
        s.d = new s();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public n O0() {
        return n.e;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        i0.X(k0);
    }

    public static s c2() {
        return s.d;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof s;
    }

    protected Object f2() {
        return s.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return r.v;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return n.e.ordinal();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String j0() {
        return "null";
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String k0(String s) {
        return s;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p y1() {
        return (p)this.W("requireNonNull() called on `NullNode`", new Object[0]);
    }
}

