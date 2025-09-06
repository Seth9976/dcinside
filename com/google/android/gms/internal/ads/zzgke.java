package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class zzgke implements zzgdn {
    private final byte[] zza;
    private final int zzb;
    private final zzgpy zzc;

    private zzgke(byte[] arr_b, zzgvo zzgvo0, int v) throws GeneralSecurityException {
        this.zzc = new zzgvi(arr_b);
        this.zza = zzgvo0.zzc();
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] arr_b2 = this.zza;
        if(arr_b.length < arr_b2.length + this.zzb + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int v = this.zzb + this.zza.length;
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, this.zza.length, v);
        byte[] arr_b4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] arr_b5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if(arr_b3.length > 12 || arr_b3.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(arr_b3, 0, arr_b4, 4, arr_b3.length);
        System.arraycopy(arr_b3, 0, arr_b5, 4, arr_b3.length);
        byte[] arr_b6 = new byte[0x20];
        System.arraycopy(this.zzc.zza(arr_b4, 16), 0, arr_b6, 0, 16);
        System.arraycopy(this.zzc.zza(arr_b5, 16), 0, arr_b6, 16, 16);
        if(!zzgks.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKey0 = zzgjd.zzc(arr_b6);
        byte[] arr_b7 = Arrays.copyOfRange(arr_b, v, v + 12);
        if(arr_b7.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if(arr_b.length < v + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpec0 = zzgjd.zza(arr_b7, 0, 12);
        Cipher cipher0 = zzgjd.zzb();
        cipher0.init(2, secretKey0, algorithmParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            cipher0.updateAAD(arr_b1);
        }
        return cipher0.doFinal(arr_b, v + 12, arr_b.length - (v + 12));
    }

    public static zzgdn zzb(zzgif zzgif0) throws GeneralSecurityException {
        return new zzgke(zzgif0.zzd().zzd(zzgdw.zza()), zzgif0.zzc(), zzgif0.zzb().zzb());
    }
}

