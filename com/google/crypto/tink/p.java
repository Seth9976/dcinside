package com.google.crypto.tink;

import L1.a;
import O1.b;
import O1.j;
import java.security.GeneralSecurityException;
import o3.h;

@a
@b
@j
public final class P {
    private static final P a;

    static {
        P.a = new P();
    }

    static P a() {
        return P.a;
    }

    @O1.a
    public static P b(@h P p0) throws GeneralSecurityException {
        if(p0 == null) {
            throw new GeneralSecurityException("SecretKeyAccess is required");
        }
        return p0;
    }
}

