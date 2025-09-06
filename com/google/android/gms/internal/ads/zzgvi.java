package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class zzgvi implements zzgpy {
    private static final ThreadLocal zza;
    private final SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    static {
        zzgvi.zza = new zzgvh();
    }

    public zzgvi(byte[] arr_b) throws GeneralSecurityException {
        zzgvm.zza(arr_b.length);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        this.zzb = secretKeySpec0;
        Cipher cipher0 = zzgvi.zzb();
        cipher0.init(1, secretKeySpec0);
        byte[] arr_b1 = zzgpp.zza(cipher0.doFinal(new byte[16]));
        this.zzc = arr_b1;
        this.zzd = zzgpp.zza(arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgpy
    public final byte[] zza(byte[] arr_b, int v) throws GeneralSecurityException {
        byte[] arr_b1;
        if(v > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipher0 = zzgvi.zzb();
        int v1 = 1;
        cipher0.init(1, this.zzb);
        if(arr_b.length != 0) {
            v1 = 1 + (arr_b.length - 1 >> 4);
        }
        int v2 = (v1 - 1) * 16;
        if(v1 * 16 == arr_b.length) {
            arr_b1 = zzguo.zzc(arr_b, v2, this.zzc, 0, 16);
        }
        else {
            byte[] arr_b2 = Arrays.copyOfRange(arr_b, v2, arr_b.length);
            if(arr_b2.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] arr_b3 = Arrays.copyOf(arr_b2, 16);
            arr_b3[arr_b2.length] = (byte)0x80;
            byte[] arr_b4 = this.zzd;
            if(arr_b3.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            arr_b1 = zzguo.zzc(arr_b3, 0, arr_b4, 0, 16);
        }
        byte[] arr_b5 = new byte[16];
        byte[] arr_b6 = new byte[16];
        for(int v3 = 0; v3 < v1 - 1; ++v3) {
            zzgvi.zzc(arr_b5, arr_b, v3 * 16, arr_b6);
            if(cipher0.doFinal(arr_b6, 0, 16, arr_b5) != 16) {
                throw new IllegalStateException("Cipher didn\'t write full block");
            }
        }
        zzgvi.zzc(arr_b5, arr_b1, 0, arr_b6);
        if(cipher0.doFinal(arr_b6, 0, 16, arr_b5) != 16) {
            throw new IllegalStateException("Cipher didn\'t write full block");
        }
        return v == 16 ? arr_b5 : Arrays.copyOf(arr_b5, v);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        return (Cipher)zzgvi.zza.get();
    }

    private static void zzc(byte[] arr_b, byte[] arr_b1, int v, byte[] arr_b2) {
        for(int v1 = 0; v1 < 16; ++v1) {
            arr_b2[v1] = (byte)(arr_b[v1] ^ arr_b1[v1 + v]);
        }
    }
}

