package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.o;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class c extends I {
    private static final long g = 1L;

    public c() {
        super(AtomicInteger.class);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException, f {
        return this.r1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(h h0) throws o {
        return new AtomicInteger();
    }

    public AtomicInteger r1(n n0, h h0) throws IOException {
        if(n0.c4()) {
            return new AtomicInteger(n0.Q1());
        }
        Integer integer0 = this.K0(n0, h0, AtomicInteger.class);
        return integer0 == null ? null : new AtomicInteger(((int)integer0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.I
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.f;
    }
}

