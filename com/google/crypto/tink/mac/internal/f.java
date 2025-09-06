package com.google.crypto.tink.mac.internal;

import O1.j;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.mac.k;
import com.google.crypto.tink.mac.l;
import com.google.crypto.tink.mac.n;
import com.google.crypto.tink.util.a;
import java.security.GeneralSecurityException;

@j
public final class f implements com.google.crypto.tink.mac.j {
    private final n a;
    private static final b b;

    static {
        f.b = b.b;
    }

    public f(n n0) throws GeneralSecurityException {
        if(!f.b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = n0;
    }

    @Override  // com.google.crypto.tink.mac.j
    public l a(byte[] arr_b) throws GeneralSecurityException {
        int v = this.a.d().c();
        if(arr_b.length < v) {
            throw new GeneralSecurityException("Tag too short");
        }
        a a0 = a.b(arr_b, 0, this.a.d().c());
        if(!this.a.d().equals(a0)) {
            throw new GeneralSecurityException("Wrong tag prefix");
        }
        return new g(this.a, arr_b);
    }

    @Override  // com.google.crypto.tink.mac.j
    public k b() throws GeneralSecurityException {
        return new e(this.a);
    }
}

