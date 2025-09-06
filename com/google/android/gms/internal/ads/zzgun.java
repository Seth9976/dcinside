package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class zzgun implements zzgdn {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgun(byte[] arr_b, zzgvo zzgvo0) throws GeneralSecurityException {
        if(!zzgks.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgjd.zzc(arr_b);
        this.zzb = zzgvo0.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] arr_b2 = this.zzb;
        if(arr_b.length < arr_b2.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpec0 = zzgjd.zza(arr_b, this.zzb.length, 12);
        Cipher cipher0 = zzgjd.zzb();
        cipher0.init(2, this.zza, algorithmParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            cipher0.updateAAD(arr_b1);
        }
        return cipher0.doFinal(arr_b, this.zzb.length + 12, arr_b.length - this.zzb.length - 12);
    }

    public static zzgdn zzb(zzgfx zzgfx0) throws GeneralSecurityException {
        return new zzgun(zzgfx0.zzd().zzd(zzgdw.zza()), zzgfx0.zzc());
    }
}

