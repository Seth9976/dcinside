package com.google.crypto.tink.mac.internal;

import O1.j;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.mac.a;
import com.google.crypto.tink.mac.k;
import com.google.crypto.tink.mac.l;
import java.security.GeneralSecurityException;

@j
public final class c implements com.google.crypto.tink.mac.j {
    private final a a;
    private static final b b;

    static {
        c.b = b.a;
    }

    public c(a a0) throws GeneralSecurityException {
        if(!c.b.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.a = a0;
    }

    @Override  // com.google.crypto.tink.mac.j
    public l a(byte[] arr_b) throws GeneralSecurityException {
        int v = this.a.d().c();
        if(arr_b.length < v) {
            throw new GeneralSecurityException("Tag too short");
        }
        com.google.crypto.tink.util.a a0 = com.google.crypto.tink.util.a.b(arr_b, 0, this.a.d().c());
        if(!this.a.d().equals(a0)) {
            throw new GeneralSecurityException("Wrong tag prefix");
        }
        return new d(this.a, arr_b);
    }

    @Override  // com.google.crypto.tink.mac.j
    public k b() throws GeneralSecurityException {
        return new com.google.crypto.tink.mac.internal.b(this.a);
    }
}

