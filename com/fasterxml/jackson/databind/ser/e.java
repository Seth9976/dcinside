package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.impl.b;
import com.fasterxml.jackson.databind.ser.impl.i;
import com.fasterxml.jackson.databind.ser.impl.v;
import com.fasterxml.jackson.databind.ser.std.d;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.util.Set;

public class e extends d {
    private static final long n = 29L;

    public e(m m0, f f0, com.fasterxml.jackson.databind.ser.d[] arr_d, com.fasterxml.jackson.databind.ser.d[] arr_d1) {
        super(m0, f0, arr_d, arr_d1);
    }

    protected e(d d0) {
        super(d0);
    }

    protected e(d d0, i i0) {
        super(d0, i0);
    }

    protected e(d d0, i i0, Object object0) {
        super(d0, i0, object0);
    }

    protected e(d d0, Set set0, Set set1) {
        super(d0, set0, set1);
    }

    protected e(d d0, com.fasterxml.jackson.databind.ser.d[] arr_d, com.fasterxml.jackson.databind.ser.d[] arr_d1) {
        super(d0, arr_d, arr_d1);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d U() {
        return this.j == null && this.g == null && this.h == null ? new b(this) : this;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d Z(Set set0, Set set1) {
        return new e(this, set0, set1);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public d a0(Object object0) {
        return new e(this, this.j, object0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public d e0(i i0) {
        return new e(this, i0, this.h);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d f0(com.fasterxml.jackson.databind.ser.d[] arr_d, com.fasterxml.jackson.databind.ser.d[] arr_d1) {
        return new e(this, arr_d, arr_d1);
    }

    @Deprecated
    public static e g0(m m0) {
        return new e(m0, null, d.m, null);
    }

    public static e h0(m m0, f f0) {
        return new e(m0, f0, d.m, null);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public final void m(Object object0, k k0, I i0) throws IOException {
        if(this.j != null) {
            k0.u1(object0);
            this.S(object0, k0, i0, true);
            return;
        }
        k0.E4(object0);
        if(this.h == null) {
            this.X(object0, k0, i0);
        }
        else {
            this.Y(object0, k0, i0);
        }
        k0.p3();
    }

    @Override  // com.fasterxml.jackson.databind.r
    public r o(x x0) {
        return new v(this, x0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public r q(Object object0) {
        return this.a0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public r r(Set set0) {
        return new e(this, set0, null);
    }

    @Override
    public String toString() {
        return "BeanSerializer for " + this.g().getName();
    }
}

