package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.i;
import com.google.crypto.tink.mac.internal.a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class f implements i {
    private final I a;
    private final byte[] b;
    public static final b c;
    private static final Collection d;
    private static final byte[] e;
    private static final byte[] f;

    static {
        f.c = b.a;
        f.d = Arrays.asList(new Integer[]{0x40});
        f.e = new byte[16];
        f.f = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    }

    public f(byte[] arr_b) throws GeneralSecurityException {
        if(!f.c.a()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if(!f.d.contains(((int)arr_b.length))) {
            throw new InvalidKeyException("invalid key size: " + arr_b.length + " bytes; key must have 64 bytes");
        }
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 0, arr_b.length / 2);
        this.b = Arrays.copyOfRange(arr_b, arr_b.length / 2, arr_b.length);
        this.a = new I(arr_b1);
    }

    @Override  // com.google.crypto.tink.i
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher0 = (Cipher)y.b.a("AES/CTR/NoPadding");
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, 0, 16);
        byte[] arr_b3 = (byte[])arr_b2.clone();
        arr_b3[8] = (byte)(arr_b3[8] & 0x7F);
        arr_b3[12] = (byte)(arr_b3[12] & 0x7F);
        cipher0.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(arr_b3));
        byte[] arr_b4 = Arrays.copyOfRange(arr_b, 16, arr_b.length);
        byte[] arr_b5 = cipher0.doFinal(arr_b4);
        if(arr_b4.length == 0 && arr_b5 == null && a0.d()) {
            arr_b5 = new byte[0];
        }
        if(!h.e(arr_b2, this.c(new byte[][]{arr_b1, arr_b5}))) {
            throw new AEADBadTagException("Integrity check failed.");
        }
        return arr_b5;
    }

    @Override  // com.google.crypto.tink.i
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length > 0x7FFFFFEF) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher0 = (Cipher)y.b.a("AES/CTR/NoPadding");
        byte[] arr_b2 = this.c(new byte[][]{arr_b1, arr_b});
        byte[] arr_b3 = (byte[])arr_b2.clone();
        arr_b3[8] = (byte)(arr_b3[8] & 0x7F);
        arr_b3[12] = (byte)(arr_b3[12] & 0x7F);
        cipher0.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(arr_b3));
        return h.d(new byte[][]{arr_b2, cipher0.doFinal(arr_b)});
    }

    private byte[] c(byte[][] arr2_b) throws GeneralSecurityException {
        byte[] arr_b3;
        if(arr2_b.length == 0) {
            return this.a.a(f.f, 16);
        }
        byte[] arr_b = this.a.a(f.e, 16);
        for(int v = 0; v < arr2_b.length - 1; ++v) {
            byte[] arr_b1 = arr2_b[v];
            if(arr_b1 == null) {
                arr_b1 = new byte[0];
            }
            arr_b = h.i(a.b(arr_b), this.a.a(arr_b1, 16));
        }
        byte[] arr_b2 = arr2_b[arr2_b.length - 1];
        if(arr_b2.length >= 16) {
            arr_b3 = h.j(arr_b2, arr_b);
            return this.a.a(arr_b3, 16);
        }
        arr_b3 = h.i(a.a(arr_b2), a.b(arr_b));
        return this.a.a(arr_b3, 16);
    }
}

