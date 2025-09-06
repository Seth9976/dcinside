package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.k.b;

public enum g implements d {
    QUOTE_FIELD_NAMES(true, b.f),
    WRITE_NAN_AS_STRINGS(true, b.g),
    WRITE_NUMBERS_AS_STRINGS(false, b.i),
    ESCAPE_NON_ASCII(false, b.h),
    WRITE_HEX_UPPER_CASE(true, b.n);

    private final boolean a;
    private final int b;
    private final b c;

    private g(boolean z, b k$b0) {
        this.a = z;
        this.b = 1 << this.ordinal();
        this.c = k$b0;
    }

    @Override  // com.fasterxml.jackson.core.d
    public int a() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.core.d
    public boolean b(int v) {
        return (v & this.b) != 0;
    }

    @Override  // com.fasterxml.jackson.core.d
    public boolean c() {
        return this.a;
    }

    public static int e() {
        g[] arr_g = g.values();
        int v1 = 0;
        for(int v = 0; v < arr_g.length; ++v) {
            g g0 = arr_g[v];
            if(g0.c()) {
                v1 |= g0.a();
            }
        }
        return v1;
    }

    public b f() {
        return this.c;
    }
}

