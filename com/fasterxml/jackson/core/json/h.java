package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.I;
import com.fasterxml.jackson.core.util.z;

public final class h implements I {
    public static final H a;

    static {
        h.a = z.d("2.16.1", "com.fasterxml.jackson.core", "jackson-core");
    }

    @Override  // com.fasterxml.jackson.core.I
    public H version() {
        return h.a;
    }
}

