package com.google.crypto.tink.signature;

import L1.a;
import O1.j;
import O1.t;
import com.google.crypto.tink.E;
import com.google.crypto.tink.l;
import com.google.crypto.tink.o;
import com.google.crypto.tink.util.c;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

@a
@j
public final class b extends C {
    static class com.google.crypto.tink.signature.b.a {
    }

    public static class com.google.crypto.tink.signature.b.b {
        private com.google.crypto.tink.signature.j a;
        private c b;

        private com.google.crypto.tink.signature.b.b() {
            this.a = null;
            this.b = null;
        }

        com.google.crypto.tink.signature.b.b(com.google.crypto.tink.signature.b.a b$a0) {
        }

        @com.google.crypto.tink.a
        public b a() throws GeneralSecurityException {
            if(this.a == null) {
                throw new GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            c c0 = this.b;
            if(c0 == null) {
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            com.google.crypto.tink.signature.b.b.d(c0.c(l.a()), this.a.i(), this.a.h().c());
            return new b(this.a, this.b, null);
        }

        @O1.a
        public com.google.crypto.tink.signature.b.b b(c c0) {
            this.b = c0;
            return this;
        }

        @O1.a
        public com.google.crypto.tink.signature.b.b c(com.google.crypto.tink.signature.j j0) {
            this.a = j0;
            return this;
        }

        private static void d(BigInteger bigInteger0, ECPoint eCPoint0, com.google.crypto.tink.signature.a.c a$c0) throws GeneralSecurityException {
            BigInteger bigInteger1 = a$c0.b().getOrder();
            if(bigInteger0.signum() <= 0 || bigInteger0.compareTo(bigInteger1) >= 0 || !com.google.crypto.tink.internal.c.k(bigInteger0, a$c0.b()).equals(eCPoint0)) {
                throw new GeneralSecurityException("Invalid private value");
            }
        }
    }

    private final com.google.crypto.tink.signature.j a;
    private final c b;

    private b(com.google.crypto.tink.signature.j j0, c c0) {
        this.a = j0;
        this.b = c0;
    }

    b(com.google.crypto.tink.signature.j j0, c c0, com.google.crypto.tink.signature.b.a b$a0) {
        this(j0, c0);
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.crypto.tink.o
    public boolean a(o o0) {
        return o0 instanceof b ? ((b)o0).a.a(this.a) && this.b.a(((b)o0).b) : false;
    }

    @Override  // com.google.crypto.tink.signature.C
    public E c() {
        return this.i();
    }

    @Override  // com.google.crypto.tink.signature.C
    public o e() {
        return this.k();
    }

    @Override  // com.google.crypto.tink.signature.C
    public A f() {
        return this.i();
    }

    @Override  // com.google.crypto.tink.signature.C
    public D g() {
        return this.k();
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static com.google.crypto.tink.signature.b.b h() {
        return new com.google.crypto.tink.signature.b.b(null);
    }

    public com.google.crypto.tink.signature.a i() {
        return this.a.h();
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public c j() {
        return this.b;
    }

    public com.google.crypto.tink.signature.j k() {
        return this.a;
    }
}

