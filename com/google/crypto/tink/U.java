package com.google.crypto.tink;

import java.security.GeneralSecurityException;

public final class u {
    public static t a(String s) throws GeneralSecurityException {
        t t0 = (t)O.t().get(s);
        if(t0 == null) {
            throw new GeneralSecurityException("cannot find key template: " + s);
        }
        return t0;
    }
}

