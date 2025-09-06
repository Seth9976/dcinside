package com.google.crypto.tink.subtle;

import com.google.crypto.tink.aead.internal.c;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

class i implements E {
    private final c a;
    static final int b = 12;

    i(byte[] arr_b, int v) throws InvalidKeyException {
        this.a = new c(arr_b, v);
    }

    @Override  // com.google.crypto.tink.subtle.E
    public byte[] a(byte[] arr_b) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 12);
        byte[] arr_b1 = {16, 13, -59, -108, 11, -25, -75, -98, -45, 14, 60, 0x6F};
        byteBuffer0.put(arr_b1);
        this.a.e(byteBuffer0, arr_b1, arr_b);
        return byteBuffer0.array();
    }

    @Override  // com.google.crypto.tink.subtle.E
    public byte[] b(byte[] arr_b) throws GeneralSecurityException {
        if(arr_b.length < 12) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, 12);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 12, arr_b.length - 12);
        return this.a.c(arr_b1, byteBuffer0);
    }
}

