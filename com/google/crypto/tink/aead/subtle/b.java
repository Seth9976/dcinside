package com.google.crypto.tink.aead.subtle;

import O1.j;
import com.google.crypto.tink.subtle.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@j
public final class b implements a {
    private final int a;

    public b(int v) throws GeneralSecurityException {
        this.a = b.c(v);
    }

    @Override  // com.google.crypto.tink.aead.subtle.a
    public com.google.crypto.tink.b a(byte[] arr_b) throws GeneralSecurityException {
        if(arr_b.length != this.b()) {
            throw new GeneralSecurityException(String.format("Symmetric key has incorrect length; expected %s, but got %s", this.b(), ((int)arr_b.length)));
        }
        return new e(arr_b);
    }

    @Override  // com.google.crypto.tink.aead.subtle.a
    public int b() {
        return this.a;
    }

    private static int c(int v) throws InvalidAlgorithmParameterException {
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid AES key size, expected 16 or 32, but got %d", v));
        }
        return v;
    }
}

