package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.subtle.c0;
import com.google.crypto.tink.subtle.h;
import java.security.GeneralSecurityException;
import java.util.Arrays;

@j
final class s implements i {
    private final c a;

    s(c c0) {
        this.a = c0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.crypto.tink.hybrid.internal.i
    public com.google.crypto.tink.hybrid.internal.j a(byte[] arr_b) throws GeneralSecurityException {
        return this.e(arr_b, new byte[]{7, (byte)0x84, 39, 87, 100, (byte)0x89, -44, (byte)0xA0, (byte)0xE1, 86, -51, (byte)0xA0, -40, -42, 21, (byte)0x90, -46, 88, 12, -9, 5, 5, 8, -57, -30, 100, 0x1F, 24, -16, -11, -87, -100});
    }

    @Override  // com.google.crypto.tink.hybrid.internal.i
    public byte[] b(byte[] arr_b, l l0) throws GeneralSecurityException {
        return this.d(c0.a(l0.b().d(), arr_b), arr_b, l0.a().d());
    }

    @Override  // com.google.crypto.tink.hybrid.internal.i
    public byte[] c() throws GeneralSecurityException {
        if(!Arrays.equals(this.a.b(), p.f)) {
            throw new GeneralSecurityException("Could not determine HPKE KEM ID");
        }
        return p.b;
    }

    private byte[] d(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        byte[] arr_b3 = h.d(new byte[][]{arr_b1, arr_b2});
        int v = this.a.g();
        return this.a.c(null, arr_b, "eae_prk", arr_b3, "shared_secret", new byte[]{75, 69, 77, 0, 0x20}, v);
    }

    com.google.crypto.tink.hybrid.internal.j e(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = c0.a(arr_b1, arr_b);
        byte[] arr_b3 = c0.c(arr_b1);
        return new com.google.crypto.tink.hybrid.internal.j(this.d(arr_b2, arr_b3, arr_b), arr_b3);
    }
}

