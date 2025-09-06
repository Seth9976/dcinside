package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.ser.k;
import java.io.IOException;

public final class r extends com.fasterxml.jackson.databind.r implements k {
    protected final j a;
    protected final com.fasterxml.jackson.databind.r b;

    public r(j j0, com.fasterxml.jackson.databind.r r0) {
        this.a = j0;
        this.b = r0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.k
    public com.fasterxml.jackson.databind.r c(I i0, d d0) throws o {
        com.fasterxml.jackson.databind.r r0 = this.b instanceof k ? i0.z0(this.b, d0) : this.b;
        return r0 == this.b ? this : new r(this.a, r0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public Class g() {
        return Object.class;
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.b.n(object0, k0, i0, this.a);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
        this.b.n(object0, k0, i0, j0);
    }

    public j s() {
        return this.a;
    }

    public com.fasterxml.jackson.databind.r u() {
        return this.b;
    }
}

