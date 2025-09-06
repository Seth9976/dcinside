package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.aead.internal.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@j
final class a implements d {
    private final int a;

    a(int v) throws InvalidAlgorithmParameterException {
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + v);
        }
        this.a = v;
    }

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public byte[] a(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) throws GeneralSecurityException {
        if(arr_b.length != this.a) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + arr_b.length);
        }
        return new b(arr_b, false).a(arr_b1, arr_b2, arr_b3);
    }

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public byte[] b(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) throws GeneralSecurityException {
        if(arr_b.length != this.a) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + arr_b.length);
        }
        return new b(arr_b, false).b(arr_b1, arr_b2, arr_b3);
    }

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public int c() {
        return 12;
    }

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public int d() {
        return this.a;
    }

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public byte[] e() throws GeneralSecurityException {
        switch(this.a) {
            case 16: {
                return p.i;
            }
            case 0x20: {
                return p.j;
            }
            default: {
                throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
            }
        }
    }
}

