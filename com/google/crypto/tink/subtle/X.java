package com.google.crypto.tink.subtle;

import com.google.crypto.tink.C;
import com.google.crypto.tink.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class x implements b {
    private final E a;
    private final C b;
    private final int c;

    public x(E e0, C c0, int v) {
        this.a = e0;
        this.b = c0;
        this.c = v;
    }

    @Override  // com.google.crypto.tink.b
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.a.a(arr_b);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b3 = h.d(new byte[][]{arr_b1, arr_b2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long)arr_b1.length) * 8L).array(), 8)});
        return h.d(new byte[][]{arr_b2, this.b.b(arr_b3)});
    }

    @Override  // com.google.crypto.tink.b
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = this.c;
        if(arr_b.length < v) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, 0, arr_b.length - v);
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, arr_b.length - this.c, arr_b.length);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b4 = h.d(new byte[][]{arr_b1, arr_b2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long)arr_b1.length) * 8L).array(), 8)});
        this.b.a(arr_b3, arr_b4);
        return this.a.b(arr_b2);
    }

    public static b c(byte[] arr_b, int v, String s, byte[] arr_b1, int v1) throws GeneralSecurityException {
        return new x(new com.google.crypto.tink.subtle.b(arr_b, v), new K(new J(s, new SecretKeySpec(arr_b1, "HMAC")), v1), v1);
    }
}

