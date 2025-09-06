package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.IOException;

public class t extends M {
    protected final m d;
    protected final String e;
    private static final long f = 1L;

    public t(m m0, String s) {
        super(Object.class);
        this.d = m0;
        this.e = s;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        i0.D(this.d, this.e);
    }
}

