package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

public class v extends d implements Serializable {
    private static final long e = 1L;

    public v() {
    }

    protected v(v v0) {
        super(v0);
    }

    public v c() {
        return new v(this);
    }

    public v d(Boolean boolean0) {
        this.a = boolean0;
        return this;
    }

    public v e(f f0, c c0) {
        this.b[f0.ordinal()] = c0;
        return this;
    }
}

