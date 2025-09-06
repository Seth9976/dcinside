package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import java.util.concurrent.atomic.AtomicReference;

public class e extends A {
    private static final long k = 1L;

    public e(m m0, B b0, f f0, n n0) {
        super(m0, b0, f0, n0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.A
    public Object c(h h0) throws o {
        return this.v1(h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object f(h h0) throws o {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.A
    public Object o(h h0) throws o {
        return this.v1(h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.A
    public Object r1(Object object0) {
        return this.w1(((AtomicReference)object0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.A
    public Object s1(Object object0) {
        return this.x1(object0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.A
    public Object t1(Object object0, Object object1) {
        return this.y1(((AtomicReference)object0), object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.A
    public A u1(f f0, n n0) {
        return this.z1(f0, n0);
    }

    public AtomicReference v1(h h0) throws o {
        return new AtomicReference(this.i.c(h0));
    }

    public Object w1(AtomicReference atomicReference0) {
        return atomicReference0.get();
    }

    public AtomicReference x1(Object object0) {
        return new AtomicReference(object0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.A
    public Boolean y(g g0) {
        return true;
    }

    public AtomicReference y1(AtomicReference atomicReference0, Object object0) {
        atomicReference0.set(object0);
        return atomicReference0;
    }

    public e z1(f f0, n n0) {
        return new e(this.f, this.g, f0, n0);
    }
}

