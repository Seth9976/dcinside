package com.google.crypto.tink.mac;

import O1.j;
import O1.t;
import com.google.crypto.tink.E;
import com.google.crypto.tink.o;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import o3.h;

@j
public final class a extends y {
    static class com.google.crypto.tink.mac.a.a {
    }

    public static class b {
        @h
        private d a;
        @h
        private com.google.crypto.tink.util.d b;
        @h
        private Integer c;

        private b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        b(com.google.crypto.tink.mac.a.a a$a0) {
        }

        public a a() throws GeneralSecurityException {
            d d0 = this.a;
            if(d0 == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if(d0.d() != this.b.d()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if(this.a.a() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if(!this.a.a() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            com.google.crypto.tink.util.a a0 = this.b();
            return new a(this.a, this.b, a0, this.c, null);
        }

        private com.google.crypto.tink.util.a b() {
            if(this.a.f() == c.e) {
                return com.google.crypto.tink.util.a.a(new byte[0]);
            }
            if(this.a.f() != c.d && this.a.f() != c.c) {
                if(this.a.f() != c.b) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.a.f());
                }
                return com.google.crypto.tink.util.a.a(ByteBuffer.allocate(5).put(1).putInt(((int)this.c)).array());
            }
            return com.google.crypto.tink.util.a.a(ByteBuffer.allocate(5).put(0).putInt(((int)this.c)).array());
        }

        @O1.a
        public b c(com.google.crypto.tink.util.d d0) throws GeneralSecurityException {
            this.b = d0;
            return this;
        }

        @O1.a
        public b d(@h Integer integer0) {
            this.c = integer0;
            return this;
        }

        @O1.a
        public b e(d d0) {
            this.a = d0;
            return this;
        }
    }

    private final d a;
    private final com.google.crypto.tink.util.d b;
    private final com.google.crypto.tink.util.a c;
    @h
    private final Integer d;

    private a(d d0, com.google.crypto.tink.util.d d1, com.google.crypto.tink.util.a a0, @h Integer integer0) {
        this.a = d0;
        this.b = d1;
        this.c = a0;
        this.d = integer0;
    }

    a(d d0, com.google.crypto.tink.util.d d1, com.google.crypto.tink.util.a a0, Integer integer0, com.google.crypto.tink.mac.a.a a$a0) {
        this(d0, d1, a0, integer0);
    }

    // 去混淆评级： 低(40)
    @Override  // com.google.crypto.tink.o
    public boolean a(o o0) {
        return o0 instanceof a ? ((a)o0).a.equals(this.a) && ((a)o0).b.b(this.b) && Objects.equals(((a)o0).d, this.d) : false;
    }

    @Override  // com.google.crypto.tink.o
    @h
    public Integer b() {
        return this.d;
    }

    @Override  // com.google.crypto.tink.mac.y
    public E c() {
        return this.i();
    }

    @Override  // com.google.crypto.tink.mac.y
    public com.google.crypto.tink.util.a d() {
        return this.c;
    }

    @Override  // com.google.crypto.tink.mac.y
    public A f() {
        return this.i();
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static b g() {
        return new b(null);
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public com.google.crypto.tink.util.d h() {
        return this.b;
    }

    public d i() {
        return this.a;
    }
}

