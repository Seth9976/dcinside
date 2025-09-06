package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.deser.std.D;
import java.io.IOException;

public class h extends D {
    protected final String f;
    private static final long g = 1L;

    public h(Class class0, String s) {
        super(class0);
        this.f = s;
    }

    public h(String s) {
        this(Object.class, s);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
        h0.a1(this, this.f, new Object[0]);
        return null;
    }
}

