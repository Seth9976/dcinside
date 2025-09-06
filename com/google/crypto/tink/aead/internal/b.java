package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.subtle.a0;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.y;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b {
    class a extends ThreadLocal {
        a() {
            super();
        }

        protected Cipher a() {
            try {
                return (Cipher)y.b.a("AES/GCM/NoPadding");
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
    private final boolean b;
    public static final com.google.crypto.tink.config.internal.c.b c = null;
    public static final int d = 12;
    public static final int e = 16;
    private static final ThreadLocal f;

    static {
        b.c = com.google.crypto.tink.config.internal.c.b.b;
        b.f = new a();
    }

    public b(byte[] arr_b, boolean z) throws GeneralSecurityException {
        if(!b.c.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        b0.a(arr_b.length);
        this.a = new SecretKeySpec(arr_b, "AES");
        this.b = z;
    }

    public byte[] a(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        if(arr_b.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z = this.b;
        int v = 0;
        if(arr_b1.length < (z ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(z && !ByteBuffer.wrap(arr_b).equals(ByteBuffer.wrap(arr_b1, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpec0 = b.c(arr_b);
        ThreadLocal threadLocal0 = b.f;
        ((Cipher)threadLocal0.get()).init(2, this.a, algorithmParameterSpec0);
        if(arr_b2 != null && arr_b2.length != 0) {
            ((Cipher)threadLocal0.get()).updateAAD(arr_b2);
        }
        boolean z1 = this.b;
        if(z1) {
            v = 12;
        }
        return z1 ? ((Cipher)threadLocal0.get()).doFinal(arr_b1, v, arr_b1.length - 12) : ((Cipher)threadLocal0.get()).doFinal(arr_b1, v, arr_b1.length);
    }

    public byte[] b(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        if(arr_b.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if(arr_b1.length > 0x7FFFFFE3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] arr_b3 = new byte[(this.b ? arr_b1.length + 28 : arr_b1.length + 16)];
        if(this.b) {
            System.arraycopy(arr_b, 0, arr_b3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpec0 = b.c(arr_b);
        ThreadLocal threadLocal0 = b.f;
        ((Cipher)threadLocal0.get()).init(1, this.a, algorithmParameterSpec0);
        if(arr_b2 != null && arr_b2.length != 0) {
            ((Cipher)threadLocal0.get()).updateAAD(arr_b2);
        }
        int v = ((Cipher)threadLocal0.get()).doFinal(arr_b1, 0, arr_b1.length, arr_b3, (this.b ? 12 : 0));
        if(v != arr_b1.length + 16) {
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, ((int)(v - arr_b1.length))));
        }
        return arr_b3;
    }

    private static AlgorithmParameterSpec c(byte[] arr_b) throws GeneralSecurityException {
        return b.d(arr_b, 0, arr_b.length);
    }

    private static AlgorithmParameterSpec d(byte[] arr_b, int v, int v1) throws GeneralSecurityException {
        return a0.d() && a0.a() <= 19 ? new IvParameterSpec(arr_b, v, v1) : new GCMParameterSpec(0x80, arr_b, v, v1);
    }
}

