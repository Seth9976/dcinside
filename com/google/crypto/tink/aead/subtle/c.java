package com.google.crypto.tink.aead.subtle;

import L1.a;
import com.google.crypto.tink.b;
import com.google.crypto.tink.subtle.a0;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.y;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@a
public final class c implements b {
    class com.google.crypto.tink.aead.subtle.c.a extends ThreadLocal {
        com.google.crypto.tink.aead.subtle.c.a() {
            super();
        }

        protected Cipher a() {
            try {
                return (Cipher)y.b.a("AES/GCM-SIV/NoPadding");
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new IllegalStateException(generalSecurityException0);
            }
        }

        @Override
        protected Object initialValue() {
            return this.a();
        }
    }

    private final SecretKey a;
    private static final ThreadLocal b = null;
    private static final int c = 12;
    private static final int d = 16;

    static {
        c.b = new com.google.crypto.tink.aead.subtle.c.a();
    }

    public c(byte[] arr_b) throws GeneralSecurityException {
        b0.a(arr_b.length);
        this.a = new SecretKeySpec(arr_b, "AES");
    }

    @Override  // com.google.crypto.tink.b
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length > 0x7FFFFFE3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] arr_b2 = new byte[arr_b.length + 28];
        byte[] arr_b3 = {-15, 20, -88, -19, 7, 26, 84, -39, 25, -84, -42, 61};
        System.arraycopy(arr_b3, 0, arr_b2, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpec0 = c.c(arr_b3);
        ThreadLocal threadLocal0 = c.b;
        ((Cipher)threadLocal0.get()).init(1, this.a, algorithmParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            ((Cipher)threadLocal0.get()).updateAAD(arr_b1);
        }
        int v = ((Cipher)threadLocal0.get()).doFinal(arr_b, 0, arr_b.length, arr_b2, 12);
        if(v != arr_b.length + 16) {
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, ((int)(v - arr_b.length))));
        }
        return arr_b2;
    }

    @Override  // com.google.crypto.tink.b
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpec0 = c.d(arr_b, 0, 12);
        ThreadLocal threadLocal0 = c.b;
        ((Cipher)threadLocal0.get()).init(2, this.a, algorithmParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            ((Cipher)threadLocal0.get()).updateAAD(arr_b1);
        }
        return ((Cipher)threadLocal0.get()).doFinal(arr_b, 12, arr_b.length - 12);
    }

    private static AlgorithmParameterSpec c(byte[] arr_b) throws GeneralSecurityException {
        return c.d(arr_b, 0, arr_b.length);
    }

    private static AlgorithmParameterSpec d(byte[] arr_b, int v, int v1) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(0x80, arr_b, v, v1);
        }
        catch(ClassNotFoundException unused_ex) {
            if(!a0.d()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            return new IvParameterSpec(arr_b, v, v1);
        }
    }
}

