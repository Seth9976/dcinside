package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

public class g extends d {
    public static final int c = 24;

    public g(byte[] arr_b, int v) throws InvalidKeyException {
        super(arr_b, v);
    }

    @Override  // com.google.crypto.tink.aead.internal.d
    int[] b(int[] arr_v, int v) {
        if(arr_v.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", ((int)(arr_v.length * 0x20))));
        }
        int[] arr_v1 = new int[16];
        a.c(arr_v1, g.i(this.a, arr_v));
        arr_v1[12] = v;
        arr_v1[13] = 0;
        arr_v1[14] = arr_v[4];
        arr_v1[15] = arr_v[5];
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
    int g() [...] // Inlined contents

    static int[] i(int[] arr_v, int[] arr_v1) {
        int[] arr_v2 = new int[16];
        a.c(arr_v2, arr_v);
        arr_v2[12] = arr_v1[0];
        arr_v2[13] = arr_v1[1];
        arr_v2[14] = arr_v1[2];
        arr_v2[15] = arr_v1[3];
        a.d(arr_v2);
        arr_v2[4] = arr_v2[12];
        arr_v2[5] = arr_v2[13];
        arr_v2[6] = arr_v2[14];
        arr_v2[7] = arr_v2[15];
        return Arrays.copyOf(arr_v2, 8);
    }
}

