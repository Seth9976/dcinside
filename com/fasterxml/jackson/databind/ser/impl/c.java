package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.IOException;

public class c extends M {
    protected final String d;

    public c(String s) {
        super(Object.class);
        this.d = s;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        i0.L0(this.d, new Object[0]);
    }
}

