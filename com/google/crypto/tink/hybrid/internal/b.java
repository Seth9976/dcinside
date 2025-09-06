package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.aead.internal.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@j
final class b implements d {
    @Override  // com.google.crypto.tink.hybrid.internal.d
    public byte[] a(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) throws GeneralSecurityException {
        if(arr_b.length != 0x20) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + 0x20);
        }
        return new e(arr_b).b(arr_b1, arr_b2, arr_b3);
    }

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public byte[] b(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) throws GeneralSecurityException {
        if(arr_b.length != 0x20) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + 0x20);
        }
        return new e(arr_b).d(arr_b1, arr_b2, arr_b3);
    }

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public int c() {
        return 12;
    }

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public int d() [...] // Inlined contents

    @Override  // com.google.crypto.tink.hybrid.internal.d
    public byte[] e() {
        return p.k;
    }
}

