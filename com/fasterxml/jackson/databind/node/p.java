package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import java.io.IOException;

public final class p extends z {
    private static final long c = 1L;
    private static final p d;

    static {
        p.d = new p();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean C() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public String F1() {
        return "";
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public void H(k k0, I i0, j j0) throws IOException {
        k0.y3();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public n O0() {
        return n.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        k0.y3();
    }

    public static p c2() {
        return p.d;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        return object0 == this;
    }

    protected Object f2() {
        return p.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return r.j;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return n.d.ordinal();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String j0() {
        return "";
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String k0(String s) {
        return s;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public String toString() {
        return "";
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public com.fasterxml.jackson.databind.p v0() {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public com.fasterxml.jackson.databind.p x1() {
        return (com.fasterxml.jackson.databind.p)this.W("require() called on `MissingNode`", new Object[0]);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public com.fasterxml.jackson.databind.p y1() {
        return (com.fasterxml.jackson.databind.p)this.W("requireNonNull() called on `MissingNode`", new Object[0]);
    }
}

