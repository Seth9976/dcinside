package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.proto.E1;
import com.google.crypto.tink.subtle.h;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import p3.a;
import p3.d;

@d
final class e {
    private final com.google.crypto.tink.hybrid.internal.d a;
    private final BigInteger b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    @a("this")
    private BigInteger f;
    private static final byte[] g;

    static {
        e.g = new byte[0];
    }

    private e(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, BigInteger bigInteger0, com.google.crypto.tink.hybrid.internal.d d0) {
        this.e = arr_b;
        this.c = arr_b1;
        this.d = arr_b2;
        this.f = BigInteger.ZERO;
        this.b = bigInteger0;
        this.a = d0;
    }

    @a("this")
    private byte[] a() throws GeneralSecurityException {
        byte[] arr_b = com.google.crypto.tink.internal.a.c(this.f, this.a.c());
        return h.i(this.d, arr_b);
    }

    private byte[] b() throws GeneralSecurityException {
        synchronized(this) {
            byte[] arr_b = this.a();
            this.i();
            return arr_b;
        }
    }

    static e c(byte[] arr_b, byte[] arr_b1, i i0, com.google.crypto.tink.hybrid.internal.h h0, com.google.crypto.tink.hybrid.internal.d d0, byte[] arr_b2) throws GeneralSecurityException {
        byte[] arr_b3 = p.a(i0.c(), h0.b(), d0.e());
        byte[] arr_b4 = h0.a(p.l, e.g, "psk_id_hash", arr_b3);
        byte[] arr_b5 = h0.a(p.l, arr_b2, "info_hash", arr_b3);
        byte[] arr_b6 = h.d(new byte[][]{p.a, arr_b4, arr_b5});
        byte[] arr_b7 = h0.a(arr_b1, e.g, "secret", arr_b3);
        return new e(arr_b, h0.d(arr_b7, arr_b6, "key", arr_b3, d0.d()), h0.d(arr_b7, arr_b6, "base_nonce", arr_b3, d0.c()), e.j(d0.c()), d0);
    }

    static e d(byte[] arr_b, l l0, i i0, com.google.crypto.tink.hybrid.internal.h h0, com.google.crypto.tink.hybrid.internal.d d0, byte[] arr_b1) throws GeneralSecurityException {
        return e.c(arr_b, i0.b(arr_b, l0), i0, h0, d0, arr_b1);
    }

    static e e(E1 e10, i i0, com.google.crypto.tink.hybrid.internal.h h0, com.google.crypto.tink.hybrid.internal.d d0, byte[] arr_b) throws GeneralSecurityException {
        j j0 = i0.a(e10.e().a0());
        return e.c(j0.a(), j0.b(), i0, h0, d0, arr_b);
    }

    byte[] f() {
        return this.d;
    }

    byte[] g() {
        return this.e;
    }

    byte[] h() {
        return this.c;
    }

    @a("this")
    private void i() throws GeneralSecurityException {
        if(this.f.compareTo(this.b) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f = this.f.add(BigInteger.ONE);
    }

    private static BigInteger j(int v) {
        BigInteger bigInteger0 = BigInteger.ONE;
        return bigInteger0.shiftLeft(v * 8).subtract(bigInteger0);
    }

    byte[] k(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.b();
        return this.a.a(this.c, arr_b2, arr_b, arr_b1);
    }

    byte[] l(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.b();
        return this.a.b(this.c, arr_b2, arr_b, arr_b1);
    }
}

