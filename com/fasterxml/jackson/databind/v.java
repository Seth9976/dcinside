package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.format.c;
import com.fasterxml.jackson.core.format.d;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.u;
import java.io.IOException;

public class v extends h {
    private static final long z = -1L;

    public v() {
        this(null);
    }

    public v(h h0, x x0) {
        super(h0, x0);
        if(x0 == null) {
            this.d1(new x(this));
        }
    }

    public v(x x0) {
        super(x0);
        if(x0 == null) {
            this.d1(new x(this));
        }
    }

    @Override  // com.fasterxml.jackson.core.h
    public h A0() {
        this.U(v.class);
        return new v(this, null);
    }

    @Override  // com.fasterxml.jackson.core.h
    public String G() {
        return "JSON";
    }

    @Override  // com.fasterxml.jackson.core.h
    public u S0() {
        return this.l1();
    }

    @Override  // com.fasterxml.jackson.core.h
    public d W0(c c0) throws IOException {
        return this.getClass() == v.class ? this.X0(c0) : null;
    }

    public final x l1() {
        return (x)this.h;
    }
}

