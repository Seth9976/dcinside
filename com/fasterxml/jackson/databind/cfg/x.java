package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.I;
import com.fasterxml.jackson.core.util.z;

public final class x implements I {
    public static final H a;

    static {
        x.a = z.d("2.16.1", "com.fasterxml.jackson.core", "jackson-databind");
    }

    @Override  // com.fasterxml.jackson.core.I
    public H version() {
        return x.a;
    }
}

