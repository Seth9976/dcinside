package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.k;
import com.google.crypto.tink.proto.A1;
import com.google.crypto.tink.proto.E1;
import java.security.GeneralSecurityException;

@j
final class g implements k {
    private final E1 a;
    private final i b;
    private final h c;
    private final d d;
    private static final byte[] e;

    static {
        g.e = new byte[0];
    }

    private g(E1 e10, i i0, h h0, d d0) {
        this.a = e10;
        this.b = i0;
        this.c = h0;
        this.d = d0;
    }

    @Override  // com.google.crypto.tink.k
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        e e0 = e.e(this.a, this.b, this.c, this.d, arr_b1);
        return com.google.crypto.tink.subtle.h.d(new byte[][]{e0.g(), e0.l(arr_b, g.e)});
    }

    static g b(E1 e10) throws GeneralSecurityException {
        if(e10.e().isEmpty()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        A1 a10 = e10.a();
        return new g(e10, m.e(a10), m.c(a10), m.a(a10));
    }
}

