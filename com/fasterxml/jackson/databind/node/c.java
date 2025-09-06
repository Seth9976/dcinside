package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class c extends t {
    protected final BigInteger d;
    private static final BigInteger e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;

    static {
        c.e = BigInteger.valueOf(0xFFFFFFFF80000000L);
        c.f = BigInteger.valueOf(0x7FFFFFFFL);
        c.g = BigInteger.valueOf(0x8000000000000000L);
        c.h = BigInteger.valueOf(0x7FFFFFFFFFFFFFFFL);
    }

    public c(BigInteger bigInteger0) {
        this.d = bigInteger0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public short D1() {
        return this.d.shortValue();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public float K0() {
        return this.d.floatValue();
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        k0.Y3(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public int U0() {
        return this.d.intValue();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean W0() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean Z(boolean z) {
        return !BigInteger.ZERO.equals(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof c ? ((c)object0).d.equals(this.d) : false;
    }

    public static c f2(BigInteger bigInteger0) {
        return new c(bigInteger0);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public b g() {
        return b.c;
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
        return this.d.hashCode();
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public String j0() {
        return this.d.toString();
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public BigInteger o0() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public long q1() {
        return this.d.longValue();
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public Number r1() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean s0() {
        return this.d.compareTo(c.e) >= 0 && this.d.compareTo(c.f) <= 0;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean t0() {
        return this.d.compareTo(c.g) >= 0 && this.d.compareTo(c.h) <= 0;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public BigDecimal u0() {
        return new BigDecimal(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public double w0() {
        return this.d.doubleValue();
    }
}

