package com.google.crypto.tink.subtle;

import com.google.crypto.tink.aead.internal.h;
import com.google.crypto.tink.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class e0 implements b {
    private final h a;

    public e0(byte[] arr_b) throws GeneralSecurityException {
        this.a = new h(arr_b);
    }

    @Override  // com.google.crypto.tink.b
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 40);
        byte[] arr_b2 = {108, 28, 20, -110, (byte)0x82, 44, 16, -62, 39, 0, 87, 0x7A, 74, 16, 11, 62, -76, (byte)0x86, -87, 91, 59, -71, 29, -59};
        byteBuffer0.put(arr_b2);
        this.a.c(byteBuffer0, arr_b2, arr_b, arr_b1);
        return byteBuffer0.array();
    }

    @Override  // com.google.crypto.tink.b
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, 24);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 24, arr_b.length - 24);
        return this.a.a(byteBuffer0, arr_b2, arr_b1);
    }
}

