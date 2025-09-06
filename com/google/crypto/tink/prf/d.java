package com.google.crypto.tink.prf;

import L1.a;
import O1.j;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

@a
public final class d extends o {
    static class com.google.crypto.tink.prf.d.a {
    }

    public static final class b {
        @h
        private Integer a;
        @h
        private c b;
        @h
        private com.google.crypto.tink.util.a c;

        private b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        b(com.google.crypto.tink.prf.d.a d$a0) {
        }

        public d a() throws GeneralSecurityException {
            Integer integer0 = this.a;
            if(integer0 == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if(this.b == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            return new d(((int)integer0), this.b, this.c, null);
        }

        @O1.a
        public b b(c d$c0) {
            this.b = d$c0;
            return this;
        }

        @O1.a
        public b c(int v) throws GeneralSecurityException {
            if(v < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit or larger are supported", ((int)(v * 8))));
            }
            this.a = v;
            return this;
        }

        @O1.a
        public b d(com.google.crypto.tink.util.a a0) {
            if(a0.c() == 0) {
                return this;
            }
            this.c = a0;
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

    private final int a;
    private final c b;
    @h
    private final com.google.crypto.tink.util.a c;
    private static final int d = 16;

    private d(int v, c d$c0, com.google.crypto.tink.util.a a0) {
        this.a = v;
        this.b = d$c0;
        this.c = a0;
    }

    d(int v, c d$c0, com.google.crypto.tink.util.a a0, com.google.crypto.tink.prf.d.a d$a0) {
        this(v, d$c0, a0);
    }

    @Override  // com.google.crypto.tink.E
    public boolean a() {
        return false;
    }

    public static b b() {
        return new b(null);
    }

    public c c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }

    @h
    public com.google.crypto.tink.util.a e() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof d ? ((d)object0).d() == this.d() && ((d)object0).c() == this.c() && Objects.equals(((d)object0).e(), this.e()) : false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public String toString() {
        return "HKDF PRF Parameters (hashType: " + this.b + ", salt: " + this.c + ", and " + this.a + "-byte key)";
    }
}

