package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.n.b;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class t extends z {
    private static final long c = 1L;

    @Override  // com.fasterxml.jackson.databind.p
    public final n O0() {
        return n.f;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public abstract int U0();

    @Override  // com.fasterxml.jackson.databind.p
    public final double a0() {
        return this.w0();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final double b0(double f) {
        return this.w0();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final int c0() {
        return this.U0();
    }

    public boolean c2() {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public abstract b g();

    @Override  // com.fasterxml.jackson.databind.p
    public final int g0(int v) {
        return this.U0();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final long h0() {
        return this.q1();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final long i0(long v) {
        return this.q1();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public abstract String j0();

    @Override  // com.fasterxml.jackson.databind.p
    public abstract BigInteger o0();

    @Override  // com.fasterxml.jackson.databind.p
    public abstract long q1();

    @Override  // com.fasterxml.jackson.databind.p
    public abstract Number r1();

    @Override  // com.fasterxml.jackson.databind.p
    public abstract boolean s0();

    @Override  // com.fasterxml.jackson.databind.p
    public abstract boolean t0();

    @Override  // com.fasterxml.jackson.databind.p
    public abstract BigDecimal u0();

    @Override  // com.fasterxml.jackson.databind.p
    public abstract double w0();
}

