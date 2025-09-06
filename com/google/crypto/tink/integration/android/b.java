package com.google.crypto.tink.integration.android;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public final class b implements com.google.crypto.tink.b {
    private final SecretKey a;
    private static final String b = "b";
    private static final int c = 100;
    private static final int d = 12;
    private static final int e = 16;

    static {
    }

    public b(String s) throws GeneralSecurityException, IOException {
        KeyStore keyStore0 = KeyStore.getInstance("AndroidKeyStore");
        keyStore0.load(null);
        SecretKey secretKey0 = (SecretKey)keyStore0.getKey(s, null);
        this.a = secretKey0;
        if(secretKey0 == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + s);
        }
    }

    b(String s, KeyStore keyStore0) throws GeneralSecurityException {
        SecretKey secretKey0 = (SecretKey)keyStore0.getKey(s, null);
        this.a = secretKey0;
        if(secretKey0 == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + s);
        }
    }

    @Override  // com.google.crypto.tink.b
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        try {
            return this.d(arr_b, arr_b1);
        }
        catch(ProviderException | GeneralSecurityException providerException0) {
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", providerException0);
            b.e();
            return this.d(arr_b, arr_b1);
        }
    }

    @Override  // com.google.crypto.tink.b
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length >= 28) {
            try {
                return this.c(arr_b, arr_b1);
            }
            catch(AEADBadTagException aEADBadTagException0) {
                throw aEADBadTagException0;
            }
            catch(ProviderException | GeneralSecurityException providerException0) {
                Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", providerException0);
                b.e();
                return this.c(arr_b, arr_b1);
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private byte[] c(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, arr_b, 0, 12);
        Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
        cipher0.init(2, this.a, gCMParameterSpec0);
        cipher0.updateAAD(arr_b1);
        return cipher0.doFinal(arr_b, 12, arr_b.length - 12);
    }

    private byte[] d(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length > 0x7FFFFFE3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] arr_b2 = new byte[arr_b.length + 28];
        Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
        cipher0.init(1, this.a);
        cipher0.updateAAD(arr_b1);
        cipher0.doFinal(arr_b, 0, arr_b.length, arr_b2, 12);
        System.arraycopy(cipher0.getIV(), 0, arr_b2, 0, 12);
        return arr_b2;
    }

    private static void e() {
        try {
            Thread.sleep(((int)(Math.random() * 100.0)));
        }
        catch(InterruptedException unused_ex) {
        }
    }
}

