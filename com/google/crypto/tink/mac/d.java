package com.google.crypto.tink.mac;

import O1.j;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

public final class d extends A {
    static class a {
    }

    public static final class b {
        @h
        private Integer a;
        @h
        private Integer b;
        private c c;

        private b() {
            this.a = null;
            this.b = null;
            this.c = c.e;
        }

        b(a d$a0) {
        }

        public d a() throws GeneralSecurityException {
            Integer integer0 = this.a;
            if(integer0 == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if(this.b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if(this.c == null) {
                throw new GeneralSecurityException("variant not set");
            }
            return new d(((int)integer0), ((int)this.b), this.c, null);
        }

        @O1.a
        public b b(int v) throws GeneralSecurityException {
            if(v != 16 && v != 0x20) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", ((int)(v * 8))));
            }
            this.a = v;
            return this;
        }

        @O1.a
        public b c(int v) throws GeneralSecurityException {
            if(v < 10 || 16 < v) {
                throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + v);
            }
            this.b = v;
            return this;
        }

        @O1.a
        public b d(c d$c0) {
            this.c = d$c0;
            return this;
        }
    }

    @j
    public static final class c {
        private final String a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;

        static {
            c.b = new c("TINK");
            c.c = new c("CRUNCHY");
            c.d = new c("LEGACY");
            c.e = new c("NO_PREFIX");
        }

        private c(String s) {
            this.a = s;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    private final int a;
    private final int b;
    private final c c;

    private d(int v, int v1, c d$c0) {
        this.a = v;
        this.b = v1;
        this.c = d$c0;
    }

    d(int v, int v1, c d$c0, a d$a0) {
        this(v, v1, d$c0);
    }

    @Override  // com.google.crypto.tink.E
    public boolean a() {
        return this.c != c.e;
    }

    public static b b() {
        return new b(null);
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        c d$c0 = this.c;
        if(d$c0 == c.e) {
            return this.c();
        }
        if(d$c0 == c.b) {
            return this.c() + 5;
        }
        if(d$c0 == c.c) {
            return this.c() + 5;
        }
        if(d$c0 != c.d) {
            throw new IllegalStateException("Unknown variant");
        }
        return this.c() + 5;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof d ? ((d)object0).d() == this.d() && ((d)object0).e() == this.e() && ((d)object0).f() == this.f() : false;
    }

    public c f() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.c + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}

