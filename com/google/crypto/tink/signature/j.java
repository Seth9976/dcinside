package com.google.crypto.tink.signature;

import L1.a;
import O1.j;
import O1.t;
import com.google.crypto.tink.E;
import com.google.crypto.tink.internal.c;
import com.google.crypto.tink.o;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import o3.h;

@a
@j
public final class com.google.crypto.tink.signature.j extends D {
    static class com.google.crypto.tink.signature.j.a {
    }

    public static class b {
        @h
        private com.google.crypto.tink.signature.a a;
        @h
        private ECPoint b;
        @h
        private Integer c;

        private b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        b(com.google.crypto.tink.signature.j.a j$a0) {
        }

        public com.google.crypto.tink.signature.j a() throws GeneralSecurityException {
            com.google.crypto.tink.signature.a a0 = this.a;
            if(a0 == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            ECPoint eCPoint0 = this.b;
            if(eCPoint0 == null) {
                throw new GeneralSecurityException("Cannot build without public point");
            }
            c.b(eCPoint0, a0.c().b().getCurve());
            if(this.a.a() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if(!this.a.a() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            com.google.crypto.tink.util.a a1 = this.b();
            return new com.google.crypto.tink.signature.j(this.a, this.b, a1, this.c, null);
        }

        private com.google.crypto.tink.util.a b() {
            if(this.a.f() == f.e) {
                return com.google.crypto.tink.util.a.a(new byte[0]);
            }
            if(this.a.f() != f.d && this.a.f() != f.c) {
                if(this.a.f() != f.b) {
                    throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.a.f());
                }
                return com.google.crypto.tink.util.a.a(ByteBuffer.allocate(5).put(1).putInt(((int)this.c)).array());
            }
            return com.google.crypto.tink.util.a.a(ByteBuffer.allocate(5).put(0).putInt(((int)this.c)).array());
        }

        @O1.a
        public b c(@h Integer integer0) {
            this.c = integer0;
            return this;
        }

        @O1.a
        public b d(com.google.crypto.tink.signature.a a0) {
            this.a = a0;
            return this;
        }

        @O1.a
        public b e(ECPoint eCPoint0) {
            this.b = eCPoint0;
            return this;
        }
    }

    private final com.google.crypto.tink.signature.a a;
    private final ECPoint b;
    private final com.google.crypto.tink.util.a c;
    @h
    private final Integer d;

    private com.google.crypto.tink.signature.j(com.google.crypto.tink.signature.a a0, ECPoint eCPoint0, com.google.crypto.tink.util.a a1, @h Integer integer0) {
        this.a = a0;
        this.b = eCPoint0;
        this.c = a1;
        this.d = integer0;
    }

    com.google.crypto.tink.signature.j(com.google.crypto.tink.signature.a a0, ECPoint eCPoint0, com.google.crypto.tink.util.a a1, Integer integer0, com.google.crypto.tink.signature.j.a j$a0) {
        this(a0, eCPoint0, a1, integer0);
    }

    // 去混淆评级： 低(40)
    @Override  // com.google.crypto.tink.o
    public boolean a(o o0) {
        return o0 instanceof com.google.crypto.tink.signature.j ? ((com.google.crypto.tink.signature.j)o0).a.equals(this.a) && ((com.google.crypto.tink.signature.j)o0).b.equals(this.b) && Objects.equals(((com.google.crypto.tink.signature.j)o0).d, this.d) : false;
    }

    @Override  // com.google.crypto.tink.o
    @h
    public Integer b() {
        return this.d;
    }

    @Override  // com.google.crypto.tink.signature.D
    public E c() {
        return this.h();
    }

    @Override  // com.google.crypto.tink.signature.D
    public com.google.crypto.tink.util.a d() {
        return this.c;
    }

    @Override  // com.google.crypto.tink.signature.D
    public A f() {
        return this.h();
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static b g() {
        return new b(null);
    }

    public com.google.crypto.tink.signature.a h() {
        return this.a;
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public ECPoint i() {
        return this.b;
    }
}

