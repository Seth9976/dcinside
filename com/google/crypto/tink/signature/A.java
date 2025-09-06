package com.google.crypto.tink.signature;

import L1.a;
import O1.j;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;

@a
public final class com.google.crypto.tink.signature.a extends A {
    static class com.google.crypto.tink.signature.a.a {
    }

    public static final class b {
        private e a;
        private c b;
        private d c;
        private f d;

        private b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = f.e;
        }

        b(com.google.crypto.tink.signature.a.a a$a0) {
        }

        public com.google.crypto.tink.signature.a a() throws GeneralSecurityException {
            e a$e0 = this.a;
            if(a$e0 == null) {
                throw new GeneralSecurityException("signature encoding is not set");
            }
            c a$c0 = this.b;
            if(a$c0 == null) {
                throw new GeneralSecurityException("EC curve type is not set");
            }
            d a$d0 = this.c;
            if(a$d0 == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            f a$f0 = this.d;
            if(a$f0 == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if(a$c0 == c.c && a$d0 != d.b) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if(a$c0 == c.d && a$d0 != d.c && a$d0 != d.d) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if(a$c0 == c.e && a$d0 != d.d) {
                throw new GeneralSecurityException("NIST_P521 requires SHA512");
            }
            return new com.google.crypto.tink.signature.a(a$e0, a$c0, a$d0, a$f0, null);
        }

        @O1.a
        public b b(c a$c0) {
            this.b = a$c0;
            return this;
        }

        @O1.a
        public b c(d a$d0) {
            this.c = a$d0;
            return this;
        }

        @O1.a
        public b d(e a$e0) {
            this.a = a$e0;
            return this;
        }

        @O1.a
        public b e(f a$f0) {
            this.d = a$f0;
            return this;
        }
    }

    @j
    public static final class c {
        private final String a;
        private final ECParameterSpec b;
        public static final c c;
        public static final c d;
        public static final c e;

        static {
            c.c = new c("NIST_P256", com.google.crypto.tink.internal.c.a);
            c.d = new c("NIST_P384", com.google.crypto.tink.internal.c.b);
            c.e = new c("NIST_P521", com.google.crypto.tink.internal.c.c);
        }

        private c(String s, ECParameterSpec eCParameterSpec0) {
            this.a = s;
            this.b = eCParameterSpec0;
        }

        public static c a(ECParameterSpec eCParameterSpec0) throws GeneralSecurityException {
            c a$c0 = c.c;
            if(com.google.crypto.tink.internal.c.j(eCParameterSpec0, a$c0.b())) {
                return a$c0;
            }
            c a$c1 = c.d;
            if(com.google.crypto.tink.internal.c.j(eCParameterSpec0, a$c1.b())) {
                return a$c1;
            }
            c a$c2 = c.e;
            if(!com.google.crypto.tink.internal.c.j(eCParameterSpec0, a$c2.b())) {
                throw new GeneralSecurityException("unknown ECParameterSpec");
            }
            return a$c2;
        }

        public ECParameterSpec b() {
            return this.b;
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

        static {
            d.b = new d("SHA256");
            d.c = new d("SHA384");
            d.d = new d("SHA512");
        }

        private d(String s) {
            this.a = s;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    @j
    public static final class e {
        private final String a;
        public static final e b;
        public static final e c;

        static {
            e.b = new e("IEEE_P1363");
            e.c = new e("DER");
        }

        private e(String s) {
            this.a = s;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    @j
    public static final class f {
        private final String a;
        public static final f b;
        public static final f c;
        public static final f d;
        public static final f e;

        static {
            f.b = new f("TINK");
            f.c = new f("CRUNCHY");
            f.d = new f("LEGACY");
            f.e = new f("NO_PREFIX");
        }

        private f(String s) {
            this.a = s;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    private final e a;
    private final c b;
    private final d c;
    private final f d;

    private com.google.crypto.tink.signature.a(e a$e0, c a$c0, d a$d0, f a$f0) {
        this.a = a$e0;
        this.b = a$c0;
        this.c = a$d0;
        this.d = a$f0;
    }

    com.google.crypto.tink.signature.a(e a$e0, c a$c0, d a$d0, f a$f0, com.google.crypto.tink.signature.a.a a$a0) {
        this(a$e0, a$c0, a$d0, a$f0);
    }

    @Override  // com.google.crypto.tink.E
    public boolean a() {
        return this.d != f.e;
    }

    public static b b() {
        return new b(null);
    }

    public c c() {
        return this.b;
    }

    public d d() {
        return this.c;
    }

    public e e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof com.google.crypto.tink.signature.a ? ((com.google.crypto.tink.signature.a)object0).e() == this.e() && ((com.google.crypto.tink.signature.a)object0).c() == this.c() && ((com.google.crypto.tink.signature.a)object0).d() == this.d() && ((com.google.crypto.tink.signature.a)object0).f() == this.f() : false;
    }

    public f f() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override
    public String toString() {
        return "ECDSA Parameters (variant: " + this.d + ", hashType: " + this.c + ", encoding: " + this.a + ", curve: " + this.b + ")";
    }
}

