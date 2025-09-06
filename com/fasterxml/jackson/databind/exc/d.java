package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;

public class d extends f {
    protected final B j;
    private static final long k = 1L;

    protected d(h h0, String s, B b0) {
        super((h0 == null ? null : h0.m0()), s);
        this.j = b0;
    }

    public static d J(h h0, B b0, m m0) {
        d d0 = new d(h0, String.format("Invalid `null` value encountered for property %s", com.fasterxml.jackson.databind.util.h.q0(b0, "<UNKNOWN>")), b0);
        if(m0 != null) {
            d0.I(m0);
        }
        return d0;
    }

    public B K() {
        return this.j;
    }
}

