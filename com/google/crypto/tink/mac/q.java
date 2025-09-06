package com.google.crypto.tink.mac;

import L1.a;
import O1.j;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

@a
public final class q extends A {
    static class com.google.crypto.tink.mac.q.a {
    }

    public static final class b {
        @h
        private Integer a;
        @h
        private Integer b;
        private c c;
        private d d;

        private b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = d.e;
        }

        b(com.google.crypto.tink.mac.q.a q$a0) {
        }

        public q a() throws GeneralSecurityException {
            Integer integer0 = this.a;
            if(integer0 == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if(this.b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if(this.c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if(this.d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if(((int)integer0) < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
            }
            b.f(((int)this.b), this.c);
            return new q(((int)this.a), ((int)this.b), this.d, this.c, null);
        }

        @O1.a
        public b b(c q$c0) {
            this.c = q$c0;
            return this;
        }

        @O1.a
        public b c(int v) throws GeneralSecurityException {
            this.a = v;
            return this;
        }

        @O1.a
        public b d(int v) throws GeneralSecurityException {
            this.b = v;
            return this;
        }

        @O1.a
        public b e(d q$d0) {
            this.d = q$d0;
            return this;
        }

        private static void f(int v, c q$c0) throws GeneralSecurityException {
            if(v < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", v));
            }
            if(q$c0 == c.b) {
                if(v > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", v));
                }
                return;
            }
            if(q$c0 == c.c) {
                if(v > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", v));
                }
                return;
            }
            if(q$c0 == c.d) {
                if(v > 0x20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", v));
                }
                return;
            }
            if(q$c0 == c.e) {
                if(v > 0x30) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", v));
                }
                return;
            }
            if(q$c0 != c.f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if(v > 0x40) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", v));
            }
        }
    }

    @j
    public static final class c {
        private final String a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;

        static {
            c.b = new c("SHA1");
            c.c = new c("SHA224");
            c.d = new c("SHA256");
            c.e = new c("SHA384");
            c.f = new c("SHA512");
        }

        private c(String s) {
            this.a = s;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    @j
    public static final class d {
        private final String a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;

        static {
            d.b = new d("TINK");
            d.c = new d("CRUNCHY");
            d.d = new d("LEGACY");
            d.e = new d("NO_PREFIX");
        }

        private d(String s) {
            this.a = s;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    private final int a;
    private final int b;
    private final d c;
    private final c d;

    private q(int v, int v1, d q$d0, c q$c0) {
        this.a = v;
        this.b = v1;
        this.c = q$d0;
        this.d = q$c0;
    }

    q(int v, int v1, d q$d0, c q$c0, com.google.crypto.tink.mac.q.a q$a0) {
        this(v, v1, q$d0, q$c0);
    }

    @Override  // com.google.crypto.tink.E
    public boolean a() {
        return this.c != d.e;
    }

    public static b b() {
        return new b(null);
    }

    public int c() {
        return this.b;
    }

    public c d() {
        return this.d;
    }

    public int e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof q ? ((q)object0).e() == this.e() && ((q)object0).f() == this.f() && ((q)object0).g() == this.g() && ((q)object0).d() == this.d() : false;
    }

    public int f() {
        d q$d0 = this.c;
        if(q$d0 == d.e) {
            return this.c();
        }
        if(q$d0 == d.b) {
            return this.c() + 5;
        }
        if(q$d0 == d.c) {
            return this.c() + 5;
        }
        if(q$d0 != d.d) {
            throw new IllegalStateException("Unknown variant");
        }
        return this.c() + 5;
    }

    public d g() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override
    public String toString() {
        return "HMAC Parameters (variant: " + this.c + ", hashType: " + this.d + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}

