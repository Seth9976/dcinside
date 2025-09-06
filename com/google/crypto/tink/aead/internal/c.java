package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

public class c extends d {
    public c(byte[] arr_b, int v) throws InvalidKeyException {
        super(arr_b, v);
    }

    @Override  // com.google.crypto.tink.aead.internal.d
    public int[] b(int[] arr_v, int v) {
        if(arr_v.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", ((int)(arr_v.length * 0x20))));
        }
        int[] arr_v1 = new int[16];
        a.c(arr_v1, this.a);
        arr_v1[12] = v;
        System.arraycopy(arr_v, 0, arr_v1, 13, arr_v.length);
        return arr_v1;
    }

    @Override  // com.google.crypto.tink.aead.internal.d
    public byte[] c(byte[] arr_b, ByteBuffer byteBuffer0) throws GeneralSecurityException {
        return super.c(arr_b, byteBuffer0);
    }

    @Override  // com.google.crypto.tink.aead.internal.d
    public byte[] d(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return super.d(arr_b, arr_b1);
    }

    @Override  // com.google.crypto.tink.aead.internal.d
    public void e(ByteBuffer byteBuffer0, byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        super.e(byteBuffer0, arr_b, arr_b1);
    }

    @Override  // com.google.crypto.tink.aead.internal.d
    public byte[] f(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return super.f(arr_b, arr_b1);
    }

    @Override  // com.google.crypto.tink.aead.internal.d
    public int g() [...] // Inlined contents
}

