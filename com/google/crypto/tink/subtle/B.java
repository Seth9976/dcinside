package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b implements E {
    class a extends ThreadLocal {
        a() {
            super();
        }

        protected Cipher a() {
            try {
                return (Cipher)y.b.a("AES/CTR/NoPadding");
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

    private final SecretKeySpec a;
    private final int b;
    private final int c;
    public static final com.google.crypto.tink.config.internal.c.b d = null;
    private static final ThreadLocal e = null;
    private static final String f = "AES";
    private static final String g = "AES/CTR/NoPadding";
    private static final int h = 12;

    static {
        b.d = com.google.crypto.tink.config.internal.c.b.b;
        b.e = new a();
    }

    public b(byte[] arr_b, int v) throws GeneralSecurityException {
        if(!b.d.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        b0.a(arr_b.length);
        this.a = new SecretKeySpec(arr_b, "AES");
        int v1 = ((Cipher)b.e.get()).getBlockSize();
        this.c = v1;
        if(v < 12 || v > v1) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = v;
    }

    @Override  // com.google.crypto.tink.subtle.E
    public byte[] a(byte[] arr_b) throws GeneralSecurityException {
        int v = this.b;
        if(arr_b.length > 0x7FFFFFFF - v) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (0x7FFFFFFF - this.b));
        }
        byte[] arr_b1 = new byte[arr_b.length + v];
        byte[] arr_b2 = L.c(v);
        System.arraycopy(arr_b2, 0, arr_b1, 0, this.b);
        this.c(arr_b, 0, arr_b.length, arr_b1, this.b, arr_b2, true);
        return arr_b1;
    }

    @Override  // com.google.crypto.tink.subtle.E
    public byte[] b(byte[] arr_b) throws GeneralSecurityException {
        int v = this.b;
        if(arr_b.length < v) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b1 = new byte[v];
        System.arraycopy(arr_b, 0, arr_b1, 0, v);
        byte[] arr_b2 = new byte[arr_b.length - this.b];
        this.c(arr_b, this.b, arr_b.length - this.b, arr_b2, 0, arr_b1, false);
        return arr_b2;
    }

    private void c(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2, byte[] arr_b2, boolean z) throws GeneralSecurityException {
        Object object0 = b.e.get();
        byte[] arr_b3 = new byte[this.c];
        System.arraycopy(arr_b2, 0, arr_b3, 0, this.b);
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b3);
        if(z) {
            ((Cipher)object0).init(1, this.a, ivParameterSpec0);
        }
        else {
            ((Cipher)object0).init(2, this.a, ivParameterSpec0);
        }
        if(((Cipher)object0).doFinal(arr_b, v, v1, arr_b1, v2) != v1) {
            throw new GeneralSecurityException("stored output\'s length does not match input\'s length");
        }
    }
}

