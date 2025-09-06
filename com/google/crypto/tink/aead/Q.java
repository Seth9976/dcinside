package com.google.crypto.tink.aead;

import L1.a;
import O1.j;
import O1.t;
import com.google.crypto.tink.E;
import com.google.crypto.tink.o;
import com.google.crypto.tink.util.d;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import o3.h;

@a
@j
public final class q extends c {
    static class com.google.crypto.tink.aead.q.a {
    }

    public static class b {
        @h
        private s a;
        @h
        private d b;
        @h
        private Integer c;

        private b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        b(com.google.crypto.tink.aead.q.a q$a0) {
        }

        public q a() throws GeneralSecurityException {
            s s0 = this.a;
            if(s0 == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if(s0.d() != this.b.d()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if(this.a.a() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if(!this.a.a() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            com.google.crypto.tink.util.a a0 = this.b();
            return new q(this.a, this.b, a0, this.c, null);
        }

        private com.google.crypto.tink.util.a b() {
            if(this.a.f() == com.google.crypto.tink.aead.s.c.d) {
                return com.google.crypto.tink.util.a.a(new byte[0]);
            }
            if(this.a.f() == com.google.crypto.tink.aead.s.c.c) {
                return com.google.crypto.tink.util.a.a(ByteBuffer.allocate(5).put(0).putInt(((int)this.c)).array());
            }
            if(this.a.f() != com.google.crypto.tink.aead.s.c.b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.a.f());
            }
            return com.google.crypto.tink.util.a.a(ByteBuffer.allocate(5).put(1).putInt(((int)this.c)).array());
        }

        @O1.a
        public b c(@h Integer integer0) {
            this.c = integer0;
            return this;
        }

        @O1.a
        public b d(d d0) {
            this.b = d0;
            return this;
        }

        @O1.a
        public b e(s s0) {
            this.a = s0;
            return this;
        }
    }

    private final s a;
    private final d b;
    private final com.google.crypto.tink.util.a c;
    @h
    private final Integer d;

    private q(s s0, d d0, com.google.crypto.tink.util.a a0, @h Integer integer0) {
        this.a = s0;
        this.b = d0;
        this.c = a0;
        this.d = integer0;
    }

    q(s s0, d d0, com.google.crypto.tink.util.a a0, Integer integer0, com.google.crypto.tink.aead.q.a q$a0) {
        this(s0, d0, a0, integer0);
    }

    // 去混淆评级： 低(40)
    @Override  // com.google.crypto.tink.o
    public boolean a(o o0) {
        return o0 instanceof q ? ((q)o0).a.equals(this.a) && ((q)o0).b.b(this.b) && Objects.equals(((q)o0).d, this.d) : false;
    }

    @Override  // com.google.crypto.tink.o
    @h
    public Integer b() {
        return this.d;
    }

    @Override  // com.google.crypto.tink.aead.c
    public E c() {
        return this.i();
    }

    @Override  // com.google.crypto.tink.aead.c
    public com.google.crypto.tink.util.a d() {
        return this.c;
    }

    @Override  // com.google.crypto.tink.aead.c
    public e f() {
        return this.i();
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static b g() {
        return new b(null);
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public d h() {
        return this.b;
    }

    public s i() {
        return this.a;
    }
}

