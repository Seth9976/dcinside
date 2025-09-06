package com.google.crypto.tink.subtle;

import com.google.crypto.tink.aead.internal.e;
import com.google.crypto.tink.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class j implements b {
    private final e a;

    public j(byte[] arr_b) throws GeneralSecurityException {
        this.a = new e(arr_b);
    }

    @Override  // com.google.crypto.tink.b
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 28);
        byte[] arr_b2 = {82, 17, 92, 10, (byte)0x83, 12, 77, (byte)0x83, -53, 107, 0x30, -75};
        byteBuffer0.put(arr_b2);
        this.a.c(byteBuffer0, arr_b2, arr_b, arr_b1);
        return byteBuffer0.array();
    }

    @Override  // com.google.crypto.tink.b
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, 12);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 12, arr_b.length - 12);
        return this.a.a(byteBuffer0, arr_b2, arr_b1);
    }
}

