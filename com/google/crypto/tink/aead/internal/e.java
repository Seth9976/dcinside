package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

public final class e extends f {
    public e(byte[] arr_b) throws GeneralSecurityException {
        super(arr_b);
    }

    @Override  // com.google.crypto.tink.aead.internal.f
    public byte[] a(ByteBuffer byteBuffer0, byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return super.a(byteBuffer0, arr_b, arr_b1);
    }

    @Override  // com.google.crypto.tink.aead.internal.f
    public byte[] b(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        return super.b(arr_b, arr_b1, arr_b2);
    }

    @Override  // com.google.crypto.tink.aead.internal.f
    public void c(ByteBuffer byteBuffer0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        super.c(byteBuffer0, arr_b, arr_b1, arr_b2);
    }

    @Override  // com.google.crypto.tink.aead.internal.f
    public byte[] d(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        return super.d(arr_b, arr_b1, arr_b2);
    }

    @Override  // com.google.crypto.tink.aead.internal.f
    d g(byte[] arr_b, int v) throws InvalidKeyException {
        return new c(arr_b, v);
    }
}

