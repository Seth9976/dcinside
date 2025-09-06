package com.google.crypto.tink.subtle;

import com.google.crypto.tink.aead.internal.g;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

class d0 implements E {
    private final g a;
    static final int b = 24;

    d0(byte[] arr_b, int v) throws InvalidKeyException {
        this.a = new g(arr_b, v);
    }

    @Override  // com.google.crypto.tink.subtle.E
    public byte[] a(byte[] arr_b) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 24);
        byte[] arr_b1 = {19, -50, (byte)0x8A, -92, 0x1F, (byte)0x87, 0x20, 0x7B, 20, 84, 65, 15, -65, -16, -27, 85, 107, 74, 11, -28, 71, 34, 76, -100};
        byteBuffer0.put(arr_b1);
        this.a.e(byteBuffer0, arr_b1, arr_b);
        return byteBuffer0.array();
    }

    @Override  // com.google.crypto.tink.subtle.E
    public byte[] b(byte[] arr_b) throws GeneralSecurityException {
        if(arr_b.length < 24) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, 24);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 24, arr_b.length - 24);
        return this.a.c(arr_b1, byteBuffer0);
    }
}

