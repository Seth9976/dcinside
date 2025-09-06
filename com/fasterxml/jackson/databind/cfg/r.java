package com.fasterxml.jackson.databind.cfg;

public enum r implements l {
    READ_NULL_PROPERTIES(true),
    WRITE_NULL_PROPERTIES(true),
    WRITE_PROPERTIES_SORTED(false),
    STRIP_TRAILING_BIGDECIMAL_ZEROES(true);

    private final boolean a;
    private final int b;
    private static final int g = 1;

    private r(boolean z) {
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

    @Override  // com.fasterxml.jackson.databind.cfg.l
    public int d() {
        return 1;
    }
}

