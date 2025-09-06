package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.h;

public enum x implements h {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false),
    EXACT_FLOATS(false);

    private final boolean a;
    private final int b;

    private x(boolean z) {
        this.a = z;
        this.b = 1 << this.ordinal();
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
}

