package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class i extends t {
    protected final float d;

    public i(float f) {
        this.d = f;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public short D1() {
        return (short)(((int)this.d));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public float K0() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        k0.E3(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public int U0() {
        return (int)this.d;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean c2() {
        return Float.isNaN(this.d) || Float.isInfinite(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean e1() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 == null ? false : object0 instanceof i && Float.compare(this.d, ((i)object0).d) == 0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean f1() {
        return true;
    }

    public static i f2(float f) {
        return new i(f);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public b g() {
        return b.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return r.s;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return Float.floatToIntBits(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public String j0() {
        return n.w(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public BigInteger o0() {
        return this.u0().toBigInteger();
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public long q1() {
        return (long)this.d;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.p
    public boolean r0() {
        return !Float.isNaN(this.d) && !Float.isInfinite(this.d) && this.d == ((float)Math.round(this.d));
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public Number r1() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean s0() {
        return this.d >= -2147483648.0f && this.d <= 2147483648.0f;
    }

    @Override  // com.fasterxml.jackson.databind.node.t
    public boolean t0() {
        return this.d >= -9223372036854776000.0f && this.d <= 9223372036854776000.0f;
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

