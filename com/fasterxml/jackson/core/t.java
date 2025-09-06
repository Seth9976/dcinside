package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.io.q;

public class t extends d {
    private static final long d = 1L;
    private static final int[] e;
    private static final q f;
    private static final q g;
    private static final t h;

    static {
        t.e = d.c();
        t.f = new q("\\u2028");
        t.g = new q("\\u2029");
        t.h = new t();
    }

    @Override  // com.fasterxml.jackson.core.io.d
    public int[] a() {
        return t.e;
    }

    @Override  // com.fasterxml.jackson.core.io.d
    public w b(int v) {
        switch(v) {
            case 0x2028: {
                return t.f;
            }
            case 0x2029: {
                return t.g;
            }
            default: {
                return null;
            }
        }
    }

    public static t d() {
        return t.h;
    }
}

