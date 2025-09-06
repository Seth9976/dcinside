package com.google.crypto.tink.subtle;

import O1.j;
import com.google.crypto.tink.M;
import com.google.crypto.tink.config.internal.c.b;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.util.List;

@j
public final class l implements M {
    private final ECPrivateKey a;
    private final String b;
    private final c c;
    public static final b d;

    static {
        l.d = b.b;
    }

    public l(ECPrivateKey eCPrivateKey0, a a$a0, c w$c0) throws GeneralSecurityException {
        if(!l.d.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.a = eCPrivateKey0;
        this.b = a0.h(a$a0);
        this.c = w$c0;
    }

    @Override  // com.google.crypto.tink.M
    public byte[] a(byte[] arr_b) throws GeneralSecurityException {
        List list0 = y.c(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"});
        Signature signature0 = (Signature)y.d.b(this.b, list0);
        signature0.initSign(this.a);
        signature0.update(arr_b);
        byte[] arr_b1 = signature0.sign();
        return this.c == c.a ? w.e(arr_b1, w.i(this.a.getParams().getCurve()) * 2) : arr_b1;
    }
}

