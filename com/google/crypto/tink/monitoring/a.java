package com.google.crypto.tink.monitoring;

import L1.a;
import O1.j;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

@a
@j
public final class com.google.crypto.tink.monitoring.a {
    static class com.google.crypto.tink.monitoring.a.a {
    }

    public static final class b {
        private HashMap a;

        public b() {
            this.a = new HashMap();
        }

        @O1.a
        public b a(String s, String s1) {
            HashMap hashMap0 = this.a;
            if(hashMap0 == null) {
                throw new IllegalStateException("add cannot be called after build()");
            }
            hashMap0.put(s, s1);
            return this;
        }

        @O1.a
        public b b(Map map0) {
            HashMap hashMap0 = this.a;
            if(hashMap0 == null) {
                throw new IllegalStateException("addAll cannot be called after build()");
            }
            hashMap0.putAll(map0);
            return this;
        }

        public com.google.crypto.tink.monitoring.a c() {
            if(this.a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            com.google.crypto.tink.monitoring.a a0 = new com.google.crypto.tink.monitoring.a(DesugarCollections.unmodifiableMap(this.a), null);
            this.a = null;
            return a0;
        }
    }

    private final Map a;
    public static final com.google.crypto.tink.monitoring.a b;

    static {
        com.google.crypto.tink.monitoring.a.b = com.google.crypto.tink.monitoring.a.a().c();
    }

    private com.google.crypto.tink.monitoring.a(Map map0) {
        this.a = map0;
    }

    com.google.crypto.tink.monitoring.a(Map map0, com.google.crypto.tink.monitoring.a.a a$a0) {
        this(map0);
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof com.google.crypto.tink.monitoring.a ? this.a.equals(((com.google.crypto.tink.monitoring.a)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

