package com.google.crypto.tink;

import L1.a;
import O1.j;

@a
@j
public final class s {
    private final String a;
    public static final s b;
    public static final s c;
    public static final s d;

    static {
        s.b = new s("ENABLED");
        s.c = new s("DISABLED");
        s.d = new s("DESTROYED");
    }

    private s(String s) {
        this.a = s;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

