package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.o;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class b extends I {
    private static final long g = 1L;

    public b() {
        super(AtomicBoolean.class);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException, f {
        return this.r1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(h h0) throws o {
        return new AtomicBoolean(false);
    }

    public AtomicBoolean r1(n n0, h h0) throws IOException {
        r r0 = n0.Y();
        if(r0 == r.t) {
            return new AtomicBoolean(true);
        }
        if(r0 == r.u) {
            return new AtomicBoolean(false);
        }
        Boolean boolean0 = this.s0(n0, h0, AtomicBoolean.class);
        return boolean0 == null ? null : new AtomicBoolean(boolean0.booleanValue());
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.I
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.h;
    }
}

