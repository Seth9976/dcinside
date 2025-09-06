package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.m;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class b extends d implements Serializable {
    static final class a {
        private final Set a;
        public static final a b;

        static {
            a.b = new a();
        }

        private a() {
            HashSet hashSet0 = new HashSet();
            this.a = hashSet0;
            hashSet0.add("java.lang.Object");
            hashSet0.add("java.io.Closeable");
            hashSet0.add("java.io.Serializable");
            hashSet0.add("java.lang.AutoCloseable");
            hashSet0.add("java.lang.Cloneable");
            hashSet0.add("java.util.logging.Handler");
            hashSet0.add("javax.naming.Referenceable");
            hashSet0.add("javax.sql.DataSource");
        }

        public boolean a(Class class0) {
            return this.a.contains(class0.getName());
        }
    }

    private static final long b = 1L;

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.jsontype.d
    public com.fasterxml.jackson.databind.jsontype.d.b a(t t0, m m0) {
        return this.e(t0, m0) ? com.fasterxml.jackson.databind.jsontype.d.b.b : com.fasterxml.jackson.databind.jsontype.d.b.c;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.d
    public com.fasterxml.jackson.databind.jsontype.d.b b(t t0, m m0, String s) {
        return com.fasterxml.jackson.databind.jsontype.d.b.c;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.d
    public com.fasterxml.jackson.databind.jsontype.d.b c(t t0, m m0, m m1) {
        return com.fasterxml.jackson.databind.jsontype.d.b.a;
    }

    protected boolean d(t t0, m m0, m m1) [...] // Inlined contents

    protected boolean e(t t0, m m0) {
        return a.b.a(m0.g());
    }
}

