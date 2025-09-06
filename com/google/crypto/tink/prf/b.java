package com.google.crypto.tink.prf;

import L1.a;
import O1.j;
import O1.t;
import com.google.crypto.tink.E;
import com.google.crypto.tink.o;
import java.security.GeneralSecurityException;
import o3.h;

@a
@j
public final class b extends m {
    static class com.google.crypto.tink.prf.b.a {
    }

    public static final class com.google.crypto.tink.prf.b.b {
        @h
        private d a;
        @h
        private com.google.crypto.tink.util.d b;

        private com.google.crypto.tink.prf.b.b() {
            this.a = null;
            this.b = null;
        }

        com.google.crypto.tink.prf.b.b(com.google.crypto.tink.prf.b.a b$a0) {
        }

        public b a() throws GeneralSecurityException {
            d d0 = this.a;
            if(d0 == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if(d0.d() != this.b.d()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            return new b(this.a, this.b, null);
        }

        @O1.a
        public com.google.crypto.tink.prf.b.b b(com.google.crypto.tink.util.d d0) {
            this.b = d0;
            return this;
        }

        @O1.a
        public com.google.crypto.tink.prf.b.b c(d d0) {
            this.a = d0;
            return this;
        }
    }

    private final d a;
    private final com.google.crypto.tink.util.d b;

    private b(d d0, com.google.crypto.tink.util.d d1) {
        this.a = d0;
        this.b = d1;
    }

    b(d d0, com.google.crypto.tink.util.d d1, com.google.crypto.tink.prf.b.a b$a0) {
        this(d0, d1);
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.crypto.tink.o
    public boolean a(o o0) {
        return o0 instanceof b ? ((b)o0).a.equals(this.a) && ((b)o0).b.b(this.b) : false;
    }

    @Override  // com.google.crypto.tink.o
    @h
    public Integer b() [...] // Inlined contents

    @Override  // com.google.crypto.tink.prf.m
    public E c() {
        return this.h();
    }

    @Override  // com.google.crypto.tink.prf.m
    public com.google.crypto.tink.prf.o d() {
        return this.h();
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static com.google.crypto.tink.prf.b.b f() {
        return new com.google.crypto.tink.prf.b.b(null);
    }

    @t(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {com.google.crypto.tink.a.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public com.google.crypto.tink.util.d g() {
        return this.b;
    }

    public d h() {
        return this.a;
    }
}

