package com.google.crypto.tink.subtle;

import com.google.crypto.tink.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class c implements b {
    class a extends ThreadLocal {
        a() {
            super();
        }

        protected Cipher a() {
            try {
                return (Cipher)y.b.a("AES/ECB/NOPADDING");
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

    class com.google.crypto.tink.subtle.c.b extends ThreadLocal {
        com.google.crypto.tink.subtle.c.b() {
            super();
        }

        protected Cipher a() {
            try {
                return (Cipher)y.b.a("AES/CTR/NOPADDING");
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

    private final byte[] a;
    private final byte[] b;
    private final SecretKeySpec c;
    private final int d;
    public static final com.google.crypto.tink.config.internal.c.b e = null;
    private static final ThreadLocal f = null;
    private static final ThreadLocal g = null;
    static final int h = 16;
    static final int i = 16;
    static final boolean j;

    static {
        c.e = com.google.crypto.tink.config.internal.c.b.a;
        c.f = new a();
        c.g = new com.google.crypto.tink.subtle.c.b();
    }

    public c(byte[] arr_b, int v) throws GeneralSecurityException {
        if(!c.e.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if(v != 12 && v != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = v;
        b0.a(arr_b.length);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        this.c = secretKeySpec0;
        Cipher cipher0 = (Cipher)c.f.get();
        cipher0.init(1, secretKeySpec0);
        byte[] arr_b1 = c.c(cipher0.doFinal(new byte[16]));
        this.a = arr_b1;
        this.b = c.c(arr_b1);
    }

    @Override  // com.google.crypto.tink.b
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = this.d;
        if(arr_b.length > 0x7FFFFFEF - v) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] arr_b2 = new byte[arr_b.length + v + 16];
        byte[] arr_b3 = L.c(v);
        System.arraycopy(arr_b3, 0, arr_b2, 0, this.d);
        Object object0 = c.f.get();
        ((Cipher)object0).init(1, this.c);
        byte[] arr_b4 = this.d(((Cipher)object0), 0, arr_b3, 0, arr_b3.length);
        byte[] arr_b5 = arr_b1 == null ? new byte[0] : arr_b1;
        byte[] arr_b6 = this.d(((Cipher)object0), 1, arr_b5, 0, arr_b5.length);
        Cipher cipher0 = (Cipher)c.g.get();
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b4);
        cipher0.init(1, this.c, ivParameterSpec0);
        cipher0.doFinal(arr_b, 0, arr_b.length, arr_b2, this.d);
        byte[] arr_b7 = this.d(((Cipher)object0), 2, arr_b2, this.d, arr_b.length);
        int v1 = arr_b.length + this.d;
        for(int v2 = 0; v2 < 16; ++v2) {
            arr_b2[v1 + v2] = (byte)(arr_b6[v2] ^ arr_b4[v2] ^ arr_b7[v2]);
        }
        return arr_b2;
    }

    @Override  // com.google.crypto.tink.b
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = arr_b.length - this.d - 16;
        if(v < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Object object0 = c.f.get();
        ((Cipher)object0).init(1, this.c);
        byte[] arr_b2 = this.d(((Cipher)object0), 0, arr_b, 0, this.d);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b3 = this.d(((Cipher)object0), 1, arr_b1, 0, arr_b1.length);
        byte[] arr_b4 = this.d(((Cipher)object0), 2, arr_b, this.d, v);
        int v2 = arr_b.length - 16;
        int v3 = 0;
        for(int v1 = 0; v1 < 16; ++v1) {
            v3 = (byte)(v3 | arr_b[v2 + v1] ^ arr_b3[v1] ^ arr_b2[v1] ^ arr_b4[v1]);
        }
        if(v3 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher0 = (Cipher)c.g.get();
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b2);
        cipher0.init(1, this.c, ivParameterSpec0);
        return cipher0.doFinal(arr_b, this.d, v);
    }

    private static byte[] c(byte[] arr_b) {
        byte[] arr_b1 = new byte[16];
        for(int v = 0; v < 15; ++v) {
            arr_b1[v] = (byte)((arr_b[v] << 1 ^ (arr_b[v + 1] & 0xFF) >>> 7) & 0xFF);
        }
        arr_b1[15] = (byte)(arr_b[0] >> 7 & 0x87 ^ arr_b[15] << 1);
        return arr_b1;
    }

    private byte[] d(Cipher cipher0, int v, byte[] arr_b, int v1, int v2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] arr_b1 = new byte[16];
        arr_b1[15] = (byte)v;
        if(v2 == 0) {
            return cipher0.doFinal(c.f(arr_b1, this.a));
        }
        byte[] arr_b2 = cipher0.doFinal(arr_b1);
        int v3;
        for(v3 = 0; v2 - v3 > 16; v3 += 16) {
            for(int v4 = 0; v4 < 16; ++v4) {
                arr_b2[v4] = (byte)(arr_b2[v4] ^ arr_b[v1 + v3 + v4]);
            }
            arr_b2 = cipher0.doFinal(arr_b2);
        }
        return cipher0.doFinal(c.f(arr_b2, this.e(Arrays.copyOfRange(arr_b, v3 + v1, v1 + v2))));
    }

    private byte[] e(byte[] arr_b) {
        if(arr_b.length == 16) {
            return c.f(arr_b, this.a);
        }
        byte[] arr_b1 = Arrays.copyOf(this.b, 16);
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b1[v] = (byte)(arr_b1[v] ^ arr_b[v]);
        }
        arr_b1[arr_b.length] = (byte)(arr_b1[arr_b.length] ^ 0x80);
        return arr_b1;
    }

    private static byte[] f(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = new byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b2[v] = (byte)(arr_b[v] ^ arr_b1[v]);
        }
        return arr_b2;
    }
}

