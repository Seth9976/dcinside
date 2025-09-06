package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.subtle.h;
import com.google.crypto.tink.subtle.w.b;
import com.google.crypto.tink.subtle.w.d;
import com.google.crypto.tink.subtle.w;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

@j
final class q implements i {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final b a;
    private final c b;

    private q(c c0, b w$b0) {
        this.b = c0;
        this.a = w$b0;
    }

    @Override  // com.google.crypto.tink.hybrid.internal.i
    public com.google.crypto.tink.hybrid.internal.j a(byte[] arr_b) throws GeneralSecurityException {
        return this.e(arr_b, w.j(this.a));
    }

    @Override  // com.google.crypto.tink.hybrid.internal.i
    public byte[] b(byte[] arr_b, l l0) throws GeneralSecurityException {
        byte[] arr_b1 = l0.b().d();
        return this.d(w.b(w.m(this.a, arr_b1), w.o(this.a, d.a, arr_b)), arr_b, l0.a().d());
    }

    @Override  // com.google.crypto.tink.hybrid.internal.i
    public byte[] c() throws GeneralSecurityException {
        switch(this.a) {
            case 1: {
                return p.c;
            }
            case 2: {
                return p.d;
            }
            case 3: {
                return p.e;
            }
            default: {
                throw new GeneralSecurityException("Could not determine HPKE KEM ID");
            }
        }
    }

    private byte[] d(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        byte[] arr_b3 = h.d(new byte[][]{arr_b1, arr_b2});
        byte[] arr_b4 = p.c(this.c());
        int v = this.b.g();
        return this.b.c(null, arr_b, "eae_prk", arr_b3, "shared_secret", arr_b4, v);
    }

    com.google.crypto.tink.hybrid.internal.j e(byte[] arr_b, KeyPair keyPair0) throws GeneralSecurityException {
        ECPublicKey eCPublicKey0 = w.o(this.a, d.a, arr_b);
        byte[] arr_b1 = w.b(((ECPrivateKey)keyPair0.getPrivate()), eCPublicKey0);
        ECPoint eCPoint0 = ((ECPublicKey)keyPair0.getPublic()).getW();
        byte[] arr_b2 = w.D(this.a, d.a, eCPoint0);
        return new com.google.crypto.tink.hybrid.internal.j(this.d(arr_b1, arr_b2, arr_b), arr_b2);
    }

    static q f(b w$b0) throws GeneralSecurityException {
        switch(a.a[w$b0.ordinal()]) {
            case 1: {
                return new q(new c("HmacSha256"), b.a);
            }
            case 2: {
                return new q(new c("HmacSha384"), b.b);
            }
            case 3: {
                return new q(new c("HmacSha512"), b.c);
            }
            default: {
                throw new GeneralSecurityException("invalid curve type: " + w$b0);
            }
        }
    }
}

