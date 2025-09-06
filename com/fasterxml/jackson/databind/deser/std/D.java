package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.o;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class d extends I {
    private static final long g = 1L;

    public d() {
        super(AtomicLong.class);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException, f {
        return this.r1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(h h0) throws o {
        return new AtomicLong();
    }

    public AtomicLong r1(n n0, h h0) throws IOException {
        if(n0.c4()) {
            return new AtomicLong(n0.e2());
        }
        Long long0 = this.M0(n0, h0, AtomicLong.class);
        return long0 == null ? null : new AtomicLong(((long)long0.intValue()));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.I
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.f;
    }
}

