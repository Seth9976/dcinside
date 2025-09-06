package com.google.crypto.tink.util;

import L1.a;
import O1.j;
import com.google.crypto.tink.P;
import java.math.BigInteger;
import java.security.MessageDigest;

@a
@j
public final class c {
    private final BigInteger a;

    private c(BigInteger bigInteger0) {
        this.a = bigInteger0;
    }

    public boolean a(c c0) {
        return MessageDigest.isEqual(this.a.toByteArray(), c0.a.toByteArray());
    }

    public static c b(BigInteger bigInteger0, P p0) {
        if(p0 == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return new c(bigInteger0);
    }

    public BigInteger c(P p0) {
        if(p0 == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.a;
    }
}

