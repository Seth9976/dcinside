package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Arrays;

public class d implements Serializable {
    protected Boolean a;
    protected final c[] b;
    private static final long c = 1L;
    private static final int d;

    static {
        d.d = f.values().length;
    }

    public d() {
        this.b = new c[d.d];
        this.a = null;
    }

    protected d(d d0) {
        this.a = d0.a;
        this.b = (c[])Arrays.copyOf(d0.b, d0.b.length);
    }

    public c a(f f0) {
        return this.b[f0.ordinal()];
    }

    public Boolean b() {
        return this.a;
    }
}

