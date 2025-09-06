package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.h;

public enum z implements h {
    AUTO_CLOSE_SOURCE(a.c),
    STRICT_DUPLICATE_DETECTION(a.q),
    IGNORE_UNDEFINED(a.r),
    INCLUDE_SOURCE_IN_LOCATION(a.s),
    USE_FAST_DOUBLE_PARSER(a.t),
    USE_FAST_BIG_NUMBER_PARSER(a.u);

    private final boolean a;
    private final int b;
    private final a c;

    private z(a n$a0) {
        this.c = n$a0;
        this.b = n$a0.d();
        this.a = n$a0.b();
    }

    @Override  // com.fasterxml.jackson.core.util.h
    public int a() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.core.util.h
    public boolean b(int v) {
        return (v & this.b) != 0;
    }

    @Override  // com.fasterxml.jackson.core.util.h
    public boolean c() {
        return this.a;
    }

    public static int e() {
        z[] arr_z = z.values();
        int v1 = 0;
        for(int v = 0; v < arr_z.length; ++v) {
            z z0 = arr_z[v];
            if(z0.c()) {
                v1 |= z0.a();
            }
        }
        return v1;
    }

    public a f() {
        return this.c;
    }
}

