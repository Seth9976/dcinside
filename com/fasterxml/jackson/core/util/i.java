package com.fasterxml.jackson.core.util;

import java.io.Serializable;

public final class i implements Serializable {
    protected int a;
    private static final long b = 1L;

    protected i(int v) {
        this.a = v;
    }

    public int a() {
        return this.a;
    }

    public static i b(int v) {
        return new i(v);
    }

    public static i c(h[] arr_h) {
        if(arr_h.length > 0x1F) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", arr_h[0].getClass().getName(), ((int)arr_h.length)));
        }
        int v1 = 0;
        for(int v = 0; v < arr_h.length; ++v) {
            h h0 = arr_h[v];
            if(h0.c()) {
                v1 |= h0.a();
            }
        }
        return new i(v1);
    }

    public boolean d(h h0) {
        return (h0.a() & this.a) != 0;
    }

    public i e(h h0) {
        int v = this.a;
        int v1 = h0.a() | v;
        return v1 == this.a ? this : new i(v1);
    }

    public i f(h h0) {
        int v = this.a;
        int v1 = ~h0.a() & v;
        return v1 == this.a ? this : new i(v1);
    }
}

