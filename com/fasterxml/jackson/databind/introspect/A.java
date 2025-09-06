package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.cfg.t;
import java.io.Serializable;

public abstract class a {
    public static class com.fasterxml.jackson.databind.introspect.a.a extends a implements Serializable {
        private static final long a = 1L;

        @Override  // com.fasterxml.jackson.databind.introspect.a
        public String a(l l0, String s) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.introspect.a
        public String b(l l0, String s) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.introspect.a
        public String c(l l0, String s) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.introspect.a
        public String d(i i0, String s) {
            return s;
        }
    }

    public static abstract class b implements Serializable {
        private static final long a = 1L;

        public abstract a a(t arg1, d arg2, c arg3);

        public abstract a b(t arg1, d arg2);

        public abstract a c(t arg1, d arg2);
    }

    public abstract String a(l arg1, String arg2);

    public abstract String b(l arg1, String arg2);

    public abstract String c(l arg1, String arg2);

    public abstract String d(i arg1, String arg2);
}

