package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.config.internal.c.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

abstract class f {
    private final d a;
    private final d b;
    public static final b c;

    static {
        f.c = b.a;
    }

    public f(byte[] arr_b) throws GeneralSecurityException {
        if(!f.c.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.a = this.g(arr_b, 1);
        this.b = this.g(arr_b, 0);
    }

    public byte[] a(ByteBuffer byteBuffer0, byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(byteBuffer0.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int v = byteBuffer0.position();
        byte[] arr_b2 = new byte[16];
        byteBuffer0.position(byteBuffer0.limit() - 16);
        byteBuffer0.get(arr_b2);
        byteBuffer0.position(v);
        byteBuffer0.limit(byteBuffer0.limit() - 16);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        try {
            i.f(this.e(arr_b), f.f(arr_b1, byteBuffer0), arr_b2);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new AEADBadTagException(generalSecurityException0.toString());
        }
        byteBuffer0.position(v);
        return this.a.c(arr_b, byteBuffer0);
    }

    public byte[] b(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        return this.a(ByteBuffer.wrap(arr_b1), arr_b, arr_b2);
    }

    public void c(ByteBuffer byteBuffer0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        if(byteBuffer0.remaining() < arr_b1.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        this.a.e(byteBuffer0, arr_b, arr_b1);
        byteBuffer0.position(byteBuffer0.position());
        byteBuffer0.limit(byteBuffer0.limit() - 16);
        if(arr_b2 == null) {
            arr_b2 = new byte[0];
        }
        byte[] arr_b3 = i.a(this.e(arr_b), f.f(arr_b2, byteBuffer0));
        byteBuffer0.limit(byteBuffer0.limit() + 16);
        byteBuffer0.put(arr_b3);
    }

    public byte[] d(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        if(arr_b1.length > 0x7FFFFFEF) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b1.length + 16);
        this.c(byteBuffer0, arr_b, arr_b1, arr_b2);
        return byteBuffer0.array();
    }

    private byte[] e(byte[] arr_b) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = this.b.a(arr_b, 0);
        byte[] arr_b1 = new byte[0x20];
        byteBuffer0.get(arr_b1);
        return arr_b1;
    }

    private static byte[] f(byte[] arr_b, ByteBuffer byteBuffer0) {
        int v = arr_b.length % 16 == 0 ? arr_b.length : arr_b.length + 16 - arr_b.length % 16;
        int v1 = byteBuffer0.remaining();
        int v2 = (v1 % 16 == 0 ? v1 : v1 + 16 - v1 % 16) + v;
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(v2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer1.put(arr_b);
        byteBuffer1.position(v);
        byteBuffer1.put(byteBuffer0);
        byteBuffer1.position(v2);
        byteBuffer1.putLong(((long)arr_b.length));
        byteBuffer1.putLong(((long)v1));
        return byteBuffer1.array();
    }

    abstract d g(byte[] arg1, int arg2) throws InvalidKeyException;
}

