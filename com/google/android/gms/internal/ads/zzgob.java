package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzgob {
    private static final zzglz zza;
    private static final zzgmx zzb;
    private static final zzgmx zzc;
    private static final zzgdy zzd;

    static {
        zzgob.zza = (zzgof zzgof0, Integer integer0) -> {
            zzgob.zze(zzgof0);
            zzgnv zzgnv0 = new zzgnv(null);
            zzgnv0.zzc(zzgof0);
            zzgnv0.zza(zzgvp.zzc(zzgof0.zzc()));
            zzgnv0.zzb(integer0);
            return zzgnv0.zzd();
        };
        zzgob.zzb = zzgmx.zzb((zzgnx zzgnx0) -> {
            zzgob.zze(zzgnx0.zzb());
            return new zzgpq(zzgnx0);
        }, zzgnx.class, zzgog.class);
        zzgob.zzc = zzgmx.zzb((zzgnx zzgnx0) -> {
            zzgob.zze(zzgnx0.zzb());
            return zzgvl.zza(zzgnx0);
        }, zzgnx.class, zzgej.class);
        zzgzk zzgzk0 = zzgqb.zzh();
        zzgob.zzd = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgej.class, zzgsj.zzb, zzgzk0);
    }

    // 检测为 Lambda 实现
    public static zzgej zza(zzgnx zzgnx0) [...]

    // 检测为 Lambda 实现
    public static zzgnx zzb(zzgof zzgof0, Integer integer0) [...]

    // 检测为 Lambda 实现
    public static zzgog zzc(zzgnx zzgnx0) [...]

    public static void zzd(boolean z) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        zzgpo.zze(zzgmk.zzc());
        zzgma.zzb().zzc(zzgob.zza, zzgof.class);
        zzgmh.zza().zze(zzgob.zzb);
        zzgmh.zza().zze(zzgob.zzc);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES_CMAC", zzgpj.zzc);
        hashMap0.put("AES256_CMAC", zzgpj.zzc);
        zzgoc zzgoc0 = new zzgoc(null);
        zzgoc0.zza(0x20);
        zzgoc0.zzb(16);
        zzgoc0.zzc(zzgod.zzd);
        hashMap0.put("AES256_CMAC_RAW", zzgoc0.zzd());
        zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
        zzgkz.zzc().zzd(zzgob.zzd, true);
    }

    private static void zze(zzgof zzgof0) throws GeneralSecurityException {
        if(zzgof0.zzc() != 0x20) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}

