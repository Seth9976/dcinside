package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

public final class r {
    public static final class a {
        private final com.google.crypto.tink.util.a a;
        private final com.google.crypto.tink.util.a b;

        public a(byte[] arr_b, byte[] arr_b1) {
            if(arr_b == null) {
                throw new NullPointerException("KemBytes must be non-null");
            }
            if(arr_b1 == null) {
                throw new NullPointerException("symmetricKey must be non-null");
            }
            this.a = com.google.crypto.tink.util.a.a(arr_b);
            this.b = com.google.crypto.tink.util.a.a(arr_b1);
        }

        public byte[] a() {
            return this.a.d();
        }

        public byte[] b() {
            return this.b.d();
        }
    }

    private final ECPublicKey a;

    public r(ECPublicKey eCPublicKey0) {
        this.a = eCPublicKey0;
    }

    public a a(String s, byte[] arr_b, byte[] arr_b1, int v, d w$d0) throws GeneralSecurityException {
        KeyPair keyPair0 = w.k(this.a.getParams());
        ECPublicKey eCPublicKey0 = (ECPublicKey)keyPair0.getPublic();
        byte[] arr_b2 = w.b(((ECPrivateKey)keyPair0.getPrivate()), this.a);
        byte[] arr_b3 = w.E(eCPublicKey0.getParams().getCurve(), w$d0, eCPublicKey0.getW());
        return new a(arr_b3, D.a(arr_b3, arr_b2, s, arr_b, arr_b1, v));
    }
}

