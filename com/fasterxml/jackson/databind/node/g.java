package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.deser.std.f;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class g extends t {
    protected final BigDecimal d;
    public static final g e;
    private static final BigDecimal f;
    private static final BigDecimal g;
    private static final BigDecimal h;
    private static final BigDecimal i;

    static {
        g.e = new g(BigDecimal.ZERO);
        g.f = BigDecimal.valueOf(0xFFFFFFFF80000000L);
        g.g = BigDecimal.valueOf(0x7FFFFFFFL);
        g.h = BigDecimal.valueOf(0x8000000000000000L);
        g.i = BigDecimal.valueOf(0x7FFFFFFFFFFFFFFFL);
    }

    public g(BigDecimal bigDecimal0) {
        this.d = bigDecimal0;
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
        k0.T3(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public int U0() {
        return this.d.intValue();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean V0() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 == null ? false : object0 instanceof g && ((g)object0).d.compareTo(this.d) == 0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean f1() {
        return true;
    }

    public static g f2(BigDecimal bigDecimal0) {
        return new g(bigDecimal0);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public b g() {
        return b.f;
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return r.s;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return this.w0().hashCode();
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public String j0() {
        return this.d.toString();
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public BigInteger o0() {
        return this.S1(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public long q1() {
        return this.d.longValue();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean r0() {
        return this.d.signum() == 0 || this.d.scale() <= 0 || f.a(this.d).scale() <= 0;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public Number r1() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean s0() {
        return this.d.compareTo(g.f) >= 0 && this.d.compareTo(g.g) <= 0;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean t0() {
        return this.d.compareTo(g.h) >= 0 && this.d.compareTo(g.i) <= 0;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public BigDecimal u0() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public double w0() {
        return this.d.doubleValue();
    }
}

