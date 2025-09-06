package com.google.crypto.tink.subtle;

import com.google.crypto.tink.N;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.util.a;
import java.security.GeneralSecurityException;

public final class v implements N {
    private final a a;
    public static final b b = null;
    public static final int c = 0x20;
    public static final int d = 0x40;

    static {
        v.b = b.a;
    }

    public v(byte[] arr_b) {
        if(!v.b.a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if(arr_b.length != 0x20) {
            throw new IllegalArgumentException("Given public key\'s length is not 32.");
        }
        this.a = a.a(arr_b);
    }

    @Override  // com.google.crypto.tink.N
    public void a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length != 0x40) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        if(!s.z(arr_b1, arr_b, this.a.d())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}

