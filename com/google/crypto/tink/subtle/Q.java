package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

public final class q {
    private ECPrivateKey a;

    public q(ECPrivateKey eCPrivateKey0) {
        this.a = eCPrivateKey0;
    }

    public byte[] a(byte[] arr_b, String s, byte[] arr_b1, byte[] arr_b2, int v, d w$d0) throws GeneralSecurityException {
        ECPublicKey eCPublicKey0 = w.q(this.a.getParams(), w$d0, arr_b);
        return D.a(arr_b, w.b(this.a, eCPublicKey0), s, arr_b1, arr_b2, v);
    }
}

