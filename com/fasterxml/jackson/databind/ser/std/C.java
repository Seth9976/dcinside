package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.type.l;
import com.fasterxml.jackson.databind.util.x;
import java.util.concurrent.atomic.AtomicReference;

public class c extends B {
    private static final long n = 1L;

    protected c(c c0, d d0, j j0, r r0, x x0, Object object0, boolean z) {
        super(c0, d0, j0, r0, x0, object0, z);
    }

    public c(l l0, boolean z, j j0, r r0) {
        super(l0, z, j0, r0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.B
    protected Object R(Object object0) {
        return this.Y(((AtomicReference)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.B
    protected Object S(Object object0) {
        return this.Z(((AtomicReference)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.B
    protected boolean T(Object object0) {
        return this.a0(((AtomicReference)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.B
    public B W(Object object0, boolean z) {
        return new c(this, this.e, this.f, this.g, this.h, object0, z);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.B
    protected B X(d d0, j j0, r r0, x x0) {
        return new c(this, d0, j0, r0, x0, this.j, this.k);
    }

    protected Object Y(AtomicReference atomicReference0) {
        return atomicReference0.get();
    }

    protected Object Z(AtomicReference atomicReference0) {
        return atomicReference0.get();
    }

    protected boolean a0(AtomicReference atomicReference0) {
        return atomicReference0.get() != null;
    }
}

