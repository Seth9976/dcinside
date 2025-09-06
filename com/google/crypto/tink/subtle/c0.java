package com.google.crypto.tink.subtle;

import L1.a;
import java.security.InvalidKeyException;
import java.util.Arrays;

@a
public final class c0 {
    public static byte[] a(byte[] arr_b, byte[] arr_b1) throws InvalidKeyException {
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] arr_v = new long[11];
        byte[] arr_b2 = Arrays.copyOf(arr_b, 0x20);
        arr_b2[0] = (byte)(arr_b2[0] & 0xF8);
        byte b = (byte)(arr_b2[0x1F] & 0x7F);
        arr_b2[0x1F] = b;
        arr_b2[0x1F] = (byte)(b | 0x40);
        k.b(arr_v, arr_b2, arr_b1);
        return B.a(arr_v);
    }

    public static byte[] b() [...] // 潜在的解密器

    public static byte[] c(byte[] arr_b) throws InvalidKeyException {
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] arr_b1 = new byte[0x20];
        arr_b1[0] = 9;
        return c0.a(arr_b, arr_b1);
    }
}

