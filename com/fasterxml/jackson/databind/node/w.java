package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class w extends t {
    protected final short d;

    public w(short v) {
        this.d = v;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public short D1() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public float K0() {
        return (float)this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        k0.Z3(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public int U0() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean Z(boolean z) {
        return this.d != 0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 == null ? false : object0 instanceof w && ((w)object0).d == this.d;
    }

    public static w f2(short v) {
        return new w(v);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public b g() {
        return b.a;
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
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public String j0() {
        return n.y(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public BigInteger o0() {
        return BigInteger.valueOf(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean o1() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public long q1() {
        return (long)this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public Number r1() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean s0() {
        return true;
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

