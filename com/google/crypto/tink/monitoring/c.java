package com.google.crypto.tink.monitoring;

import L1.a;
import O1.j;
import com.google.crypto.tink.s;
import j..util.DesugarCollections;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import o3.h;

@a
@j
public final class c {
    static class com.google.crypto.tink.monitoring.c.a {
    }

    public static final class b {
        @h
        private ArrayList a;
        private com.google.crypto.tink.monitoring.a b;
        @h
        private Integer c;

        public b() {
            this.a = new ArrayList();
            this.b = com.google.crypto.tink.monitoring.a.b;
            this.c = null;
        }

        @O1.a
        public b a(s s0, int v, String s1, String s2) {
            ArrayList arrayList0 = this.a;
            if(arrayList0 == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList0.add(new com.google.crypto.tink.monitoring.c.c(s0, v, s1, s2, null));
            return this;
        }

        public c b() throws GeneralSecurityException {
            if(this.a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            if(this.c != null && !this.c(((int)this.c))) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c c0 = new c(this.b, DesugarCollections.unmodifiableList(this.a), this.c, null);
            this.a = null;
            return c0;
        }

        private boolean c(int v) {
            for(Object object0: this.a) {
                if(((com.google.crypto.tink.monitoring.c.c)object0).a() == v) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }

        @O1.a
        public b d(com.google.crypto.tink.monitoring.a a0) {
            if(this.a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.b = a0;
            return this;
        }

        @O1.a
        public b e(int v) {
            if(this.a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.c = v;
            return this;
        }
    }

    @j
    public static final class com.google.crypto.tink.monitoring.c.c {
        private final s a;
        private final int b;
        private final String c;
        private final String d;

        private com.google.crypto.tink.monitoring.c.c(s s0, int v, String s1, String s2) {
            this.a = s0;
            this.b = v;
            this.c = s1;
            this.d = s2;
        }

        com.google.crypto.tink.monitoring.c.c(s s0, int v, String s1, String s2, com.google.crypto.tink.monitoring.c.a c$a0) {
            this(s0, v, s1, s2);
        }

        public int a() {
            return this.b;
        }

        public String b() {
            return this.d;
        }

        public String c() {
            return this.c;
        }

        public s d() {
            return this.a;
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof com.google.crypto.tink.monitoring.c.c ? this.a == ((com.google.crypto.tink.monitoring.c.c)object0).a && this.b == ((com.google.crypto.tink.monitoring.c.c)object0).b && this.c.equals(((com.google.crypto.tink.monitoring.c.c)object0).c) && this.d.equals(((com.google.crypto.tink.monitoring.c.c)object0).d) : false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
        }

        @Override
        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType=\'%s\', keyPrefix=\'%s\')", this.a, this.b, this.c, this.d);
        }
    }

    private final com.google.crypto.tink.monitoring.a a;
    private final List b;
    @h
    private final Integer c;

    private c(com.google.crypto.tink.monitoring.a a0, List list0, Integer integer0) {
        this.a = a0;
        this.b = list0;
        this.c = integer0;
    }

    c(com.google.crypto.tink.monitoring.a a0, List list0, Integer integer0, com.google.crypto.tink.monitoring.c.a c$a0) {
        this(a0, list0, integer0);
    }

    public com.google.crypto.tink.monitoring.a a() {
        return this.a;
    }

    public List b() {
        return this.b;
    }

    @h
    public Integer c() {
        return this.c;
    }

    public static b d() {
        return new b();
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof c ? this.a.equals(((c)object0).a) && this.b.equals(((c)object0).b) && Objects.equals(this.c, ((c)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}

