package com.google.crypto.tink.subtle;

import O1.j;
import com.google.crypto.tink.M;
import com.google.crypto.tink.config.internal.c.b;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

@j
public final class N implements M {
    private final RSAPrivateCrtKey a;
    private final RSAPublicKey b;
    private final String c;
    public static final b d;

    static {
        N.d = b.b;
    }

    public N(RSAPrivateCrtKey rSAPrivateCrtKey0, a a$a0) throws GeneralSecurityException {
        if(!N.d.a()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        b0.h(a$a0);
        b0.f(rSAPrivateCrtKey0.getModulus().bitLength());
        b0.g(rSAPrivateCrtKey0.getPublicExponent());
        this.a = rSAPrivateCrtKey0;
        this.c = a0.i(a$a0);
        this.b = (RSAPublicKey)((KeyFactory)y.h.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey0.getModulus(), rSAPrivateCrtKey0.getPublicExponent()));
    }

    @Override  // com.google.crypto.tink.M
    public byte[] a(byte[] arr_b) throws GeneralSecurityException {
        Signature signature0 = (Signature)y.d.a(this.c);
        signature0.initSign(this.a);
        signature0.update(arr_b);
        byte[] arr_b1 = signature0.sign();
        Signature signature1 = (Signature)y.d.a(this.c);
        signature1.initVerify(this.b);
        signature1.update(arr_b);
        if(!signature1.verify(arr_b1)) {
            throw new RuntimeException("Security bug: RSA signature computation error");
        }
        return arr_b1;
    }
}

