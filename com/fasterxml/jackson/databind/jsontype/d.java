package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import java.io.Serializable;

public abstract class d implements Serializable {
    public static abstract class a extends d implements Serializable {
        private static final long b = 1L;

        @Override  // com.fasterxml.jackson.databind.jsontype.d
        public b a(t t0, m m0) {
            return b.c;
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.d
        public b b(t t0, m m0, String s) throws o {
            return b.c;
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.d
        public b c(t t0, m m0, m m1) throws o {
            return b.c;
        }
    }

    public static enum b {
        ALLOWED,
        DENIED,
        INDETERMINATE;

    }

    private static final long a = 1L;

    public abstract b a(t arg1, m arg2);

    public abstract b b(t arg1, m arg2, String arg3) throws o;

    public abstract b c(t arg1, m arg2, m arg3) throws o;
}

