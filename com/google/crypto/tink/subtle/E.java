package com.google.crypto.tink.subtle;

import com.google.crypto.tink.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class e implements b {
    private final com.google.crypto.tink.aead.internal.b a;
    public static final com.google.crypto.tink.config.internal.c.b b;

    static {
        e.b = com.google.crypto.tink.config.internal.c.b.b;
    }

    public e(byte[] arr_b) throws GeneralSecurityException {
        if(!e.b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new com.google.crypto.tink.aead.internal.b(arr_b, true);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.crypto.tink.b
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return this.a.b(new byte[]{30, (byte)0xA0, 4, 66, -62, 6, -108, -37, 108, (byte)0x89, -61, -90}, arr_b, arr_b1);
    }

    @Override  // com.google.crypto.tink.b
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = Arrays.copyOf(arr_b, 12);
        return this.a.a(arr_b2, arr_b, arr_b1);
    }
}

