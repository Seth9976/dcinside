package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.std.d;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

public class v extends d implements Serializable {
    protected final x n;
    private static final long o = 1L;

    public v(v v0, i i0) {
        super(v0, i0);
        this.n = v0.n;
    }

    public v(v v0, i i0, Object object0) {
        super(v0, i0, object0);
        this.n = v0.n;
    }

    protected v(v v0, Set set0) {
        this(v0, set0, null);
    }

    protected v(v v0, Set set0, Set set1) {
        super(v0, set0, set1);
        this.n = v0.n;
    }

    protected v(v v0, com.fasterxml.jackson.databind.ser.d[] arr_d, com.fasterxml.jackson.databind.ser.d[] arr_d1) {
        super(v0, arr_d, arr_d1);
        this.n = v0.n;
    }

    public v(d d0, x x0) {
        super(d0, x0);
        this.n = x0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d U() {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d Z(Set set0, Set set1) {
        return new v(this, set0, set1);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public d a0(Object object0) {
        return new v(this, this.j, object0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public d e0(i i0) {
        return new v(this, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    protected d f0(com.fasterxml.jackson.databind.ser.d[] arr_d, com.fasterxml.jackson.databind.ser.d[] arr_d1) {
        return new v(this, arr_d, arr_d1);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean j() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public final void m(Object object0, k k0, I i0) throws IOException {
        k0.u1(object0);
        if(this.j != null) {
            this.S(object0, k0, i0, false);
            return;
        }
        if(this.h != null) {
            this.Y(object0, k0, i0);
            return;
        }
        this.X(object0, k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        if(i0.D0(H.h)) {
            i0.E(this.g(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        k0.u1(object0);
        if(this.j != null) {
            this.R(object0, k0, i0, j0);
            return;
        }
        if(this.h != null) {
            this.Y(object0, k0, i0);
            return;
        }
        this.X(object0, k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public r o(x x0) {
        return new v(this, x0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.d
    public r q(Object object0) {
        return this.a0(object0);
    }

    @Override
    public String toString() {
        return "UnwrappingBeanSerializer for " + this.g().getName();
    }
}

