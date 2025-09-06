package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class o extends t {
    protected final long d;

    public o(long v) {
        this.d = v;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public short D1() {
        return (short)(((int)this.d));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public float K0() {
        return (float)this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        k0.N3(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public int U0() {
        return (int)this.d;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean Z(boolean z) {
        return this.d != 0L;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 == null ? false : object0 instanceof o && ((o)object0).d == this.d;
    }

    public static o f2(long v) {
        return new o(v);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public b g() {
        return b.b;
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return r.r;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean h1() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return ((int)this.d) ^ ((int)(this.d >> 0x20));
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public String j0() {
        return n.z(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean k1() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public BigInteger o0() {
        return BigInteger.valueOf(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public long q1() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public Number r1() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean s0() {
        return this.d >= 0xFFFFFFFF80000000L && this.d <= 0x7FFFFFFFL;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean t0() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public BigDecimal u0() {
        return BigDecimal.valueOf(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public double w0() {
        return (double)this.d;
    }
}

