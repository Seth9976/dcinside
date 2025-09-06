package com.fasterxml.jackson.databind.cfg;

public enum p implements l {
    READ_ENUM_KEYS_USING_INDEX(false),
    WRITE_ENUMS_TO_LOWERCASE(false);

    private final boolean a;
    private final int b;
    private static final int e;

    private p(boolean z) {
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
        return 0;
    }
}

